package com.example.slip3q2b;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class DisplayActivity extends AppCompatActivity {
    TableLayout tableLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        tableLayout = findViewById(R.id.tableLayout);
        String name = getIntent().getStringExtra("NAME");
        String surname = getIntent().getStringExtra("SURNAME");
        String studentClass = getIntent().getStringExtra("CLASS");
        String gender = getIntent().getStringExtra("GENDER");
        String hobbies = getIntent().getStringExtra("HOBBIES");
        String marks = getIntent().getStringExtra("MARKS");
        addRow("Name:", name);
        addRow("Surname:", surname);
        addRow("Class:", studentClass);
        addRow("Gender:", gender);
        addRow("Hobbies:", hobbies);
        addRow("Marks:", marks);
    }
    private void addRow(String label, String value) {
        TableRow row = new TableRow(this);
        TextView labelView = new TextView(this);
        labelView.setText(label);
        row.addView(labelView);
        TextView valueView = new TextView(this);
        valueView.setText(value);
        row.addView(valueView);
        tableLayout.addView(row);
    }
}
