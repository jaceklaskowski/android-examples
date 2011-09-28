package pl.japila.lokatnik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class NewDepositActivity extends Activity implements OnClickListener {

    private static final String TAG = "Lokatnik";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deposit);
        
        View newDepositButton = findViewById(R.id.save);
        newDepositButton.setOnClickListener(this);
        
        View exitButton = findViewById(R.id.discard);
        exitButton.setOnClickListener(this);

    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
        case R.id.save:
            Log.i(TAG, "save button pressed");
            break;
        case R.id.discard:
            Log.i(TAG, "discard button pressed");
        }
    }
    
}
