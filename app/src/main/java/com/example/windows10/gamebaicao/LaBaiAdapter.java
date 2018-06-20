package com.example.windows10.gamebaicao;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LaBaiAdapter extends BaseAdapter {

    ArrayList<LaBai> list;
    Context context;

    public LaBaiAdapter(ArrayList<LaBai> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ListLaBai listLaBai = null;
        if (convertView == null){
            listLaBai = new ListLaBai();
            convertView = ((Activity)context).getLayoutInflater().inflate(R.layout.item_la_bai, parent,false);

            listLaBai.imgHinh = (ImageView) convertView.findViewById(R.id.imgHinh);
            listLaBai.tvSoNut = (TextView) convertView.findViewById(R.id.tvSoNut);
            listLaBai.tvTen = (TextView) convertView.findViewById(R.id.tvTen);

            convertView.setTag(listLaBai);
        } else {
           listLaBai = (ListLaBai) convertView.getTag();
        }

        listLaBai.imgHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder tb = new AlertDialog.Builder(context);
                tb.setTitle("Thông tin");
                tb.setMessage(list.get(position).getTen());
                tb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                tb.show();
            }
        });

        listLaBai.imgHinh.setImageResource(list.get(position).getHinh());
        listLaBai.tvSoNut.setText(list.get(position).getSoNut()+"");
        listLaBai.tvTen.setText(list.get(position).getTen());

        return convertView;
    }

    class ListLaBai{
        TextView tvTen, tvSoNut;
        ImageView imgHinh;
    }
}
