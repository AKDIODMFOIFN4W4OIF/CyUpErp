package com.zlbc.CyUpErp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@TableName("`psp_normal_prescription`")
public class PspNormalPrescription implements Serializable {
    /**
     * 主键
     */

    private Long id;

    /**
     * 诚和处方Id
     */
    @TableField("UserJobID")
    private String userJobID;

    /**
     * 处方编码
     */
    @TableField("PspCode")
    private String pspCode;

    /**
     * 处方状态
     */
    @TableField("PspStatus")
    private String pspStatus;

    /**
     * 处方日期
     */
    @TableField("PspDate2")
    private String pspDate2;

    /**
     * 处方日期
     */
    @TableField("PspDate")
    private Date pspDate;

    /**
     * 是否优先
     */
    @TableField("HavePriority")
    private Boolean havePriority;

    /**
     * 客户编码
     */
    @TableField("ClientCode")
    private String clientCode;

    /**
     * 客户名称
     */
    @TableField("ClientName")
    private String clientName;

    /**
     * 处方来源信息
     */
    @TableField("PspSourceId")
    private Long pspSourceId;

    /**
     * 联系电话
     */
    @TableField("PatientPhone")
    private String patientPhone;

    /**
     * 患者年龄
     */
    @TableField("PatientAge")
    private String patientAge;

    /**
     * 患者表id
     */
    @TableField("PatientsId")
    private Long patientsId;

    /**
     * 物流信息
     */
    @TableField("DeliveryId")
    private Long deliveryId;

    /**
     * 处方类型
     */
    @TableField("PspType")
    private String pspType;

    /**
     * 处方类型码，0：协定方，1：处方
     */
    @TableField("PspTypeNum")
    private Integer pspTypeNum;

    /**
     * 处方帖数
     */
    @TableField("PspNum")
    private Integer pspNum;

    @TableField("NumPackage")
    private Integer numPackage;

    /**
     * 总包数
     */
    @TableField("PspPackets")
    private Integer pspPackets;

    /**
     * 服用说明
     */
    @TableField("TakingDesc")
    private String takingDesc;

    /**
     * 处方金额
     */
    @TableField("Costs")
    private String costs;

    /**
     * 处方用法
     */
    @TableField("PspUsedMethod")
    private String pspUsedMethod;

    /**
     * 煎药要求
     */
    @TableField("BoilRequirements")
    private String boilRequirements;

    /**
     * 临床诊断
     */
    @TableField("ClinicalDiagnosis")
    private String clinicalDiagnosis;

    /**
     * 辅料信息
     */
    @TableField("SupplementaryMaterial")
    private String supplementaryMaterial;

    /**
     * 水煎容量
     */
    @TableField("WaterCapacity")
    private Integer waterCapacity;

    /**
     * 注水量
     */
    @TableField("WaterInjection")
    private Integer waterInjection;

    /**
     * 分时煎药（格式：数字/日期字符串|数字/日期字符串）
     */
    @TableField("TimeSharing")
    private String timeSharing;

    /**
     * 处方定时
     */
    @TableField("PspTiming")
    private Date pspTiming;

    /**
     * 是否孕妇
     */
    @TableField("PregnantWoman")
    private Boolean pregnantWoman;

    /**
     * 药渣配送
     */
    @TableField("DregsDelivery")
    private Boolean dregsDelivery;

    /**
     * 配药方式
     */
    @TableField("DispensingType")
    private String dispensingType;

    /**
     * 接收方式
     */
    @TableField("ReceiveType")
    private String receiveType;

    /**
     * 协定方Id
     */
    @TableField("AgreementId")
    private Long agreementId;

    /**
     * 医院名称
     */
    @TableField("HospitalName")
    private String hospitalName;

    /**
     * 分院名称
     */
    @TableField("HospitalBranchName")
    private String hospitalBranchName;

    /**
     * 联系人姓名
     */
    @TableField("ContactName")
    private String contactName;

    /**
     * 分包数
     */
    @TableField("PspSubPackets")
    private Integer pspSubPackets;

    /**
     * 合方状态（0：默认，1：主，2：次，3：合）
     */
    @TableField("MergeStatus")
    private Integer mergeStatus;

    /**
     * 所有合方处方编码
     */
    @TableField("MergeKey")
    private String mergeKey;

    /**
     * 合方id
     */
    @TableField("MergeId")
    private Long mergeId;

    /**
     * 初始接方员
     */
    @TableField("FirstReceiver")
    private Long firstReceiver;

    /**
     * 初始审方员
     */
    @TableField("FirstChecker")
    private Long firstChecker;

    /**
     * 复核接方员
     */
    @TableField("ReviewReceiver")
    private Long reviewReceiver;

    /**
     * 复核主管员
     */
    @TableField("ReviewChecker")
    private Long reviewChecker;

    /**
     * 处方来源，0：his，1：人工录方，2：电子处方
     */
    @TableField("PspFrom")
    private Integer pspFrom;

    /**
     * 订单类型
     */
    @TableField("OrderType")
    private String orderType;

    /**
     * 分桶数
     */
    @TableField("BucketNums")
    private Integer bucketNums;

    /**
     * 是否包含处方禁忌
     */
    @TableField("HasConflicts")
    private Boolean hasConflicts;

    /**
     * 是否计量超限
     */
    @TableField("HasOverLimit")
    private Boolean hasOverLimit;

    /**
     * 是否需要高管员复审
     */
    @TableField("NeedReview")
    private Boolean needReview;

    /**
     * 处方是否已在处理
     */
    @TableField("IsDoing")
    private Boolean isDoing;

    /**
     * 包装是否完成
     */
    @TableField("Packaged")
    private Boolean packaged;

    /**
     * 0：未重制，1：已重制
     */
    @TableField("IsRemake")
    private Boolean isRemake;

    /**
     * 是否生成订单，0：否，1：是
     */
    @TableField("GeneratedOrders")
    private Boolean generatedOrders;

    /**
     * 传真图片Id
     */
    @TableField("FaxImgId")
    private Long faxImgId;

    /**
     * 驳回理由
     */
    @TableField("RejectReason")
    private String rejectReason;

    /**
     * 撤单、废弃理由
     */
    @TableField("UndoReason")
    private String undoReason;

    /**
     * 是否领取（0：未领取，1：已领取）
     */
    @TableField("IsDispatch")
    private Integer isDispatch;

    /**
     * 状态
     */
    @TableField("Status")
    private Integer status;

    /**
     * 删除标识
     */
    @TableField("IsDeleted")
    private Boolean isDeleted;

    /**
     * 备注
     */
    @TableField("Comments")
    private String comments;

    /**
     * 排序
     */
    @TableField("Sequence")
    private Integer sequence;

    /**
     * 创建人
     */
    @TableField("CreatedBy")
    private Long createdBy;

    /**
     * 创建时间
     */
    @TableField("CreatedOn")
    private Date createdOn;

    /**
     * 修改人
     */
    @TableField("ModifiedBy")
    private Long modifiedBy;

    /**
     * 修改时间
     */
    @TableField("ModifiedOn")
    private Date modifiedOn;

    /**
     * 工艺环节
     */
    @TableField("ProcessLinks")
    private Integer processLinks;

    /**
     * 环节状态
     */
    @TableField("LinkStatus")
    private Integer linkStatus;

    /**
     * 操作员
     */
    @TableField("Operator")
    private Long operator;

    /**
     * 住院号/门诊号
     */
    @TableField("PspGetTypeNum")
    private String pspGetTypeNum;

    /**
     * 医生姓名
     */
    @TableField("DoctorName")
    private String doctorName;

    /**
     * 患者姓名
     */
    @TableField("Patient")
    private String patient;

    /**
     * 患者性别
     */
    @TableField("SexName")
    private String sexName;

    /**
     * 快递单号
     */
    @TableField("TrackNumber")
    private String trackNumber;

    /**
     * 配送方式
     */
    @TableField("DeliveryTypeName")
    private String deliveryTypeName;

    /**
     * 配送地址
     */
    @TableField("DeliveryAddress")
    private String deliveryAddress;

    /**
     * 病区
     */
    @TableField("DiseaseArea")
    private String diseaseArea;

    /**
     * 床号
     */
    @TableField("BedNum")
    private String bedNum;

    /**
     * 开方日期
     */
    @TableField("PrescribingDateName")
    private String prescribingDateName;

    /**
     * 医院处方号
     */
    @TableField("HisCode")
    private String hisCode;

    /**
     * 处方类型名称
     */
    @TableField("PspTypeName")
    private String pspTypeName;

    /**
     * 处方用法名称
     */
    @TableField("PspUsedMethodName")
    private String pspUsedMethodName;

    /**
     * 处方状态名称
     */
    @TableField("PspStatusName")
    private String pspStatusName;

    /**
     * 住院/门诊名称
     */
    @TableField("PspGetTypeName")
    private String pspGetTypeName;

    /**
     * 配药方式名称
     */
    @TableField("DispensingTypeName")
    private String dispensingTypeName;

    /**
     * 订单类型名称
     */
    @TableField("OrderTypeName")
    private String orderTypeName;

    /**
     * 是否优先名称（查询）
     */
    @TableField("HavePriorityName")
    private String havePriorityName;

    /**
     * 接收方式名称（查询）
     */
    @TableField("ReceiveTypeName")
    private String receiveTypeName;

    /**
     * 药渣配送名称（查询）
     */
    @TableField("DregsDeliveryName")
    private String dregsDeliveryName;

    /**
     * 是否孕妇名称（查询）
     */
    @TableField("PregnantWomanName")
    private String pregnantWomanName;

    /**
     * 医院审核单号
     */
    @TableField("HisReviewNumber")
    private String hisReviewNumber;

    /**
     * 是否时分时煎药订单：0-否，1-是
     */
    @TableField("IsTiming")
    private Boolean isTiming;

    /**
     * 分时处方来源Id
     */
    @TableField("TimeFromId")
    private Long timeFromId;

    /**
     * 客户药品与本地药品是否匹配,0：不匹配，1：匹配
     */
    @TableField("DrugMatch")
    private Boolean drugMatch;

    /**
     * 校对员姓名
     */
    @TableField("Proofreader")
    private String proofreader;

    /**
     * 判断邮政快递是否已发送 1: 已发快递 0: 未发快递
     */
    @TableField("IsSendExpress")
    private Boolean isSendExpress;

    /**
     * 配药员姓名
     */
    @TableField("Dispenser")
    private String dispenser;

    /**
     * 协定方名称
     */
    @TableField("AgreeName")
    private String agreeName;

    /**
     * 浸泡时间
     */
    @TableField("SoakTimes")
    private BigDecimal soakTimes;

    /**
     * 先煎时间
     */
    @TableField("BeforeDecTimes")
    private BigDecimal beforeDecTimes;

    /**
     * 煎药时间
     */
    @TableField("DecoctionTimes")
    private BigDecimal decoctionTimes;

    /**
     * 后下时间
     */
    @TableField("AfterDecTimes")
    private BigDecimal afterDecTimes;

    /**
     * 是否有明细
     */
    @TableField("HasDetail")
    private Boolean hasDetail;

    /**
     * 送货方式（1：配送，2：自送）
     */
    @TableField("SendType")
    private Integer sendType;

    /**
     * OCR处方的URL路径
     */
    @TableField("OcrUrl")
    private String ocrUrl;

    /**
     * HIS的处方流水号
     */
    @TableField("RecipeNo")
    private String recipeNo;

    /**
     * 打印次数
     */
    @TableField("PspPrintNum")
    private Integer pspPrintNum;

    /**
     * 处方药品消耗传输标识: 0:未传输 1:已传输
     */
    @TableField("DrugConsumption")
    private Integer drugConsumption;

    /**
     * 预留字段1
     */
    @TableField("Extends1")
    private String extends1;

    /**
     * 预留字段2
     */
    @TableField("Extends2")
    private String extends2;

    /**
     * 预留字段3
     */
    @TableField("Extends3")
    private String extends3;

    /**
     * 预留字段4
     */
    @TableField("Extends4")
    private String extends4;

    /**
     * 预留字段5
     */
    @TableField("Extends5")
    private String extends5;

    /**
     * 预留字段6
     */
    @TableField("Extends6")
    private String extends6;

    /**
     * 预留字段7
     */
    @TableField("Extends7")
    private String extends7;

    /**
     * 获取主键
     *
     * @return Id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取诚和处方Id
     *
     * @return UserJobID - 诚和处方Id
     */
    public String getUserJobID() {
        return userJobID;
    }

    /**
     * 设置诚和处方Id
     *
     * @param userJobID 诚和处方Id
     */
    public void setUserJobID(String userJobID) {
        this.userJobID = userJobID == null ? null : userJobID.trim();
    }

    /**
     * 获取处方编码
     *
     * @return PspCode - 处方编码
     */
    public String getPspCode() {
        return pspCode;
    }

    /**
     * 设置处方编码
     *
     * @param pspCode 处方编码
     */
    public void setPspCode(String pspCode) {
        this.pspCode = pspCode == null ? null : pspCode.trim();
    }

    /**
     * 获取处方状态
     *
     * @return PspStatus - 处方状态
     */
    public String getPspStatus() {
        return pspStatus;
    }

    /**
     * 设置处方状态
     *
     * @param pspStatus 处方状态
     */
    public void setPspStatus(String pspStatus) {
        this.pspStatus = pspStatus == null ? null : pspStatus.trim();
    }

    /**
     * 获取处方日期
     *
     * @return PspDate2 - 处方日期
     */
    public String getPspDate2() {
        return pspDate2;
    }

    /**
     * 设置处方日期
     *
     * @param pspDate2 处方日期
     */
    public void setPspDate2(String pspDate2) {
        this.pspDate2 = pspDate2 == null ? null : pspDate2.trim();
    }

    /**
     * 获取处方日期
     *
     * @return PspDate - 处方日期
     */
    public Date getPspDate() {
        return pspDate;
    }

    /**
     * 设置处方日期
     *
     * @param pspDate 处方日期
     */
    public void setPspDate(Date pspDate) {
        this.pspDate = pspDate;
    }

    /**
     * 获取是否优先
     *
     * @return HavePriority - 是否优先
     */
    public Boolean getHavePriority() {
        return havePriority;
    }

    /**
     * 设置是否优先
     *
     * @param havePriority 是否优先
     */
    public void setHavePriority(Boolean havePriority) {
        this.havePriority = havePriority;
    }

    /**
     * 获取客户编码
     *
     * @return ClientCode - 客户编码
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * 设置客户编码
     *
     * @param clientCode 客户编码
     */
    public void setClientCode(String clientCode) {
        this.clientCode = clientCode == null ? null : clientCode.trim();
    }

    /**
     * 获取客户名称
     *
     * @return ClientName - 客户名称
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * 设置客户名称
     *
     * @param clientName 客户名称
     */
    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    /**
     * 获取处方来源信息
     *
     * @return PspSourceId - 处方来源信息
     */
    public Long getPspSourceId() {
        return pspSourceId;
    }

    /**
     * 设置处方来源信息
     *
     * @param pspSourceId 处方来源信息
     */
    public void setPspSourceId(Long pspSourceId) {
        this.pspSourceId = pspSourceId;
    }

    /**
     * 获取联系电话
     *
     * @return PatientPhone - 联系电话
     */
    public String getPatientPhone() {
        return patientPhone;
    }

    /**
     * 设置联系电话
     *
     * @param patientPhone 联系电话
     */
    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone == null ? null : patientPhone.trim();
    }

    /**
     * 获取患者年龄
     *
     * @return PatientAge - 患者年龄
     */
    public String getPatientAge() {
        return patientAge;
    }

    /**
     * 设置患者年龄
     *
     * @param patientAge 患者年龄
     */
    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    /**
     * 获取患者表id
     *
     * @return PatientsId - 患者表id
     */
    public Long getPatientsId() {
        return patientsId;
    }

    /**
     * 设置患者表id
     *
     * @param patientsId 患者表id
     */
    public void setPatientsId(Long patientsId) {
        this.patientsId = patientsId;
    }

    /**
     * 获取物流信息
     *
     * @return DeliveryId - 物流信息
     */
    public Long getDeliveryId() {
        return deliveryId;
    }

    /**
     * 设置物流信息
     *
     * @param deliveryId 物流信息
     */
    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    /**
     * 获取处方类型
     *
     * @return PspType - 处方类型
     */
    public String getPspType() {
        return pspType;
    }

    /**
     * 设置处方类型
     *
     * @param pspType 处方类型
     */
    public void setPspType(String pspType) {
        this.pspType = pspType == null ? null : pspType.trim();
    }

    /**
     * 获取处方类型码，0：协定方，1：处方
     *
     * @return PspTypeNum - 处方类型码，0：协定方，1：处方
     */
    public Integer getPspTypeNum() {
        return pspTypeNum;
    }

    /**
     * 设置处方类型码，0：协定方，1：处方
     *
     * @param pspTypeNum 处方类型码，0：协定方，1：处方
     */
    public void setPspTypeNum(Integer pspTypeNum) {
        this.pspTypeNum = pspTypeNum;
    }

    /**
     * 获取处方帖数
     *
     * @return PspNum - 处方帖数
     */
    public Integer getPspNum() {
        return pspNum;
    }

    /**
     * 设置处方帖数
     *
     * @param pspNum 处方帖数
     */
    public void setPspNum(Integer pspNum) {
        this.pspNum = pspNum;
    }

    /**
     * @return NumPackage
     */
    public Integer getNumPackage() {
        return numPackage;
    }

    /**
     * @param numPackage
     */
    public void setNumPackage(Integer numPackage) {
        this.numPackage = numPackage;
    }

    /**
     * 获取总包数
     *
     * @return PspPackets - 总包数
     */
    public Integer getPspPackets() {
        return pspPackets;
    }

    /**
     * 设置总包数
     *
     * @param pspPackets 总包数
     */
    public void setPspPackets(Integer pspPackets) {
        this.pspPackets = pspPackets;
    }

    /**
     * 获取服用说明
     *
     * @return TakingDesc - 服用说明
     */
    public String getTakingDesc() {
        return takingDesc;
    }

    /**
     * 设置服用说明
     *
     * @param takingDesc 服用说明
     */
    public void setTakingDesc(String takingDesc) {
        this.takingDesc = takingDesc == null ? null : takingDesc.trim();
    }

    /**
     * 获取处方用法
     *
     * @return PspUsedMethod - 处方用法
     */
    public String getPspUsedMethod() {
        return pspUsedMethod;
    }

    /**
     * 设置处方用法
     *
     * @param pspUsedMethod 处方用法
     */
    public void setPspUsedMethod(String pspUsedMethod) {
        this.pspUsedMethod = pspUsedMethod == null ? null : pspUsedMethod.trim();
    }

    /**
     * 获取煎药要求
     *
     * @return BoilRequirements - 煎药要求
     */
    public String getBoilRequirements() {
        return boilRequirements;
    }

    /**
     * 设置煎药要求
     *
     * @param boilRequirements 煎药要求
     */
    public void setBoilRequirements(String boilRequirements) {
        this.boilRequirements = boilRequirements == null ? null : boilRequirements.trim();
    }

    /**
     * 获取临床诊断
     *
     * @return ClinicalDiagnosis - 临床诊断
     */
    public String getClinicalDiagnosis() {
        return clinicalDiagnosis;
    }

    /**
     * 设置临床诊断
     *
     * @param clinicalDiagnosis 临床诊断
     */
    public void setClinicalDiagnosis(String clinicalDiagnosis) {
        this.clinicalDiagnosis = clinicalDiagnosis == null ? null : clinicalDiagnosis.trim();
    }

    /**
     * 获取辅料信息
     *
     * @return SupplementaryMaterial - 辅料信息
     */
    public String getSupplementaryMaterial() {
        return supplementaryMaterial;
    }

    /**
     * 设置辅料信息
     *
     * @param supplementaryMaterial 辅料信息
     */
    public void setSupplementaryMaterial(String supplementaryMaterial) {
        this.supplementaryMaterial = supplementaryMaterial == null ? null : supplementaryMaterial.trim();
    }

    /**
     * 获取水煎容量
     *
     * @return WaterCapacity - 水煎容量
     */
    public Integer getWaterCapacity() {
        return waterCapacity;
    }

    /**
     * 设置水煎容量
     *
     * @param waterCapacity 水煎容量
     */
    public void setWaterCapacity(Integer waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    /**
     * 获取注水量
     *
     * @return WaterInjection - 注水量
     */
    public Integer getWaterInjection() {
        return waterInjection;
    }

    /**
     * 设置注水量
     *
     * @param waterInjection 注水量
     */
    public void setWaterInjection(Integer waterInjection) {
        this.waterInjection = waterInjection;
    }

    /**
     * 获取分时煎药（格式：数字/日期字符串|数字/日期字符串）
     *
     * @return TimeSharing - 分时煎药（格式：数字/日期字符串|数字/日期字符串）
     */
    public String getTimeSharing() {
        return timeSharing;
    }

    /**
     * 设置分时煎药（格式：数字/日期字符串|数字/日期字符串）
     *
     * @param timeSharing 分时煎药（格式：数字/日期字符串|数字/日期字符串）
     */
    public void setTimeSharing(String timeSharing) {
        this.timeSharing = timeSharing == null ? null : timeSharing.trim();
    }

    /**
     * 获取处方定时
     *
     * @return PspTiming - 处方定时
     */
    public Date getPspTiming() {
        return pspTiming;
    }

    /**
     * 设置处方定时
     *
     * @param pspTiming 处方定时
     */
    public void setPspTiming(Date pspTiming) {
        this.pspTiming = pspTiming;
    }

    /**
     * 获取是否孕妇
     *
     * @return PregnantWoman - 是否孕妇
     */
    public Boolean getPregnantWoman() {
        return pregnantWoman;
    }

    /**
     * 设置是否孕妇
     *
     * @param pregnantWoman 是否孕妇
     */
    public void setPregnantWoman(Boolean pregnantWoman) {
        this.pregnantWoman = pregnantWoman;
    }

    /**
     * 获取药渣配送
     *
     * @return DregsDelivery - 药渣配送
     */
    public Boolean getDregsDelivery() {
        return dregsDelivery;
    }

    /**
     * 设置药渣配送
     *
     * @param dregsDelivery 药渣配送
     */
    public void setDregsDelivery(Boolean dregsDelivery) {
        this.dregsDelivery = dregsDelivery;
    }

    /**
     * 获取配药方式
     *
     * @return DispensingType - 配药方式
     */
    public String getDispensingType() {
        return dispensingType;
    }

    /**
     * 设置配药方式
     *
     * @param dispensingType 配药方式
     */
    public void setDispensingType(String dispensingType) {
        this.dispensingType = dispensingType == null ? null : dispensingType.trim();
    }

    /**
     * 获取接收方式
     *
     * @return ReceiveType - 接收方式
     */
    public String getReceiveType() {
        return receiveType;
    }

    /**
     * 设置接收方式
     *
     * @param receiveType 接收方式
     */
    public void setReceiveType(String receiveType) {
        this.receiveType = receiveType == null ? null : receiveType.trim();
    }

    /**
     * 获取协定方Id
     *
     * @return AgreementId - 协定方Id
     */
    public Long getAgreementId() {
        return agreementId;
    }

    /**
     * 设置协定方Id
     *
     * @param agreementId 协定方Id
     */
    public void setAgreementId(Long agreementId) {
        this.agreementId = agreementId;
    }

    /**
     * 获取医院名称
     *
     * @return HospitalName - 医院名称
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * 设置医院名称
     *
     * @param hospitalName 医院名称
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    /**
     * 获取分院名称
     *
     * @return HospitalBranchName - 分院名称
     */
    public String getHospitalBranchName() {
        return hospitalBranchName;
    }

    /**
     * 设置分院名称
     *
     * @param hospitalBranchName 分院名称
     */
    public void setHospitalBranchName(String hospitalBranchName) {
        this.hospitalBranchName = hospitalBranchName == null ? null : hospitalBranchName.trim();
    }

    /**
     * 获取联系人姓名
     *
     * @return ContactName - 联系人姓名
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人姓名
     *
     * @param contactName 联系人姓名
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取分包数
     *
     * @return PspSubPackets - 分包数
     */
    public Integer getPspSubPackets() {
        return pspSubPackets;
    }

    /**
     * 设置分包数
     *
     * @param pspSubPackets 分包数
     */
    public void setPspSubPackets(Integer pspSubPackets) {
        this.pspSubPackets = pspSubPackets;
    }

    /**
     * 获取合方状态（0：默认，1：主，2：次，3：合）
     *
     * @return MergeStatus - 合方状态（0：默认，1：主，2：次，3：合）
     */
    public Integer getMergeStatus() {
        return mergeStatus;
    }

    /**
     * 设置合方状态（0：默认，1：主，2：次，3：合）
     *
     * @param mergeStatus 合方状态（0：默认，1：主，2：次，3：合）
     */
    public void setMergeStatus(Integer mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    /**
     * 获取所有合方处方编码
     *
     * @return MergeKey - 所有合方处方编码
     */
    public String getMergeKey() {
        return mergeKey;
    }

    /**
     * 设置所有合方处方编码
     *
     * @param mergeKey 所有合方处方编码
     */
    public void setMergeKey(String mergeKey) {
        this.mergeKey = mergeKey == null ? null : mergeKey.trim();
    }

    /**
     * 获取合方id
     *
     * @return MergeId - 合方id
     */
    public Long getMergeId() {
        return mergeId;
    }

    /**
     * 设置合方id
     *
     * @param mergeId 合方id
     */
    public void setMergeId(Long mergeId) {
        this.mergeId = mergeId;
    }

    /**
     * 获取初始接方员
     *
     * @return FirstReceiver - 初始接方员
     */
    public Long getFirstReceiver() {
        return firstReceiver;
    }

    /**
     * 设置初始接方员
     *
     * @param firstReceiver 初始接方员
     */
    public void setFirstReceiver(Long firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    /**
     * 获取初始审方员
     *
     * @return FirstChecker - 初始审方员
     */
    public Long getFirstChecker() {
        return firstChecker;
    }

    /**
     * 设置初始审方员
     *
     * @param firstChecker 初始审方员
     */
    public void setFirstChecker(Long firstChecker) {
        this.firstChecker = firstChecker;
    }

    /**
     * 获取复核接方员
     *
     * @return ReviewReceiver - 复核接方员
     */
    public Long getReviewReceiver() {
        return reviewReceiver;
    }

    /**
     * 设置复核接方员
     *
     * @param reviewReceiver 复核接方员
     */
    public void setReviewReceiver(Long reviewReceiver) {
        this.reviewReceiver = reviewReceiver;
    }

    /**
     * 获取复核主管员
     *
     * @return ReviewChecker - 复核主管员
     */
    public Long getReviewChecker() {
        return reviewChecker;
    }

    /**
     * 设置复核主管员
     *
     * @param reviewChecker 复核主管员
     */
    public void setReviewChecker(Long reviewChecker) {
        this.reviewChecker = reviewChecker;
    }

    /**
     * 获取处方来源，0：his，1：人工录方，2：电子处方
     *
     * @return PspFrom - 处方来源，0：his，1：人工录方，2：电子处方
     */
    public Integer getPspFrom() {
        return pspFrom;
    }

    /**
     * 设置处方来源，0：his，1：人工录方，2：电子处方
     *
     * @param pspFrom 处方来源，0：his，1：人工录方，2：电子处方
     */
    public void setPspFrom(Integer pspFrom) {
        this.pspFrom = pspFrom;
    }

    /**
     * 获取订单类型
     *
     * @return OrderType - 订单类型
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型
     *
     * @param orderType 订单类型
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    /**
     * 获取分桶数
     *
     * @return BucketNums - 分桶数
     */
    public Integer getBucketNums() {
        return bucketNums;
    }

    /**
     * 设置分桶数
     *
     * @param bucketNums 分桶数
     */
    public void setBucketNums(Integer bucketNums) {
        this.bucketNums = bucketNums;
    }

    /**
     * 获取是否包含处方禁忌
     *
     * @return HasConflicts - 是否包含处方禁忌
     */
    public Boolean getHasConflicts() {
        return hasConflicts;
    }

    /**
     * 设置是否包含处方禁忌
     *
     * @param hasConflicts 是否包含处方禁忌
     */
    public void setHasConflicts(Boolean hasConflicts) {
        this.hasConflicts = hasConflicts;
    }

    /**
     * 获取是否计量超限
     *
     * @return HasOverLimit - 是否计量超限
     */
    public Boolean getHasOverLimit() {
        return hasOverLimit;
    }

    /**
     * 设置是否计量超限
     *
     * @param hasOverLimit 是否计量超限
     */
    public void setHasOverLimit(Boolean hasOverLimit) {
        this.hasOverLimit = hasOverLimit;
    }

    /**
     * 获取是否需要高管员复审
     *
     * @return NeedReview - 是否需要高管员复审
     */
    public Boolean getNeedReview() {
        return needReview;
    }

    /**
     * 设置是否需要高管员复审
     *
     * @param needReview 是否需要高管员复审
     */
    public void setNeedReview(Boolean needReview) {
        this.needReview = needReview;
    }

    /**
     * 获取处方是否已在处理
     *
     * @return IsDoing - 处方是否已在处理
     */
    public Boolean getIsDoing() {
        return isDoing;
    }

    /**
     * 设置处方是否已在处理
     *
     * @param isDoing 处方是否已在处理
     */
    public void setIsDoing(Boolean isDoing) {
        this.isDoing = isDoing;
    }

    /**
     * 获取包装是否完成
     *
     * @return Packaged - 包装是否完成
     */
    public Boolean getPackaged() {
        return packaged;
    }

    /**
     * 设置包装是否完成
     *
     * @param packaged 包装是否完成
     */
    public void setPackaged(Boolean packaged) {
        this.packaged = packaged;
    }

    /**
     * 获取0：未重制，1：已重制
     *
     * @return IsRemake - 0：未重制，1：已重制
     */
    public Boolean getIsRemake() {
        return isRemake;
    }

    /**
     * 设置0：未重制，1：已重制
     *
     * @param isRemake 0：未重制，1：已重制
     */
    public void setIsRemake(Boolean isRemake) {
        this.isRemake = isRemake;
    }

    /**
     * 获取是否生成订单，0：否，1：是
     *
     * @return GeneratedOrders - 是否生成订单，0：否，1：是
     */
    public Boolean getGeneratedOrders() {
        return generatedOrders;
    }

    /**
     * 设置是否生成订单，0：否，1：是
     *
     * @param generatedOrders 是否生成订单，0：否，1：是
     */
    public void setGeneratedOrders(Boolean generatedOrders) {
        this.generatedOrders = generatedOrders;
    }

    /**
     * 获取传真图片Id
     *
     * @return FaxImgId - 传真图片Id
     */
    public Long getFaxImgId() {
        return faxImgId;
    }

    /**
     * 设置传真图片Id
     *
     * @param faxImgId 传真图片Id
     */
    public void setFaxImgId(Long faxImgId) {
        this.faxImgId = faxImgId;
    }

    /**
     * 获取驳回理由
     *
     * @return RejectReason - 驳回理由
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * 设置驳回理由
     *
     * @param rejectReason 驳回理由
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    /**
     * 获取撤单、废弃理由
     *
     * @return UndoReason - 撤单、废弃理由
     */
    public String getUndoReason() {
        return undoReason;
    }

    /**
     * 设置撤单、废弃理由
     *
     * @param undoReason 撤单、废弃理由
     */
    public void setUndoReason(String undoReason) {
        this.undoReason = undoReason == null ? null : undoReason.trim();
    }

    /**
     * 获取是否领取（0：未领取，1：已领取）
     *
     * @return IsDispatch - 是否领取（0：未领取，1：已领取）
     */
    public Integer getIsDispatch() {
        return isDispatch;
    }

    /**
     * 设置是否领取（0：未领取，1：已领取）
     *
     * @param isDispatch 是否领取（0：未领取，1：已领取）
     */
    public void setIsDispatch(Integer isDispatch) {
        this.isDispatch = isDispatch;
    }

    /**
     * 获取状态
     *
     * @return Status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取删除标识
     *
     * @return IsDeleted - 删除标识
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置删除标识
     *
     * @param isDeleted 删除标识
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取备注
     *
     * @return Comments - 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置备注
     *
     * @param comments 备注
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * 获取排序
     *
     * @return Sequence - 排序
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 设置排序
     *
     * @param sequence 排序
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 获取创建人
     *
     * @return CreatedBy - 创建人
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取创建时间
     *
     * @return CreatedOn - 创建时间
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * 设置创建时间
     *
     * @param createdOn 创建时间
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * 获取修改人
     *
     * @return ModifiedBy - 修改人
     */
    public Long getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设置修改人
     *
     * @param modifiedBy 修改人
     */
    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * 获取修改时间
     *
     * @return ModifiedOn - 修改时间
     */
    public Date getModifiedOn() {
        return modifiedOn;
    }

    /**
     * 设置修改时间
     *
     * @param modifiedOn 修改时间
     */
    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    /**
     * 获取工艺环节
     *
     * @return ProcessLinks - 工艺环节
     */
    public Integer getProcessLinks() {
        return processLinks;
    }

    /**
     * 设置工艺环节
     *
     * @param processLinks 工艺环节
     */
    public void setProcessLinks(Integer processLinks) {
        this.processLinks = processLinks;
    }

    /**
     * 获取环节状态
     *
     * @return LinkStatus - 环节状态
     */
    public Integer getLinkStatus() {
        return linkStatus;
    }

    /**
     * 设置环节状态
     *
     * @param linkStatus 环节状态
     */
    public void setLinkStatus(Integer linkStatus) {
        this.linkStatus = linkStatus;
    }

    /**
     * 获取操作员
     *
     * @return Operator - 操作员
     */
    public Long getOperator() {
        return operator;
    }

    /**
     * 设置操作员
     *
     * @param operator 操作员
     */
    public void setOperator(Long operator) {
        this.operator = operator;
    }

    /**
     * 获取住院号/门诊号
     *
     * @return PspGetTypeNum - 住院号/门诊号
     */
    public String getPspGetTypeNum() {
        return pspGetTypeNum;
    }

    /**
     * 设置住院号/门诊号
     *
     * @param pspGetTypeNum 住院号/门诊号
     */
    public void setPspGetTypeNum(String pspGetTypeNum) {
        this.pspGetTypeNum = pspGetTypeNum == null ? null : pspGetTypeNum.trim();
    }

    /**
     * 获取医生姓名
     *
     * @return DoctorName - 医生姓名
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * 设置医生姓名
     *
     * @param doctorName 医生姓名
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    /**
     * 获取患者姓名
     *
     * @return Patient - 患者姓名
     */
    public String getPatient() {
        return patient;
    }

    /**
     * 设置患者姓名
     *
     * @param patient 患者姓名
     */
    public void setPatient(String patient) {
        this.patient = patient == null ? null : patient.trim();
    }

    /**
     * 获取患者性别
     *
     * @return SexName - 患者性别
     */
    public String getSexName() {
        return sexName;
    }

    /**
     * 设置患者性别
     *
     * @param sexName 患者性别
     */
    public void setSexName(String sexName) {
        this.sexName = sexName == null ? null : sexName.trim();
    }

    /**
     * 获取快递单号
     *
     * @return TrackNumber - 快递单号
     */
    public String getTrackNumber() {
        return trackNumber;
    }

    /**
     * 设置快递单号
     *
     * @param trackNumber 快递单号
     */
    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber == null ? null : trackNumber.trim();
    }

    /**
     * 获取配送方式
     *
     * @return DeliveryTypeName - 配送方式
     */
    public String getDeliveryTypeName() {
        return deliveryTypeName;
    }

    /**
     * 设置配送方式
     *
     * @param deliveryTypeName 配送方式
     */
    public void setDeliveryTypeName(String deliveryTypeName) {
        this.deliveryTypeName = deliveryTypeName == null ? null : deliveryTypeName.trim();
    }

    /**
     * 获取配送地址
     *
     * @return DeliveryAddress - 配送地址
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * 设置配送地址
     *
     * @param deliveryAddress 配送地址
     */
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    /**
     * 获取病区
     *
     * @return DiseaseArea - 病区
     */
    public String getDiseaseArea() {
        return diseaseArea;
    }

    /**
     * 设置病区
     *
     * @param diseaseArea 病区
     */
    public void setDiseaseArea(String diseaseArea) {
        this.diseaseArea = diseaseArea == null ? null : diseaseArea.trim();
    }

    /**
     * 获取床号
     *
     * @return BedNum - 床号
     */
    public String getBedNum() {
        return bedNum;
    }

    /**
     * 设置床号
     *
     * @param bedNum 床号
     */
    public void setBedNum(String bedNum) {
        this.bedNum = bedNum == null ? null : bedNum.trim();
    }

    /**
     * 获取开方日期
     *
     * @return PrescribingDateName - 开方日期
     */
    public String getPrescribingDateName() {
        return prescribingDateName;
    }

    /**
     * 设置开方日期
     *
     * @param prescribingDateName 开方日期
     */
    public void setPrescribingDateName(String prescribingDateName) {
        this.prescribingDateName = prescribingDateName == null ? null : prescribingDateName.trim();
    }

    /**
     * 获取医院处方号
     *
     * @return HisCode - 医院处方号
     */
    public String getHisCode() {
        return hisCode;
    }

    /**
     * 设置医院处方号
     *
     * @param hisCode 医院处方号
     */
    public void setHisCode(String hisCode) {
        this.hisCode = hisCode == null ? null : hisCode.trim();
    }

    /**
     * 获取处方类型名称
     *
     * @return PspTypeName - 处方类型名称
     */
    public String getPspTypeName() {
        return pspTypeName;
    }

    /**
     * 设置处方类型名称
     *
     * @param pspTypeName 处方类型名称
     */
    public void setPspTypeName(String pspTypeName) {
        this.pspTypeName = pspTypeName == null ? null : pspTypeName.trim();
    }

    /**
     * 获取处方用法名称
     *
     * @return PspUsedMethodName - 处方用法名称
     */
    public String getPspUsedMethodName() {
        return pspUsedMethodName;
    }

    /**
     * 设置处方用法名称
     *
     * @param pspUsedMethodName 处方用法名称
     */
    public void setPspUsedMethodName(String pspUsedMethodName) {
        this.pspUsedMethodName = pspUsedMethodName == null ? null : pspUsedMethodName.trim();
    }

    /**
     * 获取处方状态名称
     *
     * @return PspStatusName - 处方状态名称
     */
    public String getPspStatusName() {
        return pspStatusName;
    }

    /**
     * 设置处方状态名称
     *
     * @param pspStatusName 处方状态名称
     */
    public void setPspStatusName(String pspStatusName) {
        this.pspStatusName = pspStatusName == null ? null : pspStatusName.trim();
    }

    /**
     * 获取住院/门诊名称
     *
     * @return PspGetTypeName - 住院/门诊名称
     */
    public String getPspGetTypeName() {
        return pspGetTypeName;
    }

    /**
     * 设置住院/门诊名称
     *
     * @param pspGetTypeName 住院/门诊名称
     */
    public void setPspGetTypeName(String pspGetTypeName) {
        this.pspGetTypeName = pspGetTypeName == null ? null : pspGetTypeName.trim();
    }

    /**
     * 获取配药方式名称
     *
     * @return DispensingTypeName - 配药方式名称
     */
    public String getDispensingTypeName() {
        return dispensingTypeName;
    }

    /**
     * 设置配药方式名称
     *
     * @param dispensingTypeName 配药方式名称
     */
    public void setDispensingTypeName(String dispensingTypeName) {
        this.dispensingTypeName = dispensingTypeName == null ? null : dispensingTypeName.trim();
    }

    /**
     * 获取订单类型名称
     *
     * @return OrderTypeName - 订单类型名称
     */
    public String getOrderTypeName() {
        return orderTypeName;
    }

    /**
     * 设置订单类型名称
     *
     * @param orderTypeName 订单类型名称
     */
    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName == null ? null : orderTypeName.trim();
    }

    /**
     * 获取是否优先名称（查询）
     *
     * @return HavePriorityName - 是否优先名称（查询）
     */
    public String getHavePriorityName() {
        return havePriorityName;
    }

    /**
     * 设置是否优先名称（查询）
     *
     * @param havePriorityName 是否优先名称（查询）
     */
    public void setHavePriorityName(String havePriorityName) {
        this.havePriorityName = havePriorityName == null ? null : havePriorityName.trim();
    }

    /**
     * 获取接收方式名称（查询）
     *
     * @return ReceiveTypeName - 接收方式名称（查询）
     */
    public String getReceiveTypeName() {
        return receiveTypeName;
    }

    /**
     * 设置接收方式名称（查询）
     *
     * @param receiveTypeName 接收方式名称（查询）
     */
    public void setReceiveTypeName(String receiveTypeName) {
        this.receiveTypeName = receiveTypeName == null ? null : receiveTypeName.trim();
    }

    /**
     * 获取药渣配送名称（查询）
     *
     * @return DregsDeliveryName - 药渣配送名称（查询）
     */
    public String getDregsDeliveryName() {
        return dregsDeliveryName;
    }

    /**
     * 设置药渣配送名称（查询）
     *
     * @param dregsDeliveryName 药渣配送名称（查询）
     */
    public void setDregsDeliveryName(String dregsDeliveryName) {
        this.dregsDeliveryName = dregsDeliveryName == null ? null : dregsDeliveryName.trim();
    }

    /**
     * 获取是否孕妇名称（查询）
     *
     * @return PregnantWomanName - 是否孕妇名称（查询）
     */
    public String getPregnantWomanName() {
        return pregnantWomanName;
    }

    /**
     * 设置是否孕妇名称（查询）
     *
     * @param pregnantWomanName 是否孕妇名称（查询）
     */
    public void setPregnantWomanName(String pregnantWomanName) {
        this.pregnantWomanName = pregnantWomanName == null ? null : pregnantWomanName.trim();
    }

    /**
     * 获取医院审核单号
     *
     * @return HisReviewNumber - 医院审核单号
     */
    public String getHisReviewNumber() {
        return hisReviewNumber;
    }

    /**
     * 设置医院审核单号
     *
     * @param hisReviewNumber 医院审核单号
     */
    public void setHisReviewNumber(String hisReviewNumber) {
        this.hisReviewNumber = hisReviewNumber == null ? null : hisReviewNumber.trim();
    }

    /**
     * 获取是否时分时煎药订单：0-否，1-是
     *
     * @return IsTiming - 是否时分时煎药订单：0-否，1-是
     */
    public Boolean getIsTiming() {
        return isTiming;
    }

    /**
     * 设置是否时分时煎药订单：0-否，1-是
     *
     * @param isTiming 是否时分时煎药订单：0-否，1-是
     */
    public void setIsTiming(Boolean isTiming) {
        this.isTiming = isTiming;
    }

    /**
     * 获取分时处方来源Id
     *
     * @return TimeFromId - 分时处方来源Id
     */
    public Long getTimeFromId() {
        return timeFromId;
    }

    /**
     * 设置分时处方来源Id
     *
     * @param timeFromId 分时处方来源Id
     */
    public void setTimeFromId(Long timeFromId) {
        this.timeFromId = timeFromId;
    }

    /**
     * 获取客户药品与本地药品是否匹配,0：不匹配，1：匹配
     *
     * @return DrugMatch - 客户药品与本地药品是否匹配,0：不匹配，1：匹配
     */
    public Boolean getDrugMatch() {
        return drugMatch;
    }

    /**
     * 设置客户药品与本地药品是否匹配,0：不匹配，1：匹配
     *
     * @param drugMatch 客户药品与本地药品是否匹配,0：不匹配，1：匹配
     */
    public void setDrugMatch(Boolean drugMatch) {
        this.drugMatch = drugMatch;
    }

    /**
     * 获取校对员姓名
     *
     * @return Proofreader - 校对员姓名
     */
    public String getProofreader() {
        return proofreader;
    }

    /**
     * 设置校对员姓名
     *
     * @param proofreader 校对员姓名
     */
    public void setProofreader(String proofreader) {
        this.proofreader = proofreader == null ? null : proofreader.trim();
    }

    /**
     * 获取判断邮政快递是否已发送 1: 已发快递 0: 未发快递
     *
     * @return IsSendExpress - 判断邮政快递是否已发送 1: 已发快递 0: 未发快递
     */
    public Boolean getIsSendExpress() {
        return isSendExpress;
    }

    /**
     * 设置判断邮政快递是否已发送 1: 已发快递 0: 未发快递
     *
     * @param isSendExpress 判断邮政快递是否已发送 1: 已发快递 0: 未发快递
     */
    public void setIsSendExpress(Boolean isSendExpress) {
        this.isSendExpress = isSendExpress;
    }

    /**
     * 获取配药员姓名
     *
     * @return Dispenser - 配药员姓名
     */
    public String getDispenser() {
        return dispenser;
    }

    /**
     * 设置配药员姓名
     *
     * @param dispenser 配药员姓名
     */
    public void setDispenser(String dispenser) {
        this.dispenser = dispenser == null ? null : dispenser.trim();
    }

    /**
     * 获取协定方名称
     *
     * @return AgreeName - 协定方名称
     */
    public String getAgreeName() {
        return agreeName;
    }

    /**
     * 设置协定方名称
     *
     * @param agreeName 协定方名称
     */
    public void setAgreeName(String agreeName) {
        this.agreeName = agreeName == null ? null : agreeName.trim();
    }

    /**
     * 获取浸泡时间
     *
     * @return SoakTimes - 浸泡时间
     */
    public BigDecimal getSoakTimes() {
        return soakTimes;
    }

    /**
     * 设置浸泡时间
     *
     * @param soakTimes 浸泡时间
     */
    public void setSoakTimes(BigDecimal soakTimes) {
        this.soakTimes = soakTimes;
    }

    /**
     * 获取先煎时间
     *
     * @return BeforeDecTimes - 先煎时间
     */
    public BigDecimal getBeforeDecTimes() {
        return beforeDecTimes;
    }

    /**
     * 设置先煎时间
     *
     * @param beforeDecTimes 先煎时间
     */
    public void setBeforeDecTimes(BigDecimal beforeDecTimes) {
        this.beforeDecTimes = beforeDecTimes;
    }

    /**
     * 获取煎药时间
     *
     * @return DecoctionTimes - 煎药时间
     */
    public BigDecimal getDecoctionTimes() {
        return decoctionTimes;
    }

    /**
     * 设置煎药时间
     *
     * @param decoctionTimes 煎药时间
     */
    public void setDecoctionTimes(BigDecimal decoctionTimes) {
        this.decoctionTimes = decoctionTimes;
    }

    /**
     * 获取后下时间
     *
     * @return AfterDecTimes - 后下时间
     */
    public BigDecimal getAfterDecTimes() {
        return afterDecTimes;
    }

    /**
     * 设置后下时间
     *
     * @param afterDecTimes 后下时间
     */
    public void setAfterDecTimes(BigDecimal afterDecTimes) {
        this.afterDecTimes = afterDecTimes;
    }

    /**
     * 获取是否有明细
     *
     * @return HasDetail - 是否有明细
     */
    public Boolean getHasDetail() {
        return hasDetail;
    }

    /**
     * 设置是否有明细
     *
     * @param hasDetail 是否有明细
     */
    public void setHasDetail(Boolean hasDetail) {
        this.hasDetail = hasDetail;
    }

    /**
     * 获取送货方式（1：配送，2：自送）
     *
     * @return SendType - 送货方式（1：配送，2：自送）
     */
    public Integer getSendType() {
        return sendType;
    }

    /**
     * 设置送货方式（1：配送，2：自送）
     *
     * @param sendType 送货方式（1：配送，2：自送）
     */
    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    /**
     * 获取OCR处方的URL路径
     *
     * @return OcrUrl - OCR处方的URL路径
     */
    public String getOcrUrl() {
        return ocrUrl;
    }

    /**
     * 设置OCR处方的URL路径
     *
     * @param ocrUrl OCR处方的URL路径
     */
    public void setOcrUrl(String ocrUrl) {
        this.ocrUrl = ocrUrl == null ? null : ocrUrl.trim();
    }

    /**
     * 获取HIS的处方流水号
     *
     * @return RecipeNo - HIS的处方流水号
     */
    public String getRecipeNo() {
        return recipeNo;
    }

    /**
     * 设置HIS的处方流水号
     *
     * @param recipeNo HIS的处方流水号
     */
    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo == null ? null : recipeNo.trim();
    }

    /**
     * 获取打印次数
     *
     * @return PspPrintNum - 打印次数
     */
    public Integer getPspPrintNum() {
        return pspPrintNum;
    }

    /**
     * 设置打印次数
     *
     * @param pspPrintNum 打印次数
     */
    public void setPspPrintNum(Integer pspPrintNum) {
        this.pspPrintNum = pspPrintNum;
    }

    /**
     * 获取处方药品消耗传输标识: 0:未传输 1:已传输
     *
     * @return DrugConsumption - 处方药品消耗传输标识: 0:未传输 1:已传输
     */
    public Integer getDrugConsumption() {
        return drugConsumption;
    }

    /**
     * 设置处方药品消耗传输标识: 0:未传输 1:已传输
     *
     * @param drugConsumption 处方药品消耗传输标识: 0:未传输 1:已传输
     */
    public void setDrugConsumption(Integer drugConsumption) {
        this.drugConsumption = drugConsumption;
    }

    /**
     * 获取预留字段1
     *
     * @return Extends1 - 预留字段1
     */
    public String getExtends1() {
        return extends1;
    }

    /**
     * 设置预留字段1
     *
     * @param extends1 预留字段1
     */
    public void setExtends1(String extends1) {
        this.extends1 = extends1 == null ? null : extends1.trim();
    }

    /**
     * 获取预留字段2
     *
     * @return Extends2 - 预留字段2
     */
    public String getExtends2() {
        return extends2;
    }

    /**
     * 设置预留字段2
     *
     * @param extends2 预留字段2
     */
    public void setExtends2(String extends2) {
        this.extends2 = extends2 == null ? null : extends2.trim();
    }

    /**
     * 获取预留字段3
     *
     * @return Extends3 - 预留字段3
     */
    public String getExtends3() {
        return extends3;
    }

    /**
     * 设置预留字段3
     *
     * @param extends3 预留字段3
     */
    public void setExtends3(String extends3) {
        this.extends3 = extends3 == null ? null : extends3.trim();
    }

    /**
     * 获取预留字段4
     *
     * @return Extends4 - 预留字段4
     */
    public String getExtends4() {
        return extends4;
    }

    /**
     * 设置预留字段4
     *
     * @param extends4 预留字段4
     */
    public void setExtends4(String extends4) {
        this.extends4 = extends4 == null ? null : extends4.trim();
    }

    /**
     * 获取预留字段5
     *
     * @return Extends5 - 预留字段5
     */
    public String getExtends5() {
        return extends5;
    }

    /**
     * 设置预留字段5
     *
     * @param extends5 预留字段5
     */
    public void setExtends5(String extends5) {
        this.extends5 = extends5 == null ? null : extends5.trim();
    }

    /**
     * 获取预留字段6
     *
     * @return Extends6 - 预留字段6
     */
    public String getExtends6() {
        return extends6;
    }

    /**
     * 设置预留字段6
     *
     * @param extends6 预留字段6
     */
    public void setExtends6(String extends6) {
        this.extends6 = extends6 == null ? null : extends6.trim();
    }

    /**
     * 获取预留字段7
     *
     * @return Extends7 - 预留字段7
     */
    public String getExtends7() {
        return extends7;
    }

    /**
     * 设置预留字段7
     *
     * @param extends7 预留字段7
     */
    public void setExtends7(String extends7) {
        this.extends7 = extends7 == null ? null : extends7.trim();
    }
}