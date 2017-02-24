package com.myapp.godwin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText one;
    EditText two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=(EditText)findViewById(R.id.name);
         two=(EditText)findViewById(R.id.phone);
    }

    public void send(View view){
        String name=one.getText().toString();
        String phone =two.getText().toString();

        String msg="Name  "+name + "and phone "+phone +" sent ";

        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }



}
