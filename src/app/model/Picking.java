package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ObservableList;

public class Picking {
    private IntegerProperty pickingID;
    private Order order;
    private Employee employeePicking;
    private ObservableList<PickingDetails> pickingList;

    public Picking(int pickingID, Order order, Employee employeePicking, ObservableList<PickingDetails> pickingList){
        this.pickingID = new SimpleIntegerProperty(pickingID);
        this.order = order;
        this.employeePicking = employeePicking;
        this.pickingList = pickingList;
    }

    public IntegerProperty getPickingIDProperty() {
        return this.pickingID;
    }

    public int getPickingID(){
        return this.pickingID.get();
    }

    public Order getOrder() {
        return this.order;
    }

    public Employee getEmployeePicking() {
        return this.employeePicking;
    }

    public ObservableList<PickingDetails> getPickingList() {
        return this.pickingList;
    }

    public void addPickingDetail(Product product, int quantityToBePicked){
        this.pickingList.add(new PickingDetails(product, quantityToBePicked));
    }

    public void setPickingID(int pickingID) {
        this.pickingID.set(pickingID);
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setEmployeePicking(Employee employeePicking) {
        this.employeePicking = employeePicking;
    }

    public void setPickingList(ObservableList<PickingDetails> pickingList) {
        this.pickingList = pickingList;
    }

    public class PickingDetails{
        private Product product;
        private IntegerProperty quantityToBePicked;

        public PickingDetails(Product product, int quantityToBePicked){
            this.product = product;
            this.quantityToBePicked = new SimpleIntegerProperty(quantityToBePicked);
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public int getQuantityToBePicked() {
            return quantityToBePicked.get();
        }

        public IntegerProperty quantityToBePickedProperty() {
            return quantityToBePicked;
        }

        public void setQuantityToBePicked(int quantityToBePicked) {
            this.quantityToBePicked.set(quantityToBePicked);
        }

    }
}
