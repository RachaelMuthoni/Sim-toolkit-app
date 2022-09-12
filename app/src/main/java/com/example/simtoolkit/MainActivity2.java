package com.example.simtoolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ListView listview2;
    //data source
    String[] mpesamenu = {"Send Money", "Withdraw Cash", "Buy Airtime", "Loans and Savings", "Lipa na MPESA", "My Account"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listview2=findViewById(R.id.listview2);

        //create an adapter
        ArrayAdapter adapter= new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                mpesamenu
        );

        //load the listview
        listview2.setAdapter(adapter);
        listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(intent);

                }

                if(position==1){

                    Toast.makeText(getApplicationContext(),"You clicked Withdraw Cash",Toast.LENGTH_SHORT).show();
                }
                if(position==2){

                    Toast.makeText(getApplicationContext(),"You clicked Buy Airtime",Toast.LENGTH_SHORT).show();
                }
                if(position==3){

                    Toast.makeText(getApplicationContext(),"You clicked Loans and Savings",Toast.LENGTH_SHORT).show();
                }
                if(position==4){

                    Toast.makeText(getApplicationContext(),"You clicked Lipa na MPESA",Toast.LENGTH_SHORT).show();
                }
                if(position==5){

                    Toast.makeText(getApplicationContext(),"You clicked My Account",Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}
