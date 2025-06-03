package com.ruoyi.teach.mapper;

import com.ruoyi.teach.domain.entity.TeachProjectInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeachProjectInfoMapper {

    List<TeachProjectInfo> findByConditions(
            @Param("projectStatus") String projectStatus,
            @Param("projectManager") String projectManager,
            @Param("projectCode") String projectCode,
            @Param("projectName") String projectName,
            @Param("pageNum") Integer pageNum,
            @Param("pageSize") Integer pageSize
    );

    public int deleteProjectinfoByIds(Long[] ids);
    @Insert("INSERT INTO project_info(prjName, prjCode, prjStatus, manager) " +
            "VALUES(#{prjName}, #{prjCode}, #{prjStatus}, #{manager})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertProject(TeachProjectInfo project);


    @Update("<script>" +
            "UPDATE project_info " +
            "<set>" +
            "   <if test='prjName != null'>prjName = #{prjName},</if>" +
            "   <if test='prjCode != null'>prjCode = #{prjCode},</if>" +
            "   <if test='prjStatus != null'>prjStatus = #{prjStatus},</if>" +
            "   <if test='manager != null'>Manager = #{manager},</if>" +
            "   <if test='money != null'>Money = #{money},</if>" +
            "</set>" +
            "WHERE id = #{id}" +
            "</script>")
    int updateProject(TeachProjectInfo project);

}



