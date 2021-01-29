package io.gio.vietnampoker.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import io.gio.vietnampoker.Class.cardvalue;
import io.gio.vietnampoker.Model.CardViewModel;
import io.gio.vietnampoker.R;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    Context context;
    List<CardViewModel> data;
TextView title1,desc1,condi;
ImageView image;
    public CardAdapter(Context context, List<CardViewModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.carditem, parent, false);
       ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.title.setText(data.get(position).getName());
    holder.img.setImageResource(data.get(position).getImage());

        final Dialog myDialog;
        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.carddetail);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        title1 = myDialog.findViewById(R.id.cardname);
        desc1 = myDialog.findViewById(R.id.carddesc);
        condi = myDialog.findViewById(R.id.cardcondi);
        image = myDialog.findViewById(R.id.cardimg);
        for (int i = 0; i<data.size(); i++) {
            if(holder.title.getText()==data.get(position).getName()){
                title1.setText(data.get(position).getName());
                desc1.setText(data.get(position).getDesc());
                condi.setText(data.get(position).getCondition());
                Picasso.get().load(data.get(position).getImage()).into(image);
            }
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.cardtitle);
            img = itemView.findViewById(R.id.imahe);
        }
    }
}
