import com.collection.CollectClient;

/**
 * Created by perfection on 16-2-24.
 */
public class Test {
    public static void main(String args) {
        CollectClient.createAndroidData("http://192.168.1.32:27017", "pageBelong", "localPage", "city", 0, "phoneType",
                "btnNumber", "srData", "neData", "coData", "appVersion",
                "cmData", true, "sessionKey", "uuid", "phoneVersion",
                "ip", "lng", "0", "0", "age", "education", "industry");
    }
}
