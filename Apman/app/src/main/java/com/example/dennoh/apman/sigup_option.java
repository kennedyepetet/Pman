package com.example.dennoh.apman;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class sigup_option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigup_option);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button owner_btn=(Button)findViewById(R.id.btn_owner);
        owner_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent owner_reg=new Intent(sigup_option.this, sign_up_acticity.class);
                startActivity(owner_reg);
            }
        });
        Button tenant_btn=(Button)findViewById(R.id.btn_tenant);
        tenant_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tenant_reg_activity=new Intent(sigup_option.this, tenant_signup_activity.class);
                startActivity(tenant_reg_activity);
            }
        });
    }

}
