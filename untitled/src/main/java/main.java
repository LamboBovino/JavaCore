import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class main {
    public static void main (String[] args) {
        OkHttpClient okHttpClient = new OkHttpClient();

        Request request=new Request.Builder()
                .url("https://icanhazdadjoke.com/")
                .header("Accept", "application/json" )
                .build();
        Response response = OkHttpClient.newCall(request).execute();

        System.out.println(response.body().string());
    }
}
