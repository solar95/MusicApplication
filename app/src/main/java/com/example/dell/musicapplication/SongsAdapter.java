package com.example.dell.musicapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Song> {
    private Context context;
    private ArrayList<Song> data;


    public SongsAdapter(Context context, ArrayList<Song> data) {
        super(context, R.layout.item, data);
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View item = LayoutInflater.from(context).inflate(R.layout.item, null);

        //Image
        ImageView image = item.findViewById(R.id.item_image);
        image.setImageResource(data.get(position).getImageID());

        //Title
        TextView title = item.findViewById(R.id.item_title);
        title.setText(data.get(position).getName());

        //Artist
        TextView artist = item.findViewById(R.id.item_artist);
        artist.setText(data.get(position).getArtist());

        //Album
        TextView album = item.findViewById(R.id.item_album);
        album.setText(data.get(position).getAlbum());

        LinearLayout body = item.findViewById(R.id.item_body);

        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ImageView nowPlaying = item.findViewById(R.id.item_playButton);

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,NowPlaying.class);
                intent.putExtra("activity_name","songsAdapter");
                intent.putExtra("title",data.get(position).getName());
                intent.putExtra("artist",data.get(position).getArtist());
                intent.putExtra("album",data.get(position).getAlbum());
                intent.putExtra("image",data.get(position).getImageID());
                context.startActivity(intent);
            }
        });

        image.setTag(position);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, AlbumViewer.class);
                intent.putExtra("IMAGE_INFO",data.get(position).getImageID());
                intent.putExtra("ALBUM_INFO",data.get(position).getAlbum());
                intent.putExtra("ARTIST_INFO",data.get(position).getArtist());

                context.startActivity(intent);
            }
        });
        return item;
    }
}