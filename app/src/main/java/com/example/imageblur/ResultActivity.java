package com.example.imageblur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    ImageView ivresult;
    Button btnresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ivresult = findViewById(R.id.ivresult);
        btnresult = findViewById(R.id.btnresult);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            Bitmap img = (Bitmap)extras.get("image");
            if(ivresult != null){
                ivresult.setImageBitmap(img);
            }
        }

        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}
