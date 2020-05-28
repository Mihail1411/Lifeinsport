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

public class TableArrayAdapter extends ArrayAdapter<TableClass> {
    private LayoutInflater inflater;
    private List<TableClass> tableItem;



    public TableArrayAdapter(@NonNull Context context, int resource, List<TableClass> listItem, LayoutInflater inflater) {
        super(context, resource, listItem);
        this.inflater = inflater;
        this.tableItem = listItem;
            



    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        TableClass tableItClass = tableItem.get(position);
        if(convertView == null){
            convertView = inflater.inflate(R.layout.fragment_table, null, false);
            viewHolder = new ViewHolder();
            viewHolder.data1 = convertView.findViewById(R.id.tvData1);
            viewHolder.data2 = convertView.findViewById(R.id.tvData2);
            viewHolder.data3 = convertView.findViewById(R.id.tvData3);
            viewHolder.data4 = convertView.findViewById(R.id.tvData4);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.data1.setText(tableItClass.getData_1());
        viewHolder.data2.setText(tableItClass.getData_2());
        viewHolder.data3.setText(tableItClass.getData_3());
        viewHolder.data4.setText(tableItClass.getData_4());
        return convertView;
    }
    private class ViewHolder{
        TextView data1;
        TextView data2;
        TextView data3;
        TextView data4;


    }
}

