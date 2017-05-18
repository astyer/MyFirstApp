package com.example.as489.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WaitingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.waiting_activity);
        finish();

        change();
    }

    public void change()
    {
        timerStuff t = new timerStuff();
        t.start();
        while(true)
        {
            if(t.stopped())
            {
                Intent intent = new Intent(WaitingActivity.this, ReadyToTap.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;
            }
        }
    }

}
