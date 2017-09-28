package com.nhuquynh.dulichmiennam;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 09/14/2017.
 */

public class diadanhAdapter extends ArrayAdapter {
    Activity context;
    int resource;
    List<diadanh> object;
    public diadanhAdapter ( Activity context, int resource, List<diadanh> object)
    {
        super(context,resource,object);
        this.context = context;
        this.resource = resource;
        this.object = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource,null);
        // khai bao cac view
        TextView txtten = (TextView) row.findViewById(R.id.txt_tentinh);
        TextView txtnhanxet = (TextView) row.findViewById(R.id.txtnhanxet);
        ImageView imghinh = (ImageView) row.findViewById(R.id.imghinh);

        //
        final diadanh Diadanh = this.object.get(position);
        txtten.setText(Diadanh.getTendiadanh());
        txtnhanxet.setText(Diadanh.getNhanxet());
        txtten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,chitietdiadanh.class);
                context.startActivity(intent);
            }
        });


        return row;
    }
}
