package com.burakkaya.business.concretes;

import com.burakkaya.business.abstracts.InvoiceService;
import com.burakkaya.entities.concretes.CorporateCustomer;
import com.burakkaya.entities.concretes.Invoice;

import java.util.List;

public class InvoiceManager implements InvoiceService {
    List<Invoice> invoices;

    public InvoiceManager(List<Invoice> invoices) {
        this.invoices = invoices;
    }
    @Override
    public List<Invoice> getAll() {
        return invoices;
    }

    @Override
    public Invoice getById(Long id) {
        return invoices.stream().filter(invoice -> invoice.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void add(Invoice customer) {
        invoices.add(customer);
    }

    @Override
    public void update(Long id, Invoice customer) {
        if (invoices.stream().anyMatch(c -> c.getId().equals(id))) {
            invoices.set(invoices.indexOf(invoices.stream().filter(c -> c.getId().equals(id)).findFirst().get()), customer);
        }
    }

    @Override
    public void delete(Long id) {
        if (invoices.stream().anyMatch(c -> c.getId().equals(id))) {
            invoices.remove(invoices.stream().filter(c -> c.getId().equals(id)).findFirst().get());
        }
    }

    @Override
    public List<Invoice> getInvoicesWithTotalAmountGreaterThan(double amount) {
        return invoices.stream().filter(invoice -> invoice.getAmount() > amount).toList();
    }

    @Override
    public double calculateAverageAmountOfInvoicesAboveThreshold(double thresholdAmount) {
        return invoices.stream().filter(invoice -> invoice.getAmount() > thresholdAmount).mapToDouble(Invoice::getAmount).average().orElse(0);
    }

    @Override
    public List<String> getNamesOfCustomersWithInvoicesBelowThreshold(double thresholdAmount) {
        return invoices.stream().filter(invoice -> invoice.getAmount() < thresholdAmount).map(invoice -> invoice.getOrder().getCustomer().getName()).toList();
    }

    @Override
    public List<String> listSectorsOfCompaniesWithInvoiceAverageBelowThreshold(int month, double thresholdAmount) {
        return invoices.stream().filter(invoice -> invoice.getOrder().getCustomer() instanceof CorporateCustomer).filter(invoice -> invoice.getCreatedAt().getMonthValue() == month).filter(invoice -> invoice.getAmount() < thresholdAmount).map(invoice -> ((CorporateCustomer) invoice.getOrder().getCustomer()).getSector()).toList();
    }

    @Override
    public double getTotalAmountOfInvoicesForCustomersRegisteredInMonth(int month) {
        return invoices.stream().filter(invoice -> invoice.getOrder().getCustomer().getCreatedAt().getMonthValue() == month).mapToDouble(Invoice::getAmount).sum();
    }
}
