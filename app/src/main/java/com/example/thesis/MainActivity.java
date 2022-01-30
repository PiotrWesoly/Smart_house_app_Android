package com.example.thesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView LivingRoomL = (CardView) findViewById(R.id.LivingRoom);
        LivingRoomL.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "WESZLO");

        switch (v.getId()) {
            case R.id.LivingRoom:
                Context context = v.getContext();
                context.startActivity(new Intent(context,LivingRoom.class));
                break;
            default:
                break;
        }
    }

}

