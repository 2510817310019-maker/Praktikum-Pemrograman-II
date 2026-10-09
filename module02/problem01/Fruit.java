package module02.problem01;

import java.util.Locale;

public class Fruit {
    private String fruitName;
    private double price;
    private double weight;
    private double purchaseTotal;

    private double pricePerKg;

    public Fruit(String fruitName, double price, double weight, double purchaseTotal) {
        this.fruitName = fruitName;
        this.price = price;
        this.weight = weight;
        this.purchaseTotal = purchaseTotal;

        this.pricePerKg = this.price / this.weight;
    }

    public void printInfo() {
        System.out.println("Nama Buah: " + this.fruitName);
        System.out.println("Berat: " + this.weight);
        System.out.println("Harga: " + this.price);
        System.out.println("Jumlah Beli: " + this.purchaseTotal + "kg");
        System.out.printf(Locale.US, "Harga Sebelum Diskon: Rp%.2f%n", getPreDiscountPrice());
        System.out.printf(Locale.US, "Total Diskon: Rp%.2f%n", getDiscountTotal());
        System.out.printf(Locale.US, "Harga Setelah Diskon: Rp%.2f%n", getPostDiscountPrice());
        System.out.println();
    }

    public double getPreDiscountPrice() {
        return this.pricePerKg * this.purchaseTotal;
    }

    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.purchaseTotal / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}