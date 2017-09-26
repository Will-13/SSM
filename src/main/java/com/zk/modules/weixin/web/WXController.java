package com.zk.modules.weixin.web;

import com.zk.common.config.Global;
import com.zk.modules.weixin.entity.AccessToken;
import com.zk.modules.weixin.service.WXService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by zk on 2017/6/5.
 */
@Controller
@RequestMapping("/api/wx")
public class WXController {
    private static final String WEIXIN_TOKEN = Global.getConfig("WEIXIN_TOKEN");
    private static final String WEIXIN_APPID = Global.getConfig("WEIXIN_APPID");
    private static final String WEIXIN_APPSECRET = Global.getConfig("WEIXIN_APPSECRET");

    @Autowired
    private WXService wxService;

    @RequestMapping(value = "reply", method = RequestMethod.GET)
    public void reply(HttpServletRequest request, HttpServletResponse response, String signature,
                         String timestamp, String nonce, String echostr) throws ServletException, IOException {
        if (wxService.checkSignature(signature, WEIXIN_TOKEN, timestamp, nonce)){
            PrintWriter out = response.getWriter();
            out.print(echostr);
        }
    }

    @RequestMapping(value = "updatAccessToken")
    public void updateAccessToken() {
        AccessToken token = new AccessToken();
        // 访问微信服务器
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + WEIXIN_APPID +
                "&secret=" + WEIXIN_APPSECRET;
        try {
            URL getUrl=new URL(url);
            HttpURLConnection http=(HttpURLConnection)getUrl.openConnection();
            http.setRequestMethod("GET");
            http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            http.setDoOutput(true);
            http.setDoInput(true);

            http.connect();
            InputStream is = http.getInputStream();
            int size = is.available();
            byte[] b = new byte[size];
            is.read(b);

            String message = new String(b, "UTF-8");

            JSONObject json = JSONObject.fromObject(message);

            token.setAccessToken(json.getString("access_token"));
            token.setExpiresIn(new Long(json.getString("expires_in")));

            wxService.updateAccessToken(token);
            System.out.println(token);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
