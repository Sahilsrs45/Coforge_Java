package com.coforge.Day_06_07_2026prj;

public class Product implements Comparable<Product> {

    private int prodId;
    private String prodName;
    private double prodCost;
    private int nou;

    public Product() {
    }

    public Product(int prodId, String prodName, double prodCost, int nou) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodCost = prodCost;
        this.nou = nou;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdCost() {
        return prodCost;
    }

    public void setProdCost(double prodCost) {
        this.prodCost = prodCost;
    }

    public int getNou() {
        return nou;
    }

    public void setNou(int nou) {
        this.nou = nou;
    }

    @Override
    public String toString() {
        return "Product [prodId=" + prodId + ", prodName=" + prodName
                + ", prodCost=" + prodCost + ", nou=" + nou + "]";
    }

    @Override
    public int compareTo(Product p) {
        return Integer.compare(this.prodId, p.prodId);
    }
}