package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.courtcounter.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;
    static final String SCORE_TEAM_A = "SCORE_TEAM_A";
    static final String SCORE_TEAM_B = "SCORE_TEAM_B";

    /**
     * Add score - team A
     */
    public void scoreFourA(View view) {
        scoreTeamA = scoreTeamA + 4;
        if (scoreTeamA - scoreTeamB > 5) {
            Toast.makeText(this, "Great job!", Toast.LENGTH_SHORT).show();
        }
        displayForTeamA(scoreTeamA);
    }

    public void scoreThreeA(View view) {
        scoreTeamA = scoreTeamA + 3;
        if (scoreTeamA - scoreTeamB > 5) {
            Toast.makeText(this, "Great job!", Toast.LENGTH_SHORT).show();
        }
        displayForTeamA(scoreTeamA);
    }

    public void scoreTwoA(View view) {
        scoreTeamA = scoreTeamA + 2;
        if (scoreTeamA - scoreTeamB > 5) {
            Toast.makeText(this, "Great job!", Toast.LENGTH_SHORT).show();
        }
        displayForTeamA(scoreTeamA);
    }

    public void scoreFreeThrowA(View view) {
        scoreTeamA = scoreTeamA + 1;
        if (scoreTeamA - scoreTeamB > 5) {
            Toast.makeText(this, "Great job!", Toast.LENGTH_SHORT).show();
        }
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add score - team B
     */
    public void scoreFourB(View view) {
        scoreTeamB = scoreTeamB + 4;
        if (scoreTeamB - scoreTeamA > 5) {
            Toast.makeText(this, "Great job!", Toast.LENGTH_SHORT).show();
        }
        displayForTeamB(scoreTeamB);
    }

    public void scoreThreeB(View view) {
        scoreTeamB = scoreTeamB + 3;
        if (scoreTeamB - scoreTeamA > 5) {
            Toast.makeText(this, "Great job!", Toast.LENGTH_SHORT).show();
        }
        displayForTeamB(scoreTeamB);
    }

    public void scoreTwoB(View view) {
        scoreTeamB = scoreTeamB + 2;
        if (scoreTeamB - scoreTeamA > 5) {
            Toast.makeText(this, "Great job!", Toast.LENGTH_SHORT).show();
        }
        displayForTeamB(scoreTeamB);
    }

    public void scoreFreeThrowB(View view) {
        scoreTeamB = scoreTeamB + 1;
        if (scoreTeamB - scoreTeamA > 5) {
            Toast.makeText(this, "Great job!", Toast.LENGTH_SHORT).show();
        }
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets both sides to 0.
     */
    public void reset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(SCORE_TEAM_A, scoreTeamA);
        savedInstanceState.putInt(SCORE_TEAM_B, scoreTeamB);
        super.onSaveInstanceState(savedInstanceState);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt(SCORE_TEAM_A);
            scoreTeamB = savedInstanceState.getInt(SCORE_TEAM_B);
        }
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);
        // Restore state members from saved instance
        scoreTeamA = savedInstanceState.getInt(SCORE_TEAM_A);
        scoreTeamB = savedInstanceState.getInt(SCORE_TEAM_B);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}