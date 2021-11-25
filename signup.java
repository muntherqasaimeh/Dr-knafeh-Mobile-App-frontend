package com.example.Drknafeh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    ImageView imageknafeh;
    Drawable draw1;
    String username;
    String password;
    String email;
    EditText name;
    EditText pass;
    EditText mail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        imageknafeh=findViewById(R.id.Drknafehimg);
        draw1=getResources().getDrawable(R.drawable.drknafeh);
        imageknafeh.setImageDrawable(draw1);
        name=(EditText) findViewById(R.id.usernametxt);
        pass=(EditText) findViewById(R.id.passtxt);
        mail=(EditText) findViewById(R.id.email);
        username=name.getText().toString();
        password=pass.getText().toString();
        email=mail.getText().toString();

    }

    public void returntomain(View view) {
        Intent myintent=new Intent(this,MainActivity .class);
        startActivity(myintent);
    }

    public void createaccount(View view) {
        Intent myintent=new Intent(this,MainActivity .class);
         myintent.putExtra("username",username);
        myintent.putExtra("password",password);
        myintent.putExtra("email",email);
        startActivity(myintent);
    }
}