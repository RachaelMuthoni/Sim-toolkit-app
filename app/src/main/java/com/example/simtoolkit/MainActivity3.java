package com.example.simtoolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    ListView listview;
    String[] mpesamenu2 = {"Enter phone no.", "Search SIM Contacts"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       listview = (ListView)findViewById(R.id.listview);
        ArrayAdapter adapter= new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                mpesamenu2
        );
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(getApplicationContext(),MainActivity4.class);
                    startActivity(intent);
            }
                if(position==1){
                    Toast.makeText(getApplicationContext(), "You clicked search sim contacts", Toast.LENGTH_SHORT).show();
                }
        }});
        }}