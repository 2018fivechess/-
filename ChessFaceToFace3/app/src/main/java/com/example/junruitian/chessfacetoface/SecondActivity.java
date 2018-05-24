package com.example.junruitian.chessfacetoface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent2);
            }
        });

        Button button4 = (Button) findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"余额不足，请先充值，您选择的服务暂未开放" ,Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent4);
            }
        });

        Button button5 = (Button) findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"余额不足，请先充值，您选择的服务暂未开放" ,Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent5);
            }
        });
    }
}
