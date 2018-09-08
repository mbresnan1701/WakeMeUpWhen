package com.reddogsoftware.mbresnan.wakemeupwhen.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.reddogsoftware.mbresnan.wakemeupwhen.Models.ListItem;
import com.reddogsoftware.mbresnan.wakemeupwhen.R;

import java.util.List;

public class RegisteredNumberAdapter extends RecyclerView.Adapter<RegisteredNumberAdapter.ViewHolder> {
    private Context context;
    private List<ListItem> listItems;

    public RegisteredNumberAdapter(Context context, List listitem) {
        this.context = context;
        this.listItems = listitem;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RegisteredNumberAdapter.ViewHolder holder, int position) {
        ListItem item = listItems.get(position);
        holder.number.setText(item.getNumber());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView number;

        public ViewHolder(View itemView) {
            super(itemView);

            number = itemView.findViewById(R.id.number_label);
            itemView.setOnClickListener(this.onClick);

        }

        private View.OnClickListener onClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(context, ItemActivity.class);
//
//                intent.putExtra("title", listItems.get(getAdapterPosition()).getmTitle());
//                context.startActivity(intent);

            }
        };

    }
}
