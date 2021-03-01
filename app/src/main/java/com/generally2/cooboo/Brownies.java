package com.generally2.cooboo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

public class Brownies extends AppCompatActivity {
    PDFView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewwer);

        view = findViewById(R.id.pdf_viewer);
        view.fromAsset("brownies.pdf").load();

    }
}
