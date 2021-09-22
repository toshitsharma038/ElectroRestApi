package com.demo.ElectrocartRestApi.Beans;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oid;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date;
    private String deliverystatus;
    private long oquantity;

    @OneToMany(mappedBy = "deliveryperson")
    private List<DeliveryPerson> deliveryperson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="customerid")
    private User user;

    @ManyToOne
    @JoinColumn(name="productid")
    private Product product;

  @ManyToOne
  @JoinColumn(name="deliverypersonid")
  private DeliveryPerson deliveryPerson;

    public Order(Date date, String deliverystatus,long oquantity) {
        this.date = date;
        this.deliverystatus = deliverystatus;
        this.oquantity = oquantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", date=" + date +
                ", deliverystatus='" + deliverystatus + '\'' +
                ", oquantity='" + oquantity + '\'' +
                '}';
    }

    public Order() {
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDeliverystatus() {
        return deliverystatus;
    }

    public void setDeliverystatus(String deliverystatus) {
        this.deliverystatus = deliverystatus;
    }

    public long getOquantity() {
        return oquantity;
    }

    public void setOquantity(long oquantity) {
        this.oquantity = oquantity;
    }
}
