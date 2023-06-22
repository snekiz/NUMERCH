package model;

import java.text.DecimalFormat;

abstract class Product {
    private String productName;
    private String productDescription;
    private double productPrice;
    private String productImage;
    private boolean isSelected = false;
    private int qty;
    private String productsize;
    private String productstyle;
    private int stocks = 69;
    


    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public void setProductDescription(String description) {
        this.productDescription = description;
    }

    public double getProductPrice() {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String formattedPrice = decimalFormat.format(this.productPrice);
        return Double.parseDouble(formattedPrice);
    }

    public void setProductPrice(double price) {
        this.productPrice = price;
    }

    public String getProductImage() {
        return this.productImage;
    }

    public void setProductImage(String path) {
        this.productImage = path;
    }

    public boolean getProductStatus() {
        return this.isSelected;
    }

    public void setProductStatus(boolean status) {
        this.isSelected = status;
    }

    public void setProductQuantity(int quantity) {
        this.qty = quantity;
    }

    public int getProductQuantity() {
        return this.qty;
    }

    public void setProductsize(String size) {
        this.productsize = size;
    }

    public String getProductsize() {
        return this.productsize;
    }

    public String getProductstyle() {
        return this.productstyle;
    }

    public void setProductstyle(String style) {
        this.productstyle = style;
    }

    public void setProductStocks(int Stocks) {
        this.stocks = Stocks;
    }

    public int getProductStocks() {
        return this.stocks;
    }
}
