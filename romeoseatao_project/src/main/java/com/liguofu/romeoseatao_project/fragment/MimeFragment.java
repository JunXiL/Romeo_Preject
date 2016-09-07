package com.liguofu.romeoseatao_project.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liguofu.romeoseatao_project.R;

/**
 * Created by my on 2016/9/5.
 */
public class MimeFragment extends Fragment {

    private Context context;

    public static MimeFragment newInstance(){
        MimeFragment fragment = new MimeFragment();
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
        View view = inflater.inflate(R.layout.mime_frg,null);
        return view;
    }
}
