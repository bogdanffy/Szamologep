package com.example.diak.szamologep;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Változók felvétele:

    private Button egy,ketto,harom,negy,ot,hat,het,nyolc,kilenc,nulla,pont;
    private Button osszeadas,kivonas,szorzas,osztas,vegeredmeny, torol;
    private EditText szam;
    private String szam2 = "";
    private double elso_szam = 0;
    private double masodik_szam = 0;
    private double eredmeny = 0;
    private double eredmeny2 = 0;
    private int mitcsinaljunk = 0; //1 = összeadás, 2 = kivonás, 3 = szorzás, 4 = osztás

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Képernyő mindig álló helyzetben

        egy = (Button) findViewById(R.id.button_egy);
        ketto = (Button) findViewById(R.id.button_ketto);
        harom = (Button) findViewById(R.id.button_harom);
        negy = (Button) findViewById(R.id.button_negy);
        ot = (Button) findViewById(R.id.button_ot);
        hat = (Button) findViewById(R.id.button_hat);
        het = (Button) findViewById(R.id.button_het);
        nyolc = (Button) findViewById(R.id.button_nyolc);
        kilenc = (Button) findViewById(R.id.button_kilenc);
        nulla = (Button) findViewById(R.id.button_nulla);
        osszeadas = (Button) findViewById(R.id.button_osszeadas);
        kivonas = (Button) findViewById(R.id.button_kivonas);
        szorzas = (Button) findViewById(R.id.button_szorzas);
        osztas = (Button) findViewById(R.id.button_osztas);
        vegeredmeny = (Button) findViewById(R.id.button_egyenlo);
        torol = (Button) findViewById(R.id.button_torol);
        szam = (EditText) findViewById(R.id.editText_vegeredmeny);
        pont = (Button) findViewById(R.id.button_dot);
        //szam.setEnabled(false);


        egy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam2 += "1";
                szam.setText(szam2);
            }
        });
        ketto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam2 += "2";
                szam.setText(szam2);
            }
        });
        harom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam2 += "3";
                szam.setText(szam2);
            }
        });
        negy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam2 += "4";
                szam.setText(szam2);
            }
        });
        ot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam2 += "5";
                szam.setText(szam2);
            }
        });
        hat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam2 += "6";
                szam.setText(szam2);
            }
        });
        het.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam2 += "7";
                szam.setText(szam2);
            }
        });
        nyolc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam2 += "8";
                szam.setText(szam2);
            }
        });
        kilenc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam2 += "9";
                szam.setText(szam2);
            }
        });
        nulla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam2 += "0";
                szam.setText(szam2);
            }
        });
        pont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(szam2 != "" && szam2.indexOf('.') < 0){
                    szam2 += ".";
                    szam.setText(szam2);
                }
            }
        });
        //Összeadás gomb eseménye
        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(szam2 != "") {
                    if (eredmeny == 0) {
                        elso_szam = Double.parseDouble(szam2);
                        mitcsinaljunk = 1;
                        szam.setText("");
                        szam2 = "";
                    } else {
                        elso_szam = Double.parseDouble(szam2);
                        mitcsinaljunk = 5;
                        szam.setText("");
                        szam2 = "";
                    }
                }
            }
        });

        //Kivonás gomb eseménye
        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(szam2 != "") {
                    if (eredmeny == 0) {
                        elso_szam = Double.parseDouble(szam2);
                        mitcsinaljunk = 2;
                        szam.setText("");
                        szam2 = "";
                    } else {
                        elso_szam = Double.parseDouble(szam2);
                        mitcsinaljunk = 6;
                        szam.setText("");
                        szam2 = "";
                    }
                }
            }
        });

        //Szorzás gomb eseménye
        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(szam2 != "") {
                    if (eredmeny == 0) {
                        elso_szam = Double.parseDouble(szam2);
                        mitcsinaljunk = 3;
                        szam.setText("");
                        szam2 = "";
                    } else {
                        elso_szam = Double.parseDouble(szam2);
                        mitcsinaljunk = 7;
                        szam.setText("");
                        szam2 = "";
                    }
                }
            }
        });

        //Osztás gomb eseménye
        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(szam2 != "") {
                    if (eredmeny == 0) {
                        elso_szam = Double.parseDouble(szam2);
                        mitcsinaljunk = 4;
                        szam.setText("");
                        szam2 = "";
                    } else {
                        elso_szam = Double.parseDouble(szam2);
                        mitcsinaljunk = 8;
                        szam.setText("");
                        szam2 = "";
                    }
                }
            }
        });

        //Egyenlőségjel eseménye.
        vegeredmeny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mitcsinaljunk){
                    //összeadás
                    case 1:
                        masodik_szam = Double.parseDouble(szam2);
                        eredmeny = elso_szam + masodik_szam;
                        szam.setText(parse(elso_szam) + "+" + parse(masodik_szam) + "=" + parse(eredmeny));
                        masodik_szam = eredmeny;
                        break;
                    //kivonás
                    case 2:
                        masodik_szam = Double.parseDouble(szam2);
                        eredmeny = elso_szam - masodik_szam;
                        szam.setText(parse(elso_szam) + "-" + parse(masodik_szam) + "=" + parse(eredmeny));
                        break;
                    //szozás
                    case 3:
                        masodik_szam = Double.parseDouble(szam2);
                        eredmeny = elso_szam * masodik_szam;
                        szam.setText(parse(elso_szam) + "*" + parse(masodik_szam) + "=" + parse(eredmeny));
                        break;
                    //osztás
                    case 4:
                        masodik_szam = Double.parseDouble(szam2);
                        eredmeny = elso_szam / masodik_szam;
                        //szam.setText(((int) elso_szam == elso_szam ? Integer.toString((int) elso_szam) : String.valueOf(elso_szam))
                                //+ "/"
                                //+ ((int) masodik_szam == masodik_szam ? Integer.toString((int) masodik_szam) : String.valueOf(masodik_szam))
                                //+ "="
                                //+ ((int) eredmeny == eredmeny ? Integer.toString((int) eredmeny) : String.valueOf(eredmeny)));
                        szam.setText(parse(elso_szam) + "/" + parse(masodik_szam) + "=" + parse(eredmeny));
                        break;
                    //folyamatos összeadás
                    case 5:
                        masodik_szam = Double.parseDouble(szam2);
                        eredmeny2 = eredmeny;
                        eredmeny2 += masodik_szam;
                        szam.setText(parse(eredmeny) + "+" + parse(masodik_szam) + "=" + parse(eredmeny2));
                        eredmeny = eredmeny2;
                        break;
                    //folyamatos kivonás
                    case 6:
                        masodik_szam = Double.parseDouble(szam2);
                        eredmeny2 = eredmeny;
                        eredmeny2 -= masodik_szam;
                        szam.setText(parse(eredmeny) + "-" + parse(masodik_szam) + "=" + parse(eredmeny2));
                        eredmeny = eredmeny2;
                        break;
                    //folyamatos szorzás
                    case 7:
                        masodik_szam = Double.parseDouble(szam2);
                        eredmeny2 = eredmeny;
                        eredmeny2 *= masodik_szam;
                        szam.setText(parse(eredmeny) + "*" + parse(masodik_szam) + "=" + parse(eredmeny2));
                        eredmeny = eredmeny2;
                        break;
                    //folyamatos osztás
                    case 8:
                        masodik_szam = Double.parseDouble(szam2);
                        eredmeny2 = eredmeny;
                        eredmeny2 /= masodik_szam;
                        szam.setText(parse(eredmeny) + "/" + parse(masodik_szam) + "=" + parse(eredmeny2));
                        eredmeny = eredmeny2;
                        break;
                }
            }
        });



        //Törlés gomb eseménye
        torol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elso_szam = 0;
                masodik_szam = 0;
                eredmeny = 0;
                mitcsinaljunk = 0;
                eredmeny2 = 0;
                szam2 = "";
                szam.setText("");
            }
        });
    }

    public static String parse(double num) {
        if((int) num == num) return Integer.toString((int) num);
        return String.valueOf(num);
    }
}
