package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class Delivery {

    private final IntegerProperty deliveryID;
    private Supplier supplier;
    private Employee employee;
    private final IntegerProperty palletCount;
    private LocalDate requiredDeliveryDate;
    private LocalDate deliveryArrivalDate;
    private StringProperty driverName;
    private ObservableList<DeliveryDetails> deliveryDetails;
    private DeliveryStatus deliveryStatus;

    /**
     * Constructor used to create NEW delivery order that is afterwards managed by supplier
     * @param deliveryID
     * @param supplier
     * @param employee
     * @param palletCount
     * @param deliveryDetails
     * @param deliveryStatus
     * @param requiredDeliveryDate
     * @param deliveryArrivalDate
     * @param driverName
     */

    public Delivery(int deliveryID, Supplier supplier, Employee employee, int palletCount, ObservableList<DeliveryDetails> deliveryDetails, String deliveryStatus, LocalDate requiredDeliveryDate){
        this.deliveryID = new SimpleIntegerProperty(deliveryID);
        this.supplier = supplier;
        this.employee = employee;
        this.palletCount = new SimpleIntegerProperty(palletCount);
        this.deliveryDetails = deliveryDetails;
        this.deliveryStatus = Enum.valueOf(DeliveryStatus.class, deliveryStatus);
        this.requiredDeliveryDate = requiredDeliveryDate;

        this.deliveryArrivalDate = null;
        this.driverName = new SimpleStringProperty();
    }

    /**
     * Constructor used to create a delivery instance that has already arrived at warehouse and is waiting for being taken by warehouse
     * @param deliveryID
     * @param supplier
     * @param employee
     * @param palletCount
     * @param deliveryDetails
     * @param deliveryStatus
     * @param requiredDeliveryDate
     * @param deliveryArrivalDate
     * @param driverName
     */
    public Delivery(int deliveryID, Supplier supplier, Employee employee, int palletCount, ObservableList<DeliveryDetails> deliveryDetails, String deliveryStatus, LocalDate requiredDeliveryDate, LocalDate deliveryArrivalDate, String driverName){
        this(deliveryID, supplier, employee, palletCount, deliveryDetails, deliveryStatus, requiredDeliveryDate);
        this.deliveryArrivalDate = deliveryArrivalDate;
        this.driverName = new SimpleStringProperty(driverName);
    }

    public int getDeliveryID() {
        return deliveryID.get();
    }

    public IntegerProperty deliveryIDProperty() {
        return deliveryID;
    }

    public void setDeliveryID(int deliveryID) {
        this.deliveryID.set(deliveryID);
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getPalletCount() {
        return palletCount.get();
    }

    public IntegerProperty palletCountProperty() {
        return palletCount;
    }

    public void setPalletCount(int palletCount) {
        this.palletCount.set(palletCount);
    }

    public LocalDate getRequiredDeliveryDate() {
        return requiredDeliveryDate;
    }

    public void setRequiredDeliveryDate(LocalDate requiredDeliveryDate) {
        this.requiredDeliveryDate = requiredDeliveryDate;
    }

    public LocalDate getDeliveryArrivalDate() {
        return deliveryArrivalDate;
    }

    public void setDeliveryArrivalDate(LocalDate deliveryArrivalDate) {
        this.deliveryArrivalDate = deliveryArrivalDate;
    }

    public String getDriverName() {
        return driverName.get();
    }

    public StringProperty driverNameProperty() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName.set(driverName);
    }

    public ObservableList<DeliveryDetails> getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(ObservableList<DeliveryDetails> deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }



    public enum DeliveryStatus{
        Order_Is_Placed("Order is placed", "Zamówienie złożone"), Arrived("Arrived", "Nadeszła"), Taken_By_Warehouse("Taken by warehouse", "Przyjęta przez magazyn");

        private String extendedVersion;
        private String polishVersion;

        private DeliveryStatus(String extendedVersion, String polishVersion){
            this.extendedVersion = extendedVersion;
            this.polishVersion = polishVersion;
        }

        public String getExtendedVersion() { return this.extendedVersion;}
        public String getPolishVersion() { return this.polishVersion;}

        public static String[] valuesExtended(){
            DeliveryStatus[] values = DeliveryStatus.values();
            String[] extendedValues = new String[values.length];
            for(int i =0; i < values.length; i++){
                extendedValues[i] = values[i].getExtendedVersion();
            }
            return extendedValues;
        }

        public static String[] polishValues(){
            DeliveryStatus[] values = DeliveryStatus.values();
            String[] polishValues = new String[values.length];
            for(int i = 0; i < values.length; i++){
                polishValues[i] = values[i].getPolishVersion();
            }
            return polishValues;
        }

        public static DeliveryStatus convertIntoEnglishVersion(String polishVersion){
            DeliveryStatus[] values = DeliveryStatus.values();
            for(DeliveryStatus ds : values){
                if(ds.getPolishVersion().equals(polishVersion)){
                    return ds;
                }
            }
            return null;
        }
    }



}
