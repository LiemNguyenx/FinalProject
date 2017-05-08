package com.example.liemnguyen.finalproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;

import com.example.liemnguyen.finalproject.adapter.monanAdapter;
import com.example.liemnguyen.finalproject.model.monan;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    monanAdapter adapter;
    Button btThanhToan;
    ArrayList<monan> monanList = new ArrayList<monan>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btThanhToan= (Button) findViewById(R.id.thanhtoan);
        lv = (ListView) findViewById(R.id.lvDanhSach);
        adapter = new monanAdapter(MainActivity.this,R.layout.item_monan,monanList);
        lv.setAdapter(adapter);
    }
    public void init(){
        monanList.add(new monan("da",19000,false));
        monanList.add(new monan("den",9000,false));
        monanList.add(new monan("sua",29000,false));
        monanList.add(new monan("sua",29000,true));
    }
}
