package com.example.mobile_app_development_task_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TableLayout tableLayout = new TableLayout( this);

        // первая строка
        TableRow tableRow1 = new TableRow(this);
        TextView textView1 = new TextView(this);
        textView1.setText("Логин");
        tableRow1.addView(textView1, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 0.5f));
        EditText editText1 = new EditText(this);
        tableRow1.addView(editText1, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 1.0f));
        // вторая строка
        TableRow tableRow2 = new TableRow(this);
        TextView textView2 = new TextView(this);
        textView2.setText("Email");
        tableRow2.addView(textView2, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 0.5f));
        EditText editText2 = new EditText(this);
        tableRow2.addView(editText2, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 1.f));


        // третия строка
        TableRow tableRow3 = new TableRow(this);
        Button button = new Button(this);
        button.setText("push");
        tableRow3.addView(button, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 0.5f));

        tableLayout.addView(tableRow1);
        tableLayout.addView(tableRow2);
        tableLayout.addView(button);
        setContentView(tableLayout);
    }


}