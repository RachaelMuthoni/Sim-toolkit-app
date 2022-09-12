package com.example.simtoolkit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    EditText amount;
    Button send;
    TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        amount = (EditText) findViewById(R.id.amount);
        send = (Button)findViewById(R.id.send);
        textview1 = (TextView) findViewById(R.id.textview1);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity5.this, "Sending...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        amount.addTextChangedListener(i);
    }
    private TextWatcher i = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String Amount =amount.getText().toString();
            Bundle bundle = getIntent().getExtras();
            String phoneno = bundle.getString("phoneno");
            if (Integer.parseInt(Amount)<500){
                amount.setError("Minimum amount you can send is 500");
            }
            else if (Integer.parseInt(Amount)>50000){
                amount.setError("Maximum amount you can send is 50000");
            }
            else{
               new AlertDialog.Builder(MainActivity5.this)
                       .setTitle("Enter phone no")
                       .setMessage("Send to" +phoneno +" Ksh. "+amount)
                       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                              Toast.makeText(getApplicationContext(),"Sending...",Toast.LENGTH_SHORT).show();

                           }
                       })
                       .setNegativeButton("Cancel",null).show();
            }
            send.setEnabled(!Amount.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable s) {

        }

};
}