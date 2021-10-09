package com.example.prak1_1918063_elannugif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    EditText alas, tinggi;
    Button btnhitung;
    TextView hasilluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        alas=(EditText)findViewById(R.id.input_alas);
        tinggi=(EditText)findViewById(R.id.input_tinggi);
        hasilluas=(TextView) findViewById(R.id.output_hasil);
        btnhitung=(Button) findViewById(R.id.btn_hasil);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a,t, hasil;
                a=Double.valueOf(alas.getText().toString()); t=Double.valueOf(tinggi.getText().toString());

                hasil = (a / 2) * t;
                String hasil1 = String.valueOf(hasil);
                hasilluas.setText(hasil1);
            }
        });

    }

}