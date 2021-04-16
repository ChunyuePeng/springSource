package com.pcy.service.impl;

import com.pcy.service.PrintTimeService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/4/13 9:33
 */
public class PrintTimeServiceImpl implements PrintTimeService {
    @Override
    public void printTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(new Date()));
    }
}
