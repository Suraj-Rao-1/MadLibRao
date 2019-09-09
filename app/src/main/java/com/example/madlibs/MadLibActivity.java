package com.example.madlibs;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
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
        String adjective = intent.getStringExtra(ADJECTIVE);
        String number = intent.getStringExtra(NUMBER);
        String country = intent.getStringExtra(COUNTRY);
        String bigPlace = intent.getStringExtra(BIG_PLACE);


        String strToDisplay = "Modern society has " + pastTenseVerb + " in every way possible. ";
        strToDisplay += "A single " + organism + " can access the weather " + number + " miles away. ";
        strToDisplay += "The epitome of this success is the " + adjective + " country of " + country + ". ";
        strToDisplay += "This species is the best to ever have existed in the history of the " + bigPlace + ".";

        TextView str = (TextView) findViewById(R.id.info);

        SpannableString ss = new SpannableString(strToDisplay);

        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        StyleSpan boldSpan1 = new StyleSpan(Typeface.BOLD);
        StyleSpan boldSpan2 = new StyleSpan(Typeface.BOLD);
        StyleSpan boldSpan3 = new StyleSpan(Typeface.BOLD);
        StyleSpan boldSpan4 = new StyleSpan(Typeface.BOLD);
        StyleSpan boldSpan5 = new StyleSpan(Typeface.BOLD);

        ss.setSpan(boldSpan, 19, 19 + pastTenseVerb.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(boldSpan1, 19 + pastTenseVerb.length() + 33, 19 + pastTenseVerb.length() + 33 + organism.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(boldSpan2, 19 + pastTenseVerb.length() + 33 + organism.length() + 24, 19 + pastTenseVerb.length() + 33 + organism.length() + 24 + number.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(boldSpan3, 19 + pastTenseVerb.length() + 33 + organism.length() + 24 + number.length() + 48, 19 + pastTenseVerb.length() + 33 + organism.length() + 24 + number.length() + 48 + adjective.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(boldSpan4, 19 + pastTenseVerb.length() + 33 + organism.length() + 24 + number.length() + 48 + adjective.length() + 12, 19 + pastTenseVerb.length() + 33 + organism.length() + 24 + number.length() + 48 + adjective.length() + 12 + country.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(boldSpan5, 19 + pastTenseVerb.length() + 33 + organism.length() + 24 + number.length() + 48 + adjective.length() + 12 + country.length() + 70, 19 + pastTenseVerb.length() + 33 + organism.length() + 24 + number.length() + 48 + adjective.length() + 12 + country.length() + 70 + bigPlace.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        str.setText(ss);
    }

    public void goBack(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
