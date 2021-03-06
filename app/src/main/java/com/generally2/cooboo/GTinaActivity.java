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

public class GTinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_tina);

        String[] gtTopics;
        int[] gtImages = {R.drawable.enchiladas_menu, R.drawable.guac_menu, R.drawable.tamales_menu, R.drawable.potato_salad_menu,
                R.drawable.tuna_menu, R.drawable.fluff_menu, R.drawable.pb_menu, R.drawable.zucchini_muffin_menu,
                R.drawable.mm_cookie_menu, R.drawable.caramel_menu};

        Resources res = getResources();

        gtTopics = res.getStringArray(R.array.gt_array); // add string array to resources

        ListAdapter myAdapter = new BookAdapter(this, gtTopics, gtImages);
        ListView listView = findViewById(R.id.book_view);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String topics = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(GTinaActivity.this, "Grandma Tina's " + topics, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(GTinaActivity.this, Enchiladas.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(GTinaActivity.this, Guacamole.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(GTinaActivity.this, Tamales.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(GTinaActivity.this, PotatoSalad.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(GTinaActivity.this, TunaCasserole.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(GTinaActivity.this, FluffSalad.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(GTinaActivity.this, PBSquares.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(GTinaActivity.this, ZucchiniMuffin.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(GTinaActivity.this, ChipperChamps.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(GTinaActivity.this, SoftCaramels.class);
                    startActivity(intent);
                }

            }
        });




    }
}