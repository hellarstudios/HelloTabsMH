package com.example.HelloTabsMh;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;

public class VideosActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("This is the Videos tab");
        setContentView(textview);
    }
}
