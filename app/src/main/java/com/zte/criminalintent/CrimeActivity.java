package com.zte.criminalintent;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected android.support.v4.app.Fragment createFragment() {
       // return new CrimeFragment();
        UUID crimeId = (UUID)getIntent().getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }


}
