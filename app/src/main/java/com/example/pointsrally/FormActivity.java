package com.example.pointsrally; // Change this to your actual package name
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class FormActivity extends AppCompatActivity {
    // Declare EditText fields
    private EditText etSrNo, etDayDate, etTime, etTradeName, etType, etQuantity, etStrategy, etTimeFrame, etSetup;
    private int currentIndex = 0; // Keeps track of the current field being edited
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        // Initialize EditText fields
        etSrNo = findViewById(R.id.et_sr_no);
        etDayDate = findViewById(R.id.et_day_date);
        etTime = findViewById(R.id.et_time);
        etTradeName = findViewById(R.id.et_tradename);
        etType = findViewById(R.id.et_type);
        etQuantity = findViewById(R.id.et_quantity);
        etStrategy = findViewById(R.id.et_strategy);
        etTimeFrame = findViewById(R.id.et_time_frame);
        etSetup = findViewById(R.id.et_setup);
        // Store all EditText fields in an array
        final EditText[] editTexts = {
                etSrNo, etDayDate, etTime, etTradeName, etType, etQuantity, etStrategy, etTimeFrame, etSetup
        };
        // Initialize Previous and Next buttons
        Button btnPrev = findViewById(R.id.btn_prev);
        Button btnNext = findViewById(R.id.btn_next);
        // Set focus to the first EditText
        editTexts[currentIndex].requestFocus();
        // Set up the "Next" button click listener
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentIndex < editTexts.length - 1) {
                    editTexts[currentIndex].clearFocus(); // Clear current focus
                    currentIndex++; // Move to the next field
                    editTexts[currentIndex].requestFocus(); // Set focus to the next field
                    Toast.makeText(FormActivity.this, "Moved to next field", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(FormActivity.this, "You are at the last field", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Set up the "Previous" button click listener
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentIndex > 0) {
                    editTexts[currentIndex].clearFocus(); // Clear current focus
                    currentIndex--; // Move to the previous field
                    editTexts[currentIndex].requestFocus(); // Set focus to the previous field
                    Toast.makeText(FormActivity.this, "Moved to previous field", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(FormActivity.this, "You are at the first field", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
