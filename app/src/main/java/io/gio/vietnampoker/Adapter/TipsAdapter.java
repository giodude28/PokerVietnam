package io.gio.vietnampoker.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import io.gio.vietnampoker.Model.TipsViewModel;
import io.gio.vietnampoker.R;

public class TipsAdapter extends RecyclerView.Adapter<TipsAdapter.ViewHolder> {
    Context context;
    List<TipsViewModel> data;
    TextView title1,desc1;
    public TipsAdapter(Context context, List<TipsViewModel> data) {
    this.context = context;
    this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.tipsitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
 holder.title.setText(data.get(position).getTitle());
 holder.desc.setText(data.get(position).getDesc());
        final Dialog myDialog;
        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.tipsdetail);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        title1 = myDialog.findViewById(R.id.tipsname);
        desc1 = myDialog.findViewById(R.id.tipsdesc);
        for (int i = 0; i<data.size(); i++) {
            if(holder.title.getText()==data.get(position).getTitle()){
                title1.setText(data.get(position).getTitle());
                desc1.setText(data.get(position).getDesc());
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
        TextView title,desc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tiptitle);
            desc = itemView.findViewById(R.id.tipdesc);
        }
    }
}
