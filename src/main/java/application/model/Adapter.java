package application.model;

import java.util.Set;

public class Adapter {

    private Integer id;
    private String brand;
    private String adapterName;
    private String partNumber;
    private double voltage;
    private double amperage;
    private double power;
    private String connector;
    private Set<Laptop> laptopsList;

    public Adapter() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Set<Laptop> getLaptopsList() {
        return laptopsList;
    }

    public void setLaptopsList(Set<Laptop> laptopsList) {
        this.laptopsList = laptopsList;
    }

    public String getAdapterName() {
        return adapterName;
    }

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getAmperage() {
        return amperage;
    }

    public void setAmperage(double amperage) {
        this.amperage = amperage;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }
}
