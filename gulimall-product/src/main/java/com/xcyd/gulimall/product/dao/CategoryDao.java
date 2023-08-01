package com.xcyd.gulimall.product.dao;

import com.xcyd.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xcyd
 * @email xcyd@gmail.com
 * @date 2023-07-25 10:45:36
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
