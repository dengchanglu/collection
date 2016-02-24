package com.collection;

import com.httpclient.HttpClient;

/**
 * Created by perfection on 16-2-24.
 */
public class CollectClient {
    /**
     * @param sendUrl      发送地址
     * @param pageBelong   来源页面数据
     * @param localPage    当前页面数据
     * @param city         城市数据
     * @param time         时间数据
     * @param phoneType    手机型号数据
     * @param btnNumber    按钮编号数据
     * @param srData       手机屏幕分辨率型号数据
     * @param neData       网络环境数据
     * @param coData       运营商数据
     * @param appVersion   app版本数据
     * @param cmData       渠道标记数据
     * @param isStart      是否为启动
     * @param sessionKey   会话用户key
     * @param uuid         设备唯一标识
     * @param phoneVersion 手机系统版本信息
     * @param ip           IP地址数据
     * @param lng          地理位置信息：维度
     * @param lat          地理位置信息：经度
     * @param sex          性别数据
     * @param age          年龄
     * @param education    学历数据
     * @param industry     职业数据
     * @return 返回发送状态码
     */
    public static Integer createAndroidData(String sendUrl, String pageBelong, String localPage, String city, long time, String phoneType,
                                            String btnNumber, String srData, String neData, String coData, String appVersion,
                                            String cmData, boolean isStart, String sessionKey, String uuid, String phoneVersion,
                                            String ip, String lng, String lat, String sex, String age, String education, String industry) {
        Integer status = 200;
        Integer isStart_num = 0;
        String ageRange = "-";
        if (isStart) {
            isStart_num = 1;
        }
        if (pageBelong == null) {
            pageBelong = "-";
        }
        if (localPage == null) {
            localPage = "-";
        }
        if (city == null) {
            city = "-";
        }
        if (phoneType == null) {
            phoneType = "-";
        }
        if (btnNumber == null) {
            btnNumber = "-";
        }
        if (srData == null) {
            srData = "-";
        }
        if (neData == null) {
            neData = "-";
        }
        if (coData == null) {
            coData = "-";
        }
        if (appVersion == null) {
            appVersion = "-";
        }
        if (cmData == null) {
            cmData = "-";
        }
        if (sessionKey == null) {
            sessionKey = "-";
        }
        if (uuid == null) {
            uuid = "-";
        }
        if (phoneVersion == null) {
            phoneVersion = "-";
        }
        if (ip == null) {
            ip = "-";
        }
        if (lng == null) {
            lng = "-";
        }
        if (lat == null) {
            lat = "-";
        }
        if (age == null) {
            ageRange = "-";
        } else if (Integer.parseInt(age) <= 17) {
            ageRange = "0-17";
        } else if (Integer.parseInt(age) <= 24 && Integer.parseInt(age) >= 18) {
            ageRange = "18-24";
        } else if (Integer.parseInt(age) <= 29 && Integer.parseInt(age) >= 25) {
            ageRange = "25-29";
        } else if (Integer.parseInt(age) <= 34 && Integer.parseInt(age) >= 30) {
            ageRange = "30-34";
        } else if (Integer.parseInt(age) <= 39 && Integer.parseInt(age) >= 35) {
            ageRange = "35-39";
        } else {
            ageRange = ">=40";
        }
        if (education == null) {
            education = "-";
        }
        if (industry == null) {
            industry = "-";
        }
        String param = "";
        param = "ip=" + ip//IP地址数据
                + "&lng=" + lng//地理位置信息：维度
                + "&lat=" + lat//地理位置信息：经度
                + "&city=" + city//城市数据
                + "&time=" + time//时间数据
                + "&pnoneversion=" + phoneVersion//版本信息
                + "&phoneType=" + phoneType//手机型号数据
                + "&locPage=" + localPage//当前页面数据
                + "&btn=" + btnNumber//按钮编号数据
                + "&sr=" + srData//手机屏幕分辨率型号数据
                + "&ne=" + neData //网络环境数据
                + "&co=" + coData //运营商数据
                + "&av=" + appVersion//app版本数据
                + "&cm=" + cmData//渠道标记数据
                + "&sex=" + sex//性别数据
                + "&ar=" + ageRange//年龄范围数据
                + "&edu=" + education//学历数据
                + "&ind=" + industry //行业数据
                + "&bp=" + pageBelong//来源页面数据
                + "&is=" + isStart_num//是否为启动用户
                + "&sessionkey=" + sessionKey //会话用户key
                + "&uuid=" + uuid//会话用户key
        ;
        if (HttpClient.get(sendUrl, param) == "OK") {
            return 200;
        } else {
            return 500;
        }
    }
}
