package com.erp4j.ssm.mapper.quality.monitor;

import com.erp4j.ssm.pojo.quality.monitor.UnqualifyApplyPojo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface UnqualifyMapper {

    ArrayList<UnqualifyApplyPojo> queryUnqulifyApplyAll(@Param("unqualifyApplyId") String unqualifyApplyId, @Param("productName") String productName);
    int searchUnqualifyCountByProductName(@Param("unqualifyApplyId") String unqualifyApplyId, @Param("productName") String productName);
}
