package net.somtic.holadam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        TextView nuevoTexto = new TextView(this);
        nuevoTexto.setText("Hola DAM desde Java");
        setContentView(nuevoTexto);
    }
}
