package com.ruoyi.teach.service.impl;

import com.ruoyi.teach.domain.entity.TeachProjectInfo;
import com.ruoyi.teach.mapper.TeachProjectInfoMapper;
import com.ruoyi.teach.service.ITeachProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TeachProjectInfoServiceImpl implements ITeachProjectInfoService {
    @Autowired
    private TeachProjectInfoMapper teachProjectInfoMapper;
    @Override
    public List<TeachProjectInfo> findByConditions(String prjName, String prjCode,String prjManager,String prjStatus,Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageSize == null) {
            return Collections.emptyList();
        }
        return teachProjectInfoMapper.findByConditions(
                prjStatus, prjManager, prjCode, prjName, pageNum, pageSize
        );
    }

    @Override
    public int deleteProjectinfoByIds(Long[] ids) {
        return teachProjectInfoMapper.deleteProjectinfoByIds(ids);
    }


    @Override
    public int addProjectinfoByIds(TeachProjectInfo project){
        return  teachProjectInfoMapper.insertProject(project);
    }


    public int updateProject(TeachProjectInfo project){
        return  teachProjectInfoMapper.updateProject(project);
    }
}



