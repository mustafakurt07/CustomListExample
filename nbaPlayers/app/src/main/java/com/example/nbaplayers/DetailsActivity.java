package com.example.nbaplayers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
ImageView imageView;
TextView ad;
TextView age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageView=findViewById(R.id.imageView);
        ad=findViewById(R.id.textAd);
       age=findViewById(R.id.textSayi);
        Intent veriAl=getIntent();
        Players selectedPlayers=(Players) veriAl.getSerializableExtra("SelectedPlayer");//maınden gelen verileri alıyoruz
        Bitmap bitmap= BitmapFactory.decodeResource(getApplicationContext().getResources(),selectedPlayers.getPictureInteger());
        imageView.setImageBitmap(bitmap);
        ad.setText(selectedPlayers.getName());
        age.setText(selectedPlayers.getAge());
    }
}
