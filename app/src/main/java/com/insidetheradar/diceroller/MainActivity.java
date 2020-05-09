package com.insidetheradar.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = findViewById(R.id.roll_button);
        rollButton.setOnClickListener(rolldice());

    }

    private View.OnClickListener rolldice() {
        TextView randomNumber = findViewById(R.id.random_number);
        int randomInt = new Random().nextInt(6) + 1;
        randomNumber.setText(randomInt);
        return null;
    }

}
