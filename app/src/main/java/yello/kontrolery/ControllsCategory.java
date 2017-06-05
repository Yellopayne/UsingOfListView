package yello.kontrolery;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ControllsCategory extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listCon = getListView();

        listCon.setDividerHeight(10);
        listCon.setBackgroundColor(Color.GRAY);
        listCon.setCacheColorHint(Color.WHITE);
        ArrayAdapter<Kontrolery> adapt = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                Kontrolery.KontroleryArray);
        listCon.setAdapter(adapt);


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent2 = new Intent(ControllsCategory.this, DetailControlls.class);
        intent2.putExtra(DetailControlls.EXTRA_INFO, position);
        startActivity(intent2);
    }
}
