package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultsActivity extends AppCompatActivity {
    ImageView starImageView;
    boolean starredAnswers = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_acitivity);


        // Get the user's score from the intent
        int correctAnswersCount = getIntent().getIntExtra("correctAnswersCount", 0);
        int totalQuestions = getIntent().getIntExtra("totalQuestions", 0);

            if (correctAnswersCount == 1)
            {
                ImageView starImageView = (ImageView) findViewById(R.id.starImageView1);
                starredAnswers = true;
            } else if (!starredAnswers)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView10);
                starImageView.setVisibility(View.GONE);

            }


            if (correctAnswersCount == 2)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.VISIBLE);



                starredAnswers = true;


            } else if (!starredAnswers)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView10);
                starImageView.setVisibility(View.GONE);;


            }


            if (correctAnswersCount == 3)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.VISIBLE);


                starredAnswers = true;
            } else if (!starredAnswers)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView10);
                starImageView.setVisibility(View.GONE);

            }


            if (correctAnswersCount == 4)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.VISIBLE);

                starredAnswers = true;
            } else if (!starredAnswers)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView10);
                starImageView.setVisibility(View.GONE);
            }


            if (correctAnswersCount == 5)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.VISIBLE);

                starredAnswers = true;
            } else if (!starredAnswers)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView10);
                starImageView.setVisibility(View.GONE);

            }


            if (correctAnswersCount == 6)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.VISIBLE);

                starredAnswers = true;
            } else if (!starredAnswers)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView10);
                starImageView.setVisibility(View.GONE);

            }

            if (correctAnswersCount == 7)
            {   starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.VISIBLE);

                starredAnswers = true;
            } else if (!starredAnswers)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView10);
                starImageView.setVisibility(View.GONE);
            }


            if (correctAnswersCount == 8)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.VISIBLE);

                starredAnswers = true;
            } else if (!starredAnswers)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView10);
                starImageView.setVisibility(View.GONE);

            }


            if (correctAnswersCount == 9)
            {   starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.VISIBLE);

                starredAnswers = true;
            } else if (!starredAnswers)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.GONE);


                starredAnswers = true;

            }


            if (correctAnswersCount == 10)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.VISIBLE);
                starImageView = (ImageView) findViewById(R.id.starImageView10);
                starImageView.setVisibility(View.VISIBLE);

                starredAnswers = true;
            } else if (!starredAnswers)
            {
                starImageView = (ImageView) findViewById(R.id.starImageView1);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView2);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView3);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView4);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView5);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView6);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView7);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView8);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView9);
                starImageView.setVisibility(View.GONE);
                starImageView = (ImageView) findViewById(R.id.starImageView10);
                starImageView.setVisibility(View.GONE);
            }


        // Display the user's score
        TextView textViewScore = findViewById(R.id.textViewScore);
        textViewScore.setText("Your Score: " + correctAnswersCount + "/" + totalQuestions);

        // Set up play again button
        Button buttonPlayAgain = findViewById(R.id.buttonPlayAgain);
        buttonPlayAgain.setOnClickListener(v -> {
            // Restart the game by navigating back to the MainQuestionsActivity
            Intent intent = new Intent(ResultsActivity.this, MainQuestionsActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Clear the activity stack
            startActivity(intent);
            finish(); // Finish the current activity
        });
    }
}

