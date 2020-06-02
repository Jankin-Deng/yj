package com.yj.oa.project.mapper;

import com.yj.oa.project.po.ActHiTaskInst;

import java.util.List;

public interface ActHiTaskInstMapper{

    /**
     *
     * @描述:  删除批量
     *
     * @params:
     * @return:
    */
    int deleteByprocInstIds(String[] ids);

    /**
     *
     * @描述: 主键查询
     *
     * @params:
     * @return:
    */
    ActHiTaskInst selectByPrimaryKey(String id);

    /**
     *
     * @描述: 根据审批人查询历史审批记录
     *
     * @params:
     * @return:
    */
    List<ActHiTaskInst> selectActHiTaskInstList(ActHiTaskInst actHiTaskInst);



}