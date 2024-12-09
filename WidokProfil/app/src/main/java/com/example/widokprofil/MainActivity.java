package com.example.widokprofil;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView imie;
    EditText podajImie;

    TextView nazwisko;
    EditText podajNazwisko;

    TextView login;
    EditText podajLogin;

    TextView haslo;
    EditText podajHaslo;

    TextView emajl;
    EditText podajMajla;

    TextView dane;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        podajImie = findViewById(R.id.PodajImie);
        podajNazwisko = findViewById(R.id.PodajNazwisko);
        podajLogin = findViewById(R.id.PodajLogin);
        podajHaslo = findViewById(R.id.PodajHaslo);
        podajMajla = findViewById(R.id.PodajMajla);
        dane = findViewById(R.id.Dane);


        podajImie.setEnabled(false);
        podajNazwisko.setEnabled(false);
        podajLogin.setEnabled(false);
        podajHaslo.setEnabled(false);
        podajMajla.setEnabled(false);


        findViewById(R.id.Edytuj).setOnClickListener(e->{
            podajImie.setEnabled(true);
            podajNazwisko.setEnabled(true);
            podajLogin.setEnabled(true);
            podajHaslo.setEnabled(true);
            podajMajla.setEnabled(true);

        });

        findViewById(R.id.Pokaz).setOnClickListener(e->{
            dane.setText("Oto twoje dane: \nImie: "+podajImie.getText().toString()+"\nNazwisko: "+podajNazwisko.getText().toString()+"\nLogin: "+podajLogin.getText().toString()+"\nHaslo: "+podajHaslo.getText().toString()+" \nE-Mail: "+podajMajla.getText().toString());

            podajImie.setEnabled(false);
            podajNazwisko.setEnabled(false);
            podajLogin.setEnabled(false);
            podajHaslo.setEnabled(false);
            podajMajla.setEnabled(false);
        });

    }
}