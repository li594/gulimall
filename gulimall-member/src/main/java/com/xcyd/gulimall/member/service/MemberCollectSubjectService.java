package com.xcyd.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xcyd.common.utils.PageUtils;
import com.xcyd.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author xcyd
 * @email xcyd@gmail.com
 * @date 2023-07-25 12:37:36
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

