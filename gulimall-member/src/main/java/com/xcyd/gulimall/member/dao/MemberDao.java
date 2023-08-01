package com.xcyd.gulimall.member.dao;

import com.xcyd.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xcyd
 * @email xcyd@gmail.com
 * @date 2023-07-25 12:37:36
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
