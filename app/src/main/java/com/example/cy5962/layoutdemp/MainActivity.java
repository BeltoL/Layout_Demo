package com.example.cy5962.layoutdemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linear=(Button) findViewById(R.id.linear);
        linear.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View v){
            Intent i = new Intent();
            i.setClass(com.example.cy5962.layoutdemp.MainActivity.this,com.example.cy5962.layoutdemp.Main2Activity.class);
            startActivity(i);
            }
        });

        Button constaint=(Button) findViewById(R.id.constraint);
        constaint.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent i = new Intent();
                    i.setClass(com.example.cy5962.layoutdemp.MainActivity.this,com.example.cy5962.layoutdemp.Main3Activity.class);
                    startActivity(i);
                }
        });

        Button table=(Button) findViewById(R.id.table);
        table.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent();
                i.setClass(com.example.cy5962.layoutdemp.MainActivity.this,com.example.cy5962.layoutdemp.Main4Activity.class);
                startActivity(i);
            }
        });

    }

}
