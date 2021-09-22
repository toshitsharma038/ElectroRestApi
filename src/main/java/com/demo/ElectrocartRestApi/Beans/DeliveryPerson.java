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
    private long dcontactnumber;
    private String address;
    private String vehicletype;




    @OneToMany(mappedBy = "deliveryPerson")
    private List<DeliveryPerson> deliveryPerson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="orderid")
    private  DeliveryPerson deliveryperson;

    @ManyToOne
    @JoinColumn(name="vendorid")
    private DeliveryPerson deliverypersonsid;


    public DeliveryPerson(String name,long dcontactnumber, String address, String vehicletype)
    {
        this.name = name;
        this.dcontactnumber = dcontactnumber;
        this.address = address;
        this.vehicletype = vehicletype;
    }

    @Override
    public String toString() {
        return "DeliveryPerson{" +
                "did=" + did +
                ", name='" + name + '\'' +
                ", contactnumber='" + dcontactnumber + '\'' +
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

    public long getDcontactnumber() {
        return dcontactnumber;
    }

    public void setDcontactnumber(long dcontactnumber) {
        this.dcontactnumber = dcontactnumber;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public Long getDid() {
        return did;
    }

    public void setDid(Long did)
    {
        this.did = did;
    }
}
