package com.iknow.degree_program_allocator.utils;

import com.iknow.degree_program_allocator.services.ProgramService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class SchedulerUtil {
    private ProgramService programService;

    @Scheduled(fixedDelay = 1000 * 60 * 60 * 5)
    public void checkForDealerStagesUpdate() {
        log.info("-----------------Allocating applicants to respective programs------------");
        programService.allocateProgram();
    }
}
