package com.example.mhtkarakose.tracknotuhesaplama3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;



public class FlatIleGecme extends AppCompatActivity {
    Button btn_Calculate;
    EditText txt_Track1;
    EditText txt_Track2;
    EditText txt_Track3, txt_Averange, txt_abs, txt_FlatNotu;
    String number1,number2,number3,number4;
    String numberFLAT;
    double n1=0;
    double n2=0;
    double n3=0;
    double nFLAT=0;
    int n4=0;
    double ortalama=0,ortalama2=0;

    RadioGroup rg, rg1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat_ile_gecme);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Notlar Silindi.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                txt_Track1.setText("");
                txt_Track2.setText("");
                txt_Track3.setText("");
                txt_Averange.setText("");
                txt_FlatNotu.setText("");
            }
        }); // OnClickListener END

        btn_Calculate = (Button) findViewById(R.id.btn_FlatCalculate);
        txt_Track1    = (EditText) findViewById(R.id.txt_Track1);
        txt_Track1.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});
        txt_Track2    = (EditText) findViewById(R.id.txt_Track2);
        txt_Track2.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});
        txt_Track3    = (EditText) findViewById(R.id.txt_Track3);
        txt_Track3.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});
        txt_FlatNotu  = (EditText) findViewById(R.id.txt_FlatNotu);
        txt_FlatNotu.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});
        txt_Averange = (EditText) findViewById(R.id.txt_FlatAverange);
        txt_abs = (EditText) findViewById(R.id.txt_Abs);
        final RadioGroup rg = (RadioGroup) findViewById(R.id.radioGrup);
        final RadioGroup rg1 = (RadioGroup) findViewById(R.id.rd_kur);


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioBtn_50:
                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                number1 = String.valueOf(txt_Track1.getText());
                                number2 = String.valueOf(txt_Track2.getText());
                                number3 = String.valueOf(txt_Track3.getText());
                                numberFLAT = String.valueOf(txt_FlatNotu.getText());

                                //n4 = Integer.parseInt(number4.toString());
                                try {
                                    n1 = Double.parseDouble(number1.toString());
                                }catch (NumberFormatException e ) {
                                    n1 = 0;
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
                                    nFLAT = Double.parseDouble(numberFLAT.toString());
                                }catch (NumberFormatException e){
                                    nFLAT =0;
                                }
                                double ortalama = ( (n1*20/100) + (n2*20/100) + (n3*20/100) + (nFLAT*40/100));
                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                String result = String.valueOf(ortalama2);
                                txt_Averange.setText(result);
                                if(nFLAT>=60)
                                {
                                    if(ortalama2 >=50){
                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                    }else{
                                        Toast.makeText(getApplicationContext(),"Üzgünüm. Hazırlığı başarıyla tamamlayamadın.",Toast.LENGTH_LONG).show();
                                    }

                                }else{
                                    Toast.makeText(getApplicationContext(),"Hazırlık sınıfını başarıyla tamamlaman için FLAT'den en az 60 alman gerekiyor.",Toast.LENGTH_LONG).show();


                                }
                            }
                        });
                        break; // radioBtn_50 END
                    case R.id.radioBtn_65:
                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                number1 = String.valueOf(txt_Track1.getText());
                                number2 = String.valueOf(txt_Track2.getText());
                                number3 = String.valueOf(txt_Track3.getText());
                                numberFLAT = String.valueOf(txt_FlatNotu.getText());

                                //n4 = Integer.parseInt(number4.toString());
                                try {
                                    n1 = Double.parseDouble(number1.toString());
                                }catch (NumberFormatException e ) {
                                    n1 = 0;
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
                                    nFLAT = Double.parseDouble(numberFLAT.toString());
                                }catch (NumberFormatException e){
                                    nFLAT =0;
                                }
                                double ortalama = ( (n1*20/100) + (n2*20/100) + (n3*20/100) + (nFLAT*40/100));
                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                String result = String.valueOf(ortalama2);
                                txt_Averange.setText(result);
                                if(nFLAT>=60)
                                {
                                    if(ortalama2 >=65){
                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                    }else{
                                        Toast.makeText(getApplicationContext(),"Üzgünüm. Hazırlığı başarıyla tamamlayamadın.",Toast.LENGTH_LONG).show();
                                    }

                                }else{
                                    Toast.makeText(getApplicationContext(),"Hazırlık sınıfını başarıyla tamamlaman için FLAT'den en az 60 alman gerekiyor.",Toast.LENGTH_LONG).show();


                                }
                            }
                        });
                        break;// 65 END
                    case R.id.radioBtn_75:
                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                number1 = String.valueOf(txt_Track1.getText());
                                number2 = String.valueOf(txt_Track2.getText());
                                number3 = String.valueOf(txt_Track3.getText());
                                numberFLAT = String.valueOf(txt_FlatNotu.getText());

                                //n4 = Integer.parseInt(number4.toString());
                                try {
                                    n1 = Double.parseDouble(number1.toString());
                                }catch (NumberFormatException e ) {
                                    n1 = 0;
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
                                    nFLAT = Double.parseDouble(numberFLAT.toString());
                                }catch (NumberFormatException e){
                                    nFLAT =0;
                                }
                                double ortalama = ( (n1*20/100) + (n2*20/100) + (n3*20/100) + (nFLAT*40/100));
                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                String result = String.valueOf(ortalama2);
                                txt_Averange.setText(result);
                                if(nFLAT>=60)
                                {
                                    if(ortalama2 >=75){
                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                    }else{
                                        Toast.makeText(getApplicationContext(),"Üzgünüm. Hazırlığı başarıyla tamamlayamadın.",Toast.LENGTH_LONG).show();
                                    }

                                }else{
                                    Toast.makeText(getApplicationContext(),"Hazırlık sınıfını başarıyla tamamlaman için FLAT'den en az 60 alman gerekiyor.",Toast.LENGTH_LONG).show();


                                }


                            }
                        });
                        break;// 75 END



                }// switch END


            }
        });// rg.setOncCheckedChangeListener END









    } // onCreate END

}
