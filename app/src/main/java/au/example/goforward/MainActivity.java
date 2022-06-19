package au.example.goforward;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "SharedPrefsFile";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goSecond(View view) {
        SharedPreferences storedData = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor storedDataEditor = storedData.edit();
        storedDataEditor.putString("userName", "andrey");
        storedDataEditor.commit();
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
}