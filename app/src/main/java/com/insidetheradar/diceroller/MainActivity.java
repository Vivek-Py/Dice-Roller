package com.insidetheradar.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = (Button) findViewById(R.id.roll_button);
        rollButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getString(R.string.ToastMessage), Toast.LENGTH_SHORT).show();
                rolldice();
            }
        });

    }

    private void rolldice() {
        TextView randomNumber = findViewById(R.id.random_number);
        final int num = new Random().nextInt(6) + 1;
        String number = String.valueOf(num);
        randomNumber.setText(number);
    }
}    