package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mTextView;
    private Button mAns1,mAns2;
    private int track=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView=(TextView)findViewById(R.id.storyTextView);
        mAns1=(Button)findViewById(R.id.buttonTop);
        mAns2=(Button)findViewById(R.id.buttonBottom);
        //mTextView.setText(R.string.T3_Story);
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(track==1 || track==2) {
                    mTextView.setText(R.string.T3_Story);
                    mAns1.setText(R.string.T3_Ans1);
                    mAns2.setText(R.string.T3_Ans2);
                    track=3;
                }else if(track==3){
                    mTextView.setText(R.string.T6_End);
                    mAns1.setText(R.string.T2_Ans1);
                    mAns2.setText(R.string.T2_Ans2);
                }
            }
        });

        mAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(track==1){
                    mTextView.setText(R.string.T2_Story);
                    mAns1.setText(R.string.T2_Ans1);
                    mAns2.setText(R.string.T2_Ans2);
                    track=2;
                }else if(track==2){
                    mTextView.setText(R.string.T4_End);
                    mAns1.setVisibility(View.GONE);
                    mAns2.setVisibility(View.GONE);
                }else if(track==3){
                    mTextView.setText(R.string.T5_End);
                    mAns1.setVisibility(View.GONE);
                    mAns2.setVisibility(View.GONE);
                }
               }
        });


                // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


                // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
