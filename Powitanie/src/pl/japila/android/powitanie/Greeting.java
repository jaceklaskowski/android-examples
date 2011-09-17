package pl.japila.android.powitanie;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Greeting extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String name = getIntent().getExtras().getString(Powitanie.NAME_ATTR);
		
		setContentView(R.layout.greeting);
		TextView textView = (TextView) findViewById(R.id.hello_label);
		textView.setText(String.format("Cześć %s!", name));
	}
}
