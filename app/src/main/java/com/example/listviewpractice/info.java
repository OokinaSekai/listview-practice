package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ImageView image=(ImageView) findViewById(R.id.idpic);
        TextView text=(TextView) findViewById(R.id.infos);

        Bundle b=getIntent().getExtras();
        //获取Bundle的信息
        String id=b.getString("text");
        int images=b.getInt("pic");

        image.setImageResource(images);
        text.setText(id+"balblablabalblablablablablabla");

    }
}
