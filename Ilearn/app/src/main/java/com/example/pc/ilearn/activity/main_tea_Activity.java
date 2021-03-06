package com.example.pc.ilearn.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.pc.ilearn.R;

public class main_tea_Activity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    private Collegetea_Activity fragment1;
    private Majortea_Activity fragment2;
    private Leveltea_Activity fragment3;
    private Fragment[] fragments;

    private int lastfragment;//用于记录上个选择的Fragment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_center_tea);
        initFragment();
    }
    //初始化fragment和fragment数组
    private void initFragment()
    {
        fragment1 = new Collegetea_Activity ();
        fragment2= new Majortea_Activity();
        fragment3 = new Leveltea_Activity();
        fragments = new Fragment[]{fragment1,fragment2,fragment3};
        lastfragment=0;

        getSupportFragmentManager().beginTransaction().replace(R.id.mainview,fragment1).show(fragment1).addToBackStack(null).commit();
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bnv);
        bottomNavigationView.setOnNavigationItemSelectedListener(changeFragment);
    }
    //判断选择的菜单
    private BottomNavigationView.OnNavigationItemSelectedListener changeFragment= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId())
            {
                case R.id.id1:
                {
                    if(lastfragment!=0)
                    {
                        switchFragment(lastfragment,0);
                        lastfragment=0;

                    }

                    return true;
                }
                case R.id.id2:
                {
                    if(lastfragment!=1)
                    {
                        switchFragment(lastfragment,1);
                        lastfragment=1;

                    }

                    return true;
                }
                case R.id.id3:
                {
                    if(lastfragment!=2)
                    {
                        switchFragment(lastfragment,2);
                        lastfragment=2;

                    }

                    return true;
                }
            }
            return false;
        }
    };
    //切换Fragment
    private void switchFragment(int lastfragment,int index)
    {
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.hide(fragments[lastfragment]);//隐藏上个Fragment
        if(fragments[index].isAdded()==false)
        {
            transaction.add(R.id.mainview,fragments[index]);
        }
        transaction.show(fragments[index]).commitAllowingStateLoss();
    }
}
