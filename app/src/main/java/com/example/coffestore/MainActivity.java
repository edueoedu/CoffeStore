package com.example.coffestore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
     int tlCoffe;
     double valorC;
     double totalC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tlCoffe = 0;
        valorC = 0;
        totalC = 0;
    }


    if

    public void maisCafe(View view){
        tlCoffe++;
        TextView quant = findViewById(R.id.quant);
        quant.setText("" + tlCoffe);

    }


    public void menosCafe(View view){
        tlCoffe --;
        TextView quant = findViewById(R.id.quant);
        quant.setText("" + tlCoffe);



    }
}
