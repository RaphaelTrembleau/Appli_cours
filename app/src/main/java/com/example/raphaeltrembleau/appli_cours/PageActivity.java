package com.example.raphaeltrembleau.appli_cours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageActivity extends AppCompatActivity implements View.OnClickListener {

    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        button = (Button) findViewById(R.id.buttonCancel);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
