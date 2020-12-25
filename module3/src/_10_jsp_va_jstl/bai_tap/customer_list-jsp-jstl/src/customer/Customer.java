package customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String dateOfBirth;
    private String address;
    private String graphics;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String address, String graphics) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.graphics = graphics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }
}
