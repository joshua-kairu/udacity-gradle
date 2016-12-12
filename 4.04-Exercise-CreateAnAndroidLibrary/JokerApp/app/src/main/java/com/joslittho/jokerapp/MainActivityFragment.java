package com.joslittho.jokerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.joslittho.jokelibrary.JokeActivity;
import com.joslittho.jokelibrary.JokeFragment;
import com.joslittho.jokes.JokeCreator;

/**
 *
 */// begin fragment MainActivityFragment
public class MainActivityFragment extends Fragment {

    /* CONSTANTS */

    /* VARIABLES */

    /* CONSTRUCTOR */

    public MainActivityFragment() {
        // Required empty public constructor
    }

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

        // 0. Inflate the layout for this fragment
        // 1. get the joke button
        // 2. on joke button click
        // 2a. retrieve the joke from the joke creator library
        // 2b. package joke as intent extra
        // 2c. launch the joke creator AAR's joke activity
        // last. return the inflated view

        // 0. Inflate the layout for this fragment

        View rootView = inflater.inflate( R.layout.fragment_main, container, false );

        // 1. get the joke button

        Button jokeButton = ( Button ) rootView.findViewById( R.id.main_b_joke );

        // 2. on joke button click

        // begin jokeButton.setOnClickListener
        jokeButton.setOnClickListener(

                // begin new View.OnClickListener
                new View.OnClickListener() {

                    @Override
                    // begin onClick
                    public void onClick( View view ) {

                        // 2a. retrieve the joke from the joke creator library

                        String joke = new JokeCreator().getJoke();

                        // 2b. package joke as intent extra

                        Intent intent = new Intent( getActivity(), JokeActivity.class )
                                .putExtra( JokeFragment.ARGUMENT_JOKE, joke );

                        // 2c. launch the joke creator AAR's joke activity

                        startActivity( intent );

                    } // end onClick

                } // end new View.OnClickListener

        ); // end jokeButton.setOnClickListener

        // last. return the inflated view

        return rootView;

    } // end onCreateView

} // end fragment MainActivityFragment
