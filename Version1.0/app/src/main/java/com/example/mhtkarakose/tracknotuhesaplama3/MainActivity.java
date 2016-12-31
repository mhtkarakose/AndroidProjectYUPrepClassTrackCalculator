package com.example.mhtkarakose.tracknotuhesaplama3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_Calculate;
    EditText quiz1, quiz2, quiz3, quiz4;
    EditText midterm;
    EditText finaln;
    EditText wp,is;
    EditText absense, ort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Calculate = (Button) findViewById(R.id.btn_calculate);
        quiz1 = (EditText) findViewById(R.id.txt_q1);
        quiz2 = (EditText) findViewById(R.id.txt_q2);
        midterm = (EditText) findViewById(R.id.txt_midterm);
        quiz3 = (EditText) findViewById(R.id.txt_q3);
        quiz4 = (EditText) findViewById(R.id.txt_q4);
        finaln = (EditText) findViewById(R.id.txt_final);
        wp = (EditText) findViewById(R.id.txt_wp);
        is = (EditText) findViewById(R.id.txt_is);
        absense = (EditText) findViewById(R.id.txt_absense);
        ort = (EditText) findViewById(R.id.txt_ort);

        btn_Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = String.valueOf(quiz1.getText());   double n1 = Double.parseDouble(number1);
                String number2 = String.valueOf(quiz2.getText());   double n2 = Double.parseDouble(number2);
                String number3 = String.valueOf(midterm.getText()); double n3 = Double.parseDouble(number3);
                String number4 = String.valueOf(quiz3.getText());   double n4 = Double.parseDouble(number4);
                String number5 = String.valueOf(quiz4.getText());   double n5 = Double.parseDouble(number5);
                String number6 = String.valueOf(finaln.getText());  double n6 = Double.parseDouble(number6);
                String number7 = String.valueOf(wp.getText());      double n7 = Double.parseDouble(number7);
                String number8 = String.valueOf(is.getText());      double n8 = Double.parseDouble(number8);
                String number9 = String.valueOf(absense.getText()); int    n9 = Integer.parseInt(number9);

                double ortalama = (((n1 * 5/100) + (n2 * 5/100) + (n3 * 25/100) + (n4 * 5/100) + (n5 * 5/100) + (n6 * 40/100) + (n7 *10/100) + (n8 * 5/100)));
                String result = String.valueOf(ortalama);
                ort.setText(result);
                if(ortalama>=60)
                {
                    Toast.makeText(getApplicationContext(),"Congratulations!! You passed the track :)",Toast.LENGTH_LONG).show();

                }else if(ortalama>=55 && ortalama<60)
                {
                    if(n9<=60)
                    {
                        Toast.makeText(getApplicationContext(),"Your average is not enough. But you can enter Fast Track ",Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Unfortunately!! You did not pass the track :(",Toast.LENGTH_LONG).show();
                }


            }
        });




    }
}
