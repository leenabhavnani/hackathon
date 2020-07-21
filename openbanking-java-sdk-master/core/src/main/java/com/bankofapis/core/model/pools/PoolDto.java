package com.bankofapis.core.model.pools;

import com.bankofapis.core.model.common.Links;
import com.bankofapis.core.model.common.Meta;
import com.bankofapis.core.model.payments.OBWriteDataDomesticResponse;
import com.bankofapis.core.model.payments.OBWriteDomesticResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Validated
public class PoolDto {
    @JsonProperty("PoolType")
    private String poolType;

    @JsonProperty("PoolName")
    private String poolName;

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("StartDate")
    private String startDate;

    @JsonProperty("EndDate")
    private String endDate;

    @JsonProperty("Participants")
    private String participants;

    @JsonProperty("BidActive")
    private String bidActive;

    @JsonProperty("AmountInvested")
    private String amountInvested;

    @JsonProperty("AmountReceived")
    private String amountReceived;

    @JsonProperty("Profit")
    private String profit;

    @JsonProperty("tenure")
    private String tenure;

    public PoolDto()
    {

    }

    public String getPoolType() {
        return poolType;
    }

    public void setPoolType(String poolType) {
        this.poolType = poolType;
    }

    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public String getBidActive() {
        return bidActive;
    }

    public void setBidActive(String bidActive) {
        this.bidActive = bidActive;
    }

    public String getAmountInvested() {
        return amountInvested;
    }

    public void setAmountInvested(String amountInvested) {
        this.amountInvested = amountInvested;
    }

    public String getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(String amountReceived) {
        this.amountReceived = amountReceived;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }
}
