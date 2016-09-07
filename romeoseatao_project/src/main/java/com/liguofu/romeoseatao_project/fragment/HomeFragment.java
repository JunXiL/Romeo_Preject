package com.liguofu.romeoseatao_project.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.liguofu.romeoseatao_project.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by my on 2016/9/5.
 */
public class HomeFragment extends Fragment {

    private Context context;
    private TabLayout tab;
    private ViewPager mPager;
    private List<Fragment> fragList = new ArrayList<>();
    private List<String> titelList = new ArrayList<>();
    private ImageView image;
    private TextView text;

    public static HomeFragment newInstance(){
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_frag,container,false);
        tab = (TabLayout) view.findViewById(R.id.tab_home);
        mPager = (ViewPager) view.findViewById(R.id.vp_home);
        image = (ImageView) view.findViewById(R.id.iv_home_top);
        text = (TextView) view.findViewById(R.id.tv_home_top);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        loadData();
        setupAdapter();

    }

    private void setupAdapter() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getFragmentManager());
        mPager.setAdapter(viewPagerAdapter);
        tab.setupWithViewPager(mPager);

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //用来隐藏 标题图片
                if(position == 1){
                    image.setVisibility(View.INVISIBLE);
                    text.setVisibility(View.INVISIBLE);
                }else {
                    image.setVisibility(View.VISIBLE);
                    text.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void loadData() {
        fragList.add(HomeOneFragment.newInstance());
        fragList.add(HomeTwoFragment.newInstance());

        titelList.add("推荐");
        titelList.add("关注");

    }

    class ViewPagerAdapter extends FragmentStatePagerAdapter{

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragList.get(position);
        }

        @Override
        public int getCount() {
            return fragList == null ? 0 : fragList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titelList.get(position);
        }
    }


}
