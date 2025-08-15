package com.zlbc.CyUpErp.mapper;

import com.zlbc.CyUpErp.entity.PrescriptionDetailDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface PrescriptionMapper {

    void updateUpErpStatus(@Param("flowNo") String flowNo, @Param("UpErpStatus") int UpErpStatus);

    int batchUpdateFlowNo(@Param("flowNo") String flowNo, @Param("pspCodes") List<String> pspCodes);

    List<PrescriptionDetailDTO> selectPrescriptionDetailByFlowNo(@Param("flowNo") String flowNo);

    List<String> selectTop10PendingPrescriptionPspCodes(@Param("clientCode") String clientCode);

    String selectFlowNoByPspCodes(@Param("pspCodes") List<String> pspCodeList);
}
