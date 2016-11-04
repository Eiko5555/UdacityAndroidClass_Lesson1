package com.example.eiko.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView cookie;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cookie = (ImageView)findViewById(R.id.android_cookie_image_view);
        text = (TextView)findViewById(R.id.status_text_view);
    }
    public void eatCookie(View v){
        cookie.setImageResource(R.drawable.after_cookie);
        text.setText("I'm so full");
    }
    public void moreCookie(View v){
        cookie.setImageResource(R.drawable.before_cookie);
        text.setText("More cookie.....");

    }

}

