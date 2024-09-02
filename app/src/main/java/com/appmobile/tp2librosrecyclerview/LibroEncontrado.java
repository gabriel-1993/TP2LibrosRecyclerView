package com.appmobile.tp2librosrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LibroEncontrado extends AppCompatActivity {

/*
    private ArrayList<Libro> libros = new ArrayList<>();
    MutableLiveData<ArrayList<Libro>>mLibros;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro_encontrado);

    }
}