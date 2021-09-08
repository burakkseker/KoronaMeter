package com.burak.korona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);


    }
    public  void testebasla(View view)
    {

        int number;
        Random random=new Random();
        number=random.nextInt(100)+1;
        textView=findViewById(R.id.textView);
        textView.setText(String.valueOf("%"+number));

    }
    public  void burayaDokun(View view)
    {
        Intent intent=new Intent(MainActivity.this,description.class);
        startActivity(intent);
    }
}

