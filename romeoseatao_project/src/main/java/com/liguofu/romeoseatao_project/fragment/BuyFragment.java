package com.liguofu.romeoseatao_project.fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.handmark.pulltorefresh.library.PullToRefreshExpandableListView;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.liguofu.romeoseatao_project.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import HttpUitls.HttpRetrofit;
import adapter.BuyListViewAdapter;
import bean.BuyBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by my on 2016/9/5.  买欧洲的显示界面
 */
public class BuyFragment extends Fragment {

    private Context context;
    private PullToRefreshListView mListView;
    private ConvenientBanner cb;
    private RecyclerView mRecycleView;
    private  List<BuyBean.DatasBean.HomesBean.AdvesBean> adves = new ArrayList<>();
    private List<BuyBean.DatasBean.HomesBean.SortsBean>  sorts = new ArrayList<>();
    private List<BuyBean.DatasBean.HomesBean> beans = new ArrayList<>();
    private ProgressDialog dialog;


    public static BuyFragment newInstance(){
        BuyFragment fragment = new BuyFragment();
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
        View view = inflater.inflate(R.layout.buy_frag,null);
        mListView = (PullToRefreshListView) view.findViewById(R.id.prlv_buy);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        dialog = new ProgressDialog(context);
        dialog.setMessage("努力加载中。。。");
        initHeaderView();
        loadData();

    }

    private void loadData() {
        dialog.show();
        HttpRetrofit.init().getBuyResult().enqueue(new Callback<BuyBean>() {
            @Override
            public void onResponse(Call<BuyBean> call, Response<BuyBean> response) {
                BuyBean body = response.body();
                BuyBean.DatasBean.HomesBean bean = body.getDatas().getHomes();
                beans.add(body.getDatas().getHomes());
                adves.addAll(bean.getAdves());
                sorts.addAll(bean.getSorts());
                setupAdapter();
                setupListViewAdapter();
            }

            @Override
            public void onFailure(Call<BuyBean> call, Throwable t) {

            }
        });

    }

    private void initHeaderView() {
        View view  = LayoutInflater.from(context).inflate(R.layout.buy_header_view,null);
        cb = (ConvenientBanner) view.findViewById(R.id.cb_buy_header);
        mRecycleView = (RecyclerView) view.findViewById(R.id.rv_buy_header);
        mListView.getRefreshableView().addHeaderView(view);
    }

    private void setupListViewAdapter(){
        dialog.dismiss();
        BuyListViewAdapter buyListViewAdapter = new BuyListViewAdapter(context,beans);
        mListView.setAdapter(buyListViewAdapter);
    }

    private void setupAdapter(){
        cb.setPages(new CBViewHolderCreator<CBViewHodler>() {
            @Override
            public CBViewHodler createHolder() {
                return new CBViewHodler();
            }
        },adves).startTurning(3000);

        LinearLayoutManager layout = new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
        mRecycleView.setLayoutManager(layout);
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter();
        mRecycleView.setAdapter(recycleViewAdapter);
    }

    class RecycleViewHodler extends RecyclerView.ViewHolder{
        ImageView image;
        public RecycleViewHodler(View itemView) {
            super(itemView);
            image = (ImageView) itemView;
        }
    }

    class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewHodler>{

        @Override
        public RecycleViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
            ImageView iamge = new ImageView(context);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(300, 300);
            lp.setMargins(0, 0, 10, 0);
            iamge.setLayoutParams(lp);
            return new RecycleViewHodler(iamge);
        }

        @Override
        public void onBindViewHolder(RecycleViewHodler holder, int position) {
            Picasso.with(context).load(sorts.get(position).getLogos()).into(holder.image);
        }

        @Override
        public int getItemCount() {
            return sorts == null ? 0 : sorts.size();
        }
    }

    class CBViewHodler implements Holder<BuyBean.DatasBean.HomesBean.AdvesBean>{
        ImageView image;
        @Override
        public View createView(Context context) {
            image = new ImageView(context);
            image.setScaleType(ImageView.ScaleType.FIT_XY);
            return image;
        }

        @Override
        public void UpdateUI(Context context, int position, BuyBean.DatasBean.HomesBean.AdvesBean data) {
            Picasso.with(context).load(data.getUpdata()).into(image);
        }
    }
}
