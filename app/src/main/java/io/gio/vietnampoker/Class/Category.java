package io.gio.vietnampoker.Class;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import io.gio.vietnampoker.Adapter.CategoryAdapter;
import io.gio.vietnampoker.Data.CategoryData;
import io.gio.vietnampoker.MainActivity;
import io.gio.vietnampoker.Model.CategoryViewModel;
import io.gio.vietnampoker.R;

public class Category extends AppCompatActivity {
CategoryViewModel categoryViewModel;
CategoryAdapter categoryAdapter;
public static RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    initialize();
    }
    private void initialize(){
        List<CategoryViewModel> awit = new ArrayList<>();
        for(int i = 0; i < CategoryData.title.length; i ++ ){
            awit.add(new CategoryViewModel(CategoryData.title[i],CategoryData.desc[i]));
        }

        recyclerView =findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(Category.this));
        categoryAdapter = new CategoryAdapter(Category.this,awit);
        recyclerView.setAdapter(categoryAdapter);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent aw = new Intent(Category.this, MainActivity.class);
        startActivity(aw);
    }
}