public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String Username;
    int PhoneNumber;

    public void setUsername(String username) {
        this.Username = username;
    }
    public void setPhoneNumber(int phonenumber) {
        this.PhoneNumber = phonenumber;
    }
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message

    public void Register(){
        System.out.println("Register Success.");
        System.out.println("Name: " + Username); 
        System.out.println("Phone Number: " + PhoneNumber); 
        System.out.println("==============================");
    }
}
