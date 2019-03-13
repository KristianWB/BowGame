package android.example.bowgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreCounterTeam1 = 0;
    int scoreCounterTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Team one score counter and display update

    public void addTenPointsTeam1(View view)   {
       scoreCounterTeam1 = scoreCounterTeam1 + 10;
        displayScoreForTeam1(scoreCounterTeam1);
    }

    public void addFivePointsTeam1(View view)   {
        scoreCounterTeam1 = scoreCounterTeam1 + 5;
        displayScoreForTeam1(scoreCounterTeam1);
    }

    public void addThreePointsTeam1(View view)   {
        scoreCounterTeam1 = scoreCounterTeam1 + 3;
        displayScoreForTeam1(scoreCounterTeam1);
    }

    public void addOnePointTeam1(View view)   {
        scoreCounterTeam1 = scoreCounterTeam1 + 1;
        displayScoreForTeam1(scoreCounterTeam1);
    }

    public void displayScoreForTeam1(int score)   {
       TextView scoreView = (TextView) findViewById(R.id.team_one_score);
       scoreView.setText(String.valueOf(score));
    }


    //Team two score counter and display update

    public void addTenPointsTeam2(View view)   {
        scoreCounterTeam2 = scoreCounterTeam2 + 10;
        displayScoreForTeam2(scoreCounterTeam2);
    }

    public void addFivePointsTeam2(View view)   {
        scoreCounterTeam2 = scoreCounterTeam2 + 5;
        displayScoreForTeam2(scoreCounterTeam2);
    }

    public void addThreePointsTeam2(View view)   {
        scoreCounterTeam2 = scoreCounterTeam2 + 3;
        displayScoreForTeam2(scoreCounterTeam2);
    }

    public void addOnePointTeam2(View view)   {
        scoreCounterTeam2 = scoreCounterTeam2 + 1;
        displayScoreForTeam2(scoreCounterTeam2);
    }

    public void displayScoreForTeam2(int score)   {
        TextView scoreView = (TextView) findViewById(R.id.team_two_score);
        scoreView.setText(String.valueOf(score));
    }

    //Reset button
    public void resetScore(View view)   {
        scoreCounterTeam1 = 0;
        scoreCounterTeam2 = 0;
        displayScoreForTeam1(scoreCounterTeam1);
        displayScoreForTeam2(scoreCounterTeam2);
    }

}
