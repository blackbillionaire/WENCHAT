
package com.nku.ai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button chat = findViewById(R.id.chatButton);
        Button voice = findViewById(R.id.voiceButton);

        chat.setOnClickListener(v -> startActivity(new Intent(this, ChatActivity.class)));
        voice.setOnClickListener(v -> startActivity(new Intent(this, VoiceActivity.class)));
    }
}
