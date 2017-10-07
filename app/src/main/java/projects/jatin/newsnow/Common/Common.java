package projects.jatin.newsnow.Common;

import projects.jatin.newsnow.Interface.IconBetterIdeaService;
import projects.jatin.newsnow.Interface.NewsService;
import projects.jatin.newsnow.Remote.IconBetterIdeaClient;
import projects.jatin.newsnow.Remote.RetrofitClient;

/**
 * Created by Jateen on 07-10-2017.
 */

public class Common {

    public static final String BASE_URL="https://newsapi.org/";

    public static final String API_KEY="bfc2af4c73ba4f4989ee14db355db9a0";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }



    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }
}
