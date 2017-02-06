package com.novateka.git_test;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        int a = 0;
        for (int b = 0; b < 10; b++){
            System.out.println(b*a++);
        }


    }
}
