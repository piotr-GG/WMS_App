package app.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class OrderDetails {

    private Product product;
    private IntegerProperty quantity;
    private DoubleProperty unitPrice;
    private DoubleProperty discount;


    public OrderDetails(Product product, int quantity, double unitPrice, double discount){
        this.product = product;
        this.quantity = new SimpleIntegerProperty(quantity);
        this.unitPrice = new SimpleDoubleProperty(unitPrice);
        this.discount = new SimpleDoubleProperty(discount);
    }

    /*
     * Getters - properties
     */
    public IntegerProperty getQuantityProperty(){
        return this.quantity;
    }

    public Product getProduct(){
        return this.product;
    }

    public DoubleProperty getUnitPriceProperty(){
        return this.unitPrice;
    }

    public DoubleProperty getDiscountProperty(){
        return this.discount;
    }

    /*
     * Getters - values
     */
    public int getQuantity(){
        return this.quantity.get();
    }

    public double getUnitPrice(){
        return unitPrice.get();
    }

    public double getDiscount(){
        return discount.get();
    }

    /*
     * Setters
     */

    public void setProduct(Product product){
        this.product = product;
    }

    public void setQuantity(int quantity){
        this.quantity.set(quantity);
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice.set(unitPrice);
    }

    public void setDiscount(double discount){
        this.discount.set(discount);
    }
}
