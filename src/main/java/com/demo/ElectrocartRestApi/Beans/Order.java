package com.demo.ElectrocartRestApi.Beans;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oid;
    private String date;
    private String deliverystatus;
    private String oquantity;

    @OneToMany(mappedBy = "deliveryperson")
    private List<DeliveryPerson> deliveryperson;

    @ManyToOne
    @JoinColumn(name="customerid")
    private User user;

    @ManyToOne
    @JoinColumn(name="productid")
    private Product product;

  @ManyToOne
  @JoinColumn(name="deliverypersonid")
  private DeliveryPerson deliveryPerson;

    public Order(String date, String deliverystatus, String oquantity) {
        this.date = date;
        this.deliverystatus = deliverystatus;
        this.oquantity = oquantity;
    }

    public Order() {
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeliverystatus() {
        return deliverystatus;
    }

    public void setDeliverystatus(String deliverystatus) {
        this.deliverystatus = deliverystatus;
    }

    public String getOquantity() {
        return oquantity;
    }

    public void setOquantity(String oquantity) {
        this.oquantity = oquantity;
    }
}
