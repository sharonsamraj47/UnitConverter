package com.example.unitconverter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView2, textView3, textView4, result;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        result = findViewById(R.id.result);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);

        button.setOnClickListener(v -> convertFromkiloToPounds());

    }

    @SuppressLint("SetTextI18n")
    private void convertFromkiloToPounds() {
        String valuesEnteredinKilo = editText.getText().toString();
        double Kilo = Double.parseDouble(valuesEnteredinKilo);
        double pounds = Kilo * 2.20462;
        result.setText(" " + pounds);
    }
}