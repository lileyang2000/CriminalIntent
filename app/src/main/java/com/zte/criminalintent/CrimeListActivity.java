package com.zte.criminalintent;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected android.support.v4.app.Fragment createFragment() {
        return new CrimeListFragment();
    }


}
