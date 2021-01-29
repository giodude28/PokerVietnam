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
import io.gio.vietnampoker.Adapter.TipsAdapter;
import io.gio.vietnampoker.Data.CardData;
import io.gio.vietnampoker.Data.TipsData;
import io.gio.vietnampoker.Model.CardViewModel;
import io.gio.vietnampoker.Model.TipsViewModel;
import io.gio.vietnampoker.R;

public class Tips extends Fragment {
View root;
TipsAdapter tipsAdapter;
TipsViewModel tipsViewModel;
RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_tips,container,false);
initialize();
        return root;
    }

    private void initialize(){
        List<TipsViewModel> awit = new ArrayList<>();
        for(int i = 0; i < TipsData.tipname.length; i ++ ){
            awit.add(new TipsViewModel(TipsData.tipname[i],TipsData.tipdesc[i]));
        }

        recyclerView =root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        tipsAdapter = new TipsAdapter(getContext(),awit);
        recyclerView.setAdapter(tipsAdapter);

    }
}