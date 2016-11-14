package com.example.fufu.eventssuntec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        Intent intent = getIntent();
        String value = intent.getStringExtra("username"); //if it's a string you stored.
        TextView displayName = (TextView) findViewById(R.id.displayName);
        displayName.setText(value);


        ImageButton button = (ImageButton) findViewById(R.id.networking);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                networking();
            }
        });

        ImageButton button2 = (ImageButton) findViewById(R.id.events);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                events();
            }
        });

        ImageButton button3 = (ImageButton) findViewById(R.id.chat);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                chat();
            }
        });

        ImageButton button4 = (ImageButton) findViewById(R.id.navigation);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                navigation();
            }
        });
    }

    protected void networking(){

    }

    protected void chat(){
        Intent myIntent = new Intent(MenuScreen.this, chat.class);
        //myIntent.putExtra("username", username); //Optional parameters
        MenuScreen.this.startActivity(myIntent);
    }

    protected void events(){

    }

    protected void navigation(){
        Intent myIntent = new Intent(MenuScreen.this, Navigation.class);
        //myIntent.putExtra("username", username); //Optional parameters

        MenuScreen.this.startActivity(myIntent);
    }
}
