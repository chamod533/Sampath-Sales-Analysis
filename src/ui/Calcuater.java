package ui;

public class Calcuater {

    // Calculate total price: quantity * unitPrice
    public double calculateTotal(double quantity, double unitPrice) {
        return quantity * unitPrice;
    }

    // Calculate discount amount: total * discountPercentage
    public double calculateDiscount(double total, double discountPercentage) {
        return total * discountPercentage / 100.0;
    }

    // Calculate net amount after discount
    public double calculateNetAmount(double total, double discountAmount) {
        return total - discountAmount;
    }
}
