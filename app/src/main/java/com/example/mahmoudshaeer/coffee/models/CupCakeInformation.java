package com.example.mahmoudshaeer.coffee.models;

/**
 * Created by mahmoud Shaeer on 5/6/2017.
 */

public class CupCakeInformation {
    int idImageright;
    int idImageleft;
    String titleright;
    String getTitleLeft;
    String DetailsRight;
    String DetailsLeft;
    String Mright;
    String MLeft;
    String MpriceRight;
    String MpriceLeft;

    String lright;
    String lLeft;
    String lpriceRight;
    String lpriceLeft;

    public CupCakeInformation(int idImageright, int idImageleft,
                              String titleright, String getTitleLeft,
                              String detailsRight, String detailsLeft,
                              String mright, String MLeft,
                              String mpriceRight, String mpriceLeft,
                              String lright, String lLeft,
                              String lpriceRight, String lpriceLeft) {
        this.idImageright = idImageright;
        this.idImageleft = idImageleft;
        this.titleright = titleright;
        this.getTitleLeft = getTitleLeft;
        DetailsRight = detailsRight;
        DetailsLeft = detailsLeft;
        Mright = mright;
        this.MLeft = MLeft;
        MpriceRight = mpriceRight;
        MpriceLeft = mpriceLeft;
        this.lright = lright;
        this.lLeft = lLeft;
        this.lpriceRight = lpriceRight;
        this.lpriceLeft = lpriceLeft;
    }

    public void setIdImageright(int idImageright) {
        this.idImageright = idImageright;
    }

    public void setIdImageleft(int idImageleft) {
        this.idImageleft = idImageleft;
    }

    public void setTitleright(String titleright) {
        this.titleright = titleright;
    }

    public void setGetTitleLeft(String getTitleLeft) {
        this.getTitleLeft = getTitleLeft;
    }

    public void setDetailsRight(String detailsRight) {
        DetailsRight = detailsRight;
    }

    public void setDetailsLeft(String detailsLeft) {
        DetailsLeft = detailsLeft;
    }

    public void setMright(String mright) {
        Mright = mright;
    }

    public void setMLeft(String MLeft) {
        this.MLeft = MLeft;
    }

    public void setMpriceRight(String mpriceRight) {
        MpriceRight = mpriceRight;
    }

    public void setMpriceLeft(String mpriceLeft) {
        MpriceLeft = mpriceLeft;
    }

    public void setLright(String lright) {
        this.lright = lright;
    }

    public void setlLeft(String lLeft) {
        this.lLeft = lLeft;
    }

    public void setLpriceRight(String lpriceRight) {
        this.lpriceRight = lpriceRight;
    }

    public void setLpriceLeft(String lpriceLeft) {
        this.lpriceLeft = lpriceLeft;
    }

    public int getIdImageright() {
        return idImageright;
    }

    public int getIdImageleft() {
        return idImageleft;
    }

    public String getTitleright() {
        return titleright;
    }

    public String getGetTitleLeft() {
        return getTitleLeft;
    }

    public String getDetailsRight() {
        return DetailsRight;
    }

    public String getDetailsLeft() {
        return DetailsLeft;
    }

    public String getMright() {
        return Mright;
    }

    public String getMLeft() {
        return MLeft;
    }

    public String getMpriceRight() {
        return MpriceRight;
    }

    public String getMpriceLeft() {
        return MpriceLeft;
    }

    public String getLright() {
        return lright;
    }

    public String getlLeft() {
        return lLeft;
    }

    public String getLpriceRight() {
        return lpriceRight;
    }

    public String getLpriceLeft() {
        return lpriceLeft;
    }
}
