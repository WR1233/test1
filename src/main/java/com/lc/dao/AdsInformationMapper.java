package com.lc.dao;

import com.lc.pojo.AdsInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wr
 * @date 2022/11/4
 * @dec 描述
 */
@Mapper
public interface AdsInformationMapper {

    /**
     * 查询所有广告信息
     * @return
     */
  /*  @Select("select * from t_ads")*/
    List<AdsInformation> findAll();
}
