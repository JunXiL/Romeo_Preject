package com.liguofu.romeoseatao_project.activty;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.liguofu.romeoseatao_project.R;
import com.liguofu.romeoseatao_project.fragment.BuyFragment;
import com.liguofu.romeoseatao_project.fragment.HomeFragment;
import com.liguofu.romeoseatao_project.fragment.LiveFragment;
import com.liguofu.romeoseatao_project.fragment.MimeFragment;
import com.liguofu.romeoseatao_project.fragment.ShopCarFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
/*
*
* create by lgfu on 2016-9-5
*
* 这是一个欢迎界面   第一次登陆需要有引导页
* */

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.rg_main)
    RadioGroup mRadioGroup;
    @BindView(R.id.rb_main_one)
    RadioButton bt1;
    @BindView(R.id.rb_main_two)
    RadioButton bt2;
    @BindView(R.id.rb_main_three)
    RadioButton bt3;
    @BindView(R.id.rb_main_four)
    RadioButton bt4;
    @BindView(R.id.rb_main_five)
    RadioButton bt5;


    private HomeFragment fragment1;
    private LiveFragment fragment2;
    private BuyFragment fragment3;
    private ShopCarFragment fragment4;
    private MimeFragment fragment5;
    private Fragment curFragment;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        ButterKnife.bind(this);
        manager = getSupportFragmentManager();
        initFragment();
        initListener();

    }



    private void initListener() {
        showAllFragment(fragment1);
        mRadioGroup.check(R.id.rb_main_one);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_main_one:
                        showAllFragment(fragment1);
                        break;
                    case R.id.rb_main_two:
                        showAllFragment(fragment2);
                        break;
                    case R.id.rb_main_three:
                        showAllFragment(fragment3);
                        break;
                    case R.id.rb_main_four:
                        showAllFragment(fragment4);
                        break;
                    case R.id.rb_main_five:
                        showAllFragment(fragment5);
                        break;
                }
            }
        });

    }






    private void initFragment() {
        fragment1 = HomeFragment.newInstance();
        fragment2 = LiveFragment.newInstance();
        fragment3 = BuyFragment.newInstance();
        fragment4 = ShopCarFragment.newInstance();
        fragment5 = MimeFragment.newInstance();
    }

    private void showAllFragment(Fragment fragment){
        FragmentTransaction transaction = manager.beginTransaction();
        if(curFragment != null && curFragment.isAdded()){
            transaction.hide(curFragment);
        }
        if(!fragment.isAdded()){
            transaction.add(R.id.fl_mian,fragment);
        }else {
            transaction.show(fragment);
        }
        transaction.commit();
        curFragment = fragment;
    }

}
