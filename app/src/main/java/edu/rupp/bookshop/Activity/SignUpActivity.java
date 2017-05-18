package edu.rupp.bookshop.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import edu.rupp.bookshop.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button btnSignUp=(Button) findViewById(R.id.btn_signup);
        btnSignUp.setOnClickListener(this);
        TextView txtLogIn=(TextView) findViewById(R.id.txt_LogIn);
        txtLogIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_signup)
        {
            Intent SignUpIntent=new Intent(this,SignUp2Activity.class);
            startActivity(SignUpIntent);
        }
        else
        {
            Intent SignUpIntent=new Intent(this,LogInActivity.class);
            startActivity(SignUpIntent);
        }
    }
}
