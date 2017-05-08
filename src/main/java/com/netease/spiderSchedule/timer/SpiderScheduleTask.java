package com.netease.spiderSchedule.timer;

import org.springframework.beans.factory.annotation.Autowired;

import com.netease.spiderSchedule.service.spiderRateInfo.SpiderRateInfoService;
import com.netease.spiderSchedule.service.spiderSort.SpiderSortService;

public class SpiderScheduleTask {

	@Autowired
	private SpiderRateInfoService spiderRateInfoService;
	
	@Autowired
	private SpiderSortService spiderSortService;
	
	/**
	 * 凌晨统计
	 */
	public void zeroSchedule(){
		spiderRateInfoService.generateRateMap(0,10);
	}
	
	/**
	 * 相隔5分钟计算任务事假
	 */
	
	public void perFiveMinutesSchedule(){
		spiderSortService.addTask(spiderRateInfoService);
	}

}