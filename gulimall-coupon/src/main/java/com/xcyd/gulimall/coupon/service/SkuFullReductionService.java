package com.xcyd.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xcyd.common.utils.PageUtils;
import com.xcyd.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author xcyd
 * @email xcyd@gmail.com
 * @date 2023-07-25 12:26:28
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

