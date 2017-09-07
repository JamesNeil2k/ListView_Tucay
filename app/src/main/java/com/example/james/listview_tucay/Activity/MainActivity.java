package com.example.james.listview_tucay.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.james.listview_tucay.Adapter.CustomAdapter;
import com.example.james.listview_tucay.Model.College;
import com.example.james.listview_tucay.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] colleges;
    String[] year;
    ListView lv_colleges;
    CustomAdapter adapter;
    List<College> listVersions;
    int[] logos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv_colleges = (ListView) findViewById(R.id.lvColleges);
        listVersions = new ArrayList<College>();
        colleges = getResources().getStringArray(R.array.Colleges);
        logos = new int[] {R.drawable.iics, R.drawable.eng, R.drawable.cfad, R.drawable.fal, R.drawable.fm};
        for (int i=0; i<colleges.length; i++) {
            listVersions.add(new College(logos[i], colleges[i], year[i]));
        }

        adapter = new CustomAdapter(this, listVersions);

        lv_colleges.setAdapter(adapter);
    }
}
