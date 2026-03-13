
package com.nku.ai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = findViewById(R.id.loginBtn);

        login.setOnClickListener(v ->
                startActivity(new Intent(LoginActivity.this, DashboardActivity.class)));
    }
}
