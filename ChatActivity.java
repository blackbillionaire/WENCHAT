
package com.nku.ai;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    EditText input;
    TextView reply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        input = findViewById(R.id.userInput);
        reply = findViewById(R.id.aiReply);
        Button send = findViewById(R.id.sendButton);

        send.setOnClickListener(v -> {

            String text = input.getText().toString().toLowerCase();

            if(text.contains("hello")){
                reply.setText("NKU AI: Hello human.");
            } else if(text.contains("who made you")){
                reply.setText("NKU AI: I was created inside the NKU system.");
            } else {
                reply.setText("NKU AI: Processing intelligence...");
            }

        });
    }
}
