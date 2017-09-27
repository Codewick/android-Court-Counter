package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int score_b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void increment_by_3(View view) {
        score = score + 3;

        displayForTeamA(score);
    }

    public void increment_by_2(View view) {
        score = score + 2;
        displayForTeamA(score);
    }

    public void increment_by_1(View view) {
        score = score + 1;
        displayForTeamA(score);
    }

//    team b score calculation
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void increment_by_3_b(View view) {
        score_b = score_b + 3;

        displayForTeamB(score_b);
    }

    public void increment_by_2_b(View view) {
        score_b = score_b + 2;
        displayForTeamB(score_b);
    }

    public void increment_by_1_b(View view) {
        score_b = score_b + 1;
        displayForTeamB(score_b);
    }

    public void reset(View view) {
        score = 0;
        score_b = 0;
        displayForTeamA(score);
        displayForTeamB(score_b);
    }
}
