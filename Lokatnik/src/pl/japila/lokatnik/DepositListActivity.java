package pl.japila.lokatnik;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class DepositListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.deposit_list_item, new String[] {"Jacek", "Agatka"}));
    }

}
