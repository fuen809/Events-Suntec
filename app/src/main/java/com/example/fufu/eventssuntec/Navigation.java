package com.example.fufu.eventssuntec;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class Navigation extends AppCompatActivity implements View.OnClickListener{
// Declaring Your View and Variables


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(100, 200); // The desired size of the child
        params.setMargins(50, 50, 50, 50); // Position at 50,50
        View v = new ImageView(getBaseContext());
        ImageView image;
        image = new ImageView(v.getContext());
        image.setImageDrawable(v.getResources().getDrawable(R.drawable.pin));
        RelativeLayout mRelativeLayout = (RelativeLayout) findViewById(R.id.nav);
        mRelativeLayout.addView(image, params);


//        Bitmap b = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
//        Canvas c = new Canvas(b);

        //setting onclick listeners
        Button one = (Button) findViewById(R.id.oneButton);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.twoButton);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.threeButton);
        three.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.oneButton:
                // do your code
                Intent myIntent = new Intent(Navigation.this, Navigation.class);
                Navigation.this.startActivity(myIntent);
                break;

            case R.id.twoButton:
                // do your code
                Intent myIntent2 = new Intent(Navigation.this, NavigationL2.class);
                Navigation.this.startActivity(myIntent2);
                break;

            case R.id.threeButton:
                // do your code
                Intent myIntent3 = new Intent(Navigation.this, NavigationL2.class);
                Navigation.this.startActivity(myIntent3);
                break;

            default:
                break;
        }

    }
}
