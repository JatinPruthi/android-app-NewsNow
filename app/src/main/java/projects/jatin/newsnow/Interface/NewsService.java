package projects.jatin.newsnow.Interface;

import projects.jatin.newsnow.Model.Website;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Jateen on 07-10-2017.
 */

public interface NewsService {

    @GET("v1/sources?language=en")
    Call<Website> getSources();

}
