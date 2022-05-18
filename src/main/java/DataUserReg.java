public class DataUserReg {
    String name;
    String lastName;
    String pass;
    String email;
    String confirmEmail;
    String dayBirth;
    String mounthBirth;
    String yearBirth;
    String choosenGender;


    public DataUserReg (String name, String pass, String email, String confirmEmail, String lastName, String dayBirth, String mounthBirth, String yearBirth, String chosenGender) {
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.confirmEmail = confirmEmail;
        this.lastName = lastName;
        this.dayBirth = dayBirth;
        this.mounthBirth = mounthBirth;
        this.yearBirth = yearBirth;
        this.choosenGender = chosenGender;
    }
}
