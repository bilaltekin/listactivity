package mobil.tekin.com.listactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private String os[];
    private ArrayAdapter<String> adp;
    private ListView lst;

    private void init()
    {
        os = new String[5];
        os[0]="AS 400";
        os[1]="Solaris";
        os[2]="Pardus";
        os[3]="Macosx";
        os[4]="Ubuntu";

        lst= this.getListView();

        adp= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,os);

        this.setListAdapter(adp);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this,os[position],Toast.LENGTH_LONG).show();
    }
}
