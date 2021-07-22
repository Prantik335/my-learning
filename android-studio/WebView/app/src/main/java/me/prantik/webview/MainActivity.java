package me.prantik.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    EditText urlEditText;
    Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        webView = findViewById(R.id.web_view);
        urlEditText = findViewById(R.id.editTextUrl);
        searchButton = findViewById(R.id.search_button);

        searchButton.setOnClickListener(view -> {
            hideKeyboard();
            search(urlEditText.getText().toString());
        });

    }

    private void search(String url) {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }

    private void hideKeyboard() {
        View view = getCurrentFocus();
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (view != null) {
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}