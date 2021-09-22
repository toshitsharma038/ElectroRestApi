package com.demo.ElectrocartRestApi.Beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="vendor")
public class Vendor
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vid", nullable = false)
    private Long vid;
    private  String vname;
    private String password;
    private String vaddress;
    private long vcontactnumber;
    private String vcity;

    @OneToMany(mappedBy = "vendorid")
    private List<Vendor> vendorid;

    @OneToMany(mappedBy = "vendor")
    private List<Vendor> vendor;

    public Long getVid() {
        return vid;
    }

    public void setVid(Long vid) {
        this.vid = vid;
    }

    public Vendor() {
    }

    public Vendor(String vname, String password, String vaddress, long vcontactnumber, String vcity) {
        this.vname = vname;
        this.password = password;
        this.vaddress = vaddress;
        this.vcontactnumber = vcontactnumber;
        this.vcity = vcity;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vid=" + vid +
                ", vname='" + vname + '\'' +
                ", password='" + password + '\'' +
                ", vaddress='" + vaddress + '\'' +
                ", vcontactnumber=" + vcontactnumber +
                ", vcity='" + vcity + '\'' +
                '}';
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVaddress() {
        return vaddress;
    }

    public void setVaddress(String vaddress) {
        this.vaddress = vaddress;
    }

    public long getVcontactnumber() {
        return vcontactnumber;
    }

    public void setVcontactnumber(long vcontactnumber) {
        this.vcontactnumber = vcontactnumber;
    }

    public String getVcity() {
        return vcity;
    }

    public void setVcity(String vcity) {
        this.vcity = vcity;
    }
}
