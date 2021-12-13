package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private Button login;
    private TextView info;
    private   int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.etName);
        password = (EditText) findViewById(R.id.etPassword);
        login = (Button) findViewById(R.id.btnLogin);
        info = (TextView) findViewById(R.id.tvInfo);

    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            System.out.println(name);
            System.out.println(password);
            if((name.getText().toString().equals("admin") && (password.getText().toString().equals("1234"))))   {
                Intent intent = new Intent(MainActivity.this,page2.class);
                startActivity(intent);

            }
            else {
                info.setText("username or password is incorrect");
                counter --;
                if(counter==0){
                    login.setEnabled(false);
                    Toast.makeText(MainActivity.this,"maximum number of login exhausted",Toast.LENGTH_SHORT).show();
                }
            }
        }
    });
    }
}