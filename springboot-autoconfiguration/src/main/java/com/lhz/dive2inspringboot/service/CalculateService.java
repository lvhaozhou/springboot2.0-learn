package com.lhz.dive2inspringboot.service;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 17:15
 * @Description: 计算服务
 * @Version: 1.0
 */
public interface CalculateService {
    /**
     * 功能描述: sum 求和多个整数
     * @param: value
     * @return: Integr
     * @auther: lhz
     * @date: 2019/12/24 0024 下午 5:16
     */
    Integer sum(Integer... value);
}
