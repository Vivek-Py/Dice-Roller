package com.insidetheradar.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
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
                //Toast.makeText(getApplicationContext(), getString(R.string.ToastMessage), Toast.LENGTH_SHORT).show();
                rolldice();
            }
        });

    }

    private void rolldice() {

        final int num = new Random().nextInt(6) + 1;
        ImageView diceImage = findViewById(R.id.random_number);

        final int imageSelection;
        if(num==1){
            imageSelection = R.drawable.dice_1;
        }
        else if(num==2){
            imageSelection = R.drawable.dice_2;
        }
        else if(num==3){
            imageSelection = R.drawable.dice_3;
        }
        else if(num==4){
            imageSelection = R.drawable.dice_4;
        }
        else if(num==5){
            imageSelection = R.drawable.dice_5;
        }
        else{
            imageSelection = R.drawable.dice_6;
        }

        diceImage.setImageResource(imageSelection);

    }
}    