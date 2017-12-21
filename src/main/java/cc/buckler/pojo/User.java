package cc.buckler.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer port;

    private String passwd;

    private Long transferEnable;

    private Long u;

    private Long d;

    private Integer t;

    private Byte enable;

    private String method;

    private String customMethod;

    private String protocol;

    private String protocolParam;

    private String obfs;

    private String obfsParam;

    private Integer speedLimitPerCon;

    private Integer speedLimitPerUser;

    private Byte gender;

    private String wechat;

    private String qq;

    private Byte usage;

    private Byte payWay;

    private BigDecimal balance;

    private Integer score;

    private Date enableTime;

    private Date expireTime;

    private Integer banTime;

    private Byte level;

    private Byte isAdmin;

    private String regIp;

    private Integer lastLogin;

    private Integer referralUid;

    private Byte status;

    private Date createdAt;

    private Date updatedAt;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public Long getTransferEnable() {
        return transferEnable;
    }

    public void setTransferEnable(Long transferEnable) {
        this.transferEnable = transferEnable;
    }

    public Long getU() {
        return u;
    }

    public void setU(Long u) {
        this.u = u;
    }

    public Long getD() {
        return d;
    }

    public void setD(Long d) {
        this.d = d;
    }

    public Integer getT() {
        return t;
    }

    public void setT(Integer t) {
        this.t = t;
    }

    public Byte getEnable() {
        return enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getCustomMethod() {
        return customMethod;
    }

    public void setCustomMethod(String customMethod) {
        this.customMethod = customMethod == null ? null : customMethod.trim();
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }

    public String getProtocolParam() {
        return protocolParam;
    }

    public void setProtocolParam(String protocolParam) {
        this.protocolParam = protocolParam == null ? null : protocolParam.trim();
    }

    public String getObfs() {
        return obfs;
    }

    public void setObfs(String obfs) {
        this.obfs = obfs == null ? null : obfs.trim();
    }

    public String getObfsParam() {
        return obfsParam;
    }

    public void setObfsParam(String obfsParam) {
        this.obfsParam = obfsParam == null ? null : obfsParam.trim();
    }

    public Integer getSpeedLimitPerCon() {
        return speedLimitPerCon;
    }

    public void setSpeedLimitPerCon(Integer speedLimitPerCon) {
        this.speedLimitPerCon = speedLimitPerCon;
    }

    public Integer getSpeedLimitPerUser() {
        return speedLimitPerUser;
    }

    public void setSpeedLimitPerUser(Integer speedLimitPerUser) {
        this.speedLimitPerUser = speedLimitPerUser;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Byte getUsage() {
        return usage;
    }

    public void setUsage(Byte usage) {
        this.usage = usage;
    }

    public Byte getPayWay() {
        return payWay;
    }

    public void setPayWay(Byte payWay) {
        this.payWay = payWay;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(Date enableTime) {
        this.enableTime = enableTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getBanTime() {
        return banTime;
    }

    public void setBanTime(Integer banTime) {
        this.banTime = banTime;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Byte getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public Integer getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Integer lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getReferralUid() {
        return referralUid;
    }

    public void setReferralUid(Integer referralUid) {
        this.referralUid = referralUid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}