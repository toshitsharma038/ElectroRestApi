package com.demo.ElectrocartRestApi.Beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customer")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long cusid;

    private String name;
    @Column(unique = true)
    private String email;

    private String password;
    private long contactnumber;
    private String address;

    @OneToMany(mappedBy = "user")
    private List<Product> product;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Order> orders;


    @Override
    public String toString() {
        return "User{" +
                "cusid=" + cusid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contactnumber='" + contactnumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public User() {
    }

    public User(String name, String email, String password, long contactnumber, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.contactnumber = contactnumber;
        this.address = address;
    }

    public long getCusid() {
        return cusid;
    }

    public void setCusid(long cusid) {
        this.cusid = cusid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(long contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
