package com.firstPage;

public class GetterSetter {

    private String name;
    private String dob;
    private String mobile;
    private String email;
    private String password;

    public String getName(String name) {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
