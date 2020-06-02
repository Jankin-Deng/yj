package com.yj.oa.project.service.notice;

import com.yj.oa.project.po.Notice;
import com.yj.oa.project.po.Position;

import java.util.List;


public interface INoticeService{
    /**
     *
     * @描述 批量删除
     *
     */
    int deleteByPrimaryKeys(Integer[] positionId) throws Exception;

    /**
     *
     * @描述插入
     *
     */
    int insertSelective(Notice record);

    /**
     *
     * @描述 根据id查询
     *
     */
    Notice selectByPrimaryKey(Integer id);

    /**
     *
     * @描述 修改
     *
     */
    int updateByPrimaryKeySelective(Notice record);

    List<Notice> selectNoticeList(Notice record);

}
