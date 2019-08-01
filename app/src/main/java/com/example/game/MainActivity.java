 package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
     int scoreTeamA=0;
     int scoreTeamB=0;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         displayForTeamA(0);
         displayforTeamB(0);
     }


     public void addThreeb(View view){
         scoreTeamB=scoreTeamB+3;
         displayforTeamB(scoreTeamB);

     }

     public void addTwob(View view){
         scoreTeamB=scoreTeamB+2;
         displayforTeamB(scoreTeamB);


     }


     public void freeThrowb(View view){
         scoreTeamB=scoreTeamB+1;
         displayforTeamB(scoreTeamB);

     }



     public void addThree(View view) {
         scoreTeamA=scoreTeamA+3;
         displayForTeamA(scoreTeamA);


     }

     public void addTwo(View view) {
         scoreTeamA=scoreTeamA+2;
         displayForTeamA(scoreTeamA);

     }

     public void freeThrow(View view) {
         scoreTeamA=scoreTeamA+1;
         displayForTeamA(scoreTeamA);
     }

     public void reset(View view){
         displayForTeamA(0);
         displayforTeamB(0);
     }



     public void displayForTeamA(int score) {
         TextView scoreView = (TextView) findViewById(R.id.team_a_score);
         scoreView.setText(String.valueOf(score));
     }

     public void displayforTeamB(int score){
         TextView scoreView = (TextView) findViewById(R.id.team_b_score);
         scoreView.setText(String.valueOf(score));
     }

 }
