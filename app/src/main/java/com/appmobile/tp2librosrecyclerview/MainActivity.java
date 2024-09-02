package com.appmobile.tp2librosrecyclerview;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import com.appmobile.tp2librosrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private MainActivityViewModel mv;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        binding= ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.fotoInicio.setImageResource(R.drawable.libro);


        mv.getmMensaje().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.tvMsjsError.setText(s);
            }
        });


        binding.btBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titulo = binding.etBuscarTexto.getText().toString().trim().toLowerCase();
                mv.validarYbuscarLibro(titulo);
            }
        });






    }




}