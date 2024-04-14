package com.example.pr52;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);
        Intent i = getIntent();

        RecyclerView recyclerView = findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List <String> items = Arrays.asList("Здесь что-то написано", "Здесь что-то написано\n" +
                "Здесь что-то написано\n" +
                "Здесь что-то написано!\n" +
                "Здесь что-то написано!\n" +
                "Здесь что-то написано,\n" +
                "Здесь что-то написано,\n" +
                "Здесь что-то написано\n" +
                "Здесь что-то написано!", "Здесь что-то написано");
        List <Integer> items2 = Arrays.asList(R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground);
        //Создаем адаптер
        SimpleAdapter adapter = new SimpleAdapter(items,items2);
        //Устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);

    }
}