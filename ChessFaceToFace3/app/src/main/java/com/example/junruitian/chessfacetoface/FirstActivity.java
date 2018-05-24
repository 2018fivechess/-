package com.example.junruitian.chessfacetoface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this,"begin success",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent1);
            }
        });

        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FirstActivity.this,"click success",Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //startActivity(intent);
                finish();
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.add_item:
                Toast.makeText(this,"Login",Toast.LENGTH_SHORT).show();
                //加入login后期activity
                break;
            case R.id.remove_item:
                Toast.makeText(this,"Logout",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
