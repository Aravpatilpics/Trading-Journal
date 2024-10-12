package com.example.pointsrally;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Form3Activity extends AppCompatActivity {

    private EditText etRulesFollow, etReview, etPreChartLink, etChartLink, etAdditionalChartLink;
    private Button btnSubmit, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form3); // Ensure this matches your XML filename

        // Initialize views
        etRulesFollow = findViewById(R.id.et_rules_follow);
        etReview = findViewById(R.id.et_review);
        etPreChartLink = findViewById(R.id.et_pre_chart_link);
        etChartLink = findViewById(R.id.et_chart_link);
        etAdditionalChartLink = findViewById(R.id.et_additional_chart_link);
        btnSubmit = findViewById(R.id.btn_submit);
        btnCancel = findViewById(R.id.btn_cancel);

        // Set button click listeners
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle submit button click
                String rulesFollow = etRulesFollow.getText().toString();
                String review = etReview.getText().toString();
                String preChartLink = etPreChartLink.getText().toString();
                String chartLink = etChartLink.getText().toString();
                String additionalChartLink = etAdditionalChartLink.getText().toString();

                // Example action: Display values in a Toast
                String message = "Submitted:\nRules: " + rulesFollow + "\nReview: " + review;
                Toast.makeText(Form3Activity.this, message, Toast.LENGTH_LONG).show();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle cancel button click
                clearInputs();
            }
        });
    }

    private void clearInputs() {
        etRulesFollow.setText("");
        etReview.setText("");
        etPreChartLink.setText("");
        etChartLink.setText("");
        etAdditionalChartLink.setText("");
        Toast.makeText(this, "Inputs cleared", Toast.LENGTH_SHORT).show();
    }
}

