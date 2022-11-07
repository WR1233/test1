package com.lc.service.impl;

import com.lc.dao.AdsInformationMapper;
import com.lc.pojo.AdsInformation;
import com.lc.service.AdsInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wr
 * @date 2022/11/4
 * @dec 描述
 */
@Service
public class AdsInformationServiceImpl implements AdsInformationService {
    @Autowired
    private AdsInformationMapper adsInformationMapper;

    @Override
    public List<AdsInformation> findAll() {
        return adsInformationMapper.findAll();
    }
}
