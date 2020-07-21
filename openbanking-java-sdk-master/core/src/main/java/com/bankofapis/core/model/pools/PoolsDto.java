package com.bankofapis.core.model.pools;
import com.bankofapis.core.model.pools.PoolDto;
import java.util.ArrayList;
import java.util.List;
public class PoolsDto {
    private  List<PoolDto> poolsDto = new ArrayList<>();

    public PoolsDto() {
    }

    public PoolsDto(List<PoolDto> poolsDto) {
        this.poolsDto = poolsDto;
    }
    public void addPool(PoolDto poolDto){
        this.poolsDto.add(poolDto);
    }
    public List<PoolDto> getPools(){
        return this.poolsDto;
    }
}
