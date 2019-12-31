package com.lhz.dive2inspringboot.service.impl;

import com.lhz.dive2inspringboot.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Auther: lhz
 * @Date: 2019/12/24 0024 17:18
 * @Description: java7 实现
 * @Version: 1.0
 */
@Profile("Java7")
@Service
public class Java7CalculteServiceImpl implements CalculateService {
    @Override
    public Integer sum(Integer... value) {
        int sum = 0;
        for (int i =0; i < value.length; i++) {
            sum+=value[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        CalculateService c = new Java7CalculteServiceImpl();
        System.out.println(c.sum(1,2,3,4,5));
    }
}
