package com.balsani.coa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.balsani.controledeobirgaesacessrias.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nameEditText = findViewById(R.id.editTextNome);
                String name = nameEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, CadastroEmpresaActivity.class);
                intent.putExtra("nome", name);
                startActivity(intent);
            }
        });
    }
}