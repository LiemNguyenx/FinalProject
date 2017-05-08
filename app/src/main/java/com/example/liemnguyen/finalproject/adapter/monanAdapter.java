package com.example.liemnguyen.finalproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liemnguyen.finalproject.R;
import com.example.liemnguyen.finalproject.model.monan;

import java.util.List;

/**
 * Created by Liêm Nguyễn on 5/8/2017.
 */

public class monanAdapter extends ArrayAdapter<monan> {
    private Context ct;
    private int resource;
    private List<monan> list;
    public monanAdapter(Context context, int resource, List<monan> objects) {
        super(context, resource, objects);
        this.ct=context;
        this.resource = resource;
        this.list = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(ct).inflate(R.layout.item_monan,parent,false);
            viewHolder.imgAvatar = (ImageView) convertView.findViewById(R.id.img_avatar);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.price = (TextView) convertView.findViewById(R.id.price);
            viewHolder.check = (CheckBox) convertView.findViewById(R.id.check);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();

        }
        monan m = list.get(position);
        viewHolder.name.setText(m.getName().toString());
        viewHolder.price.setText(String.valueOf(m.getPrice()));
        if(m.getName().equalsIgnoreCase("den")){
            viewHolder.imgAvatar.setImageResource(R.drawable.den);
        }else if(m.getName().equalsIgnoreCase("da")){
            viewHolder.imgAvatar.setImageResource(R.drawable.da);
        }else if (m.getName().equalsIgnoreCase("sua")){
            viewHolder.imgAvatar.setImageResource(R.drawable.sua);
        }
        if (m.isCheck()){
            viewHolder.check.setChecked(true);
        }else{
            viewHolder.check.setChecked(false);
        }
        return convertView;
    }
    public class ViewHolder{
        ImageView imgAvatar;
        TextView name;
        TextView price;
        CheckBox check;
    }
}
