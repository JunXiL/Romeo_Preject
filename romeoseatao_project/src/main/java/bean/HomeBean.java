package bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by my on 2016/9/6.
 */
public class HomeBean {


    /**
     * status : 1
     * msgs : 获取成功
     * datas : {"life2circle":{"adves":[{"adves_id":"15","tits":"广告信息17","links_id":"304","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160818/big/20160818035722.jpg"},{"adves_id":"14","tits":"广告信息16","links_id":"239","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160721/big/20160721175113.jpg"},{"adves_id":"13","tits":"广告信息15","links_id":"312","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160818/big/20160818040106.jpg"},{"adves_id":"12","tits":"广告信息14","links_id":"348","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160902/big/20160902092234.jpg"},{"adves_id":"11","tits":"广告信息13","links_id":"289","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160818/big/20160818040259.jpg"},{"adves_id":"10","tits":"广告信息12","links_id":"306","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160902/big/20160902092111.jpg"},{"adves_id":"9","tits":"广告信息11","links_id":"311","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160902/big/20160902092421.jpg"}],"specials":[{"specials_id":"5","tits":"发随影动","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160630/big/20160630181621.png"},{"specials_id":"4","tits":"绅士格调","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160630/big/20160630180936.png"},{"specials_id":"3","tits":"欧洲印象","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160630/big/20160630181521.png"},{"specials_id":"2","tits":"美过时光","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160630/big/20160630181535.png"},{"specials_id":"1","tits":"悦己之容","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160630/big/20160630181549.png"}],"infosmains":[{"infos_mains_id":"352","tits":"来跳一支舞\u2014\u2014欧洲舞会舞蹈","pensters":"先晓欧洲","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160902/big/20160902091454.jpg","bewrites":"玛祖卡舞曲刚一开始，他就灵敏地跺了跺一只脚，伸出另一只脚，高大的身躯随着旋律变换着姿势，有时是轻盈平稳地滑动，有时是热烈喧闹地大声跺脚。华莲卡也随着他的舞步转动自己的身躯，那优美的身影飘忽旋转，并能及时收缩和迈开她那穿白缎鞋小脚的步子，轻盈得一点声音都没有。","onclicks":"158","keywords_arrays":["欧洲","舞会","传统舞蹈"],"countrys_tits":"奥地利","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/02x1.png","sorts_prods":[{"sorts_id":"28","tits":"香水"},{"sorts_id":"29","tits":"蜡烛"},{"sorts_id":"30","tits":"香膏"},{"sorts_id":"32","tits":"香水"},{"sorts_id":"33","tits":"除汗棒"},{"sorts_id":"37","tits":"卸妆/洁面"},{"sorts_id":"48","tits":"全身"}],"nums_onclickslikes":"0","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"349","tits":"法国厨艺守护者","pensters":"林嘎啦","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160902/big/20160902085654.jpg","bewrites":"蓝带国际学院被公认为是法国厨艺的守护者，通过其料理课程，继续保持和传承对美食的驾驭和对厨艺的欣赏，已经成为超过500年的法国美食料理的基石。","onclicks":"762","keywords_arrays":["法国","校园","蓝带"],"countrys_tits":"法国","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/05x1.png","sorts_prods":[{"sorts_id":"28","tits":"香水"},{"sorts_id":"32","tits":"香水"},{"sorts_id":"37","tits":"卸妆/洁面"},{"sorts_id":"38","tits":"化妆水、爽肤水"},{"sorts_id":"39","tits":"乳液"},{"sorts_id":"40","tits":"精华"},{"sorts_id":"48","tits":"全身"},{"sorts_id":"70","tits":"沐浴"},{"sorts_id":"71","tits":"口腔护理"},{"sorts_id":"75","tits":"厨房清洁"},{"sorts_id":"95","tits":"锅具 刀具"}],"nums_onclickslikes":"0","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"350","tits":"小谈法国葡萄酒的土壤主义","pensters":"STACEY GIBSON","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160902/big/20160902085602.jpg","bewrites":"大概与中国人的安土重迁风水崇拜有异曲同工之妙。欧洲人将这种理念运用到葡萄酒里，便成就了今天包括法国在内的对葡萄酒工业形成了特有的土壤主义情结。","onclicks":"697","keywords_arrays":["法国","葡萄酒","文化","历史"],"countrys_tits":"法国","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/05x1.png","sorts_prods":[{"sorts_id":"48","tits":"全身"},{"sorts_id":"49","tits":"手足护理"},{"sorts_id":"50","tits":"磨砂膏"},{"sorts_id":"51","tits":"日常防晒"}],"nums_onclickslikes":"0","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"348","tits":"记录我在米兰学时装的日子，大龄女青年留学日记","pensters":"左拥船长右抱豪斯","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102549.jpg","bewrites":"不知不觉来米兰也一个月了，有时候大清早在地铁上也会自己问自己，怎么突然就在25岁高龄跑到这里来读这个自己完全不了解的专业，想想人生真的很神奇，怎么规划都没有用，总是有太多无法控制的事情。","onclicks":"472","keywords_arrays":["米兰","留学","日常"],"countrys_tits":"意大利","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/08x1.png","sorts_prods":[{"sorts_id":"41","tits":"面霜"},{"sorts_id":"42","tits":"眼霜"},{"sorts_id":"43","tits":"唇膏"},{"sorts_id":"44","tits":"面膜"}],"nums_onclickslikes":"2","nums_critiques":"3","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"347","tits":"在布鲁塞尔的\u201c伪\u201d文艺生活","pensters":"phoebecwf","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102614.jpg","bewrites":"第一次在欧洲生活三个月，就竟然在布鲁塞尔找到一间住着三个文艺女孩的单位，对我而言，这个确实是间\u201c文艺女私窦\u201d 。","onclicks":"680","keywords_arrays":["比利时","布鲁塞尔","留学","日常"],"countrys_tits":"比利时","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/03x1.png","sorts_prods":[{"sorts_id":"54","tits":"隔离/妆前乳/遮瑕"},{"sorts_id":"55","tits":"BB霜/CC霜"},{"sorts_id":"56","tits":"粉底液"}],"nums_onclickslikes":"2","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"346","tits":"奧地利，老太太溫暖的小衣袋","pensters":"倪端幸福生活讲堂","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102637.jpg","bewrites":"在追逐热气球的半突中，被外观由钢铁锻造的设计小屋给吸引了\u2026遇见一位老妈妈，她朝我走来，用德语问:\u201c\u2026是不是跟着热气球来的？\u201d看我对门上镶有 『 Kunstschmiede』的铁工场有兴趣，便硬邀我进去看看。老妈妈说 ：『你喜欢吗？我带你进去\u2026..没关系，那是我儿子的设计工厂\u2026.』","onclicks":"794","keywords_arrays":["奥地利","居民","手工"],"countrys_tits":"奥地利","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/02x1.png","sorts_prods":[{"sorts_id":"54","tits":"隔离/妆前乳/遮瑕"},{"sorts_id":"55","tits":"BB霜/CC霜"},{"sorts_id":"56","tits":"粉底液"},{"sorts_id":"57","tits":"粉饼"},{"sorts_id":"58","tits":"散粉"}],"nums_onclickslikes":"1","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"344","tits":"玩转雷克雅维克：六大必做之事","pensters":"Xiaochen Tian","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102706.jpg","bewrites":"冰岛首都雷克雅未克是世界上最北的首都。这里可玩的东西很多，以下是给大家的六大推荐。","onclicks":"261","keywords_arrays":["冰岛","雷克雅未克","风景"],"countrys_tits":"冰岛","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/24x1.png","sorts_prods":[{"sorts_id":"48","tits":"全身"},{"sorts_id":"49","tits":"手足护理"},{"sorts_id":"50","tits":"磨砂膏"},{"sorts_id":"51","tits":"日常防晒"}],"nums_onclickslikes":"1","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"342","tits":"爱情雅座，谁来入座？","pensters":"Ruth","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826092109.jpg","bewrites":"有些人注意到丹麦哥本哈根市最近的一项创举，即是在一百多台的公车上，设置了所谓的\u201c爱情雅座\u201d！","onclicks":"959","keywords_arrays":["丹麦","公交","爱情"],"countrys_tits":"丹麦","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/22x1.png","sorts_prods":[{"sorts_id":"60","tits":"眼线/眉笔"},{"sorts_id":"61","tits":"眼影"},{"sorts_id":"62","tits":"腮红"},{"sorts_id":"63","tits":"口红/唇彩"},{"sorts_id":"65","tits":"定妆"},{"sorts_id":"66","tits":"工具"}],"nums_onclickslikes":"0","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"341","tits":"聚欢庆北欧人夏日的美好时光－仲夏节","pensters":"Jack生活隨想","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160830/big/20160830091958.jpg","bewrites":"仲夏节是日照最长的一天，当仲夏节过后便是迎接温暖的时节，对于靠近北极圈的北欧国家来说冬天会有很长一段时间垄罩在黑暗之中，因此夏季的阳光显得格外珍贵，当然要大肆庆祝一番。","onclicks":"990","keywords_arrays":["北欧","仲夏节","节庆"],"countrys_tits":"芬兰","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/04x1.png","sorts_prods":[{"sorts_id":"37","tits":"卸妆/洁面"},{"sorts_id":"38","tits":"化妆水、爽肤水"},{"sorts_id":"39","tits":"乳液"},{"sorts_id":"40","tits":"精华"},{"sorts_id":"48","tits":"全身"},{"sorts_id":"49","tits":"手足护理"}],"nums_onclickslikes":"0","nums_critiques":"1","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"340","tits":"芬兰生活中的日常饮食","pensters":"Popo ","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102759.jpg","bewrites":"这个在北方寒带地区的国度，却世世代代地延续着他们来自森林、湖泊、田园、海洋中，最原始而传统的风味。","onclicks":"327","keywords_arrays":["芬兰","食物","传统","北欧"],"countrys_tits":"芬兰","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/04x1.png","sorts_prods":[{"sorts_id":"60","tits":"眼线/眉笔"},{"sorts_id":"61","tits":"眼影"},{"sorts_id":"62","tits":"腮红"},{"sorts_id":"63","tits":"口红/唇彩"}],"nums_onclickslikes":"0","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"339","tits":"Life in Exeter, 日常小记","pensters":"米粒大不列顛生活记","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102823.jpg","bewrites":"来到这边没有特别想念什么，除了家人，就是前三天想到会有点想哭，之前空运过来的包裹里面都是粮食 所以也不会吃不习惯。","onclicks":"519","keywords_arrays":["英国","留学","食物","日常"],"countrys_tits":"英国","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/01x1.png","sorts_prods":[{"sorts_id":"37","tits":"卸妆/洁面"},{"sorts_id":"38","tits":"化妆水、爽肤水"},{"sorts_id":"39","tits":"乳液"},{"sorts_id":"40","tits":"精华"},{"sorts_id":"41","tits":"面霜"},{"sorts_id":"42","tits":"眼霜"}],"nums_onclickslikes":"1","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"332","tits":"我认识的欧洲生活","pensters":"林佑学","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826103953.jpg","bewrites":"西班牙好友Jimena马德里的家，我们在那里度过了非常缓慢美好的欧式生活。在欧洲住久了，生活习惯多少开始有点欧化。","onclicks":"501","keywords_arrays":["欧洲生活","饮食","日常"],"countrys_tits":"丹麦","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/22x1.png","sorts_prods":[{"sorts_id":"86","tits":"调节三高"},{"sorts_id":"87","tits":"关节养护"},{"sorts_id":"88","tits":"心脑保健"},{"sorts_id":"89","tits":"改善睡眠"},{"sorts_id":"90","tits":"保护视力"},{"sorts_id":"91","tits":"防脱发"}],"nums_onclickslikes":"1","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"}]}}
     */

    private int status;
    private String msgs;
    /**
     * life2circle : {"adves":[{"adves_id":"15","tits":"广告信息17","links_id":"304","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160818/big/20160818035722.jpg"},{"adves_id":"14","tits":"广告信息16","links_id":"239","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160721/big/20160721175113.jpg"},{"adves_id":"13","tits":"广告信息15","links_id":"312","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160818/big/20160818040106.jpg"},{"adves_id":"12","tits":"广告信息14","links_id":"348","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160902/big/20160902092234.jpg"},{"adves_id":"11","tits":"广告信息13","links_id":"289","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160818/big/20160818040259.jpg"},{"adves_id":"10","tits":"广告信息12","links_id":"306","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160902/big/20160902092111.jpg"},{"adves_id":"9","tits":"广告信息11","links_id":"311","updata":"http://imgs.romeomart.com/publics/imgs/adves/20160902/big/20160902092421.jpg"}],"specials":[{"specials_id":"5","tits":"发随影动","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160630/big/20160630181621.png"},{"specials_id":"4","tits":"绅士格调","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160630/big/20160630180936.png"},{"specials_id":"3","tits":"欧洲印象","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160630/big/20160630181521.png"},{"specials_id":"2","tits":"美过时光","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160630/big/20160630181535.png"},{"specials_id":"1","tits":"悦己之容","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160630/big/20160630181549.png"}],"infosmains":[{"infos_mains_id":"352","tits":"来跳一支舞\u2014\u2014欧洲舞会舞蹈","pensters":"先晓欧洲","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160902/big/20160902091454.jpg","bewrites":"玛祖卡舞曲刚一开始，他就灵敏地跺了跺一只脚，伸出另一只脚，高大的身躯随着旋律变换着姿势，有时是轻盈平稳地滑动，有时是热烈喧闹地大声跺脚。华莲卡也随着他的舞步转动自己的身躯，那优美的身影飘忽旋转，并能及时收缩和迈开她那穿白缎鞋小脚的步子，轻盈得一点声音都没有。","onclicks":"158","keywords_arrays":["欧洲","舞会","传统舞蹈"],"countrys_tits":"奥地利","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/02x1.png","sorts_prods":[{"sorts_id":"28","tits":"香水"},{"sorts_id":"29","tits":"蜡烛"},{"sorts_id":"30","tits":"香膏"},{"sorts_id":"32","tits":"香水"},{"sorts_id":"33","tits":"除汗棒"},{"sorts_id":"37","tits":"卸妆/洁面"},{"sorts_id":"48","tits":"全身"}],"nums_onclickslikes":"0","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"349","tits":"法国厨艺守护者","pensters":"林嘎啦","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160902/big/20160902085654.jpg","bewrites":"蓝带国际学院被公认为是法国厨艺的守护者，通过其料理课程，继续保持和传承对美食的驾驭和对厨艺的欣赏，已经成为超过500年的法国美食料理的基石。","onclicks":"762","keywords_arrays":["法国","校园","蓝带"],"countrys_tits":"法国","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/05x1.png","sorts_prods":[{"sorts_id":"28","tits":"香水"},{"sorts_id":"32","tits":"香水"},{"sorts_id":"37","tits":"卸妆/洁面"},{"sorts_id":"38","tits":"化妆水、爽肤水"},{"sorts_id":"39","tits":"乳液"},{"sorts_id":"40","tits":"精华"},{"sorts_id":"48","tits":"全身"},{"sorts_id":"70","tits":"沐浴"},{"sorts_id":"71","tits":"口腔护理"},{"sorts_id":"75","tits":"厨房清洁"},{"sorts_id":"95","tits":"锅具 刀具"}],"nums_onclickslikes":"0","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"350","tits":"小谈法国葡萄酒的土壤主义","pensters":"STACEY GIBSON","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160902/big/20160902085602.jpg","bewrites":"大概与中国人的安土重迁风水崇拜有异曲同工之妙。欧洲人将这种理念运用到葡萄酒里，便成就了今天包括法国在内的对葡萄酒工业形成了特有的土壤主义情结。","onclicks":"697","keywords_arrays":["法国","葡萄酒","文化","历史"],"countrys_tits":"法国","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/05x1.png","sorts_prods":[{"sorts_id":"48","tits":"全身"},{"sorts_id":"49","tits":"手足护理"},{"sorts_id":"50","tits":"磨砂膏"},{"sorts_id":"51","tits":"日常防晒"}],"nums_onclickslikes":"0","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"348","tits":"记录我在米兰学时装的日子，大龄女青年留学日记","pensters":"左拥船长右抱豪斯","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102549.jpg","bewrites":"不知不觉来米兰也一个月了，有时候大清早在地铁上也会自己问自己，怎么突然就在25岁高龄跑到这里来读这个自己完全不了解的专业，想想人生真的很神奇，怎么规划都没有用，总是有太多无法控制的事情。","onclicks":"472","keywords_arrays":["米兰","留学","日常"],"countrys_tits":"意大利","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/08x1.png","sorts_prods":[{"sorts_id":"41","tits":"面霜"},{"sorts_id":"42","tits":"眼霜"},{"sorts_id":"43","tits":"唇膏"},{"sorts_id":"44","tits":"面膜"}],"nums_onclickslikes":"2","nums_critiques":"3","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"347","tits":"在布鲁塞尔的\u201c伪\u201d文艺生活","pensters":"phoebecwf","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102614.jpg","bewrites":"第一次在欧洲生活三个月，就竟然在布鲁塞尔找到一间住着三个文艺女孩的单位，对我而言，这个确实是间\u201c文艺女私窦\u201d 。","onclicks":"680","keywords_arrays":["比利时","布鲁塞尔","留学","日常"],"countrys_tits":"比利时","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/03x1.png","sorts_prods":[{"sorts_id":"54","tits":"隔离/妆前乳/遮瑕"},{"sorts_id":"55","tits":"BB霜/CC霜"},{"sorts_id":"56","tits":"粉底液"}],"nums_onclickslikes":"2","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"346","tits":"奧地利，老太太溫暖的小衣袋","pensters":"倪端幸福生活讲堂","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102637.jpg","bewrites":"在追逐热气球的半突中，被外观由钢铁锻造的设计小屋给吸引了\u2026遇见一位老妈妈，她朝我走来，用德语问:\u201c\u2026是不是跟着热气球来的？\u201d看我对门上镶有 『 Kunstschmiede』的铁工场有兴趣，便硬邀我进去看看。老妈妈说 ：『你喜欢吗？我带你进去\u2026..没关系，那是我儿子的设计工厂\u2026.』","onclicks":"794","keywords_arrays":["奥地利","居民","手工"],"countrys_tits":"奥地利","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/02x1.png","sorts_prods":[{"sorts_id":"54","tits":"隔离/妆前乳/遮瑕"},{"sorts_id":"55","tits":"BB霜/CC霜"},{"sorts_id":"56","tits":"粉底液"},{"sorts_id":"57","tits":"粉饼"},{"sorts_id":"58","tits":"散粉"}],"nums_onclickslikes":"1","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"344","tits":"玩转雷克雅维克：六大必做之事","pensters":"Xiaochen Tian","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102706.jpg","bewrites":"冰岛首都雷克雅未克是世界上最北的首都。这里可玩的东西很多，以下是给大家的六大推荐。","onclicks":"261","keywords_arrays":["冰岛","雷克雅未克","风景"],"countrys_tits":"冰岛","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/24x1.png","sorts_prods":[{"sorts_id":"48","tits":"全身"},{"sorts_id":"49","tits":"手足护理"},{"sorts_id":"50","tits":"磨砂膏"},{"sorts_id":"51","tits":"日常防晒"}],"nums_onclickslikes":"1","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"342","tits":"爱情雅座，谁来入座？","pensters":"Ruth","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826092109.jpg","bewrites":"有些人注意到丹麦哥本哈根市最近的一项创举，即是在一百多台的公车上，设置了所谓的\u201c爱情雅座\u201d！","onclicks":"959","keywords_arrays":["丹麦","公交","爱情"],"countrys_tits":"丹麦","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/22x1.png","sorts_prods":[{"sorts_id":"60","tits":"眼线/眉笔"},{"sorts_id":"61","tits":"眼影"},{"sorts_id":"62","tits":"腮红"},{"sorts_id":"63","tits":"口红/唇彩"},{"sorts_id":"65","tits":"定妆"},{"sorts_id":"66","tits":"工具"}],"nums_onclickslikes":"0","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"341","tits":"聚欢庆北欧人夏日的美好时光－仲夏节","pensters":"Jack生活隨想","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160830/big/20160830091958.jpg","bewrites":"仲夏节是日照最长的一天，当仲夏节过后便是迎接温暖的时节，对于靠近北极圈的北欧国家来说冬天会有很长一段时间垄罩在黑暗之中，因此夏季的阳光显得格外珍贵，当然要大肆庆祝一番。","onclicks":"990","keywords_arrays":["北欧","仲夏节","节庆"],"countrys_tits":"芬兰","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/04x1.png","sorts_prods":[{"sorts_id":"37","tits":"卸妆/洁面"},{"sorts_id":"38","tits":"化妆水、爽肤水"},{"sorts_id":"39","tits":"乳液"},{"sorts_id":"40","tits":"精华"},{"sorts_id":"48","tits":"全身"},{"sorts_id":"49","tits":"手足护理"}],"nums_onclickslikes":"0","nums_critiques":"1","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"340","tits":"芬兰生活中的日常饮食","pensters":"Popo ","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102759.jpg","bewrites":"这个在北方寒带地区的国度，却世世代代地延续着他们来自森林、湖泊、田园、海洋中，最原始而传统的风味。","onclicks":"327","keywords_arrays":["芬兰","食物","传统","北欧"],"countrys_tits":"芬兰","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/04x1.png","sorts_prods":[{"sorts_id":"60","tits":"眼线/眉笔"},{"sorts_id":"61","tits":"眼影"},{"sorts_id":"62","tits":"腮红"},{"sorts_id":"63","tits":"口红/唇彩"}],"nums_onclickslikes":"0","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"339","tits":"Life in Exeter, 日常小记","pensters":"米粒大不列顛生活记","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826102823.jpg","bewrites":"来到这边没有特别想念什么，除了家人，就是前三天想到会有点想哭，之前空运过来的包裹里面都是粮食 所以也不会吃不习惯。","onclicks":"519","keywords_arrays":["英国","留学","食物","日常"],"countrys_tits":"英国","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/01x1.png","sorts_prods":[{"sorts_id":"37","tits":"卸妆/洁面"},{"sorts_id":"38","tits":"化妆水、爽肤水"},{"sorts_id":"39","tits":"乳液"},{"sorts_id":"40","tits":"精华"},{"sorts_id":"41","tits":"面霜"},{"sorts_id":"42","tits":"眼霜"}],"nums_onclickslikes":"1","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"},{"infos_mains_id":"332","tits":"我认识的欧洲生活","pensters":"林佑学","updata":"http://imgs.romeomart.com/publics/imgs/updatas/20160826/big/20160826103953.jpg","bewrites":"西班牙好友Jimena马德里的家，我们在那里度过了非常缓慢美好的欧式生活。在欧洲住久了，生活习惯多少开始有点欧化。","onclicks":"501","keywords_arrays":["欧洲生活","饮食","日常"],"countrys_tits":"丹麦","countrys_icos":"http://apiapp.romeomart.com/publics/imgs/icos_countrys/22x1.png","sorts_prods":[{"sorts_id":"86","tits":"调节三高"},{"sorts_id":"87","tits":"关节养护"},{"sorts_id":"88","tits":"心脑保健"},{"sorts_id":"89","tits":"改善睡眠"},{"sorts_id":"90","tits":"保护视力"},{"sorts_id":"91","tits":"防脱发"}],"nums_onclickslikes":"1","nums_critiques":"0","is_onclickslikes":"0","is_favorites":"0"}]}
     */

    private DatasBean datas;

    public static HomeBean objectFromData(String str) {

        return new Gson().fromJson(str, HomeBean.class);
    }

    public static HomeBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), HomeBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<HomeBean> arrayHomeBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<HomeBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<HomeBean> arrayHomeBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<HomeBean>>() {
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
        private Life2circleBean life2circle;

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

        public Life2circleBean getLife2circle() {
            return life2circle;
        }

        public void setLife2circle(Life2circleBean life2circle) {
            this.life2circle = life2circle;
        }

        public static class Life2circleBean {
            /**
             * adves_id : 15
             * tits : 广告信息17
             * links_id : 304
             * updata : http://imgs.romeomart.com/publics/imgs/adves/20160818/big/20160818035722.jpg
             */

            private List<AdvesBean> adves;
            /**
             * specials_id : 5
             * tits : 发随影动
             * updata : http://imgs.romeomart.com/publics/imgs/updatas/20160630/big/20160630181621.png
             */

            private List<SpecialsBean> specials;
            /**
             * infos_mains_id : 352
             * tits : 来跳一支舞——欧洲舞会舞蹈
             * pensters : 先晓欧洲
             * updata : http://imgs.romeomart.com/publics/imgs/updatas/20160902/big/20160902091454.jpg
             * bewrites : 玛祖卡舞曲刚一开始，他就灵敏地跺了跺一只脚，伸出另一只脚，高大的身躯随着旋律变换着姿势，有时是轻盈平稳地滑动，有时是热烈喧闹地大声跺脚。华莲卡也随着他的舞步转动自己的身躯，那优美的身影飘忽旋转，并能及时收缩和迈开她那穿白缎鞋小脚的步子，轻盈得一点声音都没有。
             * onclicks : 158
             * keywords_arrays : ["欧洲","舞会","传统舞蹈"]
             * countrys_tits : 奥地利
             * countrys_icos : http://apiapp.romeomart.com/publics/imgs/icos_countrys/02x1.png
             * sorts_prods : [{"sorts_id":"28","tits":"香水"},{"sorts_id":"29","tits":"蜡烛"},{"sorts_id":"30","tits":"香膏"},{"sorts_id":"32","tits":"香水"},{"sorts_id":"33","tits":"除汗棒"},{"sorts_id":"37","tits":"卸妆/洁面"},{"sorts_id":"48","tits":"全身"}]
             * nums_onclickslikes : 0
             * nums_critiques : 0
             * is_onclickslikes : 0
             * is_favorites : 0
             */

            private List<InfosmainsBean> infosmains;

            public static Life2circleBean objectFromData(String str) {

                return new Gson().fromJson(str, Life2circleBean.class);
            }

            public static Life2circleBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), Life2circleBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<Life2circleBean> arrayLife2circleBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<Life2circleBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<Life2circleBean> arrayLife2circleBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<Life2circleBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public List<AdvesBean> getAdves() {
                return adves;
            }

            public void setAdves(List<AdvesBean> adves) {
                this.adves = adves;
            }

            public List<SpecialsBean> getSpecials() {
                return specials;
            }

            public void setSpecials(List<SpecialsBean> specials) {
                this.specials = specials;
            }

            public List<InfosmainsBean> getInfosmains() {
                return infosmains;
            }

            public void setInfosmains(List<InfosmainsBean> infosmains) {
                this.infosmains = infosmains;
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

            public static class SpecialsBean {
                private String specials_id;
                private String tits;
                private String updata;

                public static SpecialsBean objectFromData(String str) {

                    return new Gson().fromJson(str, SpecialsBean.class);
                }

                public static SpecialsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), SpecialsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<SpecialsBean> arraySpecialsBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<SpecialsBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<SpecialsBean> arraySpecialsBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<SpecialsBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getSpecials_id() {
                    return specials_id;
                }

                public void setSpecials_id(String specials_id) {
                    this.specials_id = specials_id;
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

            public static class InfosmainsBean {
                private String infos_mains_id;
                private String tits;
                private String pensters;
                private String updata;
                private String bewrites;
                private String onclicks;
                private String countrys_tits;
                private String countrys_icos;
                private String nums_onclickslikes;
                private String nums_critiques;
                private String is_onclickslikes;
                private String is_favorites;
                private List<String> keywords_arrays;
                /**
                 * sorts_id : 28
                 * tits : 香水
                 */

                private List<SortsProdsBean> sorts_prods;

                public static InfosmainsBean objectFromData(String str) {

                    return new Gson().fromJson(str, InfosmainsBean.class);
                }

                public static InfosmainsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), InfosmainsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<InfosmainsBean> arrayInfosmainsBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<InfosmainsBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<InfosmainsBean> arrayInfosmainsBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<InfosmainsBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public String getInfos_mains_id() {
                    return infos_mains_id;
                }

                public void setInfos_mains_id(String infos_mains_id) {
                    this.infos_mains_id = infos_mains_id;
                }

                public String getTits() {
                    return tits;
                }

                public void setTits(String tits) {
                    this.tits = tits;
                }

                public String getPensters() {
                    return pensters;
                }

                public void setPensters(String pensters) {
                    this.pensters = pensters;
                }

                public String getUpdata() {
                    return updata;
                }

                public void setUpdata(String updata) {
                    this.updata = updata;
                }

                public String getBewrites() {
                    return bewrites;
                }

                public void setBewrites(String bewrites) {
                    this.bewrites = bewrites;
                }

                public String getOnclicks() {
                    return onclicks;
                }

                public void setOnclicks(String onclicks) {
                    this.onclicks = onclicks;
                }

                public String getCountrys_tits() {
                    return countrys_tits;
                }

                public void setCountrys_tits(String countrys_tits) {
                    this.countrys_tits = countrys_tits;
                }

                public String getCountrys_icos() {
                    return countrys_icos;
                }

                public void setCountrys_icos(String countrys_icos) {
                    this.countrys_icos = countrys_icos;
                }

                public String getNums_onclickslikes() {
                    return nums_onclickslikes;
                }

                public void setNums_onclickslikes(String nums_onclickslikes) {
                    this.nums_onclickslikes = nums_onclickslikes;
                }

                public String getNums_critiques() {
                    return nums_critiques;
                }

                public void setNums_critiques(String nums_critiques) {
                    this.nums_critiques = nums_critiques;
                }

                public String getIs_onclickslikes() {
                    return is_onclickslikes;
                }

                public void setIs_onclickslikes(String is_onclickslikes) {
                    this.is_onclickslikes = is_onclickslikes;
                }

                public String getIs_favorites() {
                    return is_favorites;
                }

                public void setIs_favorites(String is_favorites) {
                    this.is_favorites = is_favorites;
                }

                public List<String> getKeywords_arrays() {
                    return keywords_arrays;
                }

                public void setKeywords_arrays(List<String> keywords_arrays) {
                    this.keywords_arrays = keywords_arrays;
                }

                public List<SortsProdsBean> getSorts_prods() {
                    return sorts_prods;
                }

                public void setSorts_prods(List<SortsProdsBean> sorts_prods) {
                    this.sorts_prods = sorts_prods;
                }

                public static class SortsProdsBean {
                    private String sorts_id;
                    private String tits;

                    public static SortsProdsBean objectFromData(String str) {

                        return new Gson().fromJson(str, SortsProdsBean.class);
                    }

                    public static SortsProdsBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), SortsProdsBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public static List<SortsProdsBean> arraySortsProdsBeanFromData(String str) {

                        Type listType = new TypeToken<ArrayList<SortsProdsBean>>() {
                        }.getType();

                        return new Gson().fromJson(str, listType);
                    }

                    public static List<SortsProdsBean> arraySortsProdsBeanFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);
                            Type listType = new TypeToken<ArrayList<SortsProdsBean>>() {
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
                }
            }
        }
    }
}
