package com.generally2.cooboo;


import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] cooBooTopics;
        int[] cooBooImages = {R.drawable.gt_menu, R.drawable.gi_menu, R.drawable.gb_menu, R.drawable.gw_menu, R.drawable.gm_menu};

        Resources res = getResources();

        cooBooTopics = res.getStringArray(R.array.coo_boo_topics);

        ListAdapter myAdapter = new BookAdapter(this, cooBooTopics, cooBooImages);
        ListView listView = findViewById(R.id.book_view);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String topics = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, topics, Toast.LENGTH_SHORT).show();

                if (position == 0){
                    Intent intent = new Intent(MainActivity.this, GTinaActivity.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(MainActivity.this, GIrisActivity.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(MainActivity.this, GBonnieActivity.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(MainActivity.this, GWinnieActivity.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(MainActivity.this, GMaryActivity.class);
                    startActivity(intent);

                }

            }
        });






    }
}
