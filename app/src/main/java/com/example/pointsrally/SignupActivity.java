package com.example.pointsrally;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class SignupActivity extends AppCompatActivity {

    private EditText nameEditText, surnameEditText, mobileEditText, dobEditText, genderEditText, emailEditText, passwordEditText;
    private MaterialButton signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Initialize the EditText fields
        nameEditText = findViewById(R.id.nameEditText);
        surnameEditText = findViewById(R.id.surnameEditText);
        mobileEditText = findViewById(R.id.mobileEditText);
        dobEditText = findViewById(R.id.dobEditText);
        genderEditText = findViewById(R.id.genderEditText);
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

        // Initialize the Sign Up button
        signUpButton = findViewById(R.id.signUpButton);

        // Set an OnClickListener on the Sign Up button
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSignup();
            }
        });
    }

    private void handleSignup() {
        // Validate inputs
        String name = nameEditText.getText().toString().trim();
        String surname = surnameEditText.getText().toString().trim();
        String mobile = mobileEditText.getText().toString().trim();
        String dob = dobEditText.getText().toString().trim();
        String gender = genderEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if (TextUtils.isEmpty(name)) {
            nameEditText.setError("Name is required");
            return;
        }
        if (TextUtils.isEmpty(surname)) {
            surnameEditText.setError("Surname is required");
            return;
        }
        if (TextUtils.isEmpty(mobile)) {
            mobileEditText.setError("Mobile number is required");
            return;
        }
        if (TextUtils.isEmpty(dob)) {
            dobEditText.setError("Date of Birth is required");
            return;
        }
        if (TextUtils.isEmpty(gender)) {
            genderEditText.setError("Gender is required");
            return;
        }
        if (TextUtils.isEmpty(email)) {
            emailEditText.setError("Email is required");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            passwordEditText.setError("Password is required");
            return;
        }

        // You can add additional validation for email format and password strength here.

        // Show success message (You can replace this with your actual signup logic)
        Toast.makeText(this, "Signup successful!", Toast.LENGTH_SHORT).show();

        // Optionally, you can clear the fields after signup
        clearFields();
    }

    private void clearFields() {
        nameEditText.setText("");
        surnameEditText.setText("");
        mobileEditText.setText("");
        dobEditText.setText("");
        genderEditText.setText("");
        emailEditText.setText("");
        passwordEditText.setText("");
    }
}
