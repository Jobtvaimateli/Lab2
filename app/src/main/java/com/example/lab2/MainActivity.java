package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CountingClass Counting = new CountingClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CountWordsOrChar(View view) {
        Spinner spinner = (Spinner) findViewById(R.id.CharOrWords);
        String option = spinner.getSelectedItem().toString();
        TextView textView = (TextView) findViewById(R.id.Label2);
        EditText editText = (EditText) findViewById(R.id.MainText);

        if(editText.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "Jus neivedete teksto",
                    Toast.LENGTH_LONG).show();
        } else {
            if(option.equals("Zodziai")) {
                int result = Counting.CountWords(editText.getText().toString());
                textView.setText(Integer.toString(result));
            } else {
                int result = Counting.CountChar(editText.getText().toString());
                textView.setText(Integer.toString(result));
            }
        }

    }
}
