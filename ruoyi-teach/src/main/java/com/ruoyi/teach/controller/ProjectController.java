package com.ruoyi.teach.controller;

import com.ruoyi.common.core.controller.TeachBaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.teach.domain.dto.bo.ProjectInfoDetailBo;
import com.ruoyi.teach.domain.entity.TeachProjectInfo;
import com.ruoyi.teach.service.ITeachProjectInfoService;
import com.ruoyi.teach.service.ITeachSysDictDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ProjectInfo")
public class ProjectController extends TeachBaseController {

    private final ITeachProjectInfoService teachProjectInfoService;

    @GetMapping("/list")
    public AjaxResult list(
            @RequestParam(value = "prjName", required = false) String prjName,
            @RequestParam(value = "prjCode", required = false) String prjCode,
            @RequestParam(value = "manager", required = false) String prjManager,
            @RequestParam(value = "prjStatus", required = false) String prjStatus,
            @RequestParam(value = "pageNum", required = false) Integer pageNum,
            @RequestParam(value = "pageSize", required = false) Integer pageSize
    ) {
        startPage(pageNum, pageSize);
        return getPagedData(
                teachProjectInfoService.findByConditions(prjName,prjCode,prjManager,prjStatus,pageNum, pageSize),
                pageNum,
                pageSize
        );

    }

    @PostMapping("/delete")
    public AjaxResult delete(@RequestBody Long[] ids) {
        int deletedProjectinfoByIds = teachProjectInfoService.deleteProjectinfoByIds(ids);
        return success(deletedProjectinfoByIds);
    }

    @PostMapping("/add")
    public AjaxResult add(TeachProjectInfo projectInfo) {
        int i = teachProjectInfoService.addProjectinfoByIds(projectInfo);
        return success(i);
    }


    @PostMapping("/update")
    public AjaxResult update(TeachProjectInfo projectInfo) {
        int i = teachProjectInfoService.updateProject(projectInfo);
        return success(i);
    }

    // to be implemented

}
