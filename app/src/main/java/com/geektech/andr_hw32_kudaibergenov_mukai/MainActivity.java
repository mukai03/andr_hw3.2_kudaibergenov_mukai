package com.geektech.andr_hw32_kudaibergenov_mukai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> address = new ArrayList<>();
        address.add("Эне-Сай 0/1");
        address.add("Эне-Сай 0/2");
        address.add("Эне-Сай 0/3");
        address.add("Эне-Сай 0/4");
        address.add("Эне-Сай 0/5");
        address.add("Эне-Сай 0/6");
        address.add("Эне-Сай 0/7");
        address.add("Эне-Сай 0/8");
        address.add("Эне-Сай 0/9");
        address.add("Эне-Сай 1/10");
        address.add("Эне-Сай 1/11");
        address.add("Эне-Сай 1/12");
        address.add("Эне-Сай 1/13");
        address.add("Эне-Сай 1/14");
        address.add("Эне-Сай 1/15");
        address.add("Эне-Сай 1/16");
        address.add("Эне-Сай 1/17");
        address.add("Эне-Сай 1/18");
        address.add("Эне-Сай 1/19");
        address.add("Эне-Сай 2/20");
        address.add("Эне-Сай 2/21");
        address.add("Эне-Сай 2/22");

        AddressAdapter adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);
    }
}