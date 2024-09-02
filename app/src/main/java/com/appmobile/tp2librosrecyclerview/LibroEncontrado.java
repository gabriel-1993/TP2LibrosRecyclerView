package com.appmobile.tp2librosrecyclerview;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.appmobile.tp2librosrecyclerview.databinding.ActivityLibroEncontradoBinding;
import com.appmobile.tp2librosrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class LibroEncontrado extends AppCompatActivity {
    private ActivityLibroEncontradoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityLibroEncontradoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle bundle = getIntent().getBundleExtra("libro");
        Libro libro = (Libro) bundle.getSerializable("libro");
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(libro);

        LibroAdapter la = new LibroAdapter(libros, getLayoutInflater());
        GridLayoutManager gml = new GridLayoutManager(LibroEncontrado.this, 1, GridLayoutManager.VERTICAL, false);
        RecyclerView lr = binding.rvLista;
        lr.setLayoutManager(gml);
        lr.setAdapter(la);

        binding.btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LibroEncontrado.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}