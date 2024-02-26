package com.burakkaya.business.abstracts;

import com.burakkaya.entities.concretes.Invoice;

import java.util.List;

public interface InvoiceService {
    List<Invoice> getAll();
    Invoice getById(Long id);
    void add(Invoice customer);
    void update(Long id, Invoice customer);
    void delete(Long id);
    List<Invoice> getInvoicesWithTotalAmountGreaterThan(double amount);
    double calculateAverageAmountOfInvoicesAboveThreshold(double thresholdAmount);
    List<String> getNamesOfCustomersWithInvoicesBelowThreshold(double thresholdAmount);
    List<String> listSectorsOfCompaniesWithInvoiceAverageBelowThreshold(int month, double thresholdAmount);
    double getTotalAmountOfInvoicesForCustomersRegisteredInMonth(int month);

}
