package case_study.models;

public class Customer extends Person{
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String typeOfGuest, String address) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String name, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String typeOfGuest, String address) {
        super(name, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String showInfo() {
        return "==========> Customer <==========" + "\n" +
                "Họ và tên: " + getName() + "\n" +
                "Ngày sinh: " + getDateOfBirth() + "\n" +
                "Giới tính: " + getGender() + "\n" +
                "Số CMND: " + getIdentityCardNumber() + "\n" +
                "Số ĐT: " + getPhoneNumber() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Loại khách: " + typeOfGuest + "\n" +
                "Địa chỉ: " + address;
    }

    public String getInfoToCSV() {
        return getName() + "," + getDateOfBirth() + "," + getGender() + "," + getIdentityCardNumber() + "," +
                getPhoneNumber() + "," + getEmail() + "," + typeOfGuest + "," + address;
    }
}
