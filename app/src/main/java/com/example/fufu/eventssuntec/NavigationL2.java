package com.example.fufu.eventssuntec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NavigationL2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_l2);

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
        Button six = (Button) findViewById(R.id.sixButton);
        six.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.oneButton:
                // do your code
                Intent myIntent = new Intent(NavigationL2.this, Navigation.class);
                NavigationL2.this.startActivity(myIntent);
                break;

            case R.id.twoButton:
                // do your code
                Intent myIntent2 = new Intent(NavigationL2.this, NavigationL2.class);
                NavigationL2.this.startActivity(myIntent2);
                break;

            case R.id.threeButton:
                // do your code
                Intent myIntent3 = new Intent(NavigationL2.this, NavigationL2.class);
                NavigationL2.this.startActivity(myIntent3);
                break;
            case R.id.fourButton:
                // do your code
                Intent myIntent4 = new Intent(NavigationL2.this, NavigationL2.class);
                NavigationL2.this.startActivity(myIntent4);
                break;
            case R.id.fiveButton:
                // do your code
                Intent myIntent5 = new Intent(NavigationL2.this, NavigationL2.class);
                NavigationL2.this.startActivity(myIntent5);
                break;
            case R.id.sixButton:
                // do your code
                Intent myIntent6 = new Intent(NavigationL2.this, NavigationL2.class);
                NavigationL2.this.startActivity(myIntent6);
                break;

            default:
                break;
        }

    }
}
