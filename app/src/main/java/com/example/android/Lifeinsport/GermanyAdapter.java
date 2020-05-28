package com.example.android.Lifeinsport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android.myndapplication.R;

import java.util.List;

public class GermanyAdapter extends ArrayAdapter<GermanClass> {
    private LayoutInflater inflater;
    private List<GermanClass> germanItem;



    public GermanyAdapter(@NonNull Context context, int resource, List<GermanClass> listItem, LayoutInflater inflater) {
        super(context, resource, listItem);
        this.inflater = inflater;
        this.germanItem = listItem;




    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        GermanyAdapter.ViewHolder viewHolder;
        GermanClass germanyItClass = germanItem.get(position);
        if(convertView == null){
            convertView = inflater.inflate(R.layout.fragment_table, null, false);
            viewHolder = new GermanyAdapter.ViewHolder();
            viewHolder.data1 = convertView.findViewById(R.id.tvData1);
            viewHolder.data2 = convertView.findViewById(R.id.tvData2);
            viewHolder.data3 = convertView.findViewById(R.id.tvData3);
            viewHolder.data4 = convertView.findViewById(R.id.tvData4);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (GermanyAdapter.ViewHolder) convertView.getTag();
        }
        viewHolder.data1.setText(germanyItClass.getData_1());
        viewHolder.data2.setText(germanyItClass.getData_2());
        viewHolder.data3.setText(germanyItClass.getData_3());
        viewHolder.data4.setText(germanyItClass.getData_4());
        return convertView;
    }
    private class ViewHolder{
        TextView data1;
        TextView data2;
        TextView data3;
        TextView data4;


    }
}


