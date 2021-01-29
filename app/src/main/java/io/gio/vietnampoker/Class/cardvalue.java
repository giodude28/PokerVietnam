package io.gio.vietnampoker.Class;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.gio.vietnampoker.Adapter.CardAdapter;
import io.gio.vietnampoker.Adapter.CategoryAdapter;
import io.gio.vietnampoker.Data.CardData;
import io.gio.vietnampoker.Data.CategoryData;
import io.gio.vietnampoker.Model.CardViewModel;
import io.gio.vietnampoker.Model.CategoryViewModel;
import io.gio.vietnampoker.R;

public class cardvalue extends Fragment {
CardAdapter cardAdapter;
CardViewModel cardViewModel;
RecyclerView recyclerView;
View root;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_cardvalue,container,false);
        initialize();
        return root;
    }

    private void initialize(){
        List<CardViewModel> awit = new ArrayList<>();
        for(int i = 0; i < CardData.title.length; i ++ ){
            awit.add(new CardViewModel(CardData.title[i],CardData.desc[i],CardData.condition[i],CardData.image[i]));
        }

        recyclerView =root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        cardAdapter = new CardAdapter(getContext(),awit);
        recyclerView.setAdapter(cardAdapter);

    }
}