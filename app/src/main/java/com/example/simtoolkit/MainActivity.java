package com.example.simtoolkit;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    //data source
    String[] mpesa = {"Safaricom+", "MPESA"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=findViewById(R.id.listview);

        //create an adapter
        ArrayAdapter adapter= new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                mpesa
        );

        //load the listview
        listview.setAdapter(adapter);

        //handle click event

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Toast.makeText(getApplicationContext(),"You clicked Safaricom+",Toast.LENGTH_SHORT).show();
                }

                if(position==1){

                    Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(intent);
                }


            }
        });



    }
}
