package com.example.qthjen.contextmenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.bt);
        /** đăng kí view cho context menu **/
        registerForContextMenu(bt);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.context_menu, menu);
        menu.setHeaderTitle("Choose color");
        menu.setHeaderIcon(R.mipmap.ic_launcher);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch ( item.getItemId() ) {

            case R.id.cmBlue: bt.setText("Blue");break;
            case R.id.cmRed:  bt.setText("Red");break;
            case R.id.cmCyan: bt.setText("Cyan");break;

        }
        return super.onContextItemSelected(item);
    }
}
