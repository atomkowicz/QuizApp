package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Get string parameter song name
        Bundle b = getIntent().getExtras();
        String score = b.getString("score");

        TextView correctAnswersTextView = (TextView) findViewById(R.id.answers_correct);
        TextView totalAnswersTextView = (TextView) findViewById(R.id.answers_total);

        correctAnswersTextView.setText(score);
        totalAnswersTextView.setText("5");

        Button playAgainButton = (Button) findViewById(R.id.button_play_again);
        TextView summaryTextView = (TextView) findViewById(R.id.summary);

        switch (Integer.parseInt(score)) {
            case 3:
                summaryTextView.setText("Not so bad");
                break;
            case 4:
                summaryTextView.setText("Nice score");
                break;
            case 5:
                summaryTextView.setText("Great score");
                break;
            default:
                summaryTextView.setText("Could be a bit better :)");
                break;
        }

        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SummaryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
