package com.example.slip3q2b;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText edtName, edtSurname, edtClass, edtGender, edtHobbies, edtMarks;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        edtSurname = findViewById(R.id.edtSurname);
        edtClass = findViewById(R.id.edtClass);
        edtGender = findViewById(R.id.edtGender);
        edtHobbies = findViewById(R.id.edtHobbies);
        edtMarks = findViewById(R.id.edtMarks);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String surname = edtSurname.getText().toString();
                String studentClass = edtClass.getText().toString();
                String gender = edtGender.getText().toString();
                String hobbies = edtHobbies.getText().toString();
                String marks = edtMarks.getText().toString();
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("NAME", name);
                intent.putExtra("SURNAME", surname);
                intent.putExtra("CLASS", studentClass);
                intent.putExtra("GENDER", gender);
                intent.putExtra("HOBBIES", hobbies);
                intent.putExtra("MARKS", marks);
                startActivity(intent);
            }
        });
    }
}
