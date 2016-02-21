package appewtc.masterung.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView trafficImageView;
    private Button preButton, backButton, nextButton;
    private int[] iconInts;
    private String[] titleString, detailLongStrings;
    private int myIndexAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //Bind Widget
        bindWidget();

        //Show View

        ShowView();

        //Button controller
        backButton();
    }//main Method
    private void buttonControler
    {
        preButton.setOnClickListener(this);
        backButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
    }


        //main Method
    }//ShowView

    private void ShowView() {
        //Receive Value From Intent
        titleString = getIntent().getStringArrayExtra("Title");
        iconInts = getIntent().getIntArrayExtra("Image");
        myIndexAnInt = getIntent().getIntExtra("Index",0);

        detailLongStrings = getResources().getStringArray(R.array.detail_long);

        changeView(myIndexAnInt);


    } //changeView

    private void changeView(int myIndexAnInt){

        titleTextView.setText(titleString[myIndexAnInt]);
        trafficImageView.setImageResource(iconInts[myIndexAnInt]);
        detailTextView.setText(detailLongStrings[myIndexAnInt]);
        //changeView

    }





    private void bindWidget(){

        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView =(TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);
        preButton = (Button ) findViewById(R.id.button2);
        backButton = (Button) findViewById(R.id.button3);
        nextButton = (Button) findViewById(R.id.button4);

    }// main bindWidget

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.button2:

                myIndexAnInt-= 1;
                if (myIndexAnInt < 0) {
                    myIndexAnInt = 19;
                }
                changeView(myIndexAnInt);

                break;
            case R.id.button3:
                finish();
                break;
            case R.id.button4:
                myIndexAnInt+= 1;
                if (myIndexAnInt >=20) {
                    myIndexAnInt = 0;
                }
                changeView(myIndexAnInt);
                break;
        }  //switch
        }


} //Main class
