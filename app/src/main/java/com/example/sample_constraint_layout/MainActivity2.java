package com.example.sample_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data TextView
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //menghubungkan variabel txEmail dengan componen TextVeiw pada layout
        txEmail = findViewById(R.id.tvEmail);

        txPassword = findViewById(R.id.tvPassword);
        Bundle bundle = getIntent().getExtras();
        String email = bundle.getString( "a" );
        String pass = bundle.getString( "b" );
        txEmail.setText(email);
        txPassword.setText(pass);
    }
}