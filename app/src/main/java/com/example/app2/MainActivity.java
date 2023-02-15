package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View; //para utilizar los View no necesarios ser importados
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hola(View view){ //palabras en gris quiere decir que no lo ocupa //View clase // view objeto

        Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show();

    }
    public void adios(View view){ //palabras en gris quiere decir que no lo ocupa //View clase // view objeto

        Toast.makeText(this, "Adios", Toast.LENGTH_SHORT).show();

    }
    public void boton3(View view){ //palabras en gris quiere decir que no lo ocupa //View clase // view objeto

        Toast.makeText(this, "Boton3", Toast.LENGTH_SHORT).show();

    }
    public void boton4(View view){ //palabras en gris quiere decir que no lo ocupa //View clase // view objeto

        Toast.makeText(this, "Boton4", Toast.LENGTH_SHORT).show();

    }
    public void boton5(View view){ //palabras en gris quiere decir que no lo ocupa //View clase // view objeto

        Toast.makeText(this, "Boton5", Toast.LENGTH_SHORT).show();

    }
    public void boton6(View view){ //palabras en gris quiere decir que no lo ocupa //View clase // view objeto

        Toast.makeText(this, "Boton6", Toast.LENGTH_SHORT).show();

    }
    public void boton7(View view){ //palabras en gris quiere decir que no lo ocupa //View clase // view objeto

        Toast.makeText(this, "Boton7", Toast.LENGTH_SHORT).show();

    }
    public void boton8(View view){ //palabras en gris quiere decir que no lo ocupa //View clase // view objeto

        Toast.makeText(this, "Boton8", Toast.LENGTH_SHORT).show();

    }
}