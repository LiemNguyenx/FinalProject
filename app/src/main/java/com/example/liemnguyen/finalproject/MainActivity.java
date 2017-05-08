package com.example.liemnguyen.finalproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.liemnguyen.finalproject.adapter.monanAdapter;
import com.example.liemnguyen.finalproject.model.monan;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    monanAdapter adapter;

    ArrayList<monan> monanList = new ArrayList<monan>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        lv = (ListView) findViewById(R.id.lvDanhSach);

        ArrayList<String> l = new ArrayList<>();
        l.add("asdsad");
        l.add("asdsad");
        l.add("asdsad");
        l.add("asdsad");
        l.add("asdsad");
        ArrayAdapter a = new ArrayAdapter(this,android.R.layout.simple_list_item_1,l);
        adapter = new monanAdapter(MainActivity.this,R.layout.item_monan,monanList);
        lv.setAdapter(a);
    }
    public void init(){
        monanList.add(new monan("da",19000,false));
        monanList.add(new monan("den",9000,false));
        monanList.add(new monan("sua",29000,false));
    }
}
