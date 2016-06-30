package com.zte.criminalintent;

import android.widget.Button;
import android.widget.CheckBox;

import java.util.Date;
import java.util.UUID;

/**
 * Created by lileyang on 2016/5/12.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getId() {
        return mId;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
