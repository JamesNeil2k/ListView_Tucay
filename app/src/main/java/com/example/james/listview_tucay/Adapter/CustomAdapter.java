package com.example.james.listview_tucay.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.james.listview_tucay.Activity.MainActivity;
import com.example.james.listview_tucay.Model.College;
import com.example.james.listview_tucay.R;

import java.util.List;

/**
 * Created by James on 9/7/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context c;
    List<College> colleges;
    ImageView iv_logo;
    TextView tv_Name, tv_Year;

    public CustomAdapter (Context c, List<College> listVersions) {
        this.c = c;
        this.colleges = listVersions;
    }

    @Override
    public int getCount() {
        return colleges.size();
    }

    @Override
    public Object getItem(int position) {
        return colleges.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(c, R.layout.row_layout, null);
        iv_logo = (ImageView) view.findViewById(R.id.Logo);
        tv_Name = (TextView) view.findViewById(R.id.tvCollege);
        tv_Year = (TextView) view.findViewById(R.id.tvYear);
        iv_logo.setImageResource(colleges.get(position).getLogo());
        tv_Name.setText(colleges.get(position).getName());
        tv_Year.setText(colleges.get(position).getYear());
        return null;
    }
}
