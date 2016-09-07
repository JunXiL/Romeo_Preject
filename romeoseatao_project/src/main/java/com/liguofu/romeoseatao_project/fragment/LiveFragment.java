package com.liguofu.romeoseatao_project.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.liguofu.romeoseatao_project.R;
import com.liguofu.romeoseatao_project.activty.LiveDatielActivity;

/**
 * Created by my on 2016/9/5.
 */
public class LiveFragment extends Fragment {

    private Context context;
    private ImageView image;

    public static LiveFragment newInstance(){
        LiveFragment fragment = new LiveFragment();
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
        View view = inflater.inflate(R.layout.live_frag,null);
        image = (ImageView) view.findViewById(R.id.iv_live);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,LiveDatielActivity.class);
                startActivity(intent);
            }
        });
    }
}
