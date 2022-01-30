package com.example.thesis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class LivingRoom extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living_room);
        ImageButton btBtn = (ImageButton) findViewById(R.id.btn0);
        ImageButton lightBtn = (ImageButton) findViewById(R.id.btn2);
        ImageButton outBtn = (ImageButton) findViewById(R.id.btn3);
        ImageButton fanBtn = (ImageButton) findViewById(R.id.btn4);
        ImageButton lightBtn2 = (ImageButton) findViewById(R.id.btn5);
        ImageButton outBtn2 = (ImageButton) findViewById(R.id.btn6);


        btBtn.setOnClickListener(this);
        lightBtn.setOnClickListener(this);
        outBtn.setOnClickListener(this);
        fanBtn.setOnClickListener(this);
        lightBtn2.setOnClickListener(this);
        outBtn2.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        TextView btBtn_text = (TextView) findViewById(R.id.btn0_text);
        TextView lightBtn_text = (TextView) findViewById(R.id.btn2_text);
        TextView outBtm_text = (TextView) findViewById(R.id.btn3_text);
        TextView fanBtn_text = (TextView) findViewById(R.id.btn4_text);
        TextView lightBtn2_text = (TextView) findViewById(R.id.btn5_text);
        TextView outBtm2_text = (TextView) findViewById(R.id.btn6_text);


        Log.d(TAG, "WESZLO");

        switch (v.getId()) {
            case R.id.btn0:
                toggleButton(btBtn_text, R.id.btn0);
                break;
            case R.id.btn2:
                toggleButton(lightBtn_text, R.id.btn2);
                break;
            case R.id.btn3:
                toggleButton(outBtm_text, R.id.btn3);
                break;
            case R.id.btn4:
                toggleButton(fanBtn_text, R.id.btn4);
                break;
            case R.id.btn5:
                toggleButton(lightBtn2_text, R.id.btn5);
                break;
            case R.id.btn6:
                toggleButton(outBtm2_text, R.id.btn6);
                break;
            default:
                break;
        }
    }


    void toggleButton(TextView text, int id)
    {
        String input = text.getText().toString();
        ImageButton button = (ImageButton) findViewById(id);
        boolean isText = true;

        switch (input){
            case ("Lights: \non"):
                text.setText("Lights: \noff");
                button.setBackgroundResource(R.drawable.lights_btn_dark);
                break;
            case ("Outlet: \non"):
                text.setText("Outlet: \noff");
                button.setBackgroundResource(R.drawable.outlet_btn_dark);
                break;
            case ("Fan: \non"):
                text.setText("Ventilation: \noff");
                break;
            case ("Lights: \noff"):
                text.setText("Lights: \non");
                button.setBackgroundResource(R.drawable.light_btn);
                break;
            case ("Outlet: \noff"):
                text.setText("Outlet: \non");
                button.setBackgroundResource(R.drawable.outlet_btn);
                break;
            case ("Ventilation: \noff"):
                text.setText("Fan: \non");
                break;
            default:
                break;
        }

    }

}
