package com.kodilla.hibernate.invoice.dao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
        @Autowired
        private InvoiceDao invoiceDao;

        @Test
        public void testInvoiceDaoSave() {
                //Given

                Item item1 = new Item(new Product("Name One"), new BigDecimal(7), 4);
                Item item2 = new Item(new Product("Name Two"), new BigDecimal(1), 53);
                Item item3 = new Item(new Product("Name Three"), new BigDecimal(2), 34);

                Invoice invoice = new Invoice("234/07/2020");
                invoice.getItems().add(item1);
                invoice.getItems().add(item2);
                item1.setInvoice(invoice);
                item2.setInvoice(invoice);
                Invoice invoice1 = new Invoice("245/09/1990");
                invoice.getItems().add(item3);
                item3.setInvoice(invoice);

                //When
                invoiceDao.save(invoice);
                int id = invoice.getId();
                invoiceDao.save(invoice1);
                int id1 = invoice1.getId();

                //Then
                Assert.assertNotEquals(0, id1);

                //CleanUp
               invoiceDao.deleteById(id1);
               invoiceDao.deleteById(id);
        }
}
