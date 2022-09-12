package com.example.simtoolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    EditText phoneno;
    Button ok;
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        phoneno = (EditText) findViewById(R.id.phoneno);
        textview = (TextView) findViewById(R.id.textview);
        ok = (Button)findViewById(R.id.ok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity5.class);
                Bundle bundle1 = new Bundle();
                bundle1.putString("phoneno", String.valueOf(phoneno));
                intent.putExtras(bundle1);
                startActivity(intent);

            }
        });
        phoneno.addTextChangedListener(t);
    }

     private TextWatcher t = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {


        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String Contacts = phoneno.getText().toString().trim();
            ok.setEnabled(!Contacts.isEmpty()&& Contacts.length()==10);

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

}

