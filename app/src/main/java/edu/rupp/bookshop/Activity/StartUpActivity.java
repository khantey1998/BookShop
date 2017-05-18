package edu.rupp.bookshop.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

import edu.rupp.bookshop.R;

public class StartUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                StartSignUpActivity();
            }
        },2000);
    }
    private void StartSignUpActivity()
    {
        Intent SignUpintent=new Intent(this,SignUpActivity.class);
        startActivity(SignUpintent);
        finish();
    }
}
