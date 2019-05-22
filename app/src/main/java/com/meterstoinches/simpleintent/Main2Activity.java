package com.meterstoinches.simpleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText e3,e4;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e3=findViewById(R.id.ed3);
        e4=findViewById(R.id.ed4);
        b2=findViewById(R.id.btn2);

        String message = getIntent().getStringExtra("key1");
        e3.setText("Welcome: "+message);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                i.putExtra("key2",e4.getText().toString());
                startActivity(i);
            }
        });
    }
}
