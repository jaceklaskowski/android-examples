package pl.japila.lokatnik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class Lokatnik extends Activity implements OnClickListener {
	private static final String TAG = "Lokatnik";

    /** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

        View newDepositButton = findViewById(R.id.new_deposit_button);
        newDepositButton.setOnClickListener(this);
        
		View exitButton = findViewById(R.id.exit_button);
		exitButton.setOnClickListener(this);
	}

	public void onClick(View v) {
		Intent intent;
		switch (v.getId()) {
		case R.id.new_deposit_button:
		    Log.i(TAG, "new deposit button pressed");
		    intent = new Intent(this, NewDepositActivity.class);
		    startActivity(intent);
		    break;
		case R.id.exit_button:
            Log.i(TAG, "exit button pressed");
			finish();
		}
	}
}