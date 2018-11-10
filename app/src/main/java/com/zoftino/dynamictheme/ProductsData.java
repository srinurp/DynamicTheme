package com.zoftino.dynamictheme;

import java.util.ArrayList;
import java.util.List;

public class ProductsData {
    public static List<String> prepareProductsList() {
        List<String> prds = new ArrayList<String>();
        prds.add("Black red check shirt for $30");
        prds.add("Polo blue checks shirt for $50");
        prds.add("Blue green shirt and shot for $40");
        prds.add("Blue white shirt and shot for $60");
        prds.add("Green print shirt for $20");
        prds.add("Yellow blue boss for $44");
        return prds;
    }

    public static List<Integer> preparePrdImageList() {
        List<Integer> prdImgs = new ArrayList<Integer>();
        prdImgs.add(R.drawable.black_red);
        prdImgs.add(R.drawable.blue_checks);
        prdImgs.add(R.drawable.blue_green);
        prdImgs.add(R.drawable.blue_white);
        prdImgs.add(R.drawable.green_print);
        prdImgs.add(R.drawable.yellow_blue);

        return prdImgs;
    }
}
