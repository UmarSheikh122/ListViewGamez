package com.example.listviewgamez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class listView extends AppCompatActivity {

    TextView a,b,c,d;
    ImageView picture;

   // public android.widget.ListView list;
        int image[]={
                R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f
        };
        String name[]={"A ","B","C","D","E","F"};
        String description[]={"name","Class","hell","Jpg","wotiz","larkay"};

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
            android.widget.ListView list;  list=(android.widget.ListView)findViewById(R.id.listView1);
            customClass adapter=new customClass();
            list.setAdapter(adapter);
        //a=findViewById(R.id.text1);

    }
    public class customClass extends BaseAdapter
    {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView= getLayoutInflater().inflate(R.layout.listview,null);
            a=convertView.findViewById(R.id.text1);
            b=convertView.findViewById(R.id.text2);
            c=convertView.findViewById(R.id.text3);
            //a=convertView.findViewById(R.id.text4);
            picture=convertView.findViewById(R.id.image);
            a.setText("Name : "+name[position]);
            b.setText("Description: "+description[position]);
            picture.setImageResource(image[position]);
            return convertView;
        }
    }
}
