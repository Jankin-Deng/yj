package com.yj.oa.project.service.ACT.task;


import com.yj.oa.project.po.ActTask;
import com.yj.oa.project.po.ApplyRoomForm;
import com.yj.oa.project.po.LeaveForm;

import java.util.List;
import java.util.Map;


public interface IActTaskService{
    /**
     *
     * @描述 任务列表
     *
     */
    List<ActTask> selectACTTaskList(ActTask record);

    /**
     *
     * @描述: 请假审批
     *
     * @params:
     * @return:
    */

    public void LeaveApproval(LeaveForm leaveForm, String taskId);

    public void RoomApproval(ApplyRoomForm applyRoomForm, String taskId) throws Exception;
    /**
     *
     * @描述:  删除任务
     *
     * @params:
     * @return:
    */
    public int deletByProcInstS(String[] ids);


    /**
     *
     * @描述 通过任务Id 获取当前节点的所有信息
     *
     */
    Map<String,Object> getCurrentView(String taskId);
}
