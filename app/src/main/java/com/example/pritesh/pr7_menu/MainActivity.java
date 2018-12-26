package com.example.pritesh.pr7_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ll= new LinearLayout(this);
        ll.setOnCreateContextMenuListener(this);
        setContentView(ll);
    }
    //For Option menu creation
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }
    //For Option menu creation
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return MenuChoice(item);
    }
    //For Context menu creation
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view,ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, view, menuInfo);
        CreateMenu(menu);
    }
    //For Context menu selection
    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        return MenuChoice(item);
    }
    private void CreateMenu(Menu menu)
    {
        MenuItem mnu1 = menu.add(0, 0, 0, "RED");
        {
            mnu1.setAlphabeticShortcut('r');

        }
        MenuItem mnu2 = menu.add(0, 1, 1, "GREEN");
        {
            mnu2.setAlphabeticShortcut('g');
            //mnu2.setIcon(R.drawable.icon);
        }
        MenuItem mnu3 = menu.add(0, 2, 2, "BLUE");
        {
            mnu3.setAlphabeticShortcut('c');
        }
    }
    private boolean MenuChoice(MenuItem item)
    {
        switch (item.getItemId())
        {
            case 0:
                ll.setBackgroundColor(Color.rgb(255,0,0));
                return true;
            case 1:
                ll.setBackgroundColor(Color.rgb(0,255,0));
                return true;
            case 2:
                ll.setBackgroundColor(Color.rgb(0,0,255));
                return true;
        }
        return false;
    }
}

