package com.zk.common.persistence;

import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */
public interface BaseService<T> {


    /**
     * 根据主键获取实体
     * @return
     */
    public T getByPrimaryKey();

    /**
     * 获取全部列表
     * @return
     */
    public List<T> getList();


}
