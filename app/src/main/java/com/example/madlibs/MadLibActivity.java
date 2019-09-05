package com.example.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibActivity extends AppCompatActivity {

    public static final String PAST_TENSE_VERB = "pastTenseVerb";
    public static final String ORGANISM = "organism";
    public static final String NUMBER = "number";
    public static final String ADJECTIVE = "adjective";
    public static final String COUNTRY = "country";
    public static final String BIG_PLACE = "bigPlace";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);
        Intent intent = getIntent();

        String pastTenseVerb = intent.getStringExtra(PAST_TENSE_VERB);
        String organism = intent.getStringExtra(ORGANISM);
        String number = intent.getStringExtra(NUMBER);
        String adjective = intent.getStringExtra(ADJECTIVE);
        String country = intent.getStringExtra(COUNTRY);
        String bigPlace = intent.getStringExtra(BIG_PLACE);


        String strToDisplay = "Modern society has " + pastTenseVerb + " in every way possible. ";
        strToDisplay += "A single " + organism + " can access the weather " + number + "miles away. ";
        strToDisplay += "The epitome of this success is the " + adjective + " country of " + country + " . ";
        strToDisplay += "This species is the best to ever have existed in the history of the " + bigPlace + " .";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }




}
