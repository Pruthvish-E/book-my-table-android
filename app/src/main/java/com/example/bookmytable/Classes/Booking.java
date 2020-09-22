package com.example.bookmytable.Classes;

public class Booking {
    private String uid,rid,t1,t2,date,tableNo;

    public Booking(){}
    public Booking(String uid, String rid, String t1, String t2, String date,String tableNo) {
        this.uid = uid;
        this.rid = rid;
        this.t1 = t1;
        this.t2 = t2;
        this.date = date;
        this.tableNo=tableNo;
    }



    public String getUid() {
        return uid;
    }

    public String getTableNo() {
        return tableNo;
    }

    public void setTableNo(String tableNo) {
        this.tableNo = tableNo;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
