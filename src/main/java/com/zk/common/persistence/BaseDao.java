package com.zk.common.persistence;

import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */
public interface BaseDao<T> {
    /**
     * 根据主键获取实体
     * @return
     */
    public T getByPrimaryKey(String id);

    /**
     * 获取全部列表
     * @return
     */
    public List<T> getList();

    /**
     * 插入数据
     * @param obj
     */
    public void insert(T obj);

    /**
     * 更新数据
     * @param obj
     */
    public void update(T obj);
}
