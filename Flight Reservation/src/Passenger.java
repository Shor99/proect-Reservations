public class Passenger {
    private String firstName;
    private String lastName;
    private String seatClass;
    private String confirmationNumber;

    public Passenger(String firstName, String lastName, String seatClass, String confirmationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.seatClass = seatClass;
        this.confirmationNumber = confirmationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n' +
                "SeatClass: " + seatClass + '\n' +
                "ConfirmationNumber: " + confirmationNumber+ "\n";
    }
}
