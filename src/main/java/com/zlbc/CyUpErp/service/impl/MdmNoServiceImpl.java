package com.zlbc.CyUpErp.service.impl;

import com.zlbc.CyUpErp.entity.MdmNo;
import com.zlbc.CyUpErp.mapper.MdmNoMapper;
import com.zlbc.CyUpErp.service.MdmNoService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class MdmNoServiceImpl implements MdmNoService {
    @Resource
    MdmNoMapper mdmNoMapper;

    //流水编号长度-默认为4
    protected int length = 7;

    //流水号前缀日期
    protected Date date = null;

    //日期格式化
    protected String dateFormat = "yyMMdd";

    @Override
    public String createCode(String code, MdmNo mdmNo) {
        date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String dateStr = sdf.format(date);
        //流水号
        String value;
        //如果流水号为空时--生成当日第一个流水编码
        if (StringUtils.isBlank(mdmNo.getValue())) {
            value = dateStr + StringUtils.leftPad("1", this.length, "0");
        } else {
            //截取流水号的日期
            String mdmNoDateStr = mdmNo.getValue().substring(0, 6);
            if (mdmNoDateStr.equals(dateStr)) {
                Long number = Long.parseLong(mdmNo.getValue()) + 1;
                value = String.valueOf(number);
            } else {
                value = dateStr + StringUtils.leftPad("1", this.length, "0");
            }
        }
        updateCode(code, value);
        return value;
    }

    @Override
    public void updateCode(String code, String value) {
        MdmNo mdmNo = new MdmNo();
        mdmNo.setCode(code);
        mdmNo.setValue(value);
        mdmNoMapper.updateCode(mdmNo);
    }

    @Override
    public String getCode(String code, int length) {
        MdmNo mdmNo = findCode(code);
        if (mdmNo == null) {
            return null;
        }
        this.length = length;
        return createCode(code, mdmNo);
    }

    @Override
    public String getCodeNoReset(String code, int length) {
        MdmNo mdmNo = findCode(code);
        if (mdmNo == null) {
            return null;
        }
        this.length = length;
        Long number = Long.parseLong(mdmNo.getValue()) + 1;
        String value = String.valueOf(number);
        updateCode(code, value);
        return value;
    }

    @Override
    public String getCode(String code) {
        MdmNo mdmNo = findCode(code);
        if (mdmNo == null) {
            return null;
        }
        return createCode(code, mdmNo);
    }

    @Override
    public MdmNo findCode(String code) {
        return mdmNoMapper.findCode(code);
    }
}
