package case_study.models;

import java.util.Scanner;

public abstract class Services {
    private Scanner scanner = new Scanner(System.in);

    private String serviceId;
    private String serviceName;
    private double usableArea;
    private double rentalCosts;
    private int maximunPeople;
    private String rentalType;

    public Services() {
    }

    public Services(String serviceId, String serviceName, double usableArea, double rentalCosts, int maximunPeople, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximunPeople = maximunPeople;
        this.rentalType = rentalType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximunPeople() {
        return maximunPeople;
    }

    public void setMaximunPeople(int maximunPeople) {
        this.maximunPeople = maximunPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public abstract String showInfo();
}
