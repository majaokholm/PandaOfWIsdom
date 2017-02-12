package com.majaokholm.thepandaofwisdom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class QuestionActivity extends AppCompatActivity implements View.OnClickListener{

    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        myButton = (Button) findViewById(R.id.myButton);
        myButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        TextView QA = (TextView) findViewById(R.id.qa);
        Button myButton = (Button) findViewById(R.id.myButton);
        ImageView panda = (ImageView) findViewById(R.id.panda);

        Random r = new Random();
        int random = r.nextInt(6);

        switch (random){
            case 1:
                    QA.setText("Yes");
                    myButton.setText("Ask him again");
                    panda.setImageResource(R.mipmap.panda2);
                break;
            case 2:
                    QA.setText("No");
                    myButton.setText("Ask him again");
                    panda.setImageResource(R.mipmap.panda2);
                break;
            case 3:
                    QA.setText("NO WAY!");
                    myButton.setText("Ask him again");
                    panda.setImageResource(R.mipmap.angrypanda2);
                break;
            case 4:
                    QA.setText("But of course!");
                    myButton.setText("Ask him again");
                    panda.setImageResource(R.mipmap.panda3);
                break;
            case 5:
                QA.setText("Call your mom...");
                myButton.setText("Ask him again");
                panda.setImageResource(R.mipmap.panda2);
                break;
            default:
                break;
        }

    }
}


