package edu.rupp.bookshop.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.rupp.bookshop.R;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Button btnLogIn=(Button) findViewById(R.id.btnLogIn);
        btnLogIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
