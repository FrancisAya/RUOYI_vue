package com.ruoyi.teach.service;

import com.ruoyi.teach.domain.entity.TeachProjectInfo;

import java.util.List;

public interface ITeachProjectInfoService {

    List<TeachProjectInfo> findByConditions(
            String prjName,
            String prjCode,
            String prjManager,
            String prjStatus,
            Integer pageNum,
            Integer pageSize
    );


    int deleteProjectinfoByIds(Long[] ids);
    int addProjectinfoByIds(TeachProjectInfo project);
    int updateProject(TeachProjectInfo project);



}
