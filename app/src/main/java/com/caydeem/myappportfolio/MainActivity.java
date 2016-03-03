package com.caydeem.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();

        Button btn_spotify_streamer = (Button) findViewById(R.id.btn_spotify_streamer);
        btn_spotify_streamer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.description_spotify_streamer, Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_scores_app = (Button) findViewById(R.id.btn_scores_app);
        btn_scores_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.description_scores_app, Toast.LENGTH_SHORT).show();
            }
        });


        Button btn_library_app = (Button) findViewById(R.id.btn_library_app);
        btn_library_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.description_library_app, Toast.LENGTH_SHORT).show();
            }
        });


        Button btn_build_it_bigger = (Button) findViewById(R.id.btn_build_it_bigger);
        btn_build_it_bigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.description_build_it_bigger, Toast.LENGTH_SHORT).show();
            }
        });


        Button btn_xyz_reader = (Button) findViewById(R.id.btn_xyz_reader);
        btn_xyz_reader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.description_xyz_reader, Toast.LENGTH_SHORT).show();
            }
        });


        Button btn_capstone = (Button) findViewById(R.id.btn_capstone);
        btn_capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.description_capstone, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
