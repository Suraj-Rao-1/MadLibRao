package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v) {

        try {
            EditText pastTenseVerb = (EditText) findViewById(R.id.pastTenseVerb);
            EditText organism = (EditText) findViewById(R.id.organism);
            EditText number = (EditText) findViewById(R.id.number);
            EditText adjective = (EditText) findViewById(R.id.adjective);
            EditText country = (EditText) findViewById(R.id.country);
            EditText bigPlace = (EditText) findViewById(R.id.bigPlace);

            String pastTenseVerb1 = pastTenseVerb.getText().toString();
            String organism1 = organism.getText().toString();
            String number1 = number.getText().toString();
            String adjective1 = adjective.getText().toString();
            String country1 = country.getText().toString();
            String bigPlace1 = bigPlace.getText().toString();

            if(pastTenseVerb1.isEmpty() || organism1.isEmpty() || number1.isEmpty() || adjective1.isEmpty() || country1.isEmpty() || bigPlace1.isEmpty()){
                TextView textView = (TextView) findViewById(R.id.error);
                textView.setText("Fill in ALL the Blanks!");
            }

            else {

                Intent intent = new Intent(this, MadLibActivity.class);

                intent.putExtra(MadLibActivity.PAST_TENSE_VERB, pastTenseVerb1);
                intent.putExtra(MadLibActivity.ORGANISM, organism1);
                intent.putExtra(MadLibActivity.NUMBER, number1);
                intent.putExtra(MadLibActivity.ADJECTIVE, adjective1);
                intent.putExtra(MadLibActivity.COUNTRY, country1);
                intent.putExtra(MadLibActivity.BIG_PLACE, bigPlace1);

                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }

        }catch(Exception e){
            TextView textView = (TextView) findViewById(R.id.error);
            textView.setText("Please Enter Valid Input!");
        }
    }

    public void shareInfo(View v){
        EditText pastTenseVerb = (EditText) findViewById(R.id.pastTenseVerb);
        EditText organism = (EditText) findViewById(R.id.organism);
        EditText number = (EditText) findViewById(R.id.number);
        EditText adjective = (EditText) findViewById(R.id.adjective);
        EditText country = (EditText) findViewById(R.id.country);
        EditText bigPlace = (EditText) findViewById(R.id.bigPlace);

        String pastTenseverb1 = pastTenseVerb.getText().toString();
        String organism1 = organism.getText().toString();
        String number1 = number.getText().toString();
        String adjective1 = adjective.getText().toString();
        String country1 = country.getText().toString();
        String bigPlace1 = bigPlace.getText().toString();

        String strToDisplay = "Modern society has " + pastTenseVerb + " in every way possible. ";
        strToDisplay += "A single " + organism + " can access the weather " + number + " miles away. ";
        strToDisplay += "The epitome of this success is the " + adjective + " country of " + country + " . ";
        strToDisplay += "This species is the best to ever have existed in the history of the " + bigPlace + " .";

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, strToDisplay);

        String chooserTitle = getString(R.string.app_name);

        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }

    public void clear(View v){
        EditText pastTenseVerb = (EditText) findViewById(R.id.pastTenseVerb);
        EditText organism = (EditText) findViewById(R.id.organism);
        EditText number = (EditText) findViewById(R.id.number);
        EditText adjective = (EditText) findViewById(R.id.adjective);
        EditText country = (EditText) findViewById(R.id.country);
        EditText bigPlace = (EditText) findViewById(R.id.bigPlace);

        pastTenseVerb.setText("");
        organism.setText("");
        number.setText("");
        adjective.setText("");
        country.setText("");
        bigPlace.setText("");
    }

}
