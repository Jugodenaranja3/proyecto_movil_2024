package com.example.herediavaldiviaproyectomovil_i;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class activity_product_passivecomponents extends AppCompatActivity {

    private RecyclerView rvPassiveComponents;

    private TextView tvTitleComponentTypeItem;



    // ARREGLO PARA DATOS
    ArrayList<ProductType> listProductType;

    // ADAPTADOR
    ComponentAdapter componentAdapter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_passivecomponents);
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/

        rvPassiveComponents = findViewById(R.id.rvPassiveComponents);
        tvTitleComponentTypeItem = findViewById(R.id.tvTitleComponentTypeItem);




        listProductType = new ArrayList<ProductType>();
        LoadProductTypes();
        // ADAPTER
        rvPassiveComponents.setLayoutManager(new GridLayoutManager(this, 1));
        UpdateRecyclerView();
    }

    private void UpdateRecyclerView() {
        componentAdapter = new ComponentAdapter(listProductType, this);
        rvPassiveComponents.setAdapter(componentAdapter);
    }

    private void LoadProductTypes() {
        //ProductType productType = new ProductType("Capacitores");
        listProductType.add(new ProductType("Capacitores"));
        listProductType.add(new ProductType("Inductores"));
        listProductType.add(new ProductType("Resistores"));
        listProductType.add(new ProductType("Varistores"));
    }
}