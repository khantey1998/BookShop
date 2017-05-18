package edu.rupp.bookshop.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.rupp.bookshop.R;

public class SignUp2Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);
        Button btnSellerSignUp=(Button) findViewById(R.id.btn_sellerSignUp);
        Button btnCustomerSignUp=(Button) findViewById(R.id.btn_customerSignUp);
        btnSellerSignUp.setOnClickListener(this);
        btnCustomerSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_sellerSignUp)
        {
            Intent SellerSignUpIntent=new Intent(this,SignUp3Activity.class);
            startActivity(SellerSignUpIntent);
        }
        else
        {
            Intent SellerSignUpIntent=new Intent(this,SignUp3Activity.class);
            startActivity(SellerSignUpIntent);
        }
    }
}
