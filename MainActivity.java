package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNilaiA, editNilaiB, operasi;
    Button button;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNilaiA = (EditText) findViewById(R.id.editNilaiA);
        editNilaiB = (EditText) findViewById(R.id.editNilaiB);
        operasi = (EditText) findViewById(R.id.operasi);
        txtHasil   = (TextView) findViewById(R.id.txtHasil);
        button  = (Button) findViewById(R.id.hitung);

    }

    public void Aritmatika(View v){
        double hasil;

        double nilai1 = Double.parseDouble(editNilaiA.getText().toString());
        double nilai2 = Double.parseDouble(editNilaiB.getText().toString());

        String Operasi = operasi.getText().toString();

        if (Operasi.equals("+")){
            hasil = nilai1 + nilai2;
            txtHasil.setText(String.valueOf(hasil));
        }else if (Operasi.equals("-")){
            hasil = nilai1 - nilai2;
            txtHasil.setText(String.valueOf(hasil));
        }else if (Operasi.equals("*")){
            hasil = nilai1 * nilai2;
            txtHasil.setText(String.valueOf(hasil));
        }else if (Operasi.equals("/")){
            hasil = nilai1 / nilai2;
            txtHasil.setText(String.valueOf(hasil));
        }else {
            txtHasil.setText("OPERASI ARITMATIKA TIDAK SESUAI");
        }
     }
}
