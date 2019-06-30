package sakr.mahmoodsakr.fragmentinxml;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class FragmentB extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.v("Sakr", "Fragment-onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Sakr", "Fragment-onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.v("Sakr", "Fragment-OnCreateView");
         View v = inflater.inflate(R.layout.fragment_b_layout, container,true);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v("Sakr", "Fragment-onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v("Sakr", "Fragment-onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v("Sakr", "Fragment-onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("Sakr", "Fragment-onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v("Sakr", "Fragment-onSavedInstance");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v("Sakr", "Fragment-onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("Sakr", "Fragment-onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("Sakr", "Fragment-onDetach");
    }
}
