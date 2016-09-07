package com.liguofu.romeoseatao_project.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.liguofu.romeoseatao_project.R;

/**
 * Created by my on 2016/9/5.
 */
public class ShopCarFragment extends Fragment {

    private Context context;
    private ListView mListView;
    private LinearLayout linlayout;

    public static ShopCarFragment newInstance(){
        ShopCarFragment fragment = new ShopCarFragment();
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
        View view = inflater.inflate(R.layout.shopcar_frag,null);
        mListView = (ListView) view.findViewById(R.id.lv_shopcar);
        linlayout = (LinearLayout) view.findViewById(R.id.ll_shopcar_empty);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mListView.setEmptyView(linlayout);
    }
}
