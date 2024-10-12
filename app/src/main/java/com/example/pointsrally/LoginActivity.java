package com.example.pointsrally;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private CheckBox rememberMeCheckbox;
    private MaterialButton loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize the EditText fields and CheckBox
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        rememberMeCheckbox = findViewById(R.id.rememberMeCheckbox);

        // Initialize the Login button
        loginButton = findViewById(R.id.loginButton);

        // Set an OnClickListener on the Login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleLogin();
            }
        });
    }

    private void handleLogin() {
        // Validate inputs
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            emailEditText.setError("Email is required");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            passwordEditText.setError("Password is required");
            return;
        }

        // Here you can add your login logic (e.g., API call)
        // For demonstration purposes, we show a success message
        Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();

        // Optionally, you can remember the user if the checkbox is checked
        if (rememberMeCheckbox.isChecked()) {
            // Handle remembering user logic (e.g., save in SharedPreferences)
        }

        // Clear the fields after login
        clearFields();
    }

    private void clearFields() {
        emailEditText.setText("");
        passwordEditText.setText("");
        rememberMeCheckbox.setChecked(false);
    }
}
