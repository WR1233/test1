package com.lc.web.controller;

import com.lc.pojo.AdsInformation;
import com.lc.service.AdsInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wr
 * @date 2022/11/4
 * @dec 描述
 */
@RestController
@RequestMapping("/ads")
public class AdsInformationController {
    @Autowired
    private AdsInformationService adsInformationService;

    /**
     * 查询所有广告信息
     * @return
     */
    @PostMapping("/findAll")
    public List<AdsInformation> findALl(){
        List<AdsInformation> all = adsInformationService.findAll();
        System.out.println(all);
        return all;
    }
}
