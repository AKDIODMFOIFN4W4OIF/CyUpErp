package com.zlbc.CyUpErp.mapper;

import com.zlbc.CyUpErp.entity.MdmNo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MdmNoMapper {
//    void createCode(String code, MdmNo mdmNo);

    void updateCode(MdmNo mdmNo);

    void insertCode(MdmNo mdmNo);

//    String getCode(String code, int length);

    MdmNo findCode(String code);
}
