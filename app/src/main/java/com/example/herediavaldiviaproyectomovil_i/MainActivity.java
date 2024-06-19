package com.example.herediavaldiviaproyectomovil_i;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // CARD PRODUCTS
    private View cardProductPassiveComponents;
    private View cardProductSemiconductors;
    private View cardProductOptoelectronicDevices;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/

        cardProductPassiveComponents = findViewById(R.id.cardPassiveComponents);
        cardProductSemiconductors = findViewById(R.id.cardSemiconductors);
        cardProductOptoelectronicDevices = findViewById(R.id.cardOptoelectronicDevices);

        cardProductPassiveComponents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_product_passivecomponents.class);
                startActivity(intent);
            }
        });
        cardProductSemiconductors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_product_microcontrollers.class);
                startActivity(intent);
            }
        });
        cardProductOptoelectronicDevices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_product_optoelectronics.class);
                startActivity(intent);
            }
        });
    }
}

// No speakable text present
// Click the badge for detail