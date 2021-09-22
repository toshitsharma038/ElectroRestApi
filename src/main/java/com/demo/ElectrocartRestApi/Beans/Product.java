package com.demo.ElectrocartRestApi.Beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid", nullable = false)
    private Long productid;
    private String pname;
    private String pdescription;
    private String pimage;
    private String pprice;
    private String pgstnumber;
    private String pquantity;

    @ManyToOne
    @JoinColumn(name = "customerid")
    private User user;

    @ManyToOne
    @JoinColumn(name="categoryid")
    private Category  category;

    @OneToMany(mappedBy = "product")
    private  List<Product> product;

    public Product(String pname, String pdescription, String pimage, String pprice, String pgstnumber, String pquantity)
    {
        this.pname = pname;
        this.pdescription = pdescription;
        this.pimage = pimage;
        this.pprice = pprice;
        this.pgstnumber = pgstnumber;
        this.pquantity = pquantity;
    }

    public Product() {
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public String getPprice() {
        return pprice;
    }

    public void setPprice(String pprice) {
        this.pprice = pprice;
    }

    public String getPgstnumber() {
        return pgstnumber;
    }

    public void setPgstnumber(String pgstnumber) {
        this.pgstnumber = pgstnumber;
    }

    public String getPquantity() {
        return pquantity;
    }

    public void setPquantity(String pquantity) {
        this.pquantity = pquantity;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productid=" + productid +
                ", pname='" + pname + '\'' +
                ", pdescription='" + pdescription + '\'' +
                ", pimage='" + pimage + '\'' +
                ", pprice='" + pprice + '\'' +
                ", pgstnumber='" + pgstnumber + '\'' +
                ", pquantity='" + pquantity + '\'' +
                '}';
    }
}
