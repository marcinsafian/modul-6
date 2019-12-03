package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private LibraryDatabase libraryDatabaseMock;
    private BookLibrary bookLibrary;

    @Before
    public void beforeEachTest(){
        libraryDatabaseMock = mock(LibraryDatabase.class);
        bookLibrary = new BookLibrary(libraryDatabaseMock);
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        //LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
       // BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);

        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(new Book("Secrets of Java", "Ian Tenewitch", 2010));
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        Assert.assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        Assert.assertEquals(0, theListOfBooks0.size());
        Assert.assertEquals(15, theListOfBooks15.size());
        Assert.assertEquals(0, theListOfBooks40.size());
    }


    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        //LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        // BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        Assert.assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
   @Test
    public void testListBooksInHandsOfZeroBooks(){
        //Given
        List<Book>zeroBooks = generateListOfNBooks(0);
        when(libraryDatabaseMock.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(zeroBooks);
        //When
       LibraryUser selectedLibraryUser = new LibraryUser("Jaś","Kowalski","76789876");
        List<Book>resultBoksInHandsOfZeroBooks = bookLibrary.listBooksInHandsOf(selectedLibraryUser);
        //Then
        Assert.assertEquals(0, resultBoksInHandsOfZeroBooks.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(any(LibraryUser.class));
    }
    @Test
    public void testListBooksInHandsOfOneBook(){
        //Given
        List<Book>oneBook = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(oneBook);
        //When
        LibraryUser selectedLibraryUser = new LibraryUser("Jaś","Kowalski","76789876");
        List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(selectedLibraryUser);
        //Then
        Assert.assertEquals(1, resultListBooksInHandsOf.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(any(LibraryUser.class));
    }
    @Test
    public void testlistBooksInHandsOf5Books() {
        //Given
        List<Book> resultListOfBorrowedBooks = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(resultListOfBorrowedBooks);
        //When
        LibraryUser selectedLibraryUser = new LibraryUser("Jan", "Kowalski", "857532542135");
        List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(selectedLibraryUser);

        //Then
        Assert.assertEquals(5, resultListBooksInHandsOf.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    public void returnBooks(){
        List<Book> borrowedBooks = generateListOfNBooks(5);
        when(libraryDatabaseMock.returnBooks(any(LibraryUser.class))).thenReturn(borrowedBooks.size());

        LibraryUser borowBook = new LibraryUser("Elo","Ecki","987655");
        Integer userBook = bookLibrary.returnBooks(borowBook);

        Assert.assertSame(0, userBook);
    }
}