package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String []ids={"20161707",
            "20161713",
            "20171591",
            "20171592",
            "20171616",
            "20171627",
            "20171641",
            "20171649",
            "20171650",
            "20171653",
            "20171654",
            "20171655",
            "20171656",
            "20171659",
            "20171664",
            "20171666",
            "20171667",
            "20171668",
            "20171669",
            "20171670",
            "20171679",
            "20171688",
            "20171697",
            "20171705",
            "20171707",
            "20171714",
            "20171717",
            "20171731",
            "20171742",
            "20175064",
            "20175980",
            "20175990"};

    private int[]images=new int[]{R.drawable.avatar1,
            R.drawable.avatar2,
            R.drawable.avatar3,
            R.drawable.avatar4,
            R.drawable.avatar5,
            R.drawable.avatar6,
            R.drawable.avatar7,
            R.drawable.avatar8,
            R.drawable.avatar9,
            R.drawable.avatar10,
            R.drawable.avatar11,
            R.drawable.avatar12,
            R.drawable.avatar13,
            R.drawable.avatar14,
            R.drawable.avatar15,
            R.drawable.avatar16,
            R.drawable.avatar17,
            R.drawable.avatar18,
            R.drawable.avatar19,
            R.drawable.avatar20,
            R.drawable.avatar21,
            R.drawable.avatar22,
            R.drawable.avatar23,
            R.drawable.avatar24,
            R.drawable.avatar25,
            R.drawable.avatar26,
            R.drawable.avatar27,
            R.drawable.avatar28,
            R.drawable.avatar29,
            R.drawable.avatar30,
            R.drawable.avatar31,
            R.drawable.avatar32
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview=(ListView) findViewById(R.id.listview);
        MyAdapter myAdapter=new MyAdapter();
        listview.setAdapter(myAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Bundle bundle = new Bundle();

                bundle.putString("text", ids[position]);
                bundle.putInt("pic", images[position]);

                Intent intent = new Intent(MainActivity.this,info.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }

    private class MyAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return ids.length;
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

            View view=getLayoutInflater().inflate(R.layout.list_layout,null);
            ImageView image=(ImageView) view.findViewById(R.id.imageview);
            TextView text=(TextView) view.findViewById(R.id.textview);

            image.setImageResource(images[position]);
            text.setText(ids[position]);
            return view;
        }
    }
}
