
package satelier.estacionamientov2.logic.models;

import java.time.LocalDateTime;

public class Vehicle {
    
    private String patent;
    private String brand;
    private String model;

    private LocalDateTime entryDateTime;

    private LocalDateTime takeoutDateTime = null;
    private String available;
    private String registered;
    private VehicleType type;
    private double pay;

    public Vehicle() {
    }

    public Vehicle(String patent, String brand, String model, LocalDateTime entryDateTime, String available, String registered, VehicleType type, double pay) {
        this.patent = patent;
        this.brand = brand;
        this.model = model;
        this.entryDateTime = entryDateTime;
        this.available = available;
        this.registered = registered;
        this.type = type;
        this.pay = pay;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDateTime getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(LocalDateTime entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    public LocalDateTime getTakeoutDateTime() {
        return takeoutDateTime;
    }

    public void setTakeoutDateTime(LocalDateTime takeoutDateTime) {
        this.takeoutDateTime = takeoutDateTime;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
            
}
