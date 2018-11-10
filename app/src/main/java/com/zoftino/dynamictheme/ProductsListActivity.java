package com.zoftino.dynamictheme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProductsListActivity extends AppCompatActivity {
    private ListView products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products_list);

        products = findViewById(R.id.products);

        products.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, ProductsData.prepareProductsList()));

        products.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ProductsListActivity.this,
                        ProductDetailsActivity.class);
                intent.putExtra("prdIndex", position);
                startActivity(intent);
            }
        });
    }
}
