package com.example.nbaplayers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView playerList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      playerList=findViewById(R.id.listView);
      Players lebron=new Players("Lebron James","35",R.drawable.lebron);
      Players kobe=new Players("Kobe Bryant","38",R.drawable.kobe);
      Players jordan=new  Players("Michael Jordan","40",R.drawable.jordan);
        final ArrayList<Players>nbaPlayerList=new ArrayList<>();
        nbaPlayerList.add(lebron);
        nbaPlayerList.add(kobe);
        nbaPlayerList.add(jordan);
        CustomAdapter customAdapter=new CustomAdapter(nbaPlayerList,MainActivity.this);
        playerList.setAdapter(customAdapter);
        playerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("SelectedPlayer",nbaPlayerList.get(position));//serilestirerek yollarsak daha kolay elde ederiz
                startActivity(intent);

            }
        });
    }
}
