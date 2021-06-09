package com.example.schedule;



import com.alibaba.fastjson.JSON;
import com.example.entity.User;
import com.example.service.impl.UserServiceImpl;
import com.example.util.HttpRequest;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class TempSchedule {
    @Autowired
    private UserServiceImpl userServiceImpl;

    //@Scheduled(cron = "0/3 * * * * *")
    public void work(){
        System.out.println("启动就执行的定时任务！--------每十秒执行一次"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

   // @Scheduled(cron = "0/3 * * * * *")
    public void find(){
        List<User> user = userServiceImpl.selectList();
        System.out.println(user+" : " +"1111");
        System.out.println("aaaa启动就执行的定时任务！--------每十秒执行一次"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    //@Scheduled(cron = "0/3 * * * * *")
    public void findMap(){
        Map<String, Object> map = userServiceImpl.selectMap();
        System.out.println(map+" : " +"map");
        System.out.println("mapmapmap！--------每3秒执行一次"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
    //@Scheduled(cron = "0/3 * * * * *")
    public void selectListMap(){
        List<Map<String, Object>> listMap = userServiceImpl.selectListMap();
        System.out.println(listMap+" : " +"map");
        System.out.println("listMap！--------每3秒执行一次"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }


    //@Scheduled(cron = "0/3 * * * * *")
    public void insertUser(){
         userServiceImpl.insertUser();

        System.out.println("insert！--------每十秒执行一次"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    //@Scheduled(cron = "0/3 * * * * *")
    public void insertUserList(){
        userServiceImpl.insertUserList();

        System.out.println("insertList！--------每十秒执行一次"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    //@Scheduled(cron = "0/3 * * * * *")
    public void httpGet(){
        String s = HttpRequest.httpGet("http://localhost:8085/hello/a?str=158744");
        System.out.println(s + "httpGet！--------每十秒执行一次"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Scheduled(cron = "0/3 * * * * *")
    public void httpPost(){
        User user = new User();
        user.setRealName("zhangsan");
        user.setPassWord("123456");

        String s = HttpRequest.httpPost("http://localhost:8085/hello/b", JSONObject.fromObject(user).toString());
        System.out.println(JSON.parse(s)+ "----- httpPost！--------每十秒执行一次"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}

