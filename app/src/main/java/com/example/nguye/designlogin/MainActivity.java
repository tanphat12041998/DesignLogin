package com.example.nguye.designlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    EditText user, passwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.buttonClick1);
        user = (EditText) findViewById(R.id.editText4);
        passwd = (EditText) findViewById(R.id.editText5);
        final String userDefault = "tanphat1998";
        final String passwdDefault = "1998";

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usr = user.getText().toString();
                String pas = passwd.getText().toString();

                if(!usr.equals(userDefault) || usr.isEmpty()) {
                    user.requestFocus();
                    user.setError("Account is incorrect");
                    Toast();
                }
                else if(!pas.equals(passwdDefault) || pas.isEmpty()) {
                    passwd.requestFocus();
                    passwd.setError("Password is incorrect");
                    Toast();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
            }
        });
    }
    protected void Toast(){
        Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_LONG);
    }
}
