package com.harris.harriswifibuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class network_login extends AppCompatActivity {

    private static Button net_to_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_login);
        // Button click methods
        onClickNetMainButtonListener();
    }

    public void onClickNetMainButtonListener() {

        net_to_main = (Button)findViewById(R.id.net_to_main);
        net_to_main.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.harris.wi_fibuddy.HomeScreen");
                        startActivity(intent);
                    }
                }
        );

    }
}
