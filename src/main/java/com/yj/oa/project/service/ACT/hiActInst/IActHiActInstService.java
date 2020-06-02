package com.yj.oa.project.service.ACT.hiActInst;

import com.yj.oa.project.po.ActHiActinst;

import java.util.List;


public interface IActHiActInstService{

    /**
     *
     * @描述: 删除活动历史信息
     *
     * @params:
     * @return:
     */
    int deleteByProcInstId(String[] procInstId);

    /**
     *
     * @描述: 根据进程实例id获取当前 实例的活动信息
     *
     * @params:
     * @return:

     */
    List<ActHiActinst> selectByByProcInstId(String procInstId);
}
