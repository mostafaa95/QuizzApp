package com.example.android.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //global variable for correct answers
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    // boolean function return true if the answer is correct
    public boolean allTime() {
        EditText sherar = findViewById(R.id.edit_allTime);
        String answer = sherar.getText().toString().toLowerCase();
        if (answer.equals("alan shearer")) {
            return true;
        } else {
            return false;
        }
    }

    // boolean function return true if the answer is correct
    public boolean secondQuestion() {
        RadioButton arsenal = findViewById(R.id.arsenal);
        if (arsenal.isChecked()) {
            return true;
        } else return false;
    }

    // boolean function return true if the answer is correct
    public boolean thirdQuestion() {
        CheckBox salah = findViewById(R.id.salah_check);
        CheckBox mane = findViewById(R.id.sadio_check);
        CheckBox auba = findViewById(R.id.auba_check);
        CheckBox aguero = findViewById(R.id.sergio_check);
        if (aguero.isChecked()) {
            return false;
        } else if (salah.isChecked() && mane.isChecked() && auba.isChecked()) {
            return true;
        } else {
            return false;
        }
    }

    // boolean function return true if the answer is correct
    public boolean lastQuestion() {
        RadioButton champs = findViewById(R.id.utd_button);
        if (champs.isChecked()) {
            return true;
        } else {
            return false;
        }
    }

    // call the other functions when the button is submitted and increase score for each correct answer
    public void submitButton(View view) {
        if (allTime()) {
            score += 1;
        }
        if (secondQuestion()) {
            score += 1;
        }
        if (thirdQuestion()) {
            score += 1;
        }
        if (lastQuestion()) {
            score += 1;
        }
        if (score <= 1) {
            Toast.makeText(this, "your score is " + score + " it's okay not everyone love football", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "your score is " + score + " you really know the premier league", Toast.LENGTH_SHORT).show();
        }
        score = 0;

    }


}
