package com.example.firebase8.Model;

public class PopularModel {
    String pname, pmodel, pprice;

    public PopularModel() {

    }

    public PopularModel(String pname, String pmodel, String pprice) {
        this.pname = pname;
        this.pmodel = pmodel;
        this.pprice = pprice;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPmodel() {
        return pmodel;
    }

    public void setPmodel(String pmodel) {
        this.pmodel = pmodel;
    }

    public String getPprice() {
        return pprice;
    }

    public void setPprice(String pprice) {
        this.pprice = pprice;
    }
}
