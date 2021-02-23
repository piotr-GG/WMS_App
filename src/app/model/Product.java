package app.model;

import javafx.beans.property.*;

public class Product {
    private IntegerProperty productID;
    private StringProperty productName;
    private Category category;
    private StringProperty quantityPerUnit;
    private DoubleProperty unitPrice;
    private IntegerProperty unitsOnStock;
    private IntegerProperty reorderLevel;
    private BooleanProperty discontinued;
    private Location suggestedPickLocation;

    /**
     * Default constructor
     */


    public Product(int productID, String productName, Category category, String quantityPerUnit, double unitPrice, int unitsOnStock, int reorderLevel, boolean discontinued ){
        this.productID = new SimpleIntegerProperty(productID);
        this.productName = new SimpleStringProperty(productName);
        this.category = category;
        this.quantityPerUnit = new SimpleStringProperty(quantityPerUnit);
        this.unitPrice = new SimpleDoubleProperty(unitPrice);
        this.unitsOnStock = new SimpleIntegerProperty(unitsOnStock);
        this.reorderLevel = new SimpleIntegerProperty(reorderLevel);
        this.discontinued = new SimpleBooleanProperty(discontinued);
    }
    /**
     * Additional constructor used with Location Array List
     * @param productID
     * @param productName
     */
    public Product(int productID, String productName, int quantity){
        this.productID = new SimpleIntegerProperty(productID);
        this.productName = new SimpleStringProperty(productName);
        this.unitsOnStock = new SimpleIntegerProperty(quantity);
    }

    /**
     * Getters - properties
     */

    public IntegerProperty getProductIDProperty() {
        return productID;
    }

    public StringProperty getProductNameProperty() {
        return productName;
    }

    public StringProperty getQuantityPerUnitProperty() {
        return quantityPerUnit;
    }

    public DoubleProperty getUnitPriceProperty() {
        return unitPrice;
    }

    public IntegerProperty getUnitsInStockProperty() {
        return unitsOnStock;
    }

    public IntegerProperty getReorderLevelProperty() {
        return reorderLevel;
    }

    public BooleanProperty getDiscontinuedProperty() {
        return discontinued;
    }

    public Location getSuggestedLocation(){
        return this.suggestedPickLocation;
    }

    /**
     * Getters - values
     */

    public int getProductID(){
        return productID.get();
    }

    public String getProductName(){
        return productName.get();
    }

    public Category getCategory() {
        return category;
    }

    public String getQuantityPerUnit(){
        return quantityPerUnit.get();
    }

    public double getUnitPrice(){
        return unitPrice.get();
    }

    public int getUnitsInStock(){
        return unitsOnStock.get();
    }

    public int getReorderLevel(){
        return reorderLevel.get();
    }

    public boolean getDiscontinued(){
        return discontinued.get();
    }

    /**
     * Setters
     */

    public void setProductID(int productID){
        this.productID.set(productID);
    }

    public void setProductName(String productName){
        this.productName.set(productName);
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public void setQuantityPerUnit(String quantityPerUnit){
        this.quantityPerUnit.set(quantityPerUnit);
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice.set(unitPrice);
    }

    public void setUnitsInStock(int unitsInStock){
        this.unitsOnStock.set(unitsInStock);
    }

    public void setReorderLevel(int reorderLevel){
        this.reorderLevel.set(reorderLevel);
    }

    public void setDiscontinued(boolean discontinued){
        this.discontinued.set(discontinued);
    }

    public void setSuggestedPickLocation(Location suggestedPickLocation){
        this.suggestedPickLocation = suggestedPickLocation;
    }

    public boolean areProductsEqual(Product other){
        if(this.getProductID() != other.getProductID()) return false;
        if(!this.getProductName().equals(other.getProductName())) return false;
        if(!this.getQuantityPerUnit().equals(other.getQuantityPerUnit())) return false;
        if(this.getUnitPrice() != other.getUnitPrice()) return false;
        if(!this.getCategory().getCategoryName().equals(other.getCategory().getCategoryName())) return false;
        if(this.getUnitsInStock() != other.getUnitsInStock()) return false;
        if(this.getReorderLevel() != other.getReorderLevel()) return false;
        if(this.getDiscontinued() != other.getDiscontinued()) return false;

        return true;
    }
}
