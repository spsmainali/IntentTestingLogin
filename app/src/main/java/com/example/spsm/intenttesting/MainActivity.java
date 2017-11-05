package com.example.spsm.intenttesting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onclick(View view){
        Intent i = new Intent(this, ActivityTwo.class);
        Context context = getApplicationContext();
        EditText userName = (EditText) findViewById(R.id.editTextName);
        EditText password = (EditText) findViewById(R.id.editTxtPswd);
        String usermsg = userName.getText().toString();
        String userPass = password.getText().toString();
        if((usermsg.equals("Saurav"))&&(userPass.equals("saurav"))) {
            i.putExtra("msgFrmFirstActivity", usermsg);
            startActivity(i);
        }
        else {

            Toast.makeText(context, "Password Mismatch",
                    Toast.LENGTH_LONG).show();
        }

   }


}
