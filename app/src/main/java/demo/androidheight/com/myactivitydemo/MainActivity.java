package demo.androidheight.com.myactivitydemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate() method call",Toast.LENGTH_LONG).show();
    }
    /* onStart() method*/
    public  void onStart(){
        super.onStart();
        Toast.makeText(this,"onStart() method call",Toast.LENGTH_LONG).show();
    }
    /*onResume method*/
    public  void onResume(){
        super.onResume();
        Toast.makeText(this,"onResume() method call",Toast.LENGTH_LONG).show();
    }
    /*onPause() method*/
    public  void onPause(){
        super.onPause();
        Toast.makeText(this,"onPause() method call",Toast.LENGTH_LONG).show();
    }
    /*onstop method*/
    public  void onStop(){
        super.onStop();
        Toast.makeText(this,"onStop() method call",Toast.LENGTH_LONG).show();
    }
    /*onDestroy method*/
    public  void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "onDestroy() method call", Toast.LENGTH_LONG).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
