package com.xcyd.gulimall.coupon.dao;

import com.xcyd.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xcyd
 * @email xcyd@gmail.com
 * @date 2023-07-25 12:26:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
