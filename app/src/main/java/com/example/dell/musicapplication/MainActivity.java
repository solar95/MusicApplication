package com.example.dell.musicapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemClickListener{
    private ArrayList<Song> list1;
    private ListView lvSongs;
    private SongsAdapter adapter;
    private TextView title, artist, album;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ListView Code
        list1 = new ArrayList<Song>();
        fillSongsList();
        title = findViewById(R.id.item_title);
        artist = findViewById(R.id.item_artist);
        album = findViewById(R.id.item_album);
        adapter = new SongsAdapter(this, list1);
        lvSongs = findViewById(R.id.lv01);
        lvSongs.setAdapter(adapter);
        lvSongs.setOnItemClickListener(this);
    }

    private void fillSongsList(){

        list1.add(new Song("Aire","Golden Ganga","Exitos",R.drawable.golden_ganga));
        list1.add(new Song("Animal","Ainda Duo","Vendaval",R.drawable.ainda_duo));
        list1.add(new Song("Tormenta","Alex Andwanter","Rebeldes",R.drawable.alex));
        list1.add(new Song("Cosas infinitas","Bengala","Bajo la sal",R.drawable.bengala));
        list1.add(new Song("Viva la vida","Coldplay","Viva la vida",R.drawable.coldplay));
        list1.add(new Song("Munich","Editors","The back room",R.drawable.editors));
        list1.add(new Song("Tu vida , mi vida","Fito Paez","La ciudad liberada",R.drawable.fito));
        list1.add(new Song("Abrir la puerta","Gepe","Ciencia Exacta",R.drawable.gepe));
        list1.add(new Song("Universos Paralelos","Jorge Drexler","Bailar en la cueva",R.drawable.drexler));
        list1.add(new Song("Misread","Kings of convenience","Riot on an empty street",R.drawable.kings));
        list1.add(new Song("Rincon Yucateco","Porter","Moctezuma",R.drawable.porter));
        list1.add(new Song("Vikingman","Rodrigo y Gabriela","Rodrigo y Gabriela",R.drawable.rodrigo));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        title.setText(list1.get(i).getName());
        artist.setText(list1.get(i).getArtist());
        album.setText(list1.get(i).getAlbum());
    }
}
