package sakr.mahmoodsakr.fragmentinxml;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;

public class ActivityA extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Sakr", "Activity-Create");
        setContentView(R.layout.activity_a_layout);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Sakr", "Activity-Start");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.v("Sakr", "Activity-AttachFragment");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Sakr", "Activity-Resume");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.v("Sakr", "Activity-RestoreInstance");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Sakr", "Activity-Pause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v("Sakr", "Activity-onSaveInstance");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Sakr", "Activity-Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Sakr", "Activity-Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Sakr", "Activity-Destroy");
    }

}
