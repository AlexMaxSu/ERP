package com.erp4j.ssm.mapper;

import com.erp4j.ssm.pojo.FinalMeasuretCheck;
import com.erp4j.ssm.pojo.FinalMeasuretCheckExample;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinalMeasuretCheckMapper {
    /*分隔符 杨盼*/

    /*分隔符 杨盼*/
    long countByExample(FinalMeasuretCheckExample example);

    int deleteByExample(FinalMeasuretCheckExample example);

    int deleteByPrimaryKey(String fMeasureCheckId);

    int insert(FinalMeasuretCheck record);

    int insertSelective(FinalMeasuretCheck record);

    List<FinalMeasuretCheck> selectByExample(FinalMeasuretCheckExample example);

    FinalMeasuretCheck selectByPrimaryKey(String fMeasureCheckId);

    int updateByExampleSelective(@Param("record") FinalMeasuretCheck record, @Param("example") FinalMeasuretCheckExample example);

    int updateByExample(@Param("record") FinalMeasuretCheck record, @Param("example") FinalMeasuretCheckExample example);

    int updateByPrimaryKeySelective(FinalMeasuretCheck record);

    int updateByPrimaryKey(FinalMeasuretCheck record);

    ArrayList<FinalMeasuretCheck> selectMeasureAll(@Param("fMeasureCheckId") String fMeasureCheckId,@Param("orderId")String orderId);

    int countFMeasureCheckByFMeasureCheckId(@Param("fMeasureCheckId") String fMeasureCheckId,@Param("orderId")String orderId);
}