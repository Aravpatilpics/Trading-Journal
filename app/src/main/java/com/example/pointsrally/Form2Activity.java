package com.example.pointsrally;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class Form2Activity extends AppCompatActivity {

    private EditText etR2R, etEntryPoint, etStoploss, etTarget, etExitPrice, etPoints, etPnl, etCapital, etConfidence;
    private Button btnPrev, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2); // Make sure this matches your XML filename

        // Initialize views
        etR2R = findViewById(R.id.et_r2r);
        etEntryPoint = findViewById(R.id.et_entry_point);
        etStoploss = findViewById(R.id.et_stoploss);
        etTarget = findViewById(R.id.et_target);
        etExitPrice = findViewById(R.id.et_exit_price);
        etPoints = findViewById(R.id.et_points);
        etPnl = findViewById(R.id.et_pnl);
        etCapital = findViewById(R.id.et_capital);
        etConfidence = findViewById(R.id.et_confidence);
        btnPrev = findViewById(R.id.btn_prev);
        btnNext = findViewById(R.id.btn_next);

        // Set button click listeners
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle previous button click
                Toast.makeText(Form2Activity.this, "Prev clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle next button click
                // Retrieve values from EditTexts
                String r2r = etR2R.getText().toString();
                String entryPoint = etEntryPoint.getText().toString();
                String stoploss = etStoploss.getText().toString();
                String target = etTarget.getText().toString();
                String exitPrice = etExitPrice.getText().toString();
                String points = etPoints.getText().toString();
                String pnl = etPnl.getText().toString();
                String capital = etCapital.getText().toString();
                String confidence = etConfidence.getText().toString();

                // Example action: Display values in a Toast
                String message = "Next clicked:\nR2R: " + r2r + "\nEntry Point: " + entryPoint;
                Toast.makeText(Form2Activity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
