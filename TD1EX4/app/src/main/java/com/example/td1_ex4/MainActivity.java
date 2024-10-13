package com.example.td1_ex4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private CheckBox checkBoxSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        checkBoxSpace = findViewById(R.id.checkBoxSpace);
    }
    public void concat(View view) {
        String mot1 = editText1.getText().toString().trim();
        String mot2 = editText2.getText().toString().trim();

        if (mot1.isEmpty() || mot2.isEmpty()) {
            Toast.makeText(this, "Champs vide", Toast.LENGTH_SHORT).show();
        } else {
            String resultat;
            if (checkBoxSpace.isChecked()) {
                resultat = mot1 + " " + mot2;
            } else {
                resultat = mot1 + mot2;
            }
            Toast.makeText(this, resultat, Toast.LENGTH_SHORT).show();
        }
    }
}