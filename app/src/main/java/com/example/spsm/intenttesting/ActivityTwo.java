package com.example.spsm.intenttesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Bundle firstData = getIntent().getExtras();



        if(firstData==null){
            return;
        }


        String firstmessage = firstData.getString("msgFrmFirstActivity");
        final TextView secondtext = (TextView) findViewById(R.id.textView2);

        secondtext.setText("Welcome "+firstmessage);
      }


    public void onclick2(View view){
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
