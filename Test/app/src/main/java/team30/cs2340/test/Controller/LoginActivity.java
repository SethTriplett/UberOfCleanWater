package team30.cs2340.test.Controller;

import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.os.Bundle;
import team30.cs2340.test.R;
import android.view.View;

/**
 * Created by Seth Triplett on 2/10/2017.
 */

public class LoginActivity extends AppCompatActivity{
    private AutoCompleteTextView userText;
    private EditText passText;

    private String user;
    private String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Ids for text entry fields
         */
        userText = (AutoCompleteTextView) findViewById(R.id.email);
        passText = (EditText) findViewById(R.id.password);
    }

    protected void onAddPressed(View view) {
        user = userText.getText().toString();
        pass = passText.getText().toString();
    }
}
