package com.joslittho.jokelibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A {@link Fragment} to show a joke
 */
// begin fragment JokeFragment
public class JokeFragment extends Fragment {

    /* CONSTANTS */

    /* Strings */

    public static final String ARGUMENT_JOKE = "ARGUMENT_JOKE"; // ditto

    /* VARIABLES */

    /* Strings */

    private String joke; // ditto

    /* CONSTRUCTOR */

    public JokeFragment() {
        // Required empty public constructor
    }

    // begin method newInstance
    public static JokeFragment newInstance( String joke ) {

        // 0. put the joke in a bundle
        // 1. initialize this fragment with the bundle
        // 2. return the initialized fragment

        // 0. put the joke in a bundle

        Bundle bundle = new Bundle();

        bundle.putCharSequence( ARGUMENT_JOKE, joke );

        // 1. initialize this fragment with the bundle

        JokeFragment jokeFragment = new JokeFragment();
        jokeFragment.setArguments( bundle );

        // 2. return the initialized fragment

        return jokeFragment;

    } // end method newInstance

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

        // 0. Inflate the layout for this fragment
        // 1. get the joke passed in from arguments
        // 2. display the joke
        // last. return the inflated layout

        // 0. Inflate the layout for this fragment

        View rootView =  inflater.inflate( R.layout.jokedisplay_fragment_main, container, false );

        // 1. get the joke passed in from arguments

        if ( getArguments() != null ) { joke = getArguments().getString( ARGUMENT_JOKE ); }

        // 2. display the joke

        TextView jokeTextView = ( TextView ) rootView.findViewById( R.id.main_tv_joke );

        jokeTextView.setText( joke );

        // last. return the inflated layout

        return rootView;

    } // end onCreateView

} // end fragment JokeFragment
