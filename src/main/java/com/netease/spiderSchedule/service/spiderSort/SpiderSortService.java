package com.netease.spiderSchedule.service.spiderSort;

import java.util.List;

import com.netease.spiderSchedule.model.SpiderScheduleDto;
import com.netease.spiderSchedule.service.spiderRateInfo.SpiderRateInfoService;

public interface SpiderSortService {
	
	List<SpiderScheduleDto> getTask(int taskNum, SpiderRateInfoService spiderRateInfoService);
	int addTask(SpiderRateInfoService spiderRateInfoService);
	int addMoreTask(SpiderRateInfoService spiderRateInfoService);
	void addTask(String sourceID,SpiderRateInfoService spiderRateInfoService);
	void addErrorTask(String sourceId, SpiderRateInfoService spiderRateInfoService);
	int getSize();
}
