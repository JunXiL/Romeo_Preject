package HttpUitls;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by my on 2016/9/6.
 */
public class HttpRetrofit {

    public static final String BASE_URL = "http://apiapp.romeomart.com";

    private static HttpService mHttpService;

    public static HttpService init(){
        if(mHttpService == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            mHttpService = retrofit.create(HttpService.class);
        }
        return mHttpService;
    }
}
