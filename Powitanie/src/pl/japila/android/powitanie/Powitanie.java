package pl.japila.android.powitanie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class Powitanie extends Activity implements OnClickListener {
	
	public static final String TAG = Powitanie.class.getSimpleName();
	
	public static final String NAME_ATTR = "powitanie.name";
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		View aboutButton = findViewById(R.id.accept_button);
		aboutButton.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.accept_button:
			EditText nameTextField = (EditText) findViewById(R.id.name_field);
			String name = nameTextField.getText().toString();
			
			Log.i(TAG, name);
			
			Intent i = new Intent(this, Greeting.class);			
			i.putExtra(NAME_ATTR, name);
			startActivity(i);
		}
	}

}