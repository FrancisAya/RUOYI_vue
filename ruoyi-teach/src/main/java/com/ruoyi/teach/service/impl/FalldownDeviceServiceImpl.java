package com.ruoyi.teach.service.impl;

import com.ruoyi.teach.domain.entity.FalldownDevice;
import com.ruoyi.teach.mapper.FalldownDeviceMapper;
import com.ruoyi.teach.service.IFalldownDeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FalldownDeviceServiceImpl implements IFalldownDeviceService {

    @Autowired
    private FalldownDeviceMapper falldownDeviceMapper;

    @Override
    public List<FalldownDevice> findByConditions(String deviceCode, String model, String status, Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageSize == null) {
            return Collections.emptyList();
        }
        return falldownDeviceMapper.findByConditions(deviceCode, model, status, pageNum, pageSize);
    }
}
