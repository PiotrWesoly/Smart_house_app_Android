package com.example.thesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView LivingRoomL = (CardView) findViewById(R.id.LivingRoom);
        CardView Lock = (CardView) findViewById(R.id.lockdoor);
        CardView bluetooth = (CardView) findViewById(R.id.bluetooth);

        LivingRoomL.setOnClickListener(this);
        Lock.setOnClickListener(this);
        bluetooth.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        ImageView lock = (ImageView) findViewById(R.id.lock);
        TextView lock_text = (TextView) findViewById(R.id.lock_text);
        Context context = v.getContext();
        Log.d(TAG, "WESZLO");

        switch (v.getId()) {
            case R.id.LivingRoom:
                context.startActivity(new Intent(context,LivingRoom.class));
                break;
            case R.id.lockdoor:
                if(lock_text.getText() == "LOCKED")
                {
                    lock.setImageResource(R.drawable.lock_icon_unlocked);
                    lock_text.setText("UNLOCKED");
                }
                else
                {
                    lock.setImageResource(R.drawable.lock_icon_locked);
                    lock_text.setText("LOCKED");
                }
                break;
            case R.id.bluetooth:
                context.startActivity(new Intent(context,Bluetooth.class));
                break;
            default:
                break;
        }
    }

}

