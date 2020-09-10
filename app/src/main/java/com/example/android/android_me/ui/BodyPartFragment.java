package com.example.android.android_me.ui;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {
    // Mandatory constructor for instatiating the fragment
    public BodyPartFragment(){

    }

    //Inflates the fragment layout and sets any image resources

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        // Inflate the Android-me fragment layout
        View rootview = inflater.inflate(R.layout.fragment_body_part, container, false);

        //Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootview.findViewById(R.id.body_part_image_view);

        //set the image resource
//        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootview;
    }
}
