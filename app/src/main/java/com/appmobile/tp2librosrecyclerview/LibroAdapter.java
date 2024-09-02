package com.appmobile.tp2librosrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.ViewHolderLibro>
{

    private List<Libro> libros;

    private LayoutInflater li;

    public LibroAdapter(List<Libro> libros, LayoutInflater li){
        this.libros = libros;
        this.li = li;
    }



    @NonNull
    @Override
    public ViewHolderLibro onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = li.inflate(R.layout.item, parent, false);

        return new ViewHolderLibro(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLibro holder, int position) {
        Libro libro = libros.get(position);
        holder.tvTitulo.setText(libro.getTitulo());
        holder.tvAutor.setText(libro.getAutor());
        holder.tvAnio.setText(libro.getAnio());
        holder.tvGenero.setText(libro.getGenero());
        holder.ivFoto.setImageResource(libro.getFoto());
        holder.etDescripcion.setText(libro.getDescripcion());


    }

    @Override
    public int getItemCount() {
        return libros.size();
    }

    public class ViewHolderLibro extends RecyclerView.ViewHolder{

        TextView tvAutor, tvTitulo, tvAnio, tvGenero;
        ImageView ivFoto;
        EditText etDescripcion;


        public ViewHolderLibro(@NonNull View itemView) {
            super(itemView);
            tvAutor = itemView.findViewById(R.id.tvAutor);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvAnio = itemView.findViewById(R.id.tvAnio);
            tvGenero = itemView.findViewById(R.id.tvGenero);
            ivFoto = itemView.findViewById(R.id.ivFotoLibro);
            etDescripcion = itemView.findViewById(R.id.etDescripcion);
        }

    }
}
