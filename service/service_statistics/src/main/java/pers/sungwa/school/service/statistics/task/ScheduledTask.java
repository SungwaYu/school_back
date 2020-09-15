package pers.sungwa.school.service.statistics.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.sungwa.school.service.statistics.service.DailyService;

/**
 * @author sungwa
 * @date 9/15/20
 */
@Slf4j
@Component
public class ScheduledTask {

    @Autowired
    private DailyService dailyService;

//    @Scheduled(cron = "0/3 * * * * *")
//    public void task1(){
//        log.info("task1 在执行......");
//    }

    //    @Scheduled(cron = "0 0 1 * * ?")
//    @Scheduled(cron = "30 47 16 * * ?")
//    public void testGenStatisticsData(){
//        log.info("testGenStatisticsData 在执行......");
//        String day = new DateTime().minusDays(1).toString("yyyy-MM-dd");
//        dailyService.createStatisticsByDay(day);
//    }
}