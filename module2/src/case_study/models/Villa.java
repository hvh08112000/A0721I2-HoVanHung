package case_study.models;

public class Villa extends Services{
    private String roomStandard;
    private String descriptionOfAmenitiesOther;
    private double poolArea;
    private int floor;


    public Villa() {
    }

    public Villa(String roomStandard, String descriptionOfAmenitiesOther, double poolArea, int floor) {
        this.roomStandard = roomStandard;
        this.descriptionOfAmenitiesOther = descriptionOfAmenitiesOther;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String serviceId, String serviceName, double usableArea, double rentalCosts, int maximunPeople, String rentalType, String roomStandard, String descriptionOfAmenitiesOther, double poolArea, int floor) {
        super(serviceId, serviceName, usableArea, rentalCosts, maximunPeople, rentalType);
        this.roomStandard = roomStandard;
        this.descriptionOfAmenitiesOther = descriptionOfAmenitiesOther;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescriptionOfAmenitiesOther() {
        return descriptionOfAmenitiesOther;
    }

    public void setDescriptionOfAmenitiesOther(String descriptionOfAmenitiesOther) {
        this.descriptionOfAmenitiesOther = descriptionOfAmenitiesOther;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String showInfo() {
        return "==========> VILLA <==========" + "\n" +
                "Service id: " + getServiceId() + "\n" +
                "Service name: " + getServiceName() + "\n" +
                "Usable area: " + getUsableArea() + "\n" +
                "Rental costs: " + getRentalCosts() + "\n" +
                "Maximun number of people: " + getMaximunPeople() + "\n" +
                "Retal type: " + getRentalType() + "\n" +
                "Room standard: " + roomStandard + "\n" +
                "Description of amenities other: " + descriptionOfAmenitiesOther + "\n" +
                "Swimming pool area: " + poolArea + "\n" +
                "Number of floor: " + floor;
    }

    public String getInfoToCSV() {
        return getServiceId() + "," + getServiceName() + "," + getUsableArea() + "," + getRentalCosts() + "," +
                getMaximunPeople() + "," + getRentalType() + "," + roomStandard + "," + descriptionOfAmenitiesOther + "," +
                poolArea + "," + floor;
    }
}
