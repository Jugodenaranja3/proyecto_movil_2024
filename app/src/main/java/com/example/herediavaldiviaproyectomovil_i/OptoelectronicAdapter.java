package com.example.herediavaldiviaproyectomovil_i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

// 1.
// 2. implement interface
// 3. create class ViewHolder
// 4. MAKE VIEWHOLDER EXTENDS
public class OptoelectronicAdapter extends RecyclerView.Adapter<OptoelectronicAdapter.ViewHolder> {
    // 5. ADD ATTRIBUTES OF ADAPTER:
    ArrayList<ProductType> listProductType;
    WeakReference<Context> weakReference;


    // 6. ADD CONSTRUCTORS
    public OptoelectronicAdapter () {}
    public OptoelectronicAdapter (ArrayList<ProductType> listProduct, Context context) {
        this.listProductType = listProduct;
        this.weakReference = new WeakReference<Context>(context);
    }


    // 7. CUSTOMIZE METHODS.
    @NonNull
    @Override
    public OptoelectronicAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.component_type_item, null);
        Context context = weakReference.get();
        return new ViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull OptoelectronicAdapter.ViewHolder holder, int position) {
        // UPDATE DATA ITEM RECYLERVIEW
        holder.UpdateData(listProductType.get(position));
    }

    @Override
    public int getItemCount() {
        // RETURN QUANTITY ITEMS
        return listProductType.size();
    }


    // CLASS VIEWHOLDER
    public class ViewHolder extends RecyclerView.ViewHolder {
        // ATTRIBUTE VIEWHOLDER
        TextView tvTitle;
        LinearLayout layout;




        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public ViewHolder(View view, Context context) {
            super(view);
            tvTitle = view.findViewById(R.id.tvTitleComponentTypeItem);
        }

        public void UpdateData(ProductType productType) {
            String title = productType.getTitle();
            tvTitle.setText(""+title);
        }
    }

}
