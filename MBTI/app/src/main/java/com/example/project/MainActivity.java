package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button test = (Button) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, test.class);
                startActivity(intent);
            }
        });

        Button INFJ_btn = (Button) findViewById(R.id.INFJ_btn);
        INFJ_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), infj_description.class);
                startActivity(intent);
            }
        });

        Button INFP_btn = (Button) findViewById(R.id.INFP_btn);
        INFP_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), infp_description.class);
                startActivity(intent);
            }
        });

        Button ENFJ_btn = (Button) findViewById(R.id.ENFJ_btn);
        ENFJ_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enfj_description.class);
                startActivity(intent);
            }
        });

        Button ENFP_btn = (Button) findViewById(R.id.ENFP_btn);
        ENFP_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enfp_description.class);
                startActivity(intent);
            }
        });

        Button INTJ_btn = (Button) findViewById(R.id.INTJ_btn);
        INTJ_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), intj_description.class);
                startActivity(intent);
            }
        });

        Button INTP_btn = (Button) findViewById(R.id.INTP_btn);
        INTP_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), intp_description.class);
                startActivity(intent);
            }
        });

        Button ENTJ_btn = (Button) findViewById(R.id.ENTJ_btn);
        ENTJ_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), entj_description.class);
                startActivity(intent);
            }
        });

        Button ENTP_btn = (Button) findViewById(R.id.ENTP_btn);
        ENTP_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), entp_description.class);
                startActivity(intent);
            }
        });

        Button ISTJ_btn = (Button) findViewById(R.id.ISTJ_btn);
        ISTJ_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), istj_description.class);
                startActivity(intent);
            }
        });

        Button ISFJ_btn = (Button) findViewById(R.id.ISFJ_btn);
        ISFJ_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), isfj_description.class);
                startActivity(intent);
            }
        });

        Button ESTJ_btn = (Button) findViewById(R.id.ESTJ_btn);
        ESTJ_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), estj_description.class);
                startActivity(intent);
            }
        });

        Button ESFJ_btn = (Button) findViewById(R.id.ESFJ_btn);
        ESFJ_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), esfj_description.class);
                startActivity(intent);
            }
        });

        Button ISTP_btn = (Button) findViewById(R.id.ISTP_btn);
        ISTP_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), istp_description.class);
                startActivity(intent);
            }
        });

        Button ISFP_btn = (Button) findViewById(R.id.ISFP_btn);
        ISFP_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), isfp_description.class);
                startActivity(intent);
            }
        });

        Button ESTP_btn = (Button) findViewById(R.id.ESTP_btn);
        ESTP_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), estp_description.class);
                startActivity(intent);
            }
        });

        Button ESFP_btn = (Button) findViewById(R.id.ESFP_btn);
        ESFP_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), esfp_description.class);
                startActivity(intent);
            }
        });


    }

}