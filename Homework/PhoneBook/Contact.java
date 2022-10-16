package PhoneBook;

public class Contact{
    protected String FirstName;
    protected String SecondName;
    protected String Phone;
    protected String Address;

    public Contact(String firstName, String secondName, String phone, String address) {
        this.FirstName = firstName;
        this.SecondName = secondName;
        this.Phone = phone;
        this.Address = address;
    }

    public String getAddress() {
        return Address;
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getSecondName() {
        return SecondName;
    }
    public String getPhone() {
        return Phone;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public void setSecondName(String secondName) {
        SecondName = secondName;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }
    public void setAddress(String address) {
        Address = address;
    }
}