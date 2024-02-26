package com.burakkaya;

import com.burakkaya.business.concretes.CustomerManager;
import com.burakkaya.business.concretes.InvoiceManager;
import com.burakkaya.business.concretes.OrderManager;
import com.burakkaya.entities.abstracts.Customer;
import com.burakkaya.entities.concretes.CorporateCustomer;
import com.burakkaya.entities.concretes.IndividualCustomer;
import com.burakkaya.entities.concretes.Invoice;
import com.burakkaya.entities.concretes.Order;
import com.burakkaya.entities.enums.Status;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer individual1 = new IndividualCustomer(1L, "John Doe", "johndoe@gmail.com", "555-5555", "123 Main St", Status.ACTIVE, "1234567890");
        IndividualCustomer individual2 = new IndividualCustomer(2L, "Jane Smith", "janesmith@hotmail.com", "123-4567", "456 Elm St", Status.ACTIVE, "9876543210");
        IndividualCustomer individual3 = new IndividualCustomer(3L, "Michael Clark", "michaelclark@yahoo.com", "789-0123", "789 Oak St", Status.ACTIVE, "2345678901");
        IndividualCustomer individual4 = new IndividualCustomer(4L, "Sarah Jones", "sarahjones@outlook.com", "456-7890", "1011 Pine St", Status.ACTIVE, "3456789012");
        IndividualCustomer individual5 = new IndividualCustomer(5L, "David Miller", "davidmiller@gmail.com", "098-7654", "1213 Maple St", Status.ACTIVE, "4567890123");
        CorporateCustomer corporate1 = new CorporateCustomer(6L, "Acme Inc.", "info@acme.com", "123-4567", "456 Elm St", Status.ACTIVE, "Tech", "123456789");
        CorporateCustomer corporate2 = new CorporateCustomer(7L, "Beta Corp.", "contact@betacorp.com", "789-0123", "789 Oak St", Status.ACTIVE, "Finance", "987654321");
        CorporateCustomer corporate3 = new CorporateCustomer(8L, "Gamma Ltd.", "info@gammaltd.com", "456-7890", "1011 Pine St", Status.ACTIVE, "Retail", "876543210");
        CorporateCustomer corporate4 = new CorporateCustomer(9L, "Delta LLC.", "sales@deltallc.com", "098-7654", "1213 Maple St", Status.ACTIVE, "Manufacturing", "765432109");
        CorporateCustomer corporate5 = new CorporateCustomer(10L, "Epsilon Inc.", "support@epsiloninc.com", "123-4567", "456 Spruce St", Status.ACTIVE, "Healthcare", "654321098");

        Order order1 = new Order(1L, individual1);
        Order order2 = new Order(2L, corporate1);
        Order order3 = new Order(3L, individual2);
        Order order4 = new Order(4L, corporate2);
        Order order5 = new Order(5L, individual3);
        Order order6 = new Order(6L, corporate3);
        Order order7 = new Order(7L, individual4);
        Order order8 = new Order(8L, corporate4);
        Order order9 = new Order(9L, individual5);
        Order order10 = new Order(10L, corporate5);

        Invoice invoice1 = new Invoice(1L, 500.0, order1);
        Invoice invoice2 = new Invoice(2L, 1200.0, order2);
        Invoice invoice3 = new Invoice(3L, 750.0, order3);
        Invoice invoice4 = new Invoice(4L, 1500.0, order4);
        Invoice invoice5 = new Invoice(5L, 600.0, order5);
        Invoice invoice6 = new Invoice(6L, 2000.0, order6);
        Invoice invoice7 = new Invoice(7L, 850.0, order7);
        Invoice invoice8 = new Invoice(8L, 800.0, order8);
        Invoice invoice9 = new Invoice(9L, 700.0, order9);
        Invoice invoice10 = new Invoice(10L, 500.0, order10);


        CustomerManager customerManager = new CustomerManager(Arrays.asList(individual1, individual2, individual3, individual4, individual5, corporate1, corporate2, corporate3, corporate4, corporate5));
        InvoiceManager invoiceManager = new InvoiceManager(Arrays.asList(invoice1, invoice2, invoice3, invoice4, invoice5, invoice6, invoice7, invoice8, invoice9, invoice10));
        OrderManager orderManager = new OrderManager(Arrays.asList(order1, order2, order3, order4, order5, order6, order7, order8, order9, order10));


        List<Customer> allCustomers = customerManager.getAll();
        System.out.println("All customers: " + allCustomers);

        System.out.println("\n");
        System.out.println("\n");

        Customer customerById = customerManager.getById(1L);
        System.out.println("Customer with ID 1: " + customerById);

        System.out.println("\n");
        System.out.println("\n");

        List<Customer> customersWithLetter = customerManager.getCustomersWithNameContainingLetter('o');
        System.out.println("Customers with \"o\" in name: " + customersWithLetter);

        System.out.println("\n");
        System.out.println("\n");

        double totalAmount = invoiceManager.getTotalAmountOfInvoicesForCustomersRegisteredInMonth(2);
        System.out.println("Total invoice amount for customers registered in February: " + totalAmount);

        System.out.println("\n");
        System.out.println("\n");

        List<Order> allOrders = orderManager.getAll();
        System.out.println("All orders: " + allOrders);

        System.out.println("\n");
        System.out.println("\n");

        Order orderById = orderManager.getById(2L);
        System.out.println("Order with ID 2: " + orderById);

        System.out.println("\n");
        System.out.println("\n");


        List<Invoice> allInvoices = invoiceManager.getAll();
        System.out.println("All invoices: " + allInvoices);

        System.out.println("\n");
        System.out.println("\n");

        List<Invoice> invoicesGreaterThan1000 = invoiceManager.getInvoicesWithTotalAmountGreaterThan(1000.0);
        System.out.println("Invoices greater than 1000: " + invoicesGreaterThan1000);

        System.out.println("\n");
        System.out.println("\n");

        double averageAmount = invoiceManager.calculateAverageAmountOfInvoicesAboveThreshold(500.0);
        System.out.println("Average invoice amount above 500: " + averageAmount);

        System.out.println("\n");
        System.out.println("\n");

        List<String> customerNamesWithLowInvoices = invoiceManager.getNamesOfCustomersWithInvoicesBelowThreshold(1000.0);
        System.out.println("Customer names with invoices below 1000: " + customerNamesWithLowInvoices);

        System.out.println("\n");
        System.out.println("\n");

        List<String> sectorsWithLowInvoices = invoiceManager.listSectorsOfCompaniesWithInvoiceAverageBelowThreshold(2, 1000.0);
        System.out.println("Sectors with invoices below 1000 in February: " + sectorsWithLowInvoices);

    }
}