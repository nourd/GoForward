package au.example.goforward;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "SharedPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        SharedPreferences storedData = getSharedPreferences(PREFS_NAME, 0);
        String userName = storedData.getString("userName", null);
        TextView textView = findViewById(R.id.username);
        textView.setText(userName);
    }
}