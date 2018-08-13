package spring.boot.mybatis.apply;

import java.util.Date;
import javax.persistence.*;

@Table(name = "apply_info")
public class ApplyInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_update")
    private Date gmtUpdate;

    /**
     * 贷款申请流水号
     */
    @Column(name = "apply_no")
    private String applyNo;

    /**
     * 贷款申请用户唯一标志
     */
    @Column(name = "user_uuk")
    private String userUuk;

    /**
     * 纳税人识别号
     */
    private String nsrsbh;

    /**
     *  企业名称
     */
    @Column(name = "etr_name")
    private String etrName;

    /**
     * 产品ID
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 产品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 贷款申请期限(3/6)
     */
    @Column(name = "loan_term")
    private Integer loanTerm;

    /**
     * 贷款额度（万）
     */
    @Column(name = "loan_amount")
    private Double loanAmount;

    /**
     * 联系方式
     */
    @Column(name = "contact_mobile")
    private String contactMobile;

    /**
     * 联系人
     */
    @Column(name = "contact_person")
    private String contactPerson;

    /**
     * 客户来源渠道
     */
    @Column(name = "data_source")
    private String dataSource;

    /**
     * 营销推荐代码
     */
    private String mcode;

    /**
     * 银行ID（支行ID）
     */
    @Column(name = "bank_id")
    private String bankId;

    /**
     * 银行CODE
     */
    @Column(name = "bank_code")
    private String bankCode;

    /**
     * 银行名称（支行）
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 行政区划代码
     */
    @Column(name = "area_code")
    private String areaCode;

    /**
     * 行政区划名称
     */
    @Column(name = "area_name")
    private String areaName;

    /**
     * 状态代码
     */
    @Column(name = "status_code")
    private String statusCode;

    /**
     * 状态名称
     */
    @Column(name = "status_name")
    private String statusName;

    /**
     * 银行授信的贷款期限(3/6)
     */
    @Column(name = "permit_loan_term")
    private Integer permitLoanTerm;

    /**
     * 银行授信的贷款额度（万）
     */
    @Column(name = "permit_loan_amount")
    private Double permitLoanAmount;

    /**
     * 准入计算模板ID
     */
    @Column(name = "access_template_id")
    private Integer accessTemplateId;

    /**
     * 表单输入第一页(JSON)
     */
    @Column(name = "input_page_one")
    private String inputPageOne;

    /**
     * 表单输入第二页(JSON)
     */
    @Column(name = "input_page_two")
    private String inputPageTwo;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return gmt_update
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * @param gmtUpdate
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    /**
     * 获取贷款申请流水号
     *
     * @return apply_no - 贷款申请流水号
     */
    public String getApplyNo() {
        return applyNo;
    }

    /**
     * 设置贷款申请流水号
     *
     * @param applyNo 贷款申请流水号
     */
    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
    }

    /**
     * 获取贷款申请用户唯一标志
     *
     * @return user_uuk - 贷款申请用户唯一标志
     */
    public String getUserUuk() {
        return userUuk;
    }

    /**
     * 设置贷款申请用户唯一标志
     *
     * @param userUuk 贷款申请用户唯一标志
     */
    public void setUserUuk(String userUuk) {
        this.userUuk = userUuk == null ? null : userUuk.trim();
    }

    /**
     * 获取纳税人识别号
     *
     * @return nsrsbh - 纳税人识别号
     */
    public String getNsrsbh() {
        return nsrsbh;
    }

    /**
     * 设置纳税人识别号
     *
     * @param nsrsbh 纳税人识别号
     */
    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh == null ? null : nsrsbh.trim();
    }

    /**
     * 获取 企业名称
     *
     * @return etr_name -  企业名称
     */
    public String getEtrName() {
        return etrName;
    }

    /**
     * 设置 企业名称
     *
     * @param etrName  企业名称
     */
    public void setEtrName(String etrName) {
        this.etrName = etrName == null ? null : etrName.trim();
    }

    /**
     * 获取产品ID
     *
     * @return product_id - 产品ID
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置产品ID
     *
     * @param productId 产品ID
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取产品名称
     *
     * @return product_name - 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名称
     *
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 获取贷款申请期限(3/6)
     *
     * @return loan_term - 贷款申请期限(3/6)
     */
    public Integer getLoanTerm() {
        return loanTerm;
    }

    /**
     * 设置贷款申请期限(3/6)
     *
     * @param loanTerm 贷款申请期限(3/6)
     */
    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    /**
     * 获取贷款额度（万）
     *
     * @return loan_amount - 贷款额度（万）
     */
    public Double getLoanAmount() {
        return loanAmount;
    }

    /**
     * 设置贷款额度（万）
     *
     * @param loanAmount 贷款额度（万）
     */
    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * 获取联系方式
     *
     * @return contact_mobile - 联系方式
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * 设置联系方式
     *
     * @param contactMobile 联系方式
     */
    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile == null ? null : contactMobile.trim();
    }

    /**
     * 获取联系人
     *
     * @return contact_person - 联系人
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * 设置联系人
     *
     * @param contactPerson 联系人
     */
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    /**
     * 获取客户来源渠道
     *
     * @return data_source - 客户来源渠道
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * 设置客户来源渠道
     *
     * @param dataSource 客户来源渠道
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    /**
     * 获取营销推荐代码
     *
     * @return mcode - 营销推荐代码
     */
    public String getMcode() {
        return mcode;
    }

    /**
     * 设置营销推荐代码
     *
     * @param mcode 营销推荐代码
     */
    public void setMcode(String mcode) {
        this.mcode = mcode == null ? null : mcode.trim();
    }

    /**
     * 获取银行ID（支行ID）
     *
     * @return bank_id - 银行ID（支行ID）
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * 设置银行ID（支行ID）
     *
     * @param bankId 银行ID（支行ID）
     */
    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    /**
     * 获取银行CODE
     *
     * @return bank_code - 银行CODE
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置银行CODE
     *
     * @param bankCode 银行CODE
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * 获取银行名称（支行）
     *
     * @return bank_name - 银行名称（支行）
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名称（支行）
     *
     * @param bankName 银行名称（支行）
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 获取行政区划代码
     *
     * @return area_code - 行政区划代码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设置行政区划代码
     *
     * @param areaCode 行政区划代码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 获取行政区划名称
     *
     * @return area_name - 行政区划名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设置行政区划名称
     *
     * @param areaName 行政区划名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 获取状态代码
     *
     * @return status_code - 状态代码
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态代码
     *
     * @param statusCode 状态代码
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    /**
     * 获取状态名称
     *
     * @return status_name - 状态名称
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * 设置状态名称
     *
     * @param statusName 状态名称
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    /**
     * 获取银行授信的贷款期限(3/6)
     *
     * @return permit_loan_term - 银行授信的贷款期限(3/6)
     */
    public Integer getPermitLoanTerm() {
        return permitLoanTerm;
    }

    /**
     * 设置银行授信的贷款期限(3/6)
     *
     * @param permitLoanTerm 银行授信的贷款期限(3/6)
     */
    public void setPermitLoanTerm(Integer permitLoanTerm) {
        this.permitLoanTerm = permitLoanTerm;
    }

    /**
     * 获取银行授信的贷款额度（万）
     *
     * @return permit_loan_amount - 银行授信的贷款额度（万）
     */
    public Double getPermitLoanAmount() {
        return permitLoanAmount;
    }

    /**
     * 设置银行授信的贷款额度（万）
     *
     * @param permitLoanAmount 银行授信的贷款额度（万）
     */
    public void setPermitLoanAmount(Double permitLoanAmount) {
        this.permitLoanAmount = permitLoanAmount;
    }

    /**
     * 获取准入计算模板ID
     *
     * @return access_template_id - 准入计算模板ID
     */
    public Integer getAccessTemplateId() {
        return accessTemplateId;
    }

    /**
     * 设置准入计算模板ID
     *
     * @param accessTemplateId 准入计算模板ID
     */
    public void setAccessTemplateId(Integer accessTemplateId) {
        this.accessTemplateId = accessTemplateId;
    }

    /**
     * 获取表单输入第一页(JSON)
     *
     * @return input_page_one - 表单输入第一页(JSON)
     */
    public String getInputPageOne() {
        return inputPageOne;
    }

    /**
     * 设置表单输入第一页(JSON)
     *
     * @param inputPageOne 表单输入第一页(JSON)
     */
    public void setInputPageOne(String inputPageOne) {
        this.inputPageOne = inputPageOne == null ? null : inputPageOne.trim();
    }

    /**
     * 获取表单输入第二页(JSON)
     *
     * @return input_page_two - 表单输入第二页(JSON)
     */
    public String getInputPageTwo() {
        return inputPageTwo;
    }

    /**
     * 设置表单输入第二页(JSON)
     *
     * @param inputPageTwo 表单输入第二页(JSON)
     */
    public void setInputPageTwo(String inputPageTwo) {
        this.inputPageTwo = inputPageTwo == null ? null : inputPageTwo.trim();
    }
}