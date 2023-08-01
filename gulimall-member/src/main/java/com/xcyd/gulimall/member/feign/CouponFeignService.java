package com.xcyd.gulimall.member.feign;

import com.xcyd.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="gulimall-coupon",url = "http://localhost:7000/")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    R membercoupons();
}
