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

public class GJeanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_jean);

        String[] gjTopics;
        int[] gjImages = {R.drawable.wheat_bread_menu};

        Resources res = getResources();

        gjTopics = res.getStringArray(R.array.gj_array);

        ListAdapter myAdapter = new BookAdapter(this, gjTopics, gjImages);
        ListView listView = findViewById(R.id.book_view);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String topic = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(GJeanActivity.this, "Grandma Jean's " + topic, Toast.LENGTH_LONG).show();

                if (position == 0){
                    Intent intent = new Intent(GJeanActivity.this, WheatBread.class);
                    startActivity(intent);

                }
            }
        });


    }
}