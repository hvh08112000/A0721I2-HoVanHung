package case_study.models;

import java.util.Scanner;

public class Room extends Services{
    private Scanner scanner = new Scanner(System.in);

    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceId, String serviceName, double usableArea, double rentalCosts, int maximunPeople, String rentalType, String freeServiceIncluded) {
        super(serviceId, serviceName, usableArea, rentalCosts, maximunPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String showInfo() {
        return "==========> ROOM <==========" + "\n" +
                "Service id: " + getServiceId() + "\n" +
                "Service name: " + getServiceName() + "\n" +
                "Usable area: " + getUsableArea() + "\n" +
                "Rental costs: " + getRentalCosts() + "\n" +
                "Maximun number of people: " + getMaximunPeople() + "\n" +
                "Retal type: " + getRentalType() + "\n" +
                "Free service included: " + freeServiceIncluded;
    }

    public String getInfoToCSV() {
        return getServiceId() + "," + getServiceName() + "," + getUsableArea() + "," + getRentalCosts() + "," +
                getMaximunPeople() + "," + getRentalType() + "," + freeServiceIncluded;
    }
}
