package com.yj.oa.project.service.ACT.hiprocInst;

import com.yj.oa.project.po.ActHiProcinst;

import java.util.List;


public interface IActHiProcinstService{
    /**
     * @ 描述 批量删除
     * @ param id
     */
    int deleteByPrimaryKeys(String[] id);

    /**
     * @ 描述 根据主键查询
     */
    ActHiProcinst selectByPrimaryKey(String id);

    /**
     *
     * @描述: 根据实例id查询 判断改实例是否已经结束
     *
     * @params:
     * @return：
     */
    ActHiProcinst selectByProcInstId(String procInstId);


    /**
     * @ 描述 列表
     */
    List<ActHiProcinst> selectActHiProcinstList(ActHiProcinst actHiProcinst);
}
