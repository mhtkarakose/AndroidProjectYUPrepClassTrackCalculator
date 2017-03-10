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

public class KurIleGecme extends AppCompatActivity {
    Button btn_Calculate;
    EditText txt_Track1;
    EditText txt_Track2;
    EditText txt_Track3, txt_Averange, txt_abs;
    String number1,number2,number3,number4;
    double n1=0;
    double n2=0;
    double n3=0;
    int n4=0;
    double ortalama=0,ortalama2=0;




    RadioGroup rg, rg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kur_ile_gecme);
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
                txt_abs.setText("");
            }
        }); // OnClickListener End



        btn_Calculate = (Button) findViewById(R.id.btn_FlatCalculate);
        txt_Track1    = (EditText) findViewById(R.id.txt_Track1);
        txt_Track1.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});
        txt_Track2    = (EditText) findViewById(R.id.txt_Track2);
        txt_Track2.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});
        txt_Track3    = (EditText) findViewById(R.id.txt_Track3);
        txt_Track3.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});
        txt_Averange = (EditText) findViewById(R.id.txt_FlatAverange);
        txt_abs = (EditText) findViewById(R.id.txt_Abs);
        final RadioGroup rg = (RadioGroup) findViewById(R.id.radioGrup);
        final RadioGroup rg1 = (RadioGroup) findViewById(R.id.rd_kur);


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioBtn_50:
                        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                switch (checkedId){
                                    case R.id.rd_Elementary:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                Toast.makeText(getApplicationContext(),"3. kurda Elementary seviyesinde isen, Hazırlık Sınıfını Kur Ortalaması ile geçmen ne yazık ki mümkün değil.",Toast.LENGTH_LONG).show();
                                                Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girmen gerekiyor.",Toast.LENGTH_LONG).show();

                                            }
                                        });
                                        break; // rd_Elementary
                                    case R.id.rd_preintermediate:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                if(n3>=60){
                                                    if (ortalama2>=65)
                                                    {
                                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                                    }else{
                                                        if(n4<=160)
                                                        {
                                                            Toast.makeText(getApplicationContext(),"Ortalaman yetersiz, ama...",Toast.LENGTH_LONG).show();
                                                            Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girebilirsin",Toast.LENGTH_LONG).show();
                                                        }else{
                                                            Toast.makeText(getApplicationContext(),"Üzgünüm. Haziran FLAT Sınavına giremezsin.",Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }else{
                                                    Toast.makeText(getApplicationContext(),"Üzgünüm. 3 Kuru başarıyla bitirmedin.",Toast.LENGTH_LONG).show();
                                                }

                                            }
                                        });
                                        break; // rd_preintermediate
                                    case R.id.rd_Intermediate:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                if(n3>=60){
                                                    if (ortalama2>=60)
                                                    {
                                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                                    }else{
                                                        if(n4<=160)
                                                        {
                                                            Toast.makeText(getApplicationContext(),"Ortalaman yetersiz, ama...",Toast.LENGTH_LONG).show();
                                                            Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girebilirsin",Toast.LENGTH_LONG).show();
                                                        }else{
                                                            Toast.makeText(getApplicationContext(),"Üzgünüm. Haziran FLAT Sınavına giremezsin.",Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }else{
                                                    Toast.makeText(getApplicationContext(),"Üzgünüm. 3 Kuru başarıyla bitirmedin.",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });
                                        break;//rd_Intermediate
                                    case R.id.rd_UpperIntermediate:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                if(n3>=60){
                                                    if (ortalama2>=55)
                                                    {
                                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                                    }else{
                                                        if(n4<=160)
                                                        {
                                                            Toast.makeText(getApplicationContext(),"Ortalaman yetersiz, ama...",Toast.LENGTH_LONG).show();
                                                            Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girebilirsin",Toast.LENGTH_LONG).show();
                                                        }else{
                                                            Toast.makeText(getApplicationContext(),"Üzgünüm. Haziran FLAT Sınavına giremezsin.",Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }else{
                                                    Toast.makeText(getApplicationContext(),"Üzgünüm. 3 Kuru başarıyla bitirmedin.",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });
                                        break;//rd_UpperIntermediate End
                                    case R.id.rd_Advanced:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
                                                // n4 = Integer.parseInt(number4.toString());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                if(n3>=60){
                                                    if (ortalama2>=50)
                                                    {
                                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                                    }else{
                                                        if(n4<=160)
                                                        {
                                                            Toast.makeText(getApplicationContext(),"Ortalaman yetersiz, ama...",Toast.LENGTH_LONG).show();
                                                            Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girebilirsin",Toast.LENGTH_LONG).show();
                                                        }else{
                                                            Toast.makeText(getApplicationContext(),"Üzgünüm. Haziran FLAT Sınavına giremezsin.",Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }else{
                                                    Toast.makeText(getApplicationContext(),"Üzgünüm. 3 Kuru başarıyla bitirmedin.",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });
                                        break;// rd_Advanced END

                                }// switch END

                            }
                        });  //rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() END
                        break;// radioBtn_50 END
                    case R.id.radioBtn_65:
                        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                switch(checkedId) {
                                    case R.id.rd_Elementary:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                Toast.makeText(getApplicationContext(),"3. kurda Elementary seviyesinde isen, Hazırlık Sınıfını Kur Ortalaması ile geçmen ne yazık ki mümkün değil.",Toast.LENGTH_LONG).show();
                                                Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girmen gerekiyor.",Toast.LENGTH_LONG).show();

                                            }
                                        });
                                        break; // rd_Elementary
                                    case R.id.rd_preintermediate:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                Toast.makeText(getApplicationContext(),"3. kurda Pre-Intermadiate seviyesinde isen, Hazırlık Sınıfını Kur Ortalaması ile geçmen ne yazık ki mümkün değil.",Toast.LENGTH_LONG).show();
                                                Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girmen gerekiyor.",Toast.LENGTH_LONG).show();


                                            }
                                        });
                                        break; // rd_preintermediate
                                    case R.id.rd_Intermediate:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                if(n3>=60){
                                                    if (ortalama2>=65)
                                                    {
                                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                                    }else{
                                                        if(n4<=160)
                                                        {
                                                            Toast.makeText(getApplicationContext(),"Ortalaman yetersiz, ama...",Toast.LENGTH_LONG).show();
                                                            Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girebilirsin",Toast.LENGTH_LONG).show();
                                                        }else{
                                                            Toast.makeText(getApplicationContext(),"Üzgünüm. Haziran FLAT Sınavına giremezsin.",Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }else{
                                                    Toast.makeText(getApplicationContext(),"Üzgünüm. 3 Kuru başarıyla bitirmedin.",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });
                                        break;//rd_Intermediate
                                    case R.id.rd_UpperIntermediate:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                if(n3>=60){
                                                    if (ortalama2>=60)
                                                    {
                                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                                    }else{
                                                        if(n4<=160)
                                                        {
                                                            Toast.makeText(getApplicationContext(),"Ortalaman yetersiz, ama...",Toast.LENGTH_LONG).show();
                                                            Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girebilirsin",Toast.LENGTH_LONG).show();
                                                        }else{
                                                            Toast.makeText(getApplicationContext(),"Üzgünüm. Haziran FLAT Sınavına giremezsin.",Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }else{
                                                    Toast.makeText(getApplicationContext(),"Üzgünüm. 3 Kuru başarıyla bitirmedin.",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });
                                        break;//rd_UpperIntermediate End
                                    case R.id.rd_Advanced:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
                                                // n4 = Integer.parseInt(number4.toString());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                if(n3>=60){
                                                    if (ortalama2>=55)
                                                    {
                                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                                    }else{
                                                        if(n4<=160)
                                                        {
                                                            Toast.makeText(getApplicationContext(),"Ortalaman yetersiz, ama...",Toast.LENGTH_LONG).show();
                                                            Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girebilirsin",Toast.LENGTH_LONG).show();
                                                        }else{
                                                            Toast.makeText(getApplicationContext(),"Üzgünüm. Haziran FLAT Sınavına giremezsin.",Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }else{
                                                    Toast.makeText(getApplicationContext(),"Üzgünüm. 3 Kuru başarıyla bitirmedin.",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });
                                        break;// rd_Advanced END

                                }//switch END

                            }
                        });// rg1 END
                        break; // radioBtn_65 END
                    case R.id.radioBtn_75:
                        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                switch(checkedId) {
                                    case R.id.rd_Elementary:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                Toast.makeText(getApplicationContext(),"3. kurda Elementary seviyesinde isen, Hazırlık Sınıfını Kur Ortalaması ile geçmen ne yazık ki mümkün değil.",Toast.LENGTH_LONG).show();
                                                Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girmen gerekiyor.",Toast.LENGTH_LONG).show();

                                            }
                                        });
                                        break; // rd_Elementary
                                    case R.id.rd_preintermediate:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                Toast.makeText(getApplicationContext(),"3. kurda Pre-Intermadiate seviyesinde isen, Hazırlık Sınıfını Kur Ortalaması ile geçmen ne yazık ki mümkün değil.",Toast.LENGTH_LONG).show();
                                                Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girmen gerekiyor.",Toast.LENGTH_LONG).show();


                                            }
                                        });
                                        break; // rd_preintermediate
                                    case R.id.rd_Intermediate:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                if(n3>=60){
                                                    if (ortalama2>=65)
                                                    {
                                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                                    }else{
                                                        if(n4<=160)
                                                        {
                                                            Toast.makeText(getApplicationContext(),"Ortalaman yetersiz, ama...",Toast.LENGTH_LONG).show();
                                                            Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girebilirsin",Toast.LENGTH_LONG).show();
                                                        }else{
                                                            Toast.makeText(getApplicationContext(),"Üzgünüm. Haziran FLAT Sınavına giremezsin.",Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }else{
                                                    Toast.makeText(getApplicationContext(),"Üzgünüm. 3 Kuru başarıyla bitirmedin.",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });
                                        break;//rd_Intermediate
                                    case R.id.rd_UpperIntermediate:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                if(n3>=60){
                                                    if (ortalama2>=60)
                                                    {
                                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                                    }else{
                                                        if(n4<=160)
                                                        {
                                                            Toast.makeText(getApplicationContext(),"Ortalaman yetersiz, ama...",Toast.LENGTH_LONG).show();
                                                            Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girebilirsin",Toast.LENGTH_LONG).show();
                                                        }else{
                                                            Toast.makeText(getApplicationContext(),"Üzgünüm. Haziran FLAT Sınavına giremezsin.",Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }else{
                                                    Toast.makeText(getApplicationContext(),"Üzgünüm. 3 Kuru başarıyla bitirmedin.",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });
                                        break;//rd_UpperIntermediate End
                                    case R.id.rd_Advanced:
                                        btn_Calculate.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                number1 = String.valueOf(txt_Track1.getText());
                                                number2 = String.valueOf(txt_Track2.getText());
                                                number3 = String.valueOf(txt_Track3.getText());
                                                number4 = String.valueOf(txt_abs.getText());
                                                // n4 = Integer.parseInt(number4.toString());
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
                                                    n4 = Integer.parseInt(number4.toString());
                                                }catch (NumberFormatException e ) {
                                                    n4 = 0;
                                                }
                                                double ortalama = (n1 + n2 + n3)/3;
                                                final double ortalama2 = Math.ceil(ortalama); // yuvarlama kodu
                                                String result = String.valueOf(ortalama2);
                                                txt_Averange.setText(result);
                                                if(n3>=60){
                                                    if (ortalama2>=55)
                                                    {
                                                        Toast.makeText(getApplicationContext(),"Tebrikler. Hazırlık Sınıfını başarıyla tamamladın.",Toast.LENGTH_LONG).show();
                                                    }else{
                                                        if(n4<=160)
                                                        {
                                                            Toast.makeText(getApplicationContext(),"Ortalaman yetersiz, ama...",Toast.LENGTH_LONG).show();
                                                            Toast.makeText(getApplicationContext(),"Haziran FLAT sınavına girebilirsin",Toast.LENGTH_LONG).show();
                                                        }else{
                                                            Toast.makeText(getApplicationContext(),"Üzgünüm. Haziran FLAT Sınavına giremezsin.",Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }else{
                                                    Toast.makeText(getApplicationContext(),"Üzgünüm. 3 Kuru başarıyla bitirmedin.",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        });
                                        break;// rd_Advanced END

                                }//switch END

                            }
                        });// rg1 END
                        break; // radioBtn_65 END


                }// switch END

            }
        }); // rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() END





    }// onCreate END


}
