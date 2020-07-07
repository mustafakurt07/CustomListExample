package com.example.nbaplayers;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {
    private ArrayList<Players>players;
    private Activity context;
    public CustomAdapter(ArrayList<Players>players,Activity context)//players modellınden liste olusturuyoruz .Maınden gelen verılerı ıcıne koymak ıcın
    {       super(context,R.layout.custom_view,players);
            this.players=players;
            this.context=context;

    }

    @NonNull//Neden bu methodu kullandık bize listedeki pozisyonu veriyor customview buraya baglayacaz ve custom viewdakı text view burda olusturcaz ve listeden gelen verileri burada gostercez.
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater=context.getLayoutInflater();//layout gostercegimiz icin context kullandık
        View customView=layoutInflater.inflate(R.layout.custom_view,null,true);
      TextView nameView= customView.findViewById(R.id.customtextView);
      nameView.setText(players.get(position).getName());//akticivyden gelen pozısyona gore oyunca ısımlerını gosterıyoruz
        return customView;
    }
}
