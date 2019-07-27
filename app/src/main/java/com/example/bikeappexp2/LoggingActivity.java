package com.example.bikeappexp2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import com.example.bikeappexp2.R;

public class LoggingActivity extends AppCompatActivity {
    EditText logging_user_name,logging_user_password;
    Button logging_login;
    TextView logging_status_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);
        logging_user_name = findViewById(R.id.logging_user_name);
        logging_user_password = findViewById(R.id.logging_user_password);
        logging_login = findViewById(R.id.logging_login);
        logging_status_display = findViewById(R.id.logging_status_display);
        logging_status_display.setText("");
        logging_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_name = logging_user_name.getText().toString();
                String password = logging_user_password.getText().toString();
                com.example.bikeappexp2.LoginHelper loginHelper = new com.example.bikeappexp2.LoginHelper(getApplicationContext());
                if (loginHelper.check_password(user_name,password)){
                    loginHelper.setLoggingStatus(true,user_name);
                }
                else {
                    logging_status_display.setText("Enter valid user name and password.");
                }


            }
        });
    }



}
