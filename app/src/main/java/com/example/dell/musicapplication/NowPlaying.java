package com.example.dell.musicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String activity;
        activity = bundle.getString("activity_name");

        ImageView image = findViewById(R.id.np_image);
        TextView titleText = findViewById(R.id.np_title);
        TextView artistText = findViewById(R.id.np_artist);
        TextView albumText = findViewById(R.id.np_album);

        if (activity.equals("songsAdapter")){
            image.setImageResource(bundle.getInt("image"));
            titleText.setText(bundle.getString("title"));
            artistText.setText(bundle.getString("artist"));
            albumText.setText(bundle.getString("album"));
        }

        ImageView backImage2 = findViewById(R.id.back_image2);
        Button backButton2 = findViewById(R.id.back_button2);


        backImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
