package com.example.sparken02.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {
    private Button btnlogin;
    private EditText edtemail,edtpassword;
    private Intent intentrecycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        edtemail = (EditText) findViewById(R.id.edtemail);
        edtpassword = (EditText) findViewById(R.id.edtpassword);
        btnlogin = (Button) findViewById(R.id.btnLogin);
        
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtemail.getText().toString();
//
//                if(!emailValidator(email)){
//                    edtemail.setText("");
//                    edtemail.setError("enter valid email");
//                }else if(edtpassword.getText().length()<6){
//                    edtpassword.setText("");
//                    edtpassword.setError("enter password minimum 6 digit");
//                }
//                else{
                    intentrecycle = new Intent(LoginPage.this,RecyclerviewPage.class);
                    startActivity(intentrecycle);
//                }
            }
        });
    }
//    public boolean emailValidator(String email) {
//        Pattern pattern;
//        Matcher matcher;
//        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
//        pattern = Pattern.compile(EMAIL_PATTERN);
//        matcher = pattern.matcher(email);
//        return matcher.matches();
//
//    }
}
