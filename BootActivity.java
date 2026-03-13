
package com.nku.ai;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class BootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boot);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(BootActivity.this, LoginActivity.class));
            finish();
        }, 3500);
    }
}
