package com.example.mohamedsallam.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int foulA = 0;
    int foulB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamfoulA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsa);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamfoulB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsb);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamscoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorea);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamscoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreb);
        scoreView.setText(String.valueOf(score));
    }
    public void scoreA(View view) {
        scoreA=scoreA+1;
        displayForTeamscoreA(scoreA);
    }
    public void foulA(View view) {
        foulA=foulA+1;
        displayForTeamfoulA(foulA);
    }
    public void scoreB(View view) {
        scoreB=scoreB+1;
        displayForTeamscoreB(scoreB);
    }
    public void foulB(View view) {
        foulB=foulB+1;
        displayForTeamfoulB(foulB);
    }
    public void resets(View view) {
        foulA=0;foulB=0;
        scoreA=0;scoreB=0;
        displayForTeamfoulA(foulA);
        displayForTeamscoreA(scoreA);
        displayForTeamscoreB(scoreB);
        displayForTeamfoulB(foulB);
    }
}
