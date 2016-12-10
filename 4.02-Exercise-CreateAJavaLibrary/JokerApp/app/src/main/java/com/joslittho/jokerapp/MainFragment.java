package com.joslittho.jokerapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.joslittho.jokes.JokeMaker;
import com.joslittho.jokes.JokeSmith;

/**
 * A simple {@link Fragment} subclass.
 */
// begin fragment MainFragment
public class MainFragment extends Fragment {

    /* CONSTANTS */

    /* VARIABLES */

    /* CONSTRUCTOR */

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

        // 0. Inflate the layout for this fragment
        // 1. show the joke from the joke smith
        // 2. show the joke from the joke maker
        // last. return the inflated layout

        // 0. Inflate the layout for this fragment

        View rootView = inflater.inflate( R.layout.fragment_main, container, false );

        // 1. show the joke from the joke smith

        JokeSmith jokeSmith = new JokeSmith();

        TextView jokeSmithTextView = ( TextView ) rootView.findViewById( R.id.main_tv_jokesmith );

        jokeSmithTextView.setText( jokeSmith.getJoke() );

        // 2. show the joke from the joke maker

        JokeMaker jokeMaker = new JokeMaker();

        TextView jokeMakerTextView = ( TextView ) rootView.findViewById( R.id.main_tv_jokemaker );

        jokeMakerTextView.setText( jokeMaker.getJoke() );

        // last. return the inflated layout

        return rootView;

    } // end onCreateView

} // end fragment MainFragment
