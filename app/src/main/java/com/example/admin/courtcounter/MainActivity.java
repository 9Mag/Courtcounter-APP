package com.example.admin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(3);
    }

    // ***************start of Team A code **************************

    // method when +3 button is clicked= TeamA
    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
        }

    // method when +2 button is clicked=TeamA
    public void addTowForTeamA(View v){
      scoreTeamA = scoreTeamA + 2;
      displayForTeamA(scoreTeamA);

    }

    // method when Free Throw button is clicked=TeamA
    public void addOneForTeamA(View v){
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // ************************start of team B code***********************

    // method when +3 button is clicked= TeamB
    public void addThreeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }


    // method when +2 button is clicked= TeamB
    public void addTwoForTeamB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    // method when Free Throw button is clicked= TeamB
    public void addOneForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    // ********RESET BUTTON METHOD **********************

    public void resetButton (View v){
     scoreTeamA = 0;
     scoreTeamB = 0;
     displayForTeamA(0);
     displayForTeamB(0);
    }
}
