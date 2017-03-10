package com.example.mhtkarakose.tracknotuhesaplama3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_Calculate, btn_Reset;
    EditText quiz1, quiz2, quiz3, quiz4;
    EditText quiz1Task1, quiz1Task2;
    EditText quiz4Task1, quiz4Task2;
    EditText midterm;
    EditText finaln;
    EditText wp,is;
    EditText absense, ort;
    String number1 ,number11,number12;
    String number2,number3,number4,number5,number51,number52,number6,number7,number8,number9;
    double n1=0;
    double n11=0;
    double n12=0;
    double n2=0;
    double n3=0;
    double n4=0;
    double n5=0;
    double n51=0;
    double n52=0;
    double n6=0;
    double n7=0;
    double n8=0;
    int n9=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Calculate = (Button) findViewById(R.id.btn_calculate);
        btn_Reset = (Button) findViewById(R.id.btn_reset);

        quiz1 = (EditText) findViewById(R.id.txt_q1);
        quiz1.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        quiz1Task1 = (EditText) findViewById(R.id.txt_q1Task1);
        quiz1Task1.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        quiz1Task2 = (EditText) findViewById(R.id.txt_q1Task2);
        quiz1Task2.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        quiz2 = (EditText) findViewById(R.id.txt_q2);
        quiz2.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        midterm = (EditText) findViewById(R.id.txt_midterm);
        midterm.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        quiz3 = (EditText) findViewById(R.id.txt_q3);
        quiz3.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        quiz4 = (EditText) findViewById(R.id.txt_q4);
        quiz4.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        quiz4Task1 = (EditText) findViewById(R.id.txt_q4Task1);
        quiz4Task1.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        quiz4Task2 = (EditText) findViewById(R.id.txt_q4Task2);
        quiz4Task2.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        finaln = (EditText) findViewById(R.id.txt_final);
        finaln.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        wp = (EditText) findViewById(R.id.txt_wp);
        wp.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        is = (EditText) findViewById(R.id.txt_is);
        is.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});

        absense = (EditText) findViewById(R.id.txt_absense);

        ort = (EditText) findViewById(R.id.txt_ort);


        btn_Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number1 = String.valueOf(quiz1.getText());
                number11 = String.valueOf(quiz1Task1.getText());
                number12= String.valueOf(quiz1Task2.getText());
                number2 = String.valueOf(quiz2.getText());
                number3 = String.valueOf(midterm.getText());
                number4 = String.valueOf(quiz3.getText());
                number5 = String.valueOf(quiz4.getText());
                number51 = String.valueOf(quiz4Task1.getText());
                number52 = String.valueOf(quiz4Task2.getText());
                number6 = String.valueOf(finaln.getText());
                number7 = String.valueOf(wp.getText());
                number8 = String.valueOf(is.getText());
                number9 = String.valueOf(absense.getText());

                try {
                    n1 = Double.parseDouble(number1.toString());
                }catch (NumberFormatException e ) {
                    n1 = 0;
                }
                try {
                    n11 = Double.parseDouble(number11.toString());
                }catch (NumberFormatException e ) {
                    n11 = 0;
                }
                try {
                    n12= Double.parseDouble(number12.toString());
                }catch (NumberFormatException e ) {
                    n12 = 0;
                }
                try {
                    n2 = Double.parseDouble(number2.toString());
                }catch (NumberFormatException e ) {
                    n2 = 0;
                }
                try {
                    n3 = Double.parseDouble(number3.toString());
                }catch (NumberFormatException e ) {
                    n3 = 0;
                }
                try {
                    n4 = Double.parseDouble(number4.toString());
                }catch (NumberFormatException e ) {
                    n4 = 0;
                }
                try {
                    n5 = Double.parseDouble(number5.toString());
                }catch (NumberFormatException e ) {
                    n5 = 0;
                }
                try {
                    n51 = Double.parseDouble(number51.toString());
                }catch (NumberFormatException e ) {
                    n51 = 0;
                }
                try {
                    n52 = Double.parseDouble(number52.toString());
                }catch (NumberFormatException e ) {
                    n52 = 0;
                }
                try {
                    n6 = Double.parseDouble(number6.toString());
                }catch (NumberFormatException e ) {
                    n6 = 0;
                }
                try {
                    n7 = Double.parseDouble(number7.toString());
                }catch (NumberFormatException e ) {
                    n7 = 0;
                }
                try {
                    n8 = Double.parseDouble(number8.toString());
                }catch (NumberFormatException e ) {
                    n8 = 0;
                }
                try {
                    n9 = Integer.parseInt(number9.toString());
                }catch (NumberFormatException e ) {
                    n9 = 0;
                }


                double resultn1 = (n1*40/100) + (n11 * 30/100)+ (n12 * 30/100);
                double resultn5= (n5*40/100) + (n51 * 30/100) + (n52 * 30/100);

                double ortalama = (((resultn1 * 5/100) + (n2 * 5/100) + (n3 * 25/100) + (n4 * 5/100) + (resultn5 * 5/100) + (n6 * 40/100) + (n7 *10/100) + (n8 * 5/100)));
                double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                String result = String.valueOf(ortalama2);
                ort.setText(result);
                if(ortalama2>=60)
                {
                    Toast.makeText(getApplicationContext(),"Congratulations!! You passed the track :)",Toast.LENGTH_LONG).show();

                }else if(ortalama2>=55 && ortalama2<60)
                {
                    if(n9<=60)
                    {
                        Toast.makeText(getApplicationContext(),"Your average is low but you can still take Fast Track ",Toast.LENGTH_LONG).show();
                    }else
                    {
                        Toast.makeText(getApplicationContext(),"Unfortunately, you failed :(",Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Unfortunately, you failed :(",Toast.LENGTH_LONG).show();
                }
            }
        });

        btn_Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quiz1.setText("");
                quiz1Task1.setText("");
                quiz1Task2.setText("");
                quiz2.setText("");
                midterm.setText("");
                quiz3.setText("");
                quiz4.setText("");
                quiz4Task1.setText("");
                quiz4Task2.setText("");
                finaln.setText("");
                wp.setText("");
                is.setText("");
                absense.setText("");
                ort.setText("");
            }
        });



    }
}
