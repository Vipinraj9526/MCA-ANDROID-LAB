package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private Button login;
    private TextView info;
    int count=5;
    String username,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.etName);
        password = (EditText) findViewById(R.id.etPassword);
        login = (Button) findViewById(R.id.btnLogin);
        info= (TextView) findViewById(R.id.tvinfo);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username=name.getText().toString();
                pass=password.getText().toString();

                if (username.equals("admin") && pass.equals("1234"))
                {
                    Toast.makeText(getApplicationContext(),"login success",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,login.class));
                }
                else
                {
                    Toast.makeText(MainActivity.this,"login Failed",Toast.LENGTH_SHORT).show();
                    count--;
                    info.setText("login attempt remaining: "+count);
                    if(count==0)
                    {
                        Toast.makeText(MainActivity.this,"login button disabled", Toast.LENGTH_SHORT).show();
                        login.setEnabled(false);
                    }

                }

            }
        }

        );

    }
}