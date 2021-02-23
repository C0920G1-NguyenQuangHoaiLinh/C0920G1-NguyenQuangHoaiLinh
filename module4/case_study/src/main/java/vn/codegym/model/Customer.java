package vn.codegym.model;

import org.hibernate.annotations.Table;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Customer {
    @Id
    @NotEmpty
    @Pattern(regexp = "^(KH-)\\d{4}$",message = "Id wrong format ! Ex : KH-xxxx with x is number from 0 to 9 !")
    private String id;

    @NotEmpty(message = "enter name please !")
    private String customerName;

    @NotBlank
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String customerBirth;

    private String customerGender;
    @NotBlank
    @Pattern(regexp = "^(\\d{9}|\\d{12})$",message = "Wrong format ! idCard is 9 or 12 number !")
    private String customerIdCard;

    @NotBlank
    @Pattern(regexp = "^(0|\\+84)(90|91)\\d{7}$",message = "Numberphone wrong format ! Ex: +8490 or +8491 or 090 or 091 + xxxxxxx")
    private String customerPhone;

    @NotBlank
    @Email
    private String customerEmail;

    @ManyToOne
    @JoinColumn(name = "customer_type_id", referencedColumnName = "id")
    private CustomerType customerType;

    private String customerAddress;

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirth() {
        return customerBirth;
    }

    public void setCustomerBirth(String customerBirth) {
        this.customerBirth = customerBirth;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
