package com.example.mhtkarakose.tracknotuhesaplama3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    String mesaj= "YU Prep Class Track Calculator Download for Android " +
            "https://play.google.com/store/apps/details?id=com.mhtkarakose.yeniyu";

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
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Notlar Silindi.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
                    Toast.makeText(getApplicationContext(),"Tebrikler!! Kuru başarıyla tamamladın. :)",Toast.LENGTH_LONG).show();

                }else if(ortalama2>=55 && ortalama2<60)
                {
                    if(n9<=60)
                    {
                        Toast.makeText(getApplicationContext(),"Ortalaman geçmen için yeterli değil ama Fast-Track girebilirsin. ",Toast.LENGTH_LONG).show();
                    }else
                    {
                        Toast.makeText(getApplicationContext(),"Üzgünüm, hazırlığı başarı ile tamamlayamadın :(",Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Üzgünüm, hazırlığı başarı ile tamamlayamadın :(",Toast.LENGTH_LONG).show();
                }
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void paylasMesaj(String mesaj) {
        Intent paylasIntent = new Intent(Intent.ACTION_SEND);
        paylasIntent.setType("text/plain");
        paylasIntent.putExtra(Intent.EXTRA_TEXT,mesaj);
        startActivity(Intent.createChooser(paylasIntent,"Share!"));


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id==R.id.action_settings)
        {

        }

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.track_calculator) {
            Intent intent = new Intent(getApplicationContext(), TrackCalculator.class);
            startActivity(intent);

        } else if (id == R.id.all_track_calculator) {
            Intent intent2 = new Intent(getApplicationContext(), KurIleGecme.class);
            startActivity(intent2);
        } else if (id == R.id.flat_IleGecme) {
            Intent intent3 = new Intent(getApplicationContext(), FlatIleGecme.class);
            startActivity(intent3);
        } else if (id == R.id.nav_share) {
                paylasMesaj(mesaj);
        } else if (id == R.id.AboutMe) {

            Uri uri = Uri.parse("http://www.mehmetkarakose.com/tr/mehmet-karakose-iletisim-bilgileri/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);


        }
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }


}

