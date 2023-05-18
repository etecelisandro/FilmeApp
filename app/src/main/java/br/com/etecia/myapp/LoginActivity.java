package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    Button btnentrar, btnsair;

    TextInputEditText txtusuraio, txtsenha;

    TextView lblcadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        btnentrar = findViewById(R.id.btnentrar);
        btnsair = findViewById(R.id.btnsair);

        txtusuraio = findViewById(R.id.txtusuario);
        txtsenha = findViewById(R.id.txtusenha);

        lblcadastrar = findViewById(R.id.lblcadastrar);

        btnsair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, senha;
                usuario = txtusuraio.getText().toString();
                senha = txtsenha.getText().toString();


                if (usuario.equals("Etecia")&& senha.equals("etecia")){
                    startActivity(new Intent(getApplicationContext(),MenuActivity.class));
                }else {
                    Toast.makeText(getApplicationContext(),
                            "usuario ou senha invalido",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
        lblcadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),
                        CadUsuActivity.class));
            }
        });

    }
}