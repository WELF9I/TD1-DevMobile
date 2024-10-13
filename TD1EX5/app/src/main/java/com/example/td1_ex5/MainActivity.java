package com.example.td1_ex5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText edittext;
    TextView res;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.edittext);
        res = findViewById(R.id.res);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String taille = edittext.getText().toString();
                if (!taille.isEmpty()) {
                    int longueur = Integer.parseInt(taille);
                    String motGenere = genererMot(longueur);
                    res.setText(motGenere);
                } else {
                    Toast.makeText(MainActivity.this, "Veuillez entrer une taille", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText("");
                res.setText("");
            }
        });
    }
    private String genererMot(int taille) {
        StringBuilder sb = new StringBuilder(taille);
        Random random = new Random();
        for (int i = 0; i < taille; i++) {
            char c = (char) (random.nextInt(26) + 97);
            sb.append(c);
        }
        return sb.toString().toUpperCase();
    }
}