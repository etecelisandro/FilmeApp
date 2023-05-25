package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Petshop_Activity extends AppCompatActivity {
    TabLayout tbPetshop;
    TabItem idItemcachorro, idItemgato, idItempassaro;
    ViewPager2 idViewPagerPetshop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petshop_layout);
        tbPetshop = findViewById(R.id.idTablayout);
        idViewPagerPetshop = findViewById(R.id.idViewpaerPetshop);
    }
}