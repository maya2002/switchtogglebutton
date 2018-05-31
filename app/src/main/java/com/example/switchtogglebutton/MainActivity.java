package com.example.switchtogglebutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ToggleButton tb;
    Button change;
    Switch st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById (R.id.toggleButton);
        change=(Button) findViewById(R.id.button);
        st=(Switch) findViewById(R.id.switch1);
    }
    public void herchange (View view){
        if ((st.isChecked()&&(!tb.isChecked()))
            change.setBackgroundColor(Color.YELLOW);
        else{
            if ((tb.isChecked()&&(st.isChecked()))
                change.setBackgroundColor(Color.GREEN);
            else{
                if ((tb.isChecked()&& (!st.isChecked()))
                    change.setBackgroundColor(Color.BLUE);
                else{
                    if ((!st.isChecked()&&(!tb.isChecked())))
                        change.setBackgroundColor(Color.RED);
                }
            }
        }

    }
}
