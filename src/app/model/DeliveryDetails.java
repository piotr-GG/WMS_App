package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class DeliveryDetails {

    private Product product;
    private IntegerProperty quantity;
    private IntegerProperty quantityTaken;
    private IntegerProperty palletCount;


    /**
     * Constructor used for creating delivery details when placing a delivery order
     * @param product
     * @param quantity
     */

    public DeliveryDetails(Product product, int quantity){
        this.product = product;
        this.quantity = new SimpleIntegerProperty(quantity);
        this.quantityTaken = new SimpleIntegerProperty();
    }

    /**
     * Constructor used for creating delivery details of deliveries that have arrived at warehouse
     * @param product
     * @param quantity
     * @param palletCount
     */

    public DeliveryDetails(Product product, int quantity, int palletCount, int quantityTaken){
        this(product, quantity);
        this.palletCount = new SimpleIntegerProperty(palletCount);
        this.quantityTaken = new SimpleIntegerProperty(quantityTaken);
    }

    /*
     * Getters - property
     */

    public IntegerProperty getQuantityProperty(){
        return this.quantity;
    }

    public IntegerProperty getPalletCountProperty(){
        return this.palletCount;
    }

    public IntegerProperty getQuantityTakenProperty(){
        return this.quantityTaken;
    }

    /*
     * Getters - values
     */

    public Product getProduct(){
        return this.product;
    }

    public int getQuantity(){
        return this.quantity.get();
    }

    public int getPalletCount(){
        return this.palletCount.get();
    }

    public int getQuantityTaken(){
        return this.quantityTaken.get();
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

    public void setPalletCount(int palletCount){
        this.palletCount.set(palletCount);
    }

    public void setQuantityTaken(int quantityTaken){
        this.quantityTaken.set(quantityTaken);
    }
}
