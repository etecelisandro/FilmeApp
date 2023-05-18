package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialCardView idMenuPetshop, idMenuDogs, idMenuCats, idMenuVaccine, idMenuPetfood, idMenuAdocao;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);


        idMenuPetshop = findViewById(R.id.idMenuPetshop);
        idMenuDogs = findViewById(R.id.idMenuDogs);
        idMenuCats = findViewById(R.id.idMenuCats);
        idMenuVaccine = findViewById(R.id.idMenuVaccine);
        idMenuPetfood = findViewById(R.id.idMenuPetfood);
        idMenuAdocao = findViewById(R.id.idMenuAdocao);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.idMenuPetshop:
                startActivity(new Intent(getApplicationContext(),
                        Petshop_Activity.class));
                break;
            case R.id.idMenuDogs:
                startActivity(new Intent(getApplicationContext(),
                        Dogs_Activity.class));
                break;
            case R.id.idMenuCats:
                startActivity(new Intent(getApplicationContext(),
                        Cats_Activity.class));
                break;
            case R.id.idMenuVaccine:
                startActivity(new Intent(getApplicationContext(),
                        Vaccine_Activity.class));
                break;
            case R.id.idMenuPetfood:
                startActivity(new Intent(getApplicationContext(),
                        Petfood_Activity.class));
                break;
            case R.id.idMenuAdocao:
                startActivity(new Intent(getApplicationContext(),
                        Adocao_Activity.class));
                break;
        }
    }
}