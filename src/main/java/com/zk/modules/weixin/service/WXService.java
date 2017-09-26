package com.zk.modules.weixin.service;

import com.zk.common.persistence.BaseDao;
import com.zk.common.persistence.BaseService;
import com.zk.common.utils.SHA1;
import com.zk.modules.user.entity.User;
import com.zk.modules.weixin.dao.WXDao;
import com.zk.modules.weixin.entity.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zk on 2017/6/5.
 */
@Service
public class WXService implements BaseService<AccessToken> {
    @Autowired
    private WXDao wxDao;

    @Override
    public AccessToken getByPrimaryKey() {
        return null;
    }

    @Override
    public List<AccessToken> getList() {
        return null;
    }

    /**
     * 检查签名
     * @param signature
     * @param token
     * @param timestamp
     * @param nonce
     * @return
     */
    public boolean checkSignature(String signature, String token, String timestamp, String nonce){
        String[] arr = new String[]{token, timestamp, nonce};
        Arrays.sort(arr);

        StringBuffer sb = new StringBuffer();
        for (int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }

        String temp = SHA1.getSha1(sb.toString());

        return signature.equals(temp);
    }

    /**
     * 更新accessToken
     * @param accessToken
     */
    public void updateAccessToken(AccessToken accessToken){
        wxDao.update(accessToken);
    }
}
