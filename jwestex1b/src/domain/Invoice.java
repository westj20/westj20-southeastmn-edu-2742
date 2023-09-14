package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Invoice {

    private int invoiceId;
    private int status;
    private GDate invoiceDate;
    private ArrayList<LineItem> lineItems = new ArrayList<LineItem>();
    private GDate dueDate;




    public Invoice(int status, GDate invoiceDate, GDate dueDate) {
        this.invoiceId = DbContext.getNextInvoiceId();
        this.status = status;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;

    }


    public Invoice(Invoice invoice) {
        this.invoiceId = invoice.invoiceId;
        this.status = invoice.getStatus();
        this.invoiceDate = new GDate(invoice.getInvoiceDate());
        this.dueDate = new GDate(invoice.getDueDate());
    }

    public Invoice copy() {
        return new Invoice(this);
    }


    public void addLineItem(LineItem lineItem) {
        LineItem copy = new LineItem(lineItem);


        this.lineItems.add(copy);

    }


    public LineItem removeLineItem(int index) {
        LineItem copy = null;

        if (index >= 0 && index < this.lineItems.size()) {
            copy = this.lineItems.get(index); // Assign the value
            this.lineItems.remove(index);
        }

        return copy;
    }

    public LineItem removeLineItem(LineItem lineItem) {

            for (int i = 0; i < this.lineItems.size(); i++) {
                LineItem currentItem = this.lineItems.get(i);


                if (currentItem.equals(lineItem)) {
                    // Remove the matching item
                    this.lineItems.remove(i);
                    return currentItem;
                }
            }


            return null;

    }

    public double total() {
        double totalAmount = 0.0;

        for (LineItem lineItem : lineItems) {
            totalAmount += lineItem.getAmount();
        }

        return totalAmount;
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


    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", status=" + status +
                ", invoiceDate=" + invoiceDate +
                ", lineItems=" + lineItems +
                ", dueDate=" + dueDate +

                '}';
    }
}