package com.example.eiko.cookies;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by eiko on 11/3/2016.
 */
public class CourtCounter extends Activity {
    int shootScore = 0;
    int shootScoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.court_counter);
        displayForTeamA(shootScore);
        displayTeamB(shootScoreB);
    }
    public void displayForTeamA(int score){
        TextView teamAscore = (TextView)findViewById(R.id.teamA_score);
        teamAscore.setText(String.valueOf(score));
    }
    public void displayTeamB(int scoreB){
        TextView teamBscore = (TextView)findViewById(R.id.teamB_score);
        teamBscore.setText(String.valueOf(scoreB));
    }
    public void addOnePoints(View v){
        shootScore +=1;
        displayForTeamA(shootScore);
        }
    public void addTwoPoints(View v){
        shootScore += 2;
        displayForTeamA(shootScore);
    }
    public void addThreePoints(View v){
        shootScore += 3;
        displayForTeamA(shootScore);
    }

}
