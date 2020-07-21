package com.bankofapis.web.controller;


import com.bankofapis.core.model.pools.PoolDto;
import com.bankofapis.core.model.pools.PoolsDto;
import com.bankofapis.web.service.PoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.bankofapis.remote.common.Endpoints.DOMESTIC_PAYMENTS_PAYMENT_ID_ENDPOINT;

@RestController
@RequestMapping("/poolservice")
public class PoolController {
@Autowired
public PoolService poolService;
    @GetMapping(value = "/current-pools/{accountId}")
    public List<PoolDto> getCurrentPools(@PathVariable(value = "accountId") String accountId) {
       return  poolService.getCurrentPools(accountId);
    }
    @GetMapping(value = "/shortlisted-pools/{accountId}")
    public List<PoolDto> getShortListedPools(@PathVariable(value = "accountId") String accountId) {
        return  poolService.getShortListedPools(accountId);
    }
    @GetMapping(value = "/completed-pools/{accountId}")
    public List<PoolDto> getCompletedPools(@PathVariable(value = "accountId") String accountId) {
        return  poolService.getCompletedPools(accountId);
    }
}
