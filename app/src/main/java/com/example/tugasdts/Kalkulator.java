package com.example.tugasdts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {
    EditText angka1, angka2;
    TextView txtHasil;
    Button btnTambah, btnKurang, btnKali, btnBagi, btnReset;
    private String awal, akhir;
    Double bilangan1, bilangan2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        angka1 = findViewById(R.id.edit1);
        angka2 = findViewById(R.id.edit2);
        btnTambah = findViewById(R.id.tambah);
        btnKurang = findViewById(R.id.kurang);
        btnBagi = findViewById(R.id.bagi);
        btnKali = findViewById(R.id.kali);
        txtHasil = findViewById(R.id.txthasil);
        btnReset = findViewById(R.id.bersih);


        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                awal = angka1.getText().toString(); //ambil angka1
                akhir = angka2.getText().toString(); //ambil angka2
                System.out.println("ini awal"+awal);
                Hitung(awal,akhir,"*");
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                awal = angka1.getText().toString(); //ambil angka1
                akhir = angka2.getText().toString(); //ambil angka2
                Hitung(awal,akhir,"/");
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                awal = angka1.getText().toString(); //ambil angka1
                akhir = angka2.getText().toString(); //ambil angka2
                Hitung(awal,akhir,"-");
            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                awal = angka1.getText().toString(); //ambil angka1
                akhir = angka2.getText().toString(); //ambil angka2
                Hitung(awal,akhir,"+");
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1.setText("");
                angka2.setText("");
                txtHasil.setText("0");
            }
        });
    }

    void Hitung(String bil1, String bil2, String operator){
        if(awal.equals("")){
            Toast.makeText(this,"Masukan Angka Pertama", Toast.LENGTH_LONG).show();
        }else if(akhir.equals("")){
            Toast.makeText(this,"Masukan Angka Kedua", Toast.LENGTH_LONG).show();
        }else {
            bilangan1 = Double.parseDouble(bil1);
            bilangan2 = Double.parseDouble(bil2);
            if(operator.equals("+")){
                hasil = bilangan1+bilangan2;
                txtHasil.setText(hasil.toString());
            }else if(operator.equals("-")){
                hasil = bilangan1-bilangan2;
                txtHasil.setText(hasil.toString());
            }else if(operator.equals("*")){
                hasil = bilangan1*bilangan2;
                txtHasil.setText(hasil.toString());
            }else if(operator.equals("/")){
                hasil = bilangan1/bilangan2;
                txtHasil.setText(hasil.toString());
            }
        }
    }
}
