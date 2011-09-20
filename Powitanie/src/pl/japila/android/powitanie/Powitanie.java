package pl.japila.android.powitanie;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

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

    public void onClick(View view) {
        switch (view.getId()) {
        case R.id.accept_button:
            EditText nameTextField = (EditText) findViewById(R.id.name_field);
            String name = nameTextField.getText().toString();

            Log.i(TAG, name);

            Toast toast = Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();

        }
    }

}