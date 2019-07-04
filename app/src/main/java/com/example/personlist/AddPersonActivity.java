package com.example.personlist;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

public class AddPersonActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    ListView lv;
    ImageView personImage;
    Uri imageUri;
    EditText name;
    Spinner age;
    String selectedAge;
    Button btnsave, btncancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);

        personImage = (ImageView) findViewById(R.id.personimage);
        name = (EditText) findViewById(R.id.editTextName);
        age = (Spinner) findViewById(R.id.spinnerAge);
        btnsave = (Button) findViewById(R.id.btnsave);
        btncancel = (Button) findViewById(R.id.btncancel);
        lv = (ListView) findViewById(R.id.listview_persons);

        age.setOnItemSelectedListener(this);
        btnsave.setOnClickListener(this);
        btncancel.setOnClickListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {

    }
}
