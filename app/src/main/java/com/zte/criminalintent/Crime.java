package com.zte.criminalintent;

import java.util.UUID;

/**
 * Created by lileyang on 2016/5/12.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime(){
        mId = UUID.randomUUID();
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


}
