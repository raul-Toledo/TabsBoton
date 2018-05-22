package com.example.sir_c.tabs;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(getApplicationContext(),
                getSupportFragmentManager(),
                android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec("Tab 1").setIndicator("Pestaña 1"), Tab1Fragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("Tab 2").setIndicator("Pestaña 2"), Tab2Fragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("Tab 3").setIndicator("Pestaña 3"), Tab3Fragment.class, null);
    }

    public void evento(View v) {
        // does something very interesting
        Toast.makeText(this, "HOLA", Toast.LENGTH_SHORT).show();
    }
}
