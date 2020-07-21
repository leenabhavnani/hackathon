package com.bankofapis.web.service;

import org.springframework.stereotype.Service;
import com.bankofapis.core.model.pools.PoolDto;
import com.bankofapis.core.model.pools.PoolsDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class PoolService {

    public List<PoolDto> getCurrentPools(String accountId){
        PoolDto poolDto = new PoolDto();
        List<PoolDto> poolsDto = new ArrayList<>();
        poolDto.setBidActive("Y");
        poolDto.setAmount("50000");
        poolDto.setAmountInvested("");
        poolDto.setAmountReceived("");
        poolDto.setEndDate("31st September 2020");
        poolDto.setParticipants("User 2, User 4");
        poolDto.setPoolName("Pool_2020_04_01");
        poolDto.setPoolType("current");
        poolDto.setProfit("");
        poolDto.setStartDate("1st April 2020");
        poolDto.setTenure("6");
        poolsDto.add(poolDto);

        PoolDto poolDto1 = new PoolDto();
        poolDto1.setBidActive("N");
        poolDto1.setAmount("70000");
        poolDto1.setAmountInvested("");
        poolDto1.setAmountReceived("");
        poolDto1.setEndDate("31st November 2020");
        poolDto1.setParticipants("User 12, User 13");
        poolDto1.setPoolName("Pool_2020_06_01");
        poolDto1.setPoolType("current");
        poolDto1.setProfit("");
        poolDto1.setStartDate("1st June 2020");
        poolDto1.setTenure("6");
        poolsDto.add(poolDto1);

        PoolDto poolDto2 = new PoolDto();
        poolDto2.setBidActive("Y");
        poolDto2.setAmount("70000");
        poolDto2.setAmountInvested("");
        poolDto2.setAmountReceived("");
        poolDto2.setEndDate("30th May 2021");
        poolDto2.setParticipants("User 8, User 6,User 4, User 10,User 13, User 15");
        poolDto2.setPoolName("Pool_2020_06_01_1");
        poolDto2.setPoolType("current");
        poolDto2.setProfit("");
        poolDto2.setStartDate("1st June 2020");
        poolDto2.setTenure("12");
        poolsDto.add(poolDto2);
        return poolsDto;
    }

    public List<PoolDto> getShortListedPools(String accountId){
        PoolDto poolDto = new PoolDto();
        List<PoolDto> poolsDto = new ArrayList<>();
        poolDto.setBidActive("Make Payments,Details");
        poolDto.setAmount("12000");
        poolDto.setAmountInvested("");
        poolDto.setAmountReceived("");
        poolDto.setEndDate("31st September 2020");
        poolDto.setParticipants("User 4, User 7, User 8, User 10, User11");
        poolDto.setPoolName("Pool_2020_04_01_01");
        poolDto.setPoolType("shortlisted");
        poolDto.setProfit("");
        poolDto.setStartDate("1st April 2020");
        poolDto.setTenure("6");
        poolsDto.add(poolDto);

        PoolDto poolDto1 = new PoolDto();
        poolDto1.setBidActive("Make Payments,Details");
        poolDto1.setAmount("10000");
        poolDto1.setAmountInvested("");
        poolDto1.setAmountReceived("");
        poolDto1.setEndDate("30th April 2021");
        poolDto1.setParticipants("User 8, User 6,User 4, User 10,User 13, User 15");
        poolDto1.setPoolName("Pool_2020_06_01_1");
        poolDto1.setPoolType("shortlisted");
        poolDto1.setProfit("");
        poolDto1.setStartDate("1st May 2020");
        poolDto1.setTenure("12");
        poolsDto.add(poolDto1);
        return poolsDto;
    }

    public List<PoolDto> getCompletedPools(String accountId){
        PoolDto poolDto = new PoolDto();
        List<PoolDto> poolsDto = new ArrayList<>();
        poolDto.setBidActive("");
        poolDto.setAmount("");
        poolDto.setAmountInvested("600000");
        poolDto.setAmountReceived("605000");
        poolDto.setEndDate("31st September 2019");
        poolDto.setParticipants("User 4, User 7, User 8, User 10, User11, User25");
        poolDto.setPoolName("Pool_2019_04_01");
        poolDto.setPoolType("shortlisted");
        poolDto.setProfit("5000");
        poolDto.setStartDate("1st April 2019");
        poolDto.setTenure("6");
        poolsDto.add(poolDto);

        PoolDto poolDto1 = new PoolDto();
        poolDto1.setBidActive("");
        poolDto1.setAmount("");
        poolDto1.setAmountInvested("1200000");
        poolDto1.setAmountReceived("1250000");
        poolDto1.setEndDate("31st October 2019");
        poolDto1.setParticipants("User 3, User 6, User 8, User 12, User 15, User 19");
        poolDto1.setPoolName("Pool_2020_06_01_1");
        poolDto1.setPoolType("shortlisted");
        poolDto1.setProfit("50000");
        poolDto1.setStartDate("1st May 2019");
        poolDto1.setTenure("6");
        poolsDto.add(poolDto1);
        return poolsDto;
    }
}
