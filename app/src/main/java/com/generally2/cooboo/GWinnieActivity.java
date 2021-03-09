package com.generally2.cooboo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class GWinnieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_winnie);

        String[] gwTopics;
        int[] gwImages = {R.drawable.brownie3};


        Resources res = getResources();

        gwTopics = res.getStringArray(R.array.gw_array);

        ListAdapter myAdapter = new BookAdapter(this, gwTopics, gwImages);
        ListView listView = findViewById(R.id.book_view);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String topic = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(GWinnieActivity.this, "Grandma Winnie's " + topic, Toast.LENGTH_LONG).show();

                if (position == 0){
                    Intent intent = new Intent(GWinnieActivity.this, Brownies.class);
                    startActivity(intent);

                }
            }

        });

    }
}
