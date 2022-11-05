package com.example.convertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1=findViewById(R.id.editText);
        Button btn=findViewById(R.id.button);
        EditText editText2=findViewById(R.id.editText2);
        TextView textView=findViewById(R.id.editText2);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //get the kg from the user
                String Kg = editText1.getText().toString();

                //convert string into float of kg
                float kilogram= Float.parseFloat(Kg);

                //kilo into pounds
                float pounds= (float) (kilogram * 2.20462);

                //set the pounds as result of textview

                editText2.setText("" + pounds);

            }
        });
    }
}