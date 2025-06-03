package com.ruoyi.teach.domain.dto.bo;

import lombok.Data;

import java.util.Date;

@Data
public class ProjectInfoDetailBo {

    private String prjName;

    private String prjCode;

    private Long prjType;

    private String prjStatus;

    private String prjDesc;

    private Date startDate;

    private Date endDate;

    private String manager;

    private Integer money;

    private String remark;

}
