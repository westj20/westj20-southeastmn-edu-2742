package domain;

import java.util.ArrayList;

public class Invoice {
    private int invoiceId;
    private int status;
    private GDate invoiceDate;
    private GDate dueDate;
    private ArrayList<LineItem> lineItems;


    public Invoice(int status, GDate invoiceDate, GDate dueDate) {
        // TODO - implement Invoice.Invoice
        throw new UnsupportedOperationException();
    }

    public Invoice(Invoice invoice) {
        // TODO - implement Invoice.Invoice
        throw new UnsupportedOperationException();
    }

    public Invoice copy() {
        // TODO - implement Invoice.copy
        throw new UnsupportedOperationException();
    }


    public void addLineItem(LineItem lineItem) {
        // TODO - implement Invoice.addLineItem
        throw new UnsupportedOperationException();
    }


    public LineItem removeLineItem(int lineItemId) {
        // TODO - implement Invoice.removeLineItem
        throw new UnsupportedOperationException();
    }

    public double total() {
        // TODO - implement Invoice.total
        throw new UnsupportedOperationException();
    }


    public int getInvoiceId() {
        return invoiceId;
    }

    public int getStatus() {
        return status;
    }

    public GDate getInvoiceDate() {
        return invoiceDate;
    }

    public GDate getDueDate() {
        return dueDate;
    }

    public ArrayList getLineItems() {
        return lineItems;
    }
}
