package edu.fsu.cs.mobile.example.layoutinflater;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class LayoutInflaterActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        LinearLayout root = (LinearLayout) findViewById(R.id.layout);
        
        LayoutInflater inflater = getLayoutInflater();
        
        setContentView(inflater.inflate(R.layout.sublayout, root));
    }
}