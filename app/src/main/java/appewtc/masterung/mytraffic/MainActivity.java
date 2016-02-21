package appewtc.masterung.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

        //ListView Controler
        listViewController();


    }   // Main Method

    private void listViewController() {

        //Create ListView
        //Type1
        int[] iconInts = {R.drawable.traffic_01, R.drawable.traffic_02,

                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
                R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
                R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17,
                R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20,};
        //Type2
        String[] titleString = new String[20];
        titleString[0] = "หัวข้อหลักที่ 1";
        titleString[1] = "หัวข้อหลักที่ 2";
        titleString[2] = "หัวข้อหลักที่ 3";
        titleString[3] = "หัวข้อหลักที่ 4";
        titleString[4] = "หัวข้อหลักที่ 5";
        titleString[5] = "หัวข้อหลักที่ 6";
        titleString[6] = "หัวข้อหลักที่ 7";
        titleString[7] = "หัวข้อหลักที่ 8";
        titleString[8] = "หัวข้อหลักที่ 9";
        titleString[9] = "หัวข้อหลักที่ 10";
        titleString[10] = "หัวข้อหลักที่ 11";
        titleString[11] = "หัวข้อหลักที่ 12";
        titleString[12] = "หัวข้อหลักที่ 13";
        titleString[13] = "หัวข้อหลักที่ 14";
        titleString[14] = "หัวข้อหลักที่ 15";
        titleString[15] = "หัวข้อหลักที่ 16";
        titleString[16] = "หัวข้อหลักที่ 17";
        titleString[17] = "หัวข้อหลักที่ 18";
        titleString[18] = "หัวข้อหลักที่ 19";
        titleString[19] = "หัวข้อหลักที่ 20";

//type3
        String[] detailShortString = getResources().getStringArray(R.array.detail_short);

        //Send Value to Adepter
        MyAdapter myAdapter = new MyAdapter(MainActivity.this,iconInts,titleString,detailShortString);
        trafficListView.setAdapter(myAdapter);

        //ListView Active When Click
        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

           Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                startActivity(intent);

            }  //even
        });


    }  // listViewController

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.cow);
                mediaPlayer.start();

                //Web View
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/AFmWqLIqDZA"));
                startActivity(intent);

            }   // event
        });

    }   // buttonController

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }   // bindWidget

}   // Main Class นี่คือคลาสหลัก
