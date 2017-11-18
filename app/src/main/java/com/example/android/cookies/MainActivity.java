package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Called when the cookie should be eaten.
     */

    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imgCookies = (ImageView) findViewById(R.id.android_cookie_image_view);
        imgCookies.setImageResource(R.drawable.after_cookie);


        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView txtStatus = (TextView) findViewById(R.id.status_text_view);
        txtStatus.setText("I'm so full");

        Button eatCookieButton = findViewById(R.id.eat_cookie_button);
        Button beHungryButton = findViewById(R.id.be_hungry_button);
        eatCookieButton.setVisibility(View.GONE);
        beHungryButton.setVisibility(View.VISIBLE);


    }

    public void beHungry(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imgCookies = (ImageView) findViewById(R.id.android_cookie_image_view);
        imgCookies.setImageResource(R.drawable.before_cookie);


        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView txtStatus = (TextView) findViewById(R.id.status_text_view);
        txtStatus.setText("I'm so hungry");

        Button eatCookieButton = findViewById(R.id.eat_cookie_button);
        Button beHungryButton = findViewById(R.id.be_hungry_button);
        beHungryButton.setVisibility(View.GONE);
        eatCookieButton.setVisibility(View.VISIBLE);
    }

}
