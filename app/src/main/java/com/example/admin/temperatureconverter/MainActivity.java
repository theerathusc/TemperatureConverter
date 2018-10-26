package com.example.admin.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Convert_C = findViewById(R.id.c_button);
        Convert_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.input);
                int number = Integer.parseInt(input.getText().toString());
                Convert convert = new Convert(number);
                final TextView output = findViewById(R.id.output);
                String show = Integer.toString(convert.convert_c_to_f());
                output.setText(show);
            }
        });
        Button Convert_F = findViewById(R.id.f_button);
        Convert_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.input);
                int number = Integer.parseInt(input.getText().toString());
                Convert convert = new Convert(number);
                final TextView output = findViewById(R.id.output);
                String show = String.format("%.2f", convert.convert_f_to_c());
                output.setText(show);
            }
        });
    }
}
