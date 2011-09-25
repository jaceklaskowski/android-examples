package pl.japila.lokatnik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Lokatnik extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		View aboutButton = findViewById(R.id.about_button);
		aboutButton.setOnClickListener(this);
		View exitButton = findViewById(R.id.exit_button);
		exitButton.setOnClickListener(this);
	}

	public void onClick(View v) {
		Intent i;
		switch (v.getId()) {
		case R.id.about_button:
			i = new Intent(this, About.class);
			startActivity(i);
			break;
		case R.id.exit_button:
			finish();
		}
	}
}