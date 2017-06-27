package com.example.mcnight.ballislife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int team1 = 0;
    int team2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create Reset Button
        Button reset = (Button) findViewById(R.id.reset_b);
        // Team 1 Bulls buttons
        Button three_1 = (Button) findViewById(R.id.threepoint_1);
        Button two_1 = (Button) findViewById(R.id.twopoint_1);
        Button free_1 = (Button) findViewById(R.id.ft_1);
        final TextView points_1 = (TextView) findViewById(R.id.team_1);

        // Team 2 Warriors buttons
        Button three_2 = (Button) findViewById(R.id.threepoint_2);
        Button two_2 = (Button) findViewById(R.id.twopoint_2);
        Button free_2 = (Button) findViewById(R.id.ft_2);
        final TextView points_2 = (TextView) findViewById(R.id.team_2);


        three_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                team1 = team1 + 3;
                points_1.setText("" + team1);

            }
        });

        three_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                team2 = team2 + 3;
                points_2.setText("" + team2);

            }
        });

        two_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                team1 = team1 + 2;
                points_1.setText("" + team1);

            }
        });

        two_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                team2 = team2 + 2;
                points_2.setText("" + team2);

            }
        });

        free_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                team1 = team1 + 1;
                points_1.setText("" + team1);

            }
        });


        free_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                team2 = team2 + 1;
                points_2.setText("" + team2);

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team1 = 0;
                team2 = 0;
                points_1.setText("0");
                points_2.setText("0");
            }
        });


    }


}
