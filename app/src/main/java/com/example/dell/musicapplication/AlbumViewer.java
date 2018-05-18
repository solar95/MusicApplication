package com.example.dell.musicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AlbumViewer extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_viewer);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        ImageView backImage1 = findViewById(R.id.back_image1);
        Button backButton1 = findViewById(R.id.back_button1);
        TextView info = findViewById(R.id.album_info);
        ImageView image = findViewById(R.id.full_image);
        image.setImageResource(bundle.getInt("IMAGE_INFO"));
        String info_album = bundle.getString("ALBUM_INFO");
        String info_artist = bundle.getString("ARTIST_INFO");
        info.setText("Artist: "+info_artist+"  Album: "+info_album);

        backImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        backButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
