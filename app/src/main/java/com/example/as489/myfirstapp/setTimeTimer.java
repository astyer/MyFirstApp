package com.example.as489.myfirstapp;

import java.util.Timer;
import java.util.TimerTask;

public class setTimeTimer {

    Timer timer = new Timer();
    int secondsPassed = 0;
    public void setup(final int x)
    {
        TimerTask task = new TimerTask() {
            public void run()
            {
                secondsPassed++;
                if(secondsPassed == x)
                {
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public boolean stopped(int x)
    {
        if(secondsPassed == x)
        {
            return true;
        }
        return false;
    }



}
