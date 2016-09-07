package HttpUitls;

import bean.BuyBean;
import bean.HomeBean;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by my on 2016/9/6.
 */
public interface HttpService {

    @GET("/apiapp2/homes/life2circle?appkey=&infos_pages=1&infos_rowsmax=12")
    Call<HomeBean> getHomeResult();

    @GET("/apiapp2/homes/homes?sources=sources&appkey=")
    Call<BuyBean> getBuyResult();
}
