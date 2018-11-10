package com.zoftino.dynamictheme;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetailsActivity extends AppCompatActivity {

    private Button add;
    private Button buy;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details);

        int index = (Integer) getIntent().getExtras().get("prdIndex");

        tv = findViewById(R.id.prodTitle);
        tv.setText(ProductsData.prepareProductsList().get(index));

        ImageView iv = findViewById(R.id.productImage);
        iv.setImageResource(ProductsData.preparePrdImageList().get(index));

        add = findViewById(R.id.add);
        buy = findViewById(R.id.buy);

        setColors(index);
    }

    public void setColors(int index){

        Palette p = Palette.from(getBitMap(index)).generate();

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(p.getLightMutedColor(
                getResources().getColor(R.color.colorPrimaryDark, null))));

        this.getWindow().setStatusBarColor(p.getDominantColor(
                getResources().getColor(R.color.colorAccent, null)));

        buy.setBackgroundColor(p.getLightVibrantColor(
                getResources().getColor(R.color.colorAccent, null)));

        add.setBackgroundColor(p.getDarkMutedColor(
                getResources().getColor(R.color.colorAccent, null)));
    }

    public Bitmap getBitMap(int index){
        Drawable myDrawable = getResources().getDrawable(ProductsData.preparePrdImageList()
                .get(index), null);
        return ((BitmapDrawable) myDrawable).getBitmap();
    }
}
