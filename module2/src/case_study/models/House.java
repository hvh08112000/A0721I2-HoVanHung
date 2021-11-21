package case_study.models;

public class House extends Services{
    private String roomStandard;
    private String descriptionOfAmenitiesOther;
    private int floor;

    public House() {
    }

    public House(String roomStandard, String descriptionOfAmenitiesOther, int floor) {
        this.roomStandard = roomStandard;
        this.descriptionOfAmenitiesOther = descriptionOfAmenitiesOther;
        this.floor = floor;
    }

    public House(String serviceId, String serviceName, double usableArea, double rentalCosts, int maximunPeople, String rentalType, String roomStandard, String descriptionOfAmenitiesOther, int floor) {
        super(serviceId, serviceName, usableArea, rentalCosts, maximunPeople, rentalType);
        this.roomStandard = roomStandard;
        this.descriptionOfAmenitiesOther = descriptionOfAmenitiesOther;
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String showInfo() {
        return "==========> HOUSE <==========" + "\n" +
                "Service id: " + getServiceId() + "\n" +
                "Service name: " + getServiceName() + "\n" +
                "Usable area: " + getUsableArea() + "\n" +
                "Rental costs: " + getRentalCosts() + "\n" +
                "Maximun number of people: " + getMaximunPeople() + "\n" +
                "Retal type: " + getRentalType() + "\n" +
                "Room standard: " + roomStandard + "\n" +
                "Description of amenities other: " + descriptionOfAmenitiesOther + "\n" +
                "Number of floor: " + floor;
    }

    public String getInfoToCSV() {
        return getServiceId() + "," + getServiceName() + "," + getUsableArea() + "," + getRentalCosts() + "," +
                getMaximunPeople() + "," + getRentalType() + "," + roomStandard + "," + descriptionOfAmenitiesOther + "," + floor;
    }
}
