package com.liguofu.romeoseatao_project.fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.liguofu.romeoseatao_project.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import HttpUitls.HttpRetrofit;
import adapter.HomeListViewAdapter;
import bean.HomeBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by my on 2016/9/5. 首页的显示界面
 */
public class HomeOneFragment extends Fragment {


    private Context context;
    private PullToRefreshListView mListVIew;
    private ConvenientBanner cb;
    private RecyclerView mrecycleView;
    private List<HomeBean.DatasBean.Life2circleBean.AdvesBean> adves = new ArrayList<>();
    private List<Integer> imageList = new ArrayList<>();
    private List<HomeBean.DatasBean.Life2circleBean.InfosmainsBean> infosmains = new ArrayList<>();
    private ProgressDialog dialog;

    public static HomeOneFragment newInstance(){
        HomeOneFragment fragment = new HomeOneFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getContext();
        dialog = new ProgressDialog(context);
        dialog.setMessage("努力加载中。。。");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_one_frag,container,false);
        mListVIew = (PullToRefreshListView) view.findViewById(R.id.ptlv_home_one);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = LayoutInflater.from(context).inflate(R.layout.home_one_header_view,null);
        mListVIew.getRefreshableView().addHeaderView(view);
        initHeaderView(view);
    }

    private void initHeaderView(View view) {
        cb = (ConvenientBanner) view.findViewById(R.id.cb_home_one_header);
        mrecycleView = (RecyclerView) view.findViewById(R.id.rv_home_one_header);
        loadData();
    }

    private void setupAdapter(){
        dialog.dismiss();
        cb.setPages(new CBViewHolderCreator<CbViewHodler>() {
            @Override
            public CbViewHodler createHolder() {
                return new CbViewHodler();
            }
        },adves);
        cb.startTurning(3000);

        HomeListViewAdapter mAdapter = new HomeListViewAdapter(context, infosmains);
        mListVIew.setAdapter(mAdapter);
        mListVIew.getRefreshableView().setDividerHeight(20);

    }

    private void setRecycleView(){
        LinearLayoutManager layout = new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
        mrecycleView.setLayoutManager(layout);
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter();
        mrecycleView.setAdapter(recycleViewAdapter);

    }
    private void loadData(){
        dialog.show();
        HttpRetrofit.init().getHomeResult().enqueue(new Callback<HomeBean>() {
            @Override
            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
                HomeBean body = response.body();
                adves.addAll(body.getDatas().getLife2circle().getAdves());
                infosmains.addAll(body.getDatas().getLife2circle().getInfosmains());
                setupAdapter();
            }

            @Override
            public void onFailure(Call<HomeBean> call, Throwable t) {

            }
        });

        imageList.add(R.drawable.guojia_img0);
        imageList.add(R.drawable.guojia_img1);
        imageList.add(R.drawable.guojia_img2);
        imageList.add(R.drawable.guojia_img3);
        imageList.add(R.drawable.guojia_img4);
        imageList.add(R.drawable.guojia_img5);

        setRecycleView();

    }


    class CbViewHodler implements Holder<HomeBean.DatasBean.Life2circleBean.AdvesBean>{

        private ImageView image;

        @Override
        public View createView(Context context) {
            image = new ImageView(context);
            image.setScaleType(ImageView.ScaleType.FIT_XY);
            return image;
        }

        @Override
        public void UpdateUI(Context context, int position, HomeBean.DatasBean.Life2circleBean.AdvesBean data) {
            Picasso.with(context).load(data.getUpdata()).into(image);
        }
    }

    class RecycleViewHodler extends RecyclerView.ViewHolder{
        public ImageView image;
        public RecycleViewHodler(View itemView) {
            super(itemView);
            image = (ImageView) itemView;
        }
    }

    class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewHodler>{

        @Override
        public RecycleViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
            ImageView image = new ImageView(context);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            lp.setMargins(0, 0, 10, 0);
            image.setLayoutParams(lp);
            return new RecycleViewHodler(image);
        }

        @Override
        public void onBindViewHolder(RecycleViewHodler holder, int position) {
           holder.image.setImageResource(imageList.get(position));
        }

        @Override
        public int getItemCount() {
            return imageList == null ? 0 : imageList.size();
        }
    }

}
