package com.example.study_wds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean LEDOn = true;
    private Button button = null;
    private CheckBox LED1 = null;
    private CheckBox LED2 = null;
    private CheckBox LED3 = null;
    private CheckBox LED4 = null;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.LED1:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "LED1 ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "LED1 OFF", Toast.LENGTH_SHORT).show();
                }
            case R.id.LED2:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "LED2 ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "LED2 OFF", Toast.LENGTH_SHORT).show();
                }
            case R.id.LED3:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "LED3 ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "LED2 OFF", Toast.LENGTH_SHORT).show();
                }
            case R.id.LED4:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "LED4 ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "LED4 OFF", Toast.LENGTH_SHORT).show();
                }

                break;
            // TODO: Veggie sandwich
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        LED1 = (CheckBox) findViewById(R.id.LED1);
        LED2 = (CheckBox) findViewById(R.id.LED2);
        LED3 = (CheckBox) findViewById(R.id.LED3);
        LED4 = (CheckBox) findViewById(R.id.LED4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (LEDOn) {
                    button.setText("ALL LED OFF");
                    LED1.setChecked(true);
                    LED2.setChecked(true);
                    LED3.setChecked(true);
                    LED4.setChecked(true);
                } else {
                    button.setText("ALL LED ON");
                    LED1.setChecked(false);
                    LED2.setChecked(false);
                    LED3.setChecked(false);
                    LED4.setChecked(false);
                }

                LEDOn = !LEDOn;
            }

        });

    }
}
