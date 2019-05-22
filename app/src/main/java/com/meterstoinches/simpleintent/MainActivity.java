package com.meterstoinches.simpleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.ed1);
        e2=findViewById(R.id.ed2);
        b1=findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(getApplicationContext(),Main2Activity.class);
                s.putExtra("key1",e1.getText().toString());
                startActivity(s);
            }
        });
        String message2 = getIntent().getStringExtra("key2");
        e2.setText("Your ID is: "+message2);
    }
}
