package com.example.android.futbolscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    Method to set score for team A in score display
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /*
    Method to set score for team B in score display
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /*
    Method to set fouls for team A in score display
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }
    /*
    Method to set fouls for team B in score display
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }
    /*
    Method to increase goals for team A
     */
    public void increaseTeamAgoals(View view) {
        scoreTeamA += 1;
        displayScoreForTeamA(scoreTeamA);
    }
    /*
    Method to increase goals for team B
     */
    public void increaseTeamBgoals(View view) {
        scoreTeamB += 1;
        displayScoreForTeamB(scoreTeamB);
    }
    /*
    Method to increase fouls for team A
     */
    public void increaseTeamAfouls(View view) {
        foulsTeamA += 1;
        displayFoulsForTeamA(foulsTeamA);
    }
    /*
    Method to increase fouls for team B
     */
    public void increaseTeamBfouls(View view) {
        foulsTeamB += 1;
        displayFoulsForTeamB(foulsTeamB);
    }
    /*
    Method to reset name of the first team edit view field
     */
    public void resetTeamAName() {
        EditText teamName = (EditText) findViewById(R.id.first_team_name);
        teamName.setText("");
    }
    /*
    Method to reset name of the second team edit view field
     */
    public void resetTeamBName() {
        EditText teamName = (EditText) findViewById(R.id.second_team_name);
        teamName.setText("");
    }
    /*
    Method to call all methods needed to reset the app when pressing reset button
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);
        resetTeamAName();
        resetTeamBName();
    }
}
