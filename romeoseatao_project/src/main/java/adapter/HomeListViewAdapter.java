package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.liguofu.romeoseatao_project.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import bean.HomeBean;

/**
 * Created by my on 2016/9/6.  首页listview的适配器
 */
public class HomeListViewAdapter extends BaseAdapter {

    private Context context;
    private List<HomeBean.DatasBean.Life2circleBean.InfosmainsBean> list;

    public HomeListViewAdapter(Context context, List<HomeBean.DatasBean.Life2circleBean.InfosmainsBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
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
        MyHodler hodler = null;
        if(convertView == null){
            hodler = new MyHodler();
            convertView = LayoutInflater.from(context).inflate(R.layout.home_listview_item,null);
            hodler.image1 = (ImageView) convertView.findViewById(R.id.civ_home_lv_item);
            hodler.text1 = (TextView) convertView.findViewById(R.id.tv_home_lv_item_one);
            hodler.text2 = (TextView) convertView.findViewById(R.id.tv_home_lv_item_two);
            hodler.text3 = (TextView) convertView.findViewById(R.id.tv_home_lv_item_three);
            hodler.text4 = (TextView) convertView.findViewById(R.id.tv_home_lv_item_four);
            hodler.text5 = (TextView) convertView.findViewById(R.id.tv_home_lv_item_five);
            hodler.text6 = (TextView) convertView.findViewById(R.id.tv_home_lv_item_six);
            hodler.text7 = (TextView) convertView.findViewById(R.id.tv_home_lv_item_senve);
            hodler.text8 = (TextView) convertView.findViewById(R.id.tv_home_lv_item_8);
            hodler.text9 = (TextView) convertView.findViewById(R.id.tv_home_lv_item_9);
            hodler.image2 = (ImageView) convertView.findViewById(R.id.iv_home_lv_item_mid);
            hodler.bt = (Button) convertView.findViewById(R.id.bt_home_lv_item);
            convertView.setTag(hodler);
        }else{
            hodler = (MyHodler) convertView.getTag();
        }
        HomeBean.DatasBean.Life2circleBean.InfosmainsBean bean = list.get(position);
        Picasso.with(context).load(bean.getCountrys_icos()).into(hodler.image1);
        Picasso.with(context).load(bean.getUpdata()).into(hodler.image2);
        hodler.text1.setText(bean.getPensters());
        hodler.text2.setText(bean.getCountrys_tits());
        hodler.text3.setText(bean.getBewrites());
        hodler.text4.setText(bean.getKeywords_arrays().get(0));
        hodler.text5.setText(bean.getKeywords_arrays().get(1));
        hodler.text6.setText(bean.getKeywords_arrays().get(2));
        hodler.text7.setText(bean.getOnclicks()+"   已阅读");
        hodler.text8.setText(bean.getNums_onclickslikes()+"");
        hodler.text9.setText(bean.getNums_critiques()+"");
        return convertView;
    }

    class MyHodler{
        ImageView image1;
        TextView text1;
        TextView text2;
        Button bt;
        ImageView image2;
        TextView text3;
        TextView text4;
        TextView text5;
        TextView text6;
        TextView text7;
        TextView text8;
        TextView text9;


    }
}
