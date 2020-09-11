package com.example.android.android_me.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        if (savedInstanceState  == null) {
            // create a new head BodyPartFragment
            BodyPartFragment headFragment = new BodyPartFragment();

            //set the List of Image id's for the head fragment
            headFragment.setImageIds(AndroidImageAssets.getHeads());

            // set the position to the second image in the list
            headFragment.setListIndex(1);

            FragmentManager fragmentManager = getSupportFragmentManager();

            //fragment transaction
            fragmentManager.beginTransaction().add(R.id.head_container, headFragment).commit();



            // Create and display the body and leg BodyPartFragment

            BodyPartFragment bodyFrament = new BodyPartFragment();
            bodyFrament.setImageIds(AndroidImageAssets.getBodies());
            fragmentManager.beginTransaction().add(R.id.body_container, bodyFrament).commit();

            BodyPartFragment legFragment = new BodyPartFragment();
            legFragment.setImageIds(AndroidImageAssets.getLegs());
            fragmentManager.beginTransaction().add(R.id.leg_container, legFragment).commit();
        }


    }

}
