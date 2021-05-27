package com.example.fragment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentManagerNonConfig;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fragment1,fragment2,fragment3,fragment4,fragment5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1=findViewById(R.id.fragment1);
        fragment2=findViewById(R.id.fragment2);
        fragment3=findViewById(R.id.fragment3);
        fragment4=findViewById(R.id.fragment4);
        fragment5=findViewById(R.id.fragment5);

        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment1 fragment1 =new Fragment1();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.layout2,fragment1,fragment1.getTag()).commit();
            }
        });
        fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2=new Fragment2();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.layout2,fragment2,fragment2.getTag()).commit();

            }
        });
        fragment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Fragment3 fragment3=new Fragment3();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.layout2,fragment3,fragment3.getTag()).commit();
            }
        });
        fragment4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment4 fragment4=new Fragment4();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.layout2,fragment4,fragment4.getTag()).commit();
            }
        });
        fragment5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment5 fragment5=new Fragment5();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.layout2,fragment5,fragment5.getTag()).commit();
            }
        });
    }

}