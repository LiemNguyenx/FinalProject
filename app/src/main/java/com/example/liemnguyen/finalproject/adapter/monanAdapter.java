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

        if(convertView == null){
            LayoutInflater inflater= LayoutInflater.from(getContext());
            convertView = LayoutInflater.from(ct).inflate(R.layout.item_monan,parent,false);
        }
        TextView tvName= (TextView) convertView.findViewById(R.id.name);
        TextView tvPrice = (TextView) convertView.findViewById(R.id.price);
        ImageView imgAvatar = (ImageView) convertView.findViewById(R.id.img_avatar);
        CheckBox cbCheck = (CheckBox) convertView.findViewById(R.id.check);

        monan m = getItem(position);
        if(m!=null){
            tvName.setText(m.getName().toString());
            tvPrice.setText(String.valueOf(m.getPrice()));
            cbCheck.setChecked(m.isCheck());
            if(m.getName().equals("da")){
                imgAvatar.setImageResource(R.drawable.da);
            }else if(m.getName().equals("den")){
                imgAvatar.setImageResource(R.drawable.den);
            }else if(m.getName().equals("sua")){
                imgAvatar.setImageResource(R.drawable.sua);
            }
        }

        return convertView;
    }

}
