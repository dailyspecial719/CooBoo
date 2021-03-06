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

public class GMaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_mary);

        String[] gmTopics;
        int[] gmImages = {R.drawable.green_chili_menu,  R.drawable.brownie3};

        Resources res = getResources();
         gmTopics = res.getStringArray(R.array.gm_array);

         ListAdapter myAdapter = new BookAdapter(this, gmTopics, gmImages);
         ListView listView = findViewById(R.id.book_view);
         listView.setAdapter(myAdapter);

         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 String topic = String.valueOf(parent.getItemAtPosition(position));
                 Toast.makeText(GMaryActivity.this, "Grandma Mary's " + topic, Toast.LENGTH_LONG).show();

                 if (position == 0){
                     Intent intent = new Intent(GMaryActivity.this, GreenChili.class);
                     startActivity(intent);
                 }
                 if (position == 1){
                     Intent intent = new Intent(GMaryActivity.this, Brownies.class);
                     startActivity(intent);
                 }
             }
         });
    }
}