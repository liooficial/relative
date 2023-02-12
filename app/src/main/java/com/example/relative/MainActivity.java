package com.example.relative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText contraseña, usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.inicioo);
        contraseña = (EditText) findViewById(R.id.contraseña);
        usuario = (EditText) findViewById(R.id.usuario);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usuario.getText().toString()=="liooficial"){
                    if(contraseña.getText().toString()=="12345"){



                    }else{

                    }

                }else{

                }


            }
        });



    }
}
