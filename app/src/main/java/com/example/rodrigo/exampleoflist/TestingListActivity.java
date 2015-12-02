package com.example.rodrigo.exampleoflist;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class TestingListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Creamos el contenedor de datos
        final String[] Names = new String[]{"Rodrigo", "Isaac", "Jaime", "Luis", "Adrian", "Alfredo", "Manuel"};
        //Setamos el adapter
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Names));
        //Habilitamos el evento en la lista y mostramos el row seleccionado
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TestingListActivity.this, "Hello from the ListActivity " + Names[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
