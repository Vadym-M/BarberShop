package com.example.barbershop.ui.home.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barbershop.R;
import com.example.barbershop.Service;

import java.util.ArrayList;

public class AdapterServices extends RecyclerView.Adapter<AdapterServices.ViewHolder> {
    private ArrayList<Service> services;
    private LayoutInflater inflater;
    private Context context;

    public AdapterServices(Context context, ArrayList<Service> services) {
        this.context = context;
        this.services = services;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.template_service, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.description.setText(services.get(position).getDescription());
    holder.title.setText(services.get(position).getTitle());
    holder.price.setText(services.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return services.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, description, price;
        private Button btn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleService);
            description = itemView.findViewById(R.id.descriptionService);
            price = itemView.findViewById(R.id.priceService);
            btn = itemView.findViewById(R.id.btnService);
        }
    }
}
