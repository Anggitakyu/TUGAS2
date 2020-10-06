package com.example.tugasdts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnama, txtalamat;
    Button simpan, bersih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnama=findViewById(R.id.editnama);
        txtalamat=findViewById(R.id.editalamat);
        simpan=findViewById(R.id.simpan);
        bersih=findViewById(R.id.bersih);
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama, Alamat;
                if (txtnama.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Silahkan isikan nama anda", Toast.LENGTH_LONG).show();
                    txtnama.requestFocus();
                } else if (txtalamat.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Silahkan isikan alamat anda", Toast.LENGTH_LONG).show();
                    txtalamat.requestFocus();
                }else {
                    Nama = txtnama.getText().toString();
                    Alamat = txtalamat.getText().toString();
                    Toast.makeText(MainActivity.this, "Selamat Datang" +Nama+ "Yang Beralamat di" +Alamat, Toast.LENGTH_LONG).show();
                    txtalamat.requestFocus();
                }
            }
        });
    }
    public void bersih(View view) {
        txtnama.setText("");
        txtalamat.setText("");
    }
}
