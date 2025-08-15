package com.zlbc.CyUpErp.service;

import com.zlbc.CyUpErp.entity.MdmNo;
import org.springframework.stereotype.Service;

@Service
public interface MdmNoService {
    String createCode(String code, MdmNo mdmNo);

    void updateCode(String code, String value);

    String getCode(String code, int length);

    String getCodeNoReset(String code, int length);

    String getCode(String code);

    MdmNo findCode(String code);
}