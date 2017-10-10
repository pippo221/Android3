package com.example.cuongducnguyenkp.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by cuongducnguyen.kp on 10/10/2017.
 */

public class second_main2 extends Activity {
    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private EditText editTextInputSearch;
    private ArrayList<HashMap<String, String>> arrayListProductList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String products[] = {"Dell", "HTC", "Apple", "Samsung",
                "Nokia", "Google", "Mobiistar"};
        listView = (ListView) findViewById(R.id.list_view);
        editTextInputSearch = (EditText) findViewById(R.id.inputSearch);
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, products);
        listView.setAdapter(arrayAdapter);
        editTextInputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                second_main2.this.arrayAdapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
    }

}
