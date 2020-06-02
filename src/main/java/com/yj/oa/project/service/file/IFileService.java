package com.yj.oa.project.service.file;

import com.yj.oa.project.po.Files;

import java.util.List;


public interface IFileService{
    /**
     *
     * @描述 添加
     *
     */
    public int insertSelective(Files file);

    /**
     *
     * @描述 删除
     *
     */
    public int deleteByPrimaryKeys(String[] ids);

    /**
     *
     * @描述 列表
     *
     */
    List<Files> selectFileList(Files file);

    void downloadCountAddOne(Files files);
}
