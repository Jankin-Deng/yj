package com.yj.oa.project.service.position;

import com.yj.oa.project.po.Permission;
import com.yj.oa.project.po.Position;

import java.util.List;

/**
 * @描述
 */
public interface IPositionService {
    /**
     *
     * @描述 根据主键删除
     *
     */
    int deleteByPrimarysKey(Integer[] positionId);


    /**
     *
     * @描述 插入
     *
     */
    int insertSelective(Position record);

    /**
     *
     * @描述  根据主键查询
     *
     */
    Position selectByPrimaryKey(Integer positionId);

    /**
     *
     * @描述 字段不为空更新
     *
     */
    int updateByPrimaryKeySelective(Position record);


    /**
     *
     * @描述 根据对象所有字段查询
     *
     */
    List<Position> selectPositionList(Position position);


    /**
     *
     * @描述 校验名称是否唯一
     *
     */
    String checkPositionNameUnique(Position position);
}
