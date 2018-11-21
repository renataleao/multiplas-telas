package com.example.tecinfo.multiplas_telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        final EditText idade = findViewById(R.id.edt_idade);
        Button sair = (Button) findViewById(R.id.btn_sair);
        Button cadastrar = (Button) findViewById(R.id.btn_cadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityB.this, ActivityC.class);
                intent.putExtra("idade", idade.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityB.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
