package com.example.dimzproject;

public class Remote {

    private int mId;
    private int mPower;
    private  String mTime;

    public Remote() { }
    public Remote (int mId, int mPower, String mTime) {
        this.mId = mId;
        this.mPower = mPower;
        this.mTime = mTime;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId){
        this.mId = mId;
    }

    public int getmPower() {
        return mPower;
    }

    public void setmPower(int mPower){
        this.mPower = mPower;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime){
        this.mTime = mTime;
    }


}
