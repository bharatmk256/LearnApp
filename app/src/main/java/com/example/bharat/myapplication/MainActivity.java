package com.example.bharat.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openLinear_Layout(View View){
        Intent i = new Intent(this, Linear_Layout.class);
        startActivity(i);
    }
    public void openRelative_Layout(View View){
        Intent i = new Intent(this,Relative_Layout.class);
        startActivity(i);
    }
    public void openConstraint_Layout(View View){
        Intent i = new Intent(this, Constraint_layout.class);
        startActivity(i);
    }
    public void openScroll_View(View View){
        Intent i = new Intent(this, Scroll_View.class);
        startActivity(i);
    }
    public void openCard_View(View View){
        Intent i = new Intent(this, Card_View.class);
        startActivity(i);
    }
    public void openJava(View View){
        Intent i = new Intent(this, Java.class);
        startActivity(i);
    }
    public void openKotlin(View View){
        Intent i = new Intent(this, Kotlin.class);
        startActivity(i);
    }
}
