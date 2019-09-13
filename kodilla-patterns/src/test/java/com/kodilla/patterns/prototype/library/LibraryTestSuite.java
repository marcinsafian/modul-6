package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("secret Library");
        Book book1 = new Book("Secrets shadows of Grey", "Donald Duck", LocalDate.of(208, Month.MAY, 15));
        Book book2 = new Book("Secrets of Secret service", "Mickey Mouse", LocalDate.of(2012, Month.AUGUST, 12));
        Book book3 = new Book("Secrets of Santa", "Walt Disney", LocalDate.of(2006, Month.APRIL, 30));
        Book book4 = new Book("Secrets for Dummies", "Mr. Sponge", LocalDate.of(2010, Month.OCTOBER, 10));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("secret Library - shallowCopy");
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("secret Library - deepCopy");
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        //When
        library.removeBook(book2);
        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
