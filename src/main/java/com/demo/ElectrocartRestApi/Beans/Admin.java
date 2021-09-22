package com.demo.ElectrocartRestApi.Beans;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long adminid;
    private String aname;
    private String aemail;
    private String apassword;
    private String acontactnumber;
    private String aaddress;

    public Admin(String aname, String aemail, String apassword, String acontactnumber, String aaddress) {
        this.aname = aname;
        this.aemail = aemail;
        this.apassword = apassword;
        this.acontactnumber = acontactnumber;
        this.aaddress = aaddress;
    }

    public Admin() {
    }

    public Long getAdminid() {
        return adminid;
    }

    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public String getAcontactnumber() {
        return acontactnumber;
    }

    public void setAcontactnumber(String acontactnumber) {
        this.acontactnumber = acontactnumber;
    }

    public String getAaddress() {
        return aaddress;
    }

    public void setAaddress(String aaddress) {
        this.aaddress = aaddress;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminid=" + adminid +
                ", aname='" + aname + '\'' +
                ", aemail='" + aemail + '\'' +
                ", apassword='" + apassword + '\'' +
                ", acontactnumber='" + acontactnumber + '\'' +
                ", aaddress='" + aaddress + '\'' +
                '}';
    }
}
