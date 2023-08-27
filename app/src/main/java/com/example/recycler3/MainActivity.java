package com.example.recycler3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import ContactAdapter.ContactAdapter;
import contactModel.ContactModel;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    ArrayList<ContactModel> userList;
    ContactAdapter adapters;
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecycler();
    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ContactModel((R.drawable.alia),getString(R.string.alia),getString(R.string.alia_num)));
        userList.add(new ContactModel((R.drawable.deepika),getString(R.string.deepika),getString(R.string.deepika_num)));
        userList.add(new ContactModel((R.drawable.asmita),getString(R.string.asmita),getString(R.string.asmita_num)));
        userList.add(new ContactModel((R.drawable.harika),getString(R.string.harika),getString(R.string.harika_num)));
        userList.add(new ContactModel((R.drawable.kajal),getString(R.string.kajal),getString(R.string.kajal_num)));
        userList.add(new ContactModel((R.drawable.puja),getString(R.string.puja),getString(R.string.puja_num)));
        userList.add(new ContactModel((R.drawable.samantha),getString(R.string.samntha),getString(R.string.samntha_num)));
        userList.add(new ContactModel((R.drawable.yami),getString(R.string.yami),getString(R.string.yami_num)));
    }

    private void initRecycler() {
        recycler=findViewById(R.id.contactRecycler);
        adapters = new ContactAdapter(userList);
        recycler.setAdapter(adapters);
        linearLayoutManager= new LinearLayoutManager(this);
        recycler.setLayoutManager(linearLayoutManager);



    }
}