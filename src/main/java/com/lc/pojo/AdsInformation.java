package com.lc.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author wr
 * @date 2022/11/4
 * @dec 描述
 */
@Data
@TableName("t_ads")
public class AdsInformation {

    /**
     * 广告投放时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date date;
    /**
     * 广告id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    /**
     * 广告名称
     */
    private String campaignName;
    /**
     * 广告状态
     */
    private String campaignStatus;
    /**
     * 类型
     */
    private String matchType;
    /**
     *查询关键子
     */
    private String query;
    /**
     * 曝光量
     */
    private Integer impressions;
    /**
     * 点击量
     */
    private Double clicks;
    /**
     * 花费
     */
    private Double cost;
    /**
     * 销售额
     */
    private Double sales;
    /**
     * 销售数量
     */
    private Double conversions;
    /**
     * 单词点击成本
     */
    private Double CPC;
    /**
     * 点击率
     */
    private Double CTR;
    /**
     * 转化率
     */
    private Double CVR;

    private String ACOS;
}
