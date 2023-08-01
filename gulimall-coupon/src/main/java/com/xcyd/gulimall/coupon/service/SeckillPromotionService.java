package com.xcyd.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xcyd.common.utils.PageUtils;
import com.xcyd.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author xcyd
 * @email xcyd@gmail.com
 * @date 2023-07-25 12:26:28
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

