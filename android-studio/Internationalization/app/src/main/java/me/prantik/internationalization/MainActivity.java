package me.prantik.internationalization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button show;
    Switch switchBangla;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("lang", MODE_PRIVATE);

        show = findViewById(R.id.button);
        switchBangla = findViewById(R.id.switchBangla);

        show.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, R.string.toast, Toast.LENGTH_LONG)
                    .show();
        });
        check();

        switchBangla.setOnCheckedChangeListener((compoundButton, b) -> {
            if(b) {
                setLocale("bn");
            } else  {
                setLocale("en");
            }
        });
    }

    public void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, displayMetrics);
        Intent refresh = new Intent(this, MainActivity.class);
        finish();
        startActivity(refresh);


    }

    public void check() {
        String locale = getResources().getConfiguration().locale.getLanguage();

        if(locale == "bn") {
            switchBangla.setChecked(true);
        } else  {
            switchBangla.setChecked(false);
        }
    }
}