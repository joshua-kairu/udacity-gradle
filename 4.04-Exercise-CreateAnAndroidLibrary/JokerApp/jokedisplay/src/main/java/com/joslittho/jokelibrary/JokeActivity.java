package com.joslittho.jokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * An {@link android.app.Activity} to display a joke
 */
// begin activity JokeActivity
public class JokeActivity extends AppCompatActivity {

    /* CONSTANTS */
    
    /* VARIABLES */
    
    /* CONSTRUCTOR */
    
    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super stuff
        // 1. use the main activity layout
        // 2. get the joke passed into the intent
        // 3. start off the joke fragment with the joke

        // 0. super stuff

        super.onCreate( savedInstanceState );

        // 1. use the main activity layout

        setContentView( R.layout.jokedisplay_activity_main );

        // 2. get the joke passed into the intent

        String joke = getString( R.string.no_joke );

        Bundle bundle = getIntent().getExtras();

        if ( bundle != null ) { joke = bundle.getString( JokeFragment.ARGUMENT_JOKE ); }

        // 3. start off the joke fragment with the joke

        getSupportFragmentManager().beginTransaction()
                .add( R.id.jokelibrary_main_fl_container, JokeFragment.newInstance( joke ) )
                .commit();

    } // end onCreate
    
    /* Other Methods */

} // end activity JokeActivity
