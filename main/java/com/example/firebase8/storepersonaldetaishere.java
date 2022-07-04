package com.example.firebase8;

public class storepersonaldetaishere {
    String name, age, mobile, address;

    public void Customers(){

    }

    public void Customers(String name, String age, String mobile, String address){
        this.name = name;
        this.age  = age;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAge(){
        return age;
    }

    public String getMobile(){
        return mobile;
    }

    public String getAddress(){
        return address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    public void setAddress(String address){
        this.address = address;
    }

}
