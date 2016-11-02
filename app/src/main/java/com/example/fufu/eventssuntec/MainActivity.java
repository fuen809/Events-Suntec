package com.example.fufu.eventssuntec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                login();
            }
        });
    }

    protected void login(){
        EditText y = (EditText) findViewById(R.id.userName);
        String username = y.getText().toString();

        Intent myIntent = new Intent(MainActivity.this, MenuScreen.class);
        myIntent.putExtra("username", username); //Optional parameters
        MainActivity.this.startActivity(myIntent);

    }
}
