package appewtc.masterung.mytraffic;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by wanwisa on 2/21/16 AD.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private int[] iconInts;
    private String[]titleString, detailShortSrings;

    public MyAdapter(Context context, int[] iconInts, String[] titleString, String[] detailShortSrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleString = titleString;
        this.detailShortSrings = detailShortSrings;
    } //constructor

    @Override
    public int getCount() {
        return titleString.length;
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
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //about Icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);

        //about Tiyle
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleString[i]);

        //About Detail
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        detailTextView.setText(detailShortSrings[i]);

        return view1;
    }
} //main class
