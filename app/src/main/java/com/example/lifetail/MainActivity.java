package com.example.lifetail;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText mainEmailET, mainPasswordET;
    TextView mainForgetTV, mainSignUpTV;
    AppCompatButton mainSignInBtn;
    ConstraintLayout mainSignInGoogleCL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mainEmailET = findViewById(R.id.mainEmailET);
        mainPasswordET = findViewById(R.id.mainPasswordET);

        mainForgetTV = findViewById(R.id.mainForgotTV);
        mainSignInBtn = findViewById(R.id.mainSignInBtn);
        mainSignInGoogleCL = findViewById(R.id.mainSignInGoogleCL);
        mainSignUpTV = findViewById(R.id.mainSignUpTV);

        mainSignUpTV.setOnClickListener(v -> {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        });
    }
}