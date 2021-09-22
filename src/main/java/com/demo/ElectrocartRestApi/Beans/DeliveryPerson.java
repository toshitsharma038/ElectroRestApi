package com.demo.ElectrocartRestApi.Beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="deliveryperson")
public class DeliveryPerson
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long did;
    private String name;
    private String contactnumber;
    private String address;
    private String vehicletype;

  @OneToMany(mappedBy = "deliveryPerson")
  private List<DeliveryPerson> deliveryPerson;

    @ManyToOne
    @JoinColumn(name="orderid")
    private  DeliveryPerson deliveryperson;


    public DeliveryPerson(String name, String contactnumber, String address, String vehicletype)
    {
        this.name = name;
        this.contactnumber = contactnumber;
        this.address = address;
        this.vehicletype = vehicletype;
    }

    @Override
    public String toString() {
        return "DeliveryPerson{" +
                "did=" + did +
                ", name='" + name + '\'' +
                ", contactnumber='" + contactnumber + '\'' +
                ", address='" + address + '\'' +
                ", vehicletype='" + vehicletype + '\'' +
                '}';
    }

    public DeliveryPerson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did)
    {
        this.did = did;
    }
}
