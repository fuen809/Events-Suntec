package com.example.fufu.eventssuntec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NavigationL4 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_l4);
        //setting onclick listeners
        Button one = (Button) findViewById(R.id.oneButton);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.twoButton);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.threeButton);
        three.setOnClickListener(this);

        Button four = (Button) findViewById(R.id.fourButton);
        four.setOnClickListener(this); // calling onClick() method
        Button five = (Button) findViewById(R.id.fiveButton);
        five.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.oneButton:
                // do your code
                Intent myIntent = new Intent(NavigationL4.this, Navigation.class);
                NavigationL4.this.startActivity(myIntent);
                break;

            case R.id.twoButton:
                // do your code
                Intent myIntent2 = new Intent(NavigationL4.this, NavigationL2.class);
                NavigationL4.this.startActivity(myIntent2);
                break;

            case R.id.threeButton:
                // do your code
                Intent myIntent3 = new Intent(NavigationL4.this, NavigationL3.class);
                NavigationL4.this.startActivity(myIntent3);
                break;
            case R.id.fourButton:
                // do your code
                Intent myIntent4 = new Intent(NavigationL4.this, NavigationL4.class);
                NavigationL4.this.startActivity(myIntent4);
                break;
            case R.id.fiveButton:
                // do your code
                Intent myIntent5 = new Intent(NavigationL4.this, NavigationL5.class);
                NavigationL4.this.startActivity(myIntent5);
                break;


            default:
                break;
        }

    }
}
