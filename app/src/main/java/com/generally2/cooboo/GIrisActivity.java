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

public class GIrisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_iris);

        String[] giTopics;
        int[] giImages = {R.drawable.carrot_menu};

        Resources res = getResources();

        giTopics = res.getStringArray(R.array.gi_array);

        ListAdapter myAdapter = new BookAdapter(this, giTopics, giImages);
        ListView listView = findViewById(R.id.book_view);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String topics = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(GIrisActivity.this, "Grandma Iris's " + topics, Toast.LENGTH_LONG).show();

                if (position == 0){
                    Intent intent = new Intent(GIrisActivity.this, CarrotCake.class); //need recipe
                    startActivity(intent);
                }
            }
        });


    }
}