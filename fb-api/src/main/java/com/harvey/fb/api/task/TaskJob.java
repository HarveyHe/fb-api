package com.harvey.fb.api.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
  
@Component 
public class TaskJob {  
	
    @Scheduled(cron = "0/10 * * * * ?")  
    public void job1() {  
    	
    }  
} 