package com.example.listdemo;

import android.R.id;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
ListView  l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		l=(ListView)findViewById(R.id.l2);
		String[]name={"pratibha patil","Rajendra prasad"," pranab mukhargee","K.narayanan"};
		ArrayAdapter<String>ad= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,name);
		l.setAdapter(ad);
		l.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> ad, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				String s=ad.getItemAtPosition(position).toString();
				if(s=="Rajendra prasad")
				{
					Toast.makeText(MainActivity.this,"true",3000).show();
					l.setSelector(android.R.color.holo_green_dark);
					l.setEnabled(true);
				}
				else
				{
					Toast.makeText(MainActivity.this,"False", 3000).show();
					l.setSelector(android.R.color.holo_red_dark);
					l.setEnabled(false);
				}
			}
		});
				
	}
	}

