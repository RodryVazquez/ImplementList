package com.example.rodrigo.exampleoflist;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends ActionBarActivity {

    ListView listViewNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Setamos la vista y la referencia del listView del XML
        setContentView(R.layout.activity_main);
        listViewNames = (ListView)findViewById(R.id.listViewNames);

        //Contenedor de datos y adapter, setamos el adapter al listView
        final String[] Names = new String[]{"Rodrigo", "Isaac", "Jaime", "Luis", "Adrian", "Alfredo", "Manuel"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Names);
        listViewNames.setAdapter(stringArrayAdapter);

        //Implementamos el evento en la lista
        listViewNames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Hello from the ListView " + Names[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
