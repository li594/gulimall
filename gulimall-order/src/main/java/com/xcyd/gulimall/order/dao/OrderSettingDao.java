package com.xcyd.gulimall.order.dao;

import com.xcyd.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author xcyd
 * @email xcyd@gmail.com
 * @date 2023-07-25 12:57:56
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
