package com.generally2.cooboo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class GBonnieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_bonnie);

        String[] gbTopics;
        int[] gbImages ={R.drawable.tortilla_menu, R.drawable.calabacitas_menu};

        Resources res = getResources();

        gbTopics = res.getStringArray(R.array.gb_array);

        ListAdapter myAdapter = new BookAdapter(this, gbTopics, gbImages);
        ListView listView = findViewById(R.id.book_view);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String topic = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(GBonnieActivity.this, "Grandma Bonnie's " +  topic, Toast.LENGTH_LONG).show();

                if (position == 0){
                    Intent intent = new Intent(GBonnieActivity.this, Tortilla.class); //need change recipe. test only
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(GBonnieActivity.this, Calabacitas.class);
                    startActivity(intent);
                }
            }
        });

    }
}