package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class ShipmentDetails {
    private IntegerProperty shipmentID;
    private Order order;
    private IntegerProperty palletsCount;

    public ShipmentDetails(int shipmentID, Order order, int palletsCount){
        this.shipmentID = new SimpleIntegerProperty(shipmentID);
        this.order = order;
        this.palletsCount = new SimpleIntegerProperty(palletsCount);
    }

    public IntegerProperty getShipmentIDProperty(){
        return this.shipmentID;
    }

    public IntegerProperty getPalletsCountProperty(){
        return this.palletsCount;
    }

    public int getShipmentID(){
        return this.shipmentID.get();
    }

    public int getPalletsCount(){
        return this.palletsCount.get();
    }

    public Order getOrder(){
        return this.order;
    }

    public void setShipmentID(int shipmentID){
        this.shipmentID.set(shipmentID);
    }

    public void setOrder(Order order){
        this.order = order;
    }

    public void setPalletsCount(int palletsCount){
        this.palletsCount.set(palletsCount);
    }
}
