package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double mMagnitude, String place, long time, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = place;
        this.mTimeInMilliseconds = time;
        this.mUrl = mUrl;
    }

    public double  getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }

    @Override
    public String toString() {

        return "Word{" +
                "mMagnitude='" + mMagnitude + '\'' +
                ", mLocation='" + mLocation + '\'' +
                ", mTimeInMilliseconds=" + mTimeInMilliseconds +
                ", mUrl=" + mUrl +
                "}";
    }
}
