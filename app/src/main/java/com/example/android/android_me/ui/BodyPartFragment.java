package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;

import java.util.List;

public class BodyPartFragment extends Fragment {
    //Tag for logging
    private static final String TAG = "BodyPartFragment";


    // Variable to store a list of image resources and the index of the image that this fragment displays
    private List<Integer> mImageIds;
    private int mListIndex;


    // Mandatory constructor for instatiating the fragment
    public BodyPartFragment(){

    }

    //Inflates the fragment layout and sets any image resources

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // Get a reference to the ImageView in the fragment layout
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);



       if (mImageIds != null) {
           //set the image resource to the list items at the stored index
           imageView.setImageResource(mImageIds.get(mListIndex));

           // set a Click listener on the Image View
           imageView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   // increment position as long as the index remains <= the size of the image ids list
                   if (mListIndex < mImageIds.size() -1 ) {
                       mListIndex++;
                   } else {
                       // the end of the list has reached , so return to beginning index
                       mListIndex = 0;
                   }
                   // set the image resource to the new list item
                   imageView.setImageResource(mImageIds.get(mListIndex));
               }
           });
       }
       else {
           Log.v(TAG, "This fragment has a null list of image id's ");
       }

        // Return the rootView
        return rootView;
    }


    // Setter method for keeping track of the List images this fragment can display and which image
    //in the list is currently being displayed
    public void setImageIds(List<Integer> imageIds) {
        mImageIds = imageIds;
    }

    public void setListIndex(int index) {
        mListIndex = index;
    }
}
