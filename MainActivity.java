package com.example.Drknafeh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText pass;
    String username;
    String password;
    String email;
    String User_name;
    String Pass;
    ImageView image;
    Drawable draw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
         username= intent.getStringExtra("username");
        password= intent.getStringExtra("password");
         email= intent.getStringExtra("email");
        image=findViewById(R.id.Drknafehimg);
        draw=getResources().getDrawable(R.drawable.drknafeh);
        image.setImageDrawable(draw);
        name=(EditText) findViewById(R.id.usernametxt);
        pass=(EditText) findViewById(R.id.passtxt);
        User_name=name.getText().toString();
        Pass=pass.getText().toString();





    }

    public void login(View view) {
        if(User_name.equals(username)&&Pass.equals(password))
        {
            Intent myintent=new Intent(this,Menu .class);
            startActivity(myintent);

        }
        else
        {
            Intent myintent=new Intent(this,MainActivity .class);
            startActivity(myintent);
        }
    }

    public void signup(View view) {
        Intent myintent=new Intent(this,signup.class);
        startActivity(myintent);
    }

    public void order(View view) {
        Intent myintent=new Intent(this,Menu.class);
        startActivity(myintent);

    }
}