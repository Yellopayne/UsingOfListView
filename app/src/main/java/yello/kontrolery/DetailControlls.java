package yello.kontrolery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailControlls extends AppCompatActivity {

    public static final String EXTRA_INFO="controll";
    private TextView tv,im;
    private ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_controlls);
        int controll2 = (Integer)getIntent().getExtras().get(EXTRA_INFO);
        Kontrolery k = Kontrolery.KontroleryArray[controll2];

        tv=(TextView)findViewById(R.id.textView);
        tv.setText(k.getDescript());

        iv=(ImageView)findViewById(R.id.imageView);
        iv.setImageResource(k.getPic());

        im=(TextView)findViewById(R.id.name);
        im.setText(k.getName());


    }


}
