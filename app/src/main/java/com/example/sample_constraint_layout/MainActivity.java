package com.example.sample_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk batton
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnlogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edemail = findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword = findViewById(R.id.edPassword);

        //Membuat fungsi onclik pada button btnlogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //mengeset email yang bener
                String email = "ira@mail.com";

                //mengeset password yang bener
                String pass = "123456";

                //mengecek apakah isi dari eamial dan password sudah sama dengan email dan
                //password yang sudah diset
                if (nama.equals(email) && password.equals(pass)) {
                    //membuat variabel toast dan menampilkan pesan "login sukses"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Sukses", Toast.LENGTH_LONG);
                    //membuat objek bundle
                    Bundle b = new Bundle();
                    //memasukkan value dari variabel nama dengan kunci "a"
                    //dan dimasukkan kedalam bundle
                    b.putString("a", nama.trim());

                    //memasukkan value dari variabel password dengankunci "b"
                    //dan dimasukkan kedalam bundle
                    b.putString("b", password.trim());

                    //membuat objek intent berpindah activity dari mainactivity ke ActivityHasil
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);

                    //memasukkan bundle kedalam intent untuk dikirimkan ke ActivityHasil
                    i.putExtras(b);

                    //berpindah ke ActivityHasil
                    startActivity(i);
                } else {
                    //membuat variabel toast dan membuat toast dan menampilkan pesan "Login gagal

                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Gagal", Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                }
            }
        });
    }
}










