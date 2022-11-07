package com.lc.service;

import com.lc.pojo.AdsInformation;

import java.util.List;

/**
 * @author wr
 * @date 2022/11/4
 * @dec 描述
 */
public interface AdsInformationService {
    /**
     * 查询所有广告信息
     * @return
     */
    List<AdsInformation> findAll();
}
