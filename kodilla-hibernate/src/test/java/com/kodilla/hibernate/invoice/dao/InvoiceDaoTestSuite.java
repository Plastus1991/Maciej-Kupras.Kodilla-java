package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Product1");
        Invoice invoice = new Invoice("Invoice_1");
        Item item = new Item(new BigDecimal(10), 10, new BigDecimal(100));

        //When
        invoiceDao.save(invoice);
        productDao.save(product);

        item.setProduct(product);
        item.setInvoice(invoice);

        invoice.getItems().add(item);
        product.getItems().add(item);

        itemDao.save(item);
        //Then
        int invoice1 = invoice.getId();
        int product1 = product.getId();
        int item1 = item.getID();

        assertNotEquals(0, invoice1);
        assertNotEquals(0, product1);
        assertNotEquals(0, item1);

        //CleanUp
        itemDao.deleteById(item1);
        productDao.deleteById(product1);
        invoiceDao.deleteById(invoice1);
    }
}
