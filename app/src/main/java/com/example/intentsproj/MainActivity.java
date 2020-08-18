package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;

import android.view.View;

import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeIntent();
    }

    public void changeIntent() {
        btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Context context = getApplicationContext();
                        CharSequence message = "You just clicked the OK button";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context,message,duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL,0,-2);
                        toast.show();
                        Intent intent = new Intent(MainActivity.this,FirstActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}