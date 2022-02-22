package com.example.homeworkandroidgoogle1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Data initialize
    Button btnToast, btnZero, btnCount;
    TextView txtViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View's initialize
        btnToast = findViewById(R.id.btnToast);
        btnZero = findViewById(R.id.btnZero);
        btnCount = findViewById(R.id.btnCount);
        txtViewCount = findViewById(R.id.txtViewCount);
        // End View's

        // Condition to enable btnZero
        checkStatusZeroBtn();
        // End condition

        // Event clicking button list
        // Toast clicking
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = txtViewCount.getText().toString();
                String resultPrinting = "Result is: " + result;

                Toast.makeText(
                    getApplicationContext(),
                    resultPrinting,
                    Toast.LENGTH_LONG
                ).show();
            }
        });
        // End Toast

        // Zero clicking
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCount.setText("0");
                checkStatusZeroBtn();
            }
        });
        // End Zero

        // Count clicking
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = txtViewCount.getText().toString();
                Integer final_result = Integer.parseInt(result) + 1;

                txtViewCount.setText(final_result.toString());
                checkStatusZeroBtn();
            }
        });
        // End Count
        // End of event
    }

    private void checkStatusZeroBtn() {
        Integer result = Integer.parseInt(txtViewCount.getText().toString());

        if (result == 0) {
            btnZero.setEnabled(false);
        } else {
            btnZero.setEnabled(true);
        }
    }
}