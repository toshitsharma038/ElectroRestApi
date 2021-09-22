package com.demo.ElectrocartRestApi.Beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long cid;
    private  String ctitle;

    @OneToMany(mappedBy = "category")
    private List<Product> product;


    public Category(String ctitle)
    {
        this.ctitle = ctitle;
    }

    public Category() {
    }

    @Override
    public String toString() {
        return "Category{" +
                "cid=" + cid +
                ", ctitle='" + ctitle + '\'' +
                '}';
    }

    public String getCtitle() {

        return ctitle;
    }

    public void setCtitle(String ctitle) {
        this.ctitle = ctitle;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }
}
