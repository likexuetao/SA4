package Client;



import java.util.List;
import java.util.Scanner;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class WeatherWSClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建一个WeatherWS工厂
        WeatherWS factory = new WeatherWS();
        //根据工厂创建一个WeatherWSSoap对象
        WeatherWSSoap weatherWSSoap = factory.getWeatherWSSoap();
        //调用WebService提供的getWeather方法获取南宁市的天气预报情况

        //输入城市

        System.out.println("请输入查询的城市");
        String city = sc.next();

        ArrayOfString weatherInfo = weatherWSSoap.getWeather(city, null);
        List<String> lstWeatherInfo = weatherInfo.getString();
        //遍历天气预报信息
        for (String string : lstWeatherInfo) {
            System.out.println(string);
            System.out.println("------------------------");
        }
    }
}