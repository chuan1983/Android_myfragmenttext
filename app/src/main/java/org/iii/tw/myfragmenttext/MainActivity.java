package org.iii.tw.myfragmenttext;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private FragmentTransaction tran;
    private F1Fragment f1;
    private F2Fragment f2;
    private boolean isF1;  //這裡只有兩頁

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new F1Fragment();
        f2 = new F2Fragment();

        fmgr = getFragmentManager();
        tran = fmgr.beginTransaction();
        tran.add(R.id.container,f1);
        tran.commit();

        isF1 = true;
    }

    public void go(View view){
        isF1 = !isF1;
        tran = fmgr.beginTransaction();
        tran.replace(R.id.container, isF1?f1:f2);
        //tran.addToBackStack(null);
        tran.commit();
    }
    public void b1(View view){

    }

    public void b2(View view){

    }
}
