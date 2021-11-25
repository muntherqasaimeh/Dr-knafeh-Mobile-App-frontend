package com.example.Drknafeh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    ImageView imageknafeh;
    ImageView imagecheese;
    ImageView imageashta;
    Drawable draw1;
    Drawable draw2;
    Drawable draw3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        imageknafeh=findViewById(R.id.Drknafehimg);
        imagecheese=findViewById(R.id.cheeseimg);
        imageashta=findViewById(R.id.ashtaimg);

        draw1=getResources().getDrawable(R.drawable.drknafeh);
        draw2=getResources().getDrawable(R.drawable.cheese);
        draw3=getResources().getDrawable(R.drawable.ashta);

        imageknafeh.setImageDrawable(draw1);
        imagecheese.setImageDrawable(draw2);
        imageashta.setImageDrawable(draw3);


    }

    public void makeorder(View view) {
        Uri uri=Uri.parse("tel:+15146492067");
        Intent intent=new Intent(Intent.ACTION_DIAL,uri);

        startActivity(intent);

    }
}