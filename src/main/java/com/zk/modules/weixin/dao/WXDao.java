package com.zk.modules.weixin.dao;

import com.zk.common.persistence.BaseDao;
import com.zk.modules.weixin.entity.AccessToken;
import org.springframework.stereotype.Repository;

/**
 * Created by zk on 2017/6/5.
 */
@Repository
public interface WXDao extends BaseDao<AccessToken> {
    public void updateAccessToken(AccessToken accessToken);
}
