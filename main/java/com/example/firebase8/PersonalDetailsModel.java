package com.example.firebase8;

public class PersonalDetailsModel {
    String name;
    String age;
    String phone;
    String address;
    String district;
    String pincode;

    public PersonalDetailsModel(String name, String age, String phone, String address, String district, String pincode) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.district = district;
        this.pincode = pincode;
    }

    public PersonalDetailsModel(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
