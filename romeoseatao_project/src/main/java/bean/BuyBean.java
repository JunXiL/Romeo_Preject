package bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by my on 2016/9/7.
 */
public class BuyBean {


    /**
     * status : 1
     * msgs : 获取成功
     * datas : {"homes":{"lives":"http://apiapp.romeomart.com/apiapp/zlives/index?homes.html","adves":[{"adves_id":"8","tits":"广告信息08","links_id":"3","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805020915.jpg"},{"adves_id":"7","tits":"广告信息07","links_id":"657","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160901/big/20160901102901.jpg"},{"adves_id":"6","tits":"广告信息06","links_id":"14","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021118.jpg"},{"adves_id":"5","tits":"广告信息05","links_id":"32","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021218.jpg"},{"adves_id":"4","tits":"广告信息04","links_id":"1257","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160901/big/20160901100220.jpg"},{"adves_id":"3","tits":"广告信息03","links_id":"6","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021358.jpg"},{"adves_id":"2","tits":"广告信息02","links_id":"194","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021437.jpg"},{"adves_id":"1","tits":"广告信息01","links_id":"1007","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160810/big/20160810020259.jpg"}],"sorts":[{"sorts_id":"35","tits":"护肤","logos":"http://imgs.romeomart.com/publics/imgs/sorts/035.png"},{"sorts_id":"52","tits":"彩妆","logos":"http://imgs.romeomart.com/publics/imgs/sorts/052.png"},{"sorts_id":"26","tits":"香氛","logos":"http://imgs.romeomart.com/publics/imgs/sorts/026.png"},{"sorts_id":"67","tits":"日用","logos":"http://imgs.romeomart.com/publics/imgs/sorts/067.png"},{"sorts_id":"76","tits":"健康","logos":"http://imgs.romeomart.com/publics/imgs/sorts/076.png"},{"sorts_id":"100","tits":"男士","logos":"http://imgs.romeomart.com/publics/imgs/sorts/100.png"},{"sorts_id":"92","tits":"家居","logos":"http://imgs.romeomart.com/publics/imgs/sorts/092.png"}],"yjbjp":"","yjhfp":"","ozcsj":[{"prods_specials_id":"1","tits":"欧洲超市价","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160624/big/20160624191420.jpg"}],"ozyfj":[{"prods_specials_id":"2","tits":"欧洲药房价","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160624/big/20160624191353.jpg"}],"xsg":[{"prods_mains_id":"487","tits":"Chanel香奈儿炫亮魅力丝绒系列持久显色水润滋养唇膏口红 3.5G 色号43","prices_mains":"244.00","prices_markets":"303.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160705/big/20160705170611.png","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"10","tits":"De Tuinen皇家花园店芦荟胶 120ml","prices_mains":"172.00","prices_markets":"316.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20160607152920.jpg","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"12","tits":"美体小铺辣木花沐浴露 250ml","prices_mains":"47.00","prices_markets":"89.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019134607123.jpg","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"16","tits":"美体小铺橄榄油沐浴露 250ml","prices_mains":"47.00","prices_markets":"59.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019142812560.jpg","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"17","tits":"美体小铺蜂蜜沐浴露 250ml","prices_mains":"47.00","prices_markets":"68.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704150639.jpg","times_starts":"1473152400","times_exits":"1473238800"}],"jrxpp":[{"brands_id":"39","tits_cn":"馥绿德雅","tits_en":"Rene Furterer","updata":"http://apiapp.romeomart.com/publics/imgs/apiapp/homes_jrxpp.jpg"}],"ozzm":[{"prods_specials_id":"29","tits":"男士香水","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160830/big/20160830035159.jpg"},{"prods_specials_id":"28","tits":"止汗用品","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160830/big/20160830035014.jpg"},{"prods_specials_id":"25","tits":"香水印象系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160818/big/20160818034848.jpg"},{"prods_specials_id":"24","tits":"做人潮里的一股清流","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160818/big/20160818032921.jpg"},{"prods_specials_id":"22","tits":"纤体养身系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160812/big/20160812021557.jpg"},{"prods_specials_id":"21","tits":"面膜美人系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160812/big/20160812021208.jpg"},{"prods_specials_id":"20","tits":"女神愿望系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160805/big/20160805062445.jpg"},{"prods_specials_id":"19","tits":"防晒美白系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160805/big/20160805062912.jpg"}],"rmtjsp":[{"prods_mains_id":"284","tits":"Avene雅漾小金刚防晒乳 30ML","prices_mains":"143.00","prices_markets":"165.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704171828.jpg"},{"prods_mains_id":"6","tits":"欧缇丽葡萄籽胶囊30粒","prices_mains":"96.00","prices_markets":"128.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151018/big/20151018013947706.jpg"},{"prods_mains_id":"10","tits":"De Tuinen皇家花园店芦荟胶 120ml","prices_mains":"172.00","prices_markets":"316.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20160607152920.jpg"},{"prods_mains_id":"13","tits":"美体小铺椰子沐浴露 250ml","prices_mains":"47.00","prices_markets":"78.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704150327.jpg"},{"prods_mains_id":"14","tits":"美体小铺芒果沐浴露 250ml","prices_mains":"47.00","prices_markets":"65.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704144212.jpg"},{"prods_mains_id":"15","tits":"美体小铺乳木果沐浴露 250ml","prices_mains":"47.00","prices_markets":"69.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019142000795.jpg"},{"prods_mains_id":"17","tits":"美体小铺蜂蜜沐浴露 250ml","prices_mains":"47.00","prices_markets":"68.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704150639.jpg"},{"prods_mains_id":"18","tits":"美体小铺草莓沐浴露 250ml","prices_mains":"47.00","prices_markets":"59.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019144306675.jpg"},{"prods_mains_id":"32","tits":"西班牙皇室御用Casmara卡蔓-黄金24K抗氧化卡蔓面膜","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160718/big/20160718171001.jpg"},{"prods_mains_id":"40","tits":"西班牙皇室御用Casmara卡蔓－红色枸杞子面膜","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151118/big/20151118053144395.jpg"},{"prods_mains_id":"41","tits":"西班牙皇室御用Casmara卡蔓－蓝色提拉紧致保湿抗皱面膜","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151118/big/20151118053319294.jpg"},{"prods_mains_id":"42","tits":"西班牙皇室御用Casmara卡蔓-绿色海藻","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704155308.jpg"}]}}
     */

    private int status;
    private String msgs;
    /**
     * homes : {"lives":"http://apiapp.romeomart.com/apiapp/zlives/index?homes.html","adves":[{"adves_id":"8","tits":"广告信息08","links_id":"3","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805020915.jpg"},{"adves_id":"7","tits":"广告信息07","links_id":"657","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160901/big/20160901102901.jpg"},{"adves_id":"6","tits":"广告信息06","links_id":"14","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021118.jpg"},{"adves_id":"5","tits":"广告信息05","links_id":"32","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021218.jpg"},{"adves_id":"4","tits":"广告信息04","links_id":"1257","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160901/big/20160901100220.jpg"},{"adves_id":"3","tits":"广告信息03","links_id":"6","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021358.jpg"},{"adves_id":"2","tits":"广告信息02","links_id":"194","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021437.jpg"},{"adves_id":"1","tits":"广告信息01","links_id":"1007","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160810/big/20160810020259.jpg"}],"sorts":[{"sorts_id":"35","tits":"护肤","logos":"http://imgs.romeomart.com/publics/imgs/sorts/035.png"},{"sorts_id":"52","tits":"彩妆","logos":"http://imgs.romeomart.com/publics/imgs/sorts/052.png"},{"sorts_id":"26","tits":"香氛","logos":"http://imgs.romeomart.com/publics/imgs/sorts/026.png"},{"sorts_id":"67","tits":"日用","logos":"http://imgs.romeomart.com/publics/imgs/sorts/067.png"},{"sorts_id":"76","tits":"健康","logos":"http://imgs.romeomart.com/publics/imgs/sorts/076.png"},{"sorts_id":"100","tits":"男士","logos":"http://imgs.romeomart.com/publics/imgs/sorts/100.png"},{"sorts_id":"92","tits":"家居","logos":"http://imgs.romeomart.com/publics/imgs/sorts/092.png"}],"yjbjp":"","yjhfp":"","ozcsj":[{"prods_specials_id":"1","tits":"欧洲超市价","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160624/big/20160624191420.jpg"}],"ozyfj":[{"prods_specials_id":"2","tits":"欧洲药房价","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160624/big/20160624191353.jpg"}],"xsg":[{"prods_mains_id":"487","tits":"Chanel香奈儿炫亮魅力丝绒系列持久显色水润滋养唇膏口红 3.5G 色号43","prices_mains":"244.00","prices_markets":"303.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160705/big/20160705170611.png","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"10","tits":"De Tuinen皇家花园店芦荟胶 120ml","prices_mains":"172.00","prices_markets":"316.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20160607152920.jpg","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"12","tits":"美体小铺辣木花沐浴露 250ml","prices_mains":"47.00","prices_markets":"89.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019134607123.jpg","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"16","tits":"美体小铺橄榄油沐浴露 250ml","prices_mains":"47.00","prices_markets":"59.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019142812560.jpg","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"17","tits":"美体小铺蜂蜜沐浴露 250ml","prices_mains":"47.00","prices_markets":"68.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704150639.jpg","times_starts":"1473152400","times_exits":"1473238800"}],"jrxpp":[{"brands_id":"39","tits_cn":"馥绿德雅","tits_en":"Rene Furterer","updata":"http://apiapp.romeomart.com/publics/imgs/apiapp/homes_jrxpp.jpg"}],"ozzm":[{"prods_specials_id":"29","tits":"男士香水","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160830/big/20160830035159.jpg"},{"prods_specials_id":"28","tits":"止汗用品","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160830/big/20160830035014.jpg"},{"prods_specials_id":"25","tits":"香水印象系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160818/big/20160818034848.jpg"},{"prods_specials_id":"24","tits":"做人潮里的一股清流","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160818/big/20160818032921.jpg"},{"prods_specials_id":"22","tits":"纤体养身系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160812/big/20160812021557.jpg"},{"prods_specials_id":"21","tits":"面膜美人系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160812/big/20160812021208.jpg"},{"prods_specials_id":"20","tits":"女神愿望系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160805/big/20160805062445.jpg"},{"prods_specials_id":"19","tits":"防晒美白系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160805/big/20160805062912.jpg"}],"rmtjsp":[{"prods_mains_id":"284","tits":"Avene雅漾小金刚防晒乳 30ML","prices_mains":"143.00","prices_markets":"165.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704171828.jpg"},{"prods_mains_id":"6","tits":"欧缇丽葡萄籽胶囊30粒","prices_mains":"96.00","prices_markets":"128.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151018/big/20151018013947706.jpg"},{"prods_mains_id":"10","tits":"De Tuinen皇家花园店芦荟胶 120ml","prices_mains":"172.00","prices_markets":"316.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20160607152920.jpg"},{"prods_mains_id":"13","tits":"美体小铺椰子沐浴露 250ml","prices_mains":"47.00","prices_markets":"78.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704150327.jpg"},{"prods_mains_id":"14","tits":"美体小铺芒果沐浴露 250ml","prices_mains":"47.00","prices_markets":"65.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704144212.jpg"},{"prods_mains_id":"15","tits":"美体小铺乳木果沐浴露 250ml","prices_mains":"47.00","prices_markets":"69.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019142000795.jpg"},{"prods_mains_id":"17","tits":"美体小铺蜂蜜沐浴露 250ml","prices_mains":"47.00","prices_markets":"68.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704150639.jpg"},{"prods_mains_id":"18","tits":"美体小铺草莓沐浴露 250ml","prices_mains":"47.00","prices_markets":"59.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019144306675.jpg"},{"prods_mains_id":"32","tits":"西班牙皇室御用Casmara卡蔓-黄金24K抗氧化卡蔓面膜","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160718/big/20160718171001.jpg"},{"prods_mains_id":"40","tits":"西班牙皇室御用Casmara卡蔓－红色枸杞子面膜","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151118/big/20151118053144395.jpg"},{"prods_mains_id":"41","tits":"西班牙皇室御用Casmara卡蔓－蓝色提拉紧致保湿抗皱面膜","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151118/big/20151118053319294.jpg"},{"prods_mains_id":"42","tits":"西班牙皇室御用Casmara卡蔓-绿色海藻","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704155308.jpg"}]}
     */

    private DatasBean datas;

    public static BuyBean objectFromData(String str) {

        return new Gson().fromJson(str, BuyBean.class);
    }

    public static BuyBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), BuyBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<BuyBean> arrayBuyBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<BuyBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<BuyBean> arrayBuyBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<BuyBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsgs() {
        return msgs;
    }

    public void setMsgs(String msgs) {
        this.msgs = msgs;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * lives : http://apiapp.romeomart.com/apiapp/zlives/index?homes.html
         * adves : [{"adves_id":"8","tits":"广告信息08","links_id":"3","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805020915.jpg"},{"adves_id":"7","tits":"广告信息07","links_id":"657","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160901/big/20160901102901.jpg"},{"adves_id":"6","tits":"广告信息06","links_id":"14","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021118.jpg"},{"adves_id":"5","tits":"广告信息05","links_id":"32","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021218.jpg"},{"adves_id":"4","tits":"广告信息04","links_id":"1257","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160901/big/20160901100220.jpg"},{"adves_id":"3","tits":"广告信息03","links_id":"6","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021358.jpg"},{"adves_id":"2","tits":"广告信息02","links_id":"194","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805021437.jpg"},{"adves_id":"1","tits":"广告信息01","links_id":"1007","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160810/big/20160810020259.jpg"}]
         * sorts : [{"sorts_id":"35","tits":"护肤","logos":"http://imgs.romeomart.com/publics/imgs/sorts/035.png"},{"sorts_id":"52","tits":"彩妆","logos":"http://imgs.romeomart.com/publics/imgs/sorts/052.png"},{"sorts_id":"26","tits":"香氛","logos":"http://imgs.romeomart.com/publics/imgs/sorts/026.png"},{"sorts_id":"67","tits":"日用","logos":"http://imgs.romeomart.com/publics/imgs/sorts/067.png"},{"sorts_id":"76","tits":"健康","logos":"http://imgs.romeomart.com/publics/imgs/sorts/076.png"},{"sorts_id":"100","tits":"男士","logos":"http://imgs.romeomart.com/publics/imgs/sorts/100.png"},{"sorts_id":"92","tits":"家居","logos":"http://imgs.romeomart.com/publics/imgs/sorts/092.png"}]
         * yjbjp :
         * yjhfp :
         * ozcsj : [{"prods_specials_id":"1","tits":"欧洲超市价","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160624/big/20160624191420.jpg"}]
         * ozyfj : [{"prods_specials_id":"2","tits":"欧洲药房价","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160624/big/20160624191353.jpg"}]
         * xsg : [{"prods_mains_id":"487","tits":"Chanel香奈儿炫亮魅力丝绒系列持久显色水润滋养唇膏口红 3.5G 色号43","prices_mains":"244.00","prices_markets":"303.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160705/big/20160705170611.png","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"10","tits":"De Tuinen皇家花园店芦荟胶 120ml","prices_mains":"172.00","prices_markets":"316.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20160607152920.jpg","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"12","tits":"美体小铺辣木花沐浴露 250ml","prices_mains":"47.00","prices_markets":"89.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019134607123.jpg","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"16","tits":"美体小铺橄榄油沐浴露 250ml","prices_mains":"47.00","prices_markets":"59.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019142812560.jpg","times_starts":"1473152400","times_exits":"1473238800"},{"prods_mains_id":"17","tits":"美体小铺蜂蜜沐浴露 250ml","prices_mains":"47.00","prices_markets":"68.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704150639.jpg","times_starts":"1473152400","times_exits":"1473238800"}]
         * jrxpp : [{"brands_id":"39","tits_cn":"馥绿德雅","tits_en":"Rene Furterer","updata":"http://apiapp.romeomart.com/publics/imgs/apiapp/homes_jrxpp.jpg"}]
         * ozzm : [{"prods_specials_id":"29","tits":"男士香水","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160830/big/20160830035159.jpg"},{"prods_specials_id":"28","tits":"止汗用品","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160830/big/20160830035014.jpg"},{"prods_specials_id":"25","tits":"香水印象系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160818/big/20160818034848.jpg"},{"prods_specials_id":"24","tits":"做人潮里的一股清流","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160818/big/20160818032921.jpg"},{"prods_specials_id":"22","tits":"纤体养身系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160812/big/20160812021557.jpg"},{"prods_specials_id":"21","tits":"面膜美人系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160812/big/20160812021208.jpg"},{"prods_specials_id":"20","tits":"女神愿望系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160805/big/20160805062445.jpg"},{"prods_specials_id":"19","tits":"防晒美白系列","imgs":"http://imgs.romeomart.com/publics/imgs/updatas/20160805/big/20160805062912.jpg"}]
         * rmtjsp : [{"prods_mains_id":"284","tits":"Avene雅漾小金刚防晒乳 30ML","prices_mains":"143.00","prices_markets":"165.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704171828.jpg"},{"prods_mains_id":"6","tits":"欧缇丽葡萄籽胶囊30粒","prices_mains":"96.00","prices_markets":"128.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151018/big/20151018013947706.jpg"},{"prods_mains_id":"10","tits":"De Tuinen皇家花园店芦荟胶 120ml","prices_mains":"172.00","prices_markets":"316.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20160607152920.jpg"},{"prods_mains_id":"13","tits":"美体小铺椰子沐浴露 250ml","prices_mains":"47.00","prices_markets":"78.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704150327.jpg"},{"prods_mains_id":"14","tits":"美体小铺芒果沐浴露 250ml","prices_mains":"47.00","prices_markets":"65.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704144212.jpg"},{"prods_mains_id":"15","tits":"美体小铺乳木果沐浴露 250ml","prices_mains":"47.00","prices_markets":"69.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019142000795.jpg"},{"prods_mains_id":"17","tits":"美体小铺蜂蜜沐浴露 250ml","prices_mains":"47.00","prices_markets":"68.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704150639.jpg"},{"prods_mains_id":"18","tits":"美体小铺草莓沐浴露 250ml","prices_mains":"47.00","prices_markets":"59.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151019/big/20151019144306675.jpg"},{"prods_mains_id":"32","tits":"西班牙皇室御用Casmara卡蔓-黄金24K抗氧化卡蔓面膜","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160718/big/20160718171001.jpg"},{"prods_mains_id":"40","tits":"西班牙皇室御用Casmara卡蔓－红色枸杞子面膜","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151118/big/20151118053144395.jpg"},{"prods_mains_id":"41","tits":"西班牙皇室御用Casmara卡蔓－蓝色提拉紧致保湿抗皱面膜","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20151118/big/20151118053319294.jpg"},{"prods_mains_id":"42","tits":"西班牙皇室御用Casmara卡蔓-绿色海藻","prices_mains":"76.00","prices_markets":"113.00","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704155308.jpg"}]
         */

        private HomesBean homes;

        public static DatasBean objectFromData(String str) {

            return new Gson().fromJson(str, DatasBean.class);
        }

        public static DatasBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), DatasBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<DatasBean> arrayDatasBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<DatasBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<DatasBean> arrayDatasBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<DatasBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public HomesBean getHomes() {
            return homes;
        }

        public void setHomes(HomesBean homes) {
            this.homes = homes;
        }

        public static class HomesBean {
            private String lives;
            private String yjbjp;
            private String yjhfp;
            /**
             * adves_id : 8
             * tits : 广告信息08
             * links_id : 3
             * updata : http://imgs.romeomart.com/publics/imgs/adves/20160805/big/20160805020915.jpg
             */

            private List<AdvesBean> adves;
            /**
             * sorts_id : 35
             * tits : 护肤
             * logos : http://imgs.romeomart.com/publics/imgs/sorts/035.png
             */

            private List<SortsBean> sorts;
            /**
             * prods_specials_id : 1
             * tits : 欧洲超市价
             * updata : http://imgs.romeomart.com/publics/imgs/updatas/20160624/big/20160624191420.jpg
             */

            private List<OzcsjBean> ozcsj;
            /**
             * prods_specials_id : 2
             * tits : 欧洲药房价
             * updata : http://imgs.romeomart.com/publics/imgs/updatas/20160624/big/20160624191353.jpg
             */

            private List<OzyfjBean> ozyfj;
            /**
             * prods_mains_id : 487
             * tits : Chanel香奈儿炫亮魅力丝绒系列持久显色水润滋养唇膏口红 3.5G 色号43
             * prices_mains : 244.00
             * prices_markets : 303.00
             * updata : http://imgs.romeomart.com/publics/imgs/updatas/20160705/big/20160705170611.png
             * times_starts : 1473152400
             * times_exits : 1473238800
             */

            private List<XsgBean> xsg;
            /**
             * brands_id : 39
             * tits_cn : 馥绿德雅
             * tits_en : Rene Furterer
             * updata : http://apiapp.romeomart.com/publics/imgs/apiapp/homes_jrxpp.jpg
             */

            private List<JrxppBean> jrxpp;
            /**
             * prods_specials_id : 29
             * tits : 男士香水
             * imgs : http://imgs.romeomart.com/publics/imgs/updatas/20160830/big/20160830035159.jpg
             */

            private List<OzzmBean> ozzm;
            /**
             * prods_mains_id : 284
             * tits : Avene雅漾小金刚防晒乳 30ML
             * prices_mains : 143.00
             * prices_markets : 165.00
             * updata : http://imgs.romeomart.com/publics/imgs/updatas/20160704/big/20160704171828.jpg
             */

            private List<RmtjspBean> rmtjsp;

            public static HomesBean objectFromData(String str) {

                return new Gson().fromJson(str, HomesBean.class);
            }

            public static HomesBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), HomesBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<HomesBean> arrayHomesBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<HomesBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<HomesBean> arrayHomesBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<HomesBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getLives() {
                return lives;
            }

            public void setLives(String lives) {
                this.lives = lives;
            }

            public String getYjbjp() {
                return yjbjp;
            }

            public void setYjbjp(String yjbjp) {
                this.yjbjp = yjbjp;
            }

            public String getYjhfp() {
                return yjhfp;
            }

            public void setYjhfp(String yjhfp) {
                this.yjhfp = yjhfp;
            }

            public List<AdvesBean> getAdves() {
                return adves;
            }

            public void setAdves(List<AdvesBean> adves) {
                this.adves = adves;
            }

            public List<SortsBean> getSorts() {
                return sorts;
            }

            public void setSorts(List<SortsBean> sorts) {
                this.sorts = sorts;
            }

            public List<OzcsjBean> getOzcsj() {
                return ozcsj;
            }

            public void setOzcsj(List<OzcsjBean> ozcsj) {
                this.ozcsj = ozcsj;
            }

            public List<OzyfjBean> getOzyfj() {
                return ozyfj;
            }

            public void setOzyfj(List<OzyfjBean> ozyfj) {
                this.ozyfj = ozyfj;
            }

            public List<XsgBean> getXsg() {
                return xsg;
            }

            public void setXsg(List<XsgBean> xsg) {
                this.xsg = xsg;
            }

            public List<JrxppBean> getJrxpp() {
                return jrxpp;
            }

            public void setJrxpp(List<JrxppBean> jrxpp) {
                this.jrxpp = jrxpp;
            }

            public List<OzzmBean> getOzzm() {
                return ozzm;
            }

            public void setOzzm(List<OzzmBean> ozzm) {
                this.ozzm = ozzm;
            }

            public List<RmtjspBean> getRmtjsp() {
                return rmtjsp;
            }

            public void setRmtjsp(List<RmtjspBean> rmtjsp) {
                this.rmtjsp = rmtjsp;
            }

            public static class AdvesBean {
                private String adves_id;
                private String tits;
                private String links_id;
                private String updata;

                public static AdvesBean objectFromData(String str) {

                    return new Gson().fromJson(str, AdvesBean.class);
                }

                public static AdvesBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), AdvesBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<AdvesBean> arrayAdvesBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<AdvesBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<AdvesBean> arrayAdvesBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<AdvesBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getAdves_id() {
                    return adves_id;
                }

                public void setAdves_id(String adves_id) {
                    this.adves_id = adves_id;
                }

                public String getTits() {
                    return tits;
                }

                public void setTits(String tits) {
                    this.tits = tits;
                }

                public String getLinks_id() {
                    return links_id;
                }

                public void setLinks_id(String links_id) {
                    this.links_id = links_id;
                }

                public String getUpdata() {
                    return updata;
                }

                public void setUpdata(String updata) {
                    this.updata = updata;
                }
            }

            public static class SortsBean {
                private String sorts_id;
                private String tits;
                private String logos;

                public static SortsBean objectFromData(String str) {

                    return new Gson().fromJson(str, SortsBean.class);
                }

                public static SortsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), SortsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<SortsBean> arraySortsBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<SortsBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<SortsBean> arraySortsBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<SortsBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getSorts_id() {
                    return sorts_id;
                }

                public void setSorts_id(String sorts_id) {
                    this.sorts_id = sorts_id;
                }

                public String getTits() {
                    return tits;
                }

                public void setTits(String tits) {
                    this.tits = tits;
                }

                public String getLogos() {
                    return logos;
                }

                public void setLogos(String logos) {
                    this.logos = logos;
                }
            }

            public static class OzcsjBean {
                private String prods_specials_id;
                private String tits;
                private String updata;

                public static OzcsjBean objectFromData(String str) {

                    return new Gson().fromJson(str, OzcsjBean.class);
                }

                public static OzcsjBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), OzcsjBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<OzcsjBean> arrayOzcsjBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<OzcsjBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<OzcsjBean> arrayOzcsjBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<OzcsjBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getProds_specials_id() {
                    return prods_specials_id;
                }

                public void setProds_specials_id(String prods_specials_id) {
                    this.prods_specials_id = prods_specials_id;
                }

                public String getTits() {
                    return tits;
                }

                public void setTits(String tits) {
                    this.tits = tits;
                }

                public String getUpdata() {
                    return updata;
                }

                public void setUpdata(String updata) {
                    this.updata = updata;
                }
            }

            public static class OzyfjBean {
                private String prods_specials_id;
                private String tits;
                private String updata;

                public static OzyfjBean objectFromData(String str) {

                    return new Gson().fromJson(str, OzyfjBean.class);
                }

                public static OzyfjBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), OzyfjBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<OzyfjBean> arrayOzyfjBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<OzyfjBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<OzyfjBean> arrayOzyfjBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<OzyfjBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getProds_specials_id() {
                    return prods_specials_id;
                }

                public void setProds_specials_id(String prods_specials_id) {
                    this.prods_specials_id = prods_specials_id;
                }

                public String getTits() {
                    return tits;
                }

                public void setTits(String tits) {
                    this.tits = tits;
                }

                public String getUpdata() {
                    return updata;
                }

                public void setUpdata(String updata) {
                    this.updata = updata;
                }
            }

            public static class XsgBean {
                private String prods_mains_id;
                private String tits;
                private String prices_mains;
                private String prices_markets;
                private String updata;
                private String times_starts;
                private String times_exits;

                public static XsgBean objectFromData(String str) {

                    return new Gson().fromJson(str, XsgBean.class);
                }

                public static XsgBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), XsgBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<XsgBean> arrayXsgBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<XsgBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<XsgBean> arrayXsgBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<XsgBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getProds_mains_id() {
                    return prods_mains_id;
                }

                public void setProds_mains_id(String prods_mains_id) {
                    this.prods_mains_id = prods_mains_id;
                }

                public String getTits() {
                    return tits;
                }

                public void setTits(String tits) {
                    this.tits = tits;
                }

                public String getPrices_mains() {
                    return prices_mains;
                }

                public void setPrices_mains(String prices_mains) {
                    this.prices_mains = prices_mains;
                }

                public String getPrices_markets() {
                    return prices_markets;
                }

                public void setPrices_markets(String prices_markets) {
                    this.prices_markets = prices_markets;
                }

                public String getUpdata() {
                    return updata;
                }

                public void setUpdata(String updata) {
                    this.updata = updata;
                }

                public String getTimes_starts() {
                    return times_starts;
                }

                public void setTimes_starts(String times_starts) {
                    this.times_starts = times_starts;
                }

                public String getTimes_exits() {
                    return times_exits;
                }

                public void setTimes_exits(String times_exits) {
                    this.times_exits = times_exits;
                }
            }

            public static class JrxppBean {
                private String brands_id;
                private String tits_cn;
                private String tits_en;
                private String updata;

                public static JrxppBean objectFromData(String str) {

                    return new Gson().fromJson(str, JrxppBean.class);
                }

                public static JrxppBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), JrxppBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<JrxppBean> arrayJrxppBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<JrxppBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<JrxppBean> arrayJrxppBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<JrxppBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getBrands_id() {
                    return brands_id;
                }

                public void setBrands_id(String brands_id) {
                    this.brands_id = brands_id;
                }

                public String getTits_cn() {
                    return tits_cn;
                }

                public void setTits_cn(String tits_cn) {
                    this.tits_cn = tits_cn;
                }

                public String getTits_en() {
                    return tits_en;
                }

                public void setTits_en(String tits_en) {
                    this.tits_en = tits_en;
                }

                public String getUpdata() {
                    return updata;
                }

                public void setUpdata(String updata) {
                    this.updata = updata;
                }
            }

            public static class OzzmBean {
                private String prods_specials_id;
                private String tits;
                private String imgs;

                public static OzzmBean objectFromData(String str) {

                    return new Gson().fromJson(str, OzzmBean.class);
                }

                public static OzzmBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), OzzmBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<OzzmBean> arrayOzzmBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<OzzmBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<OzzmBean> arrayOzzmBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<OzzmBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getProds_specials_id() {
                    return prods_specials_id;
                }

                public void setProds_specials_id(String prods_specials_id) {
                    this.prods_specials_id = prods_specials_id;
                }

                public String getTits() {
                    return tits;
                }

                public void setTits(String tits) {
                    this.tits = tits;
                }

                public String getImgs() {
                    return imgs;
                }

                public void setImgs(String imgs) {
                    this.imgs = imgs;
                }
            }

            public static class RmtjspBean {
                private String prods_mains_id;
                private String tits;
                private String prices_mains;
                private String prices_markets;
                private String updata;

                public static RmtjspBean objectFromData(String str) {

                    return new Gson().fromJson(str, RmtjspBean.class);
                }

                public static RmtjspBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), RmtjspBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<RmtjspBean> arrayRmtjspBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<RmtjspBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<RmtjspBean> arrayRmtjspBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<RmtjspBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getProds_mains_id() {
                    return prods_mains_id;
                }

                public void setProds_mains_id(String prods_mains_id) {
                    this.prods_mains_id = prods_mains_id;
                }

                public String getTits() {
                    return tits;
                }

                public void setTits(String tits) {
                    this.tits = tits;
                }

                public String getPrices_mains() {
                    return prices_mains;
                }

                public void setPrices_mains(String prices_mains) {
                    this.prices_mains = prices_mains;
                }

                public String getPrices_markets() {
                    return prices_markets;
                }

                public void setPrices_markets(String prices_markets) {
                    this.prices_markets = prices_markets;
                }

                public String getUpdata() {
                    return updata;
                }

                public void setUpdata(String updata) {
                    this.updata = updata;
                }
            }
        }
    }
}
