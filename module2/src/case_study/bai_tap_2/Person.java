package case_study.bai_tap_2;

public class Person {
    public String fullName;
    public String numberPhone;
    public String group;
    public String address;
    public String email;
    public String gender;
    public String dateOfBirth;

    public Person() {
    }

    public Person(String fullName, String numberPhone, String group, String address, String email, String gender, String dateOfBirth) {
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.group = group;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", group='" + group + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public String showName() {
        return "Person{" + "fullName=" + fullName + "}";
    }

    public String showNumberPhone() {
        return "Person{" + "numberPhone=" + numberPhone + "}";
    }

    public String showAddress() {
        return "Person{" + "address=" + address + "}";
    }

    public String showGender() {
        return "Person{" + "gender=" + gender + "}";
    }

    public String showGroup() {
        return "Person{" + "group=" + group + "}";
    }

}
