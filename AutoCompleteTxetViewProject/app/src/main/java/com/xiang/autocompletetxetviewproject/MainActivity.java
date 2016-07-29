package com.xiang.autocompletetxetviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView actv;
    MultiAutoCompleteTextView mauto;
    //定义字数组作为提示的文本
    String []books=new String[]{"美工","语文","数学","外语"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv= (AutoCompleteTextView) findViewById(R.id.auto);
        mauto= (MultiAutoCompleteTextView) findViewById(R.id.mauto);
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,books);
        actv.setAdapter(arrayAdapter);
        mauto.setAdapter(arrayAdapter);
        //设置分割符
        mauto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
