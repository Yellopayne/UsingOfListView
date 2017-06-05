package yello.kontrolery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class TopLevelActivity extends AppCompatActivity {
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        clickItem();

    }






    public void clickItem(){
        lv=(ListView)findViewById(R.id.OptionsList);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0:
                        Toast toast = Toast.makeText(getApplicationContext(),"Controllers",Toast.LENGTH_SHORT);
                        toast.show();
                        //Intent in = new Intent(TopLevelActivity.this,KontroleryChoices.class);
                        //startActivity(in);
                        Intent inte = new Intent(TopLevelActivity.this,ControllsCategory.class);
                        startActivity(inte);
                        break;
                    case 1:
                        Toast toast2 = Toast.makeText(getApplicationContext(),"Wires",Toast.LENGTH_SHORT);
                        toast2.show();
                        break;
                    case 2:
                        Toast toast3 = Toast.makeText(getApplicationContext(),"Microphones",Toast.LENGTH_SHORT);
                        toast3.show();
                        break;


                }

            }
        });
    }


}
