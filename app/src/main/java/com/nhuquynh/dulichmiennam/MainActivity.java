package com.nhuquynh.dulichmiennam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvdiadanh;
    ArrayList<diadanh> arrdiadanh;
    diadanhAdapter adapdiadanh;
    TabHost tabhost;
    Button btnchuyen;
    TextView txtten,txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvent();
    }

    private void addEvent() {
        btnchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,chitietdiadanh.class);
                startActivity(intent);
            }
        });
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
       /* txtten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,chitietdiadanh.class);
                startActivity(intent);
            }
        });*/

    }

    private void addControls() {
        // khai bao listview dia danh
        lvdiadanh = (ListView) findViewById(R.id.lvdiadanh);
        arrdiadanh = new ArrayList<>();
        arrdiadanh.add(new diadanh("An Giang","địa điểm đẹp, sông nước" ));
        arrdiadanh.add(new diadanh("Vũng Tàu","biển đẹp, là nơi tham quan du lịch đông khách" ));
        arrdiadanh.add(new diadanh("Nha Trang","thành phố du lịch" ));
        arrdiadanh.add(new diadanh("Đà Lạt","khí hậu mát mẻ, nhiều hoa và mứt" ));
        arrdiadanh.add(new diadanh("Tp.HCM","thành phố sầm uất" ));
        adapdiadanh = new diadanhAdapter(this, R.layout.item_diadanh,arrdiadanh);
        lvdiadanh.setAdapter(adapdiadanh);

        // tabhost
        tabhost = (TabHost) findViewById(R.id.tabhost);
        //cài đặt cho tabhost
        tabhost.setup();
        //tạo tab button và đạt id
        TabHost.TabSpec tab1 = tabhost.newTabSpec("t1");
        //tạo nhãn
        tab1.setIndicator("Nổi bật");
        tab1.setContent(R.id.tabnoibat);
        tabhost.addTab(tab1);

        TabHost.TabSpec tab2 = tabhost.newTabSpec("t2");
        tab2.setIndicator("Địa Danh");
        tab2.setContent(R.id.tabdiadanh);
        tabhost.addTab(tab2);
        tabhost.setCurrentTab(0);

        // button chuyen
        btnchuyen = (Button) findViewById(R.id.btnvd);
         txtten = (TextView) findViewById(R.id.txt_tentinh);
        txt4 = (TextView) findViewById(R.id.txt4);
    }

}
