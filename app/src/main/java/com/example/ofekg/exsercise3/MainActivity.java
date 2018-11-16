package com.example.ofekg.exsercise3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
public Button btn;
int num0 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.bt0);
    }

    public void go(View view) {
        if(num0 == 6){
            btn.setText("Enough to click. Go to new start!");
            num0 = 0;
        }else{
            num0++;
            btn.setText("This is a click number: "+ num0);
        }


    }
}
