package com.balsani.coa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.balsani.controledeobirgaesacessrias.R;

public class CadastroEmpresaActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_empresa);

        TextView loggedInUserTextView = findViewById(R.id.textViewLoggedInUser);
        String nome = getIntent().getStringExtra("nome");
        loggedInUserTextView.setText(nome);


        EditText empresaEditText = findViewById(R.id.editTextCompanyName);
        EditText cnpjEditText = findViewById(R.id.editTextCnpj);

        Button cadastrarButton = findViewById(R.id.btn_cadastrar);
        cadastrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeEmpresa = empresaEditText.getText().toString();
                String cnpj = cnpjEditText.getText().toString();


            }
        });
}}
