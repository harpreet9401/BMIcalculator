package com.harpreet.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView height = findViewById(R.id.selected_height_textview);
        SeekBar seekbar = findViewById(R.id.seekbar);

        LinearLayout genderMaleLayout = findViewById(R.id.gender_male_layout);
        genderMaleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "male selected", Toast.LENGTH_SHORT).show();
            }
        });
        LinearLayout genderFemaleLayout = findViewById(R.id.gender_female_layout);
        genderFemaleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "female selected", Toast.LENGTH_SHORT).show();
            }
        });

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                height.setText(progress + " cm");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // No-Op
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // No-Op
            }
        });
    }
}
