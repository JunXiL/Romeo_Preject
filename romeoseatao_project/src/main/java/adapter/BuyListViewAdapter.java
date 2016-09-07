package adapter;

import android.content.Context;
import android.net.LocalServerSocket;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.liguofu.romeoseatao_project.R;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.List;

import bean.BuyBean;

/**
 * Created by my on 2016/9/7.
 */
public class BuyListViewAdapter extends BaseAdapter{

    private Context context;
    private List<BuyBean.DatasBean.HomesBean> beans;

    public BuyListViewAdapter(Context context,List<BuyBean.DatasBean.HomesBean> beans) {
        this.context = context;
       this.beans = beans;
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       MyVieHodler hodler = null;
        if(convertView == null){
            hodler = new MyVieHodler();
            convertView = LayoutInflater.from(context).inflate(R.layout.buy_listview_item,null);
            hodler.text1 = (TextView) convertView.findViewById(R.id.tv_buy_lv_item);
            hodler.text2 = (TextView) convertView.findViewById(R.id.tv_buy_lv_item_time);
            hodler.recyclerView = (RecyclerView) convertView.findViewById(R.id.rv_buy_lv_item);
            hodler.layouy = (LinearLayout) convertView.findViewById(R.id.ll_buy_lv_item);
            convertView.setTag(hodler);
        }else{
            hodler = (MyVieHodler) convertView.getTag();
        }

        BuyBean.DatasBean.HomesBean bean = beans.get(0);
        switch (position){
            case 0:
                hodler.text1.setText(bean.getOzcsj().get(0).getTits());
                hodler.recyclerView.setLayoutManager(new LinearLayoutManager(context));
                ItemAdapter1 itemAdapter1 = new ItemAdapter1();
                hodler.recyclerView.setAdapter(itemAdapter1);
                break;
            case 1:
                hodler.text1.setText(bean.getOzyfj().get(0).getTits());
                hodler.recyclerView.setLayoutManager(new LinearLayoutManager(context));
                ItemAdapter2 itemAdapter2 = new ItemAdapter2();
                hodler.recyclerView.setAdapter(itemAdapter2);
                break;
            case 2:
                hodler.text1.setText("限时购");
                hodler.text2.setVisibility(View.VISIBLE);
                String times_exits = bean.getXsg().get(0).getTimes_exits();
                String times_starts = bean.getXsg().get(0).getTimes_starts();
                long exits = Long.valueOf(times_exits);
                long starts = Long.valueOf(times_starts);
                long sum = exits - starts;
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                String hms = formatter.format(sum * 1000);
                hodler.text2.setText(hms);
                LinearLayoutManager manager = new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
                hodler.recyclerView.setLayoutManager(manager);
                ItemAdapter3 itemAdapter3 = new ItemAdapter3();
                hodler.recyclerView.setAdapter(itemAdapter3);
                break;
            case 3:
                hodler.layouy.setVisibility(View.GONE);
                hodler.recyclerView.setLayoutManager(new LinearLayoutManager(context));
                ItemAdapter4 itemAdapter4 = new ItemAdapter4();
                hodler.recyclerView.setAdapter(itemAdapter4);
                break;
            case 4:
                hodler.text1.setText("欧洲之美");
                hodler.recyclerView.setLayoutManager(new LinearLayoutManager(context));
                ItemAdapter5 itemAdapter5 = new ItemAdapter5();
                hodler.recyclerView.setAdapter(itemAdapter5);
                break;
            case 5:
                hodler.text1.setVisibility(View.GONE);
                hodler.recyclerView.setVisibility(View.GONE);
                break;
            case 6:
                hodler.text1.setText("Hot & Nice");
                hodler.recyclerView.setLayoutManager(new LinearLayoutManager(context));
                ItemAdapter6 itemAdapter6 = new ItemAdapter6();
                hodler.recyclerView.setAdapter(itemAdapter6);
                break;
        }

        return convertView;
    }

    class MyVieHodler{
        TextView text1;
        TextView text2;
        RecyclerView recyclerView;
        LinearLayout layouy;
    }

    class RecycleViewHodler extends RecyclerView.ViewHolder{
        ImageView small;
        TextView titel;
        TextView newPrice;
        TextView oldPrice;
        ImageView big;
        LinearLayout one;
        LinearLayout two;
        public RecycleViewHodler(View itemView) {
            super(itemView);
            small = (ImageView) itemView.findViewById(R.id.iv_buy_lv_recycleview_item);
            titel = (TextView) itemView.findViewById(R.id.tv__buy_lv_recycleview_item_titel);
            newPrice = (TextView) itemView.findViewById(R.id.tv__buy_lv_recycleview_item_newpreice);
            oldPrice = (TextView) itemView.findViewById(R.id.tv__buy_lv_recycleview_item_oldpreice);
            big = (ImageView) itemView.findViewById(R.id.iv_buy_lv_recycleview_item_single);
            one = (LinearLayout) itemView.findViewById(R.id.ll_buy_lv_recycleview_item_one);
            two = (LinearLayout) itemView.findViewById(R.id.ll_buy_lv_recycleview_item_two);
        }
    }

    class ItemAdapter1 extends RecyclerView.Adapter<RecycleViewHodler>{

        @Override
        public RecycleViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.buy_lv_item_recycleview_item,null);
            return new RecycleViewHodler(view);
        }

        @Override
        public void onBindViewHolder(RecycleViewHodler holder, int position) {
            holder.one.setVisibility(View.GONE);
            Picasso.with(context).load(beans.get(0).getOzcsj().get(0).getUpdata()).into(holder.big);
            holder.big.setScaleType(ImageView.ScaleType.FIT_XY);
        }

        @Override
        public int getItemCount() {
            return 1;
        }
    }
    class ItemAdapter2 extends RecyclerView.Adapter<RecycleViewHodler>{

        @Override
        public RecycleViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.buy_lv_item_recycleview_item,null);
            return new RecycleViewHodler(view);
        }

        @Override
        public void onBindViewHolder(RecycleViewHodler holder, int position) {
            holder.one.setVisibility(View.GONE);
            holder.big.setScaleType(ImageView.ScaleType.FIT_XY);
            Picasso.with(context).load(beans.get(0).getOzyfj().get(0).getUpdata()).into(holder.big);
        }

        @Override
        public int getItemCount() {
            return 1;
        }
    }
    class ItemAdapter3 extends RecyclerView.Adapter<RecycleViewHodler>{

        @Override
        public RecycleViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.buy_lv_item_recycleview_item,null);
            return new RecycleViewHodler(view);
        }

        @Override
        public void onBindViewHolder(RecycleViewHodler holder, int position) {
            holder.big.setVisibility(View.GONE);
            LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            layout.setMargins(5,0,5,0);
            holder.one.setLayoutParams(layout);
            holder.titel.setText(beans.get(0).getXsg().get(position).getTits());
            holder.newPrice.setText("¥"+beans.get(0).getXsg().get(position).getPrices_mains());
            holder.oldPrice.setText("市场价："+beans.get(0).getXsg().get(position).getPrices_markets());
            Picasso.with(context).load(beans.get(0).getXsg().get(position).getUpdata()).into(holder.small);
        }

        @Override
        public int getItemCount() {
            return 5;
        }
    }
    class ItemAdapter4 extends RecyclerView.Adapter<RecycleViewHodler>{

        @Override
        public RecycleViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.buy_lv_item_recycleview_item,null);
            return new RecycleViewHodler(view);
        }

        @Override
        public void onBindViewHolder(RecycleViewHodler holder, int position) {
            holder.one.setVisibility(View.GONE);
            holder.big.setScaleType(ImageView.ScaleType.FIT_XY);
            Picasso.with(context).load(beans.get(0).getJrxpp().get(0).getUpdata()).into(holder.big);
        }

        @Override
        public int getItemCount() {
            return 1;
        }
    }
    class ItemAdapter5 extends RecyclerView.Adapter<RecycleViewHodler>{

        @Override
        public RecycleViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.buy_lv_item_recycleview_item,null);
            return new RecycleViewHodler(view);
        }

        @Override
        public void onBindViewHolder(RecycleViewHodler holder, int position) {
            holder.one.setVisibility(View.GONE);
            holder.big.setScaleType(ImageView.ScaleType.FIT_XY);
            Picasso.with(context).load(beans.get(0).getOzzm().get(position).getImgs()).into(holder.big);
        }

        @Override
        public int getItemCount() {
            return 8;
        }
    }
    class ItemAdapter6 extends RecyclerView.Adapter<RecycleViewHodler>{

        @Override
        public RecycleViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.buy_lv_item_recycleview_item,null);
            return new RecycleViewHodler(view);
        }

        @Override
        public void onBindViewHolder(RecycleViewHodler holder, int position) {
            holder.big.setVisibility(View.GONE);
            LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            LinearLayout.LayoutParams layout1 = new LinearLayout.LayoutParams(800, LinearLayout.LayoutParams.WRAP_CONTENT);
            layout.setMargins(0,5,0,5);
            holder.one.setLayoutParams(layout);
            holder.two.setLayoutParams(layout1);
            Picasso.with(context).load(beans.get(0).getRmtjsp().get(position).getUpdata()).into(holder.small);
            holder.titel.setText(beans.get(0).getRmtjsp().get(position).getTits());
            holder.newPrice.setText("¥"+beans.get(0).getRmtjsp().get(position).getPrices_mains()+"");
            holder.oldPrice.setText("市场价："+beans.get(0).getRmtjsp().get(position).getPrices_markets()+"");
        }

        @Override
        public int getItemCount() {
            return 12;
        }
    }
}
