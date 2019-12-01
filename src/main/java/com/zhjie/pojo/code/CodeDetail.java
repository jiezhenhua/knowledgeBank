package com.zhjie.pojo.code;

import java.io.Serializable;
import java.util.Date;

public class CodeDetail implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_code_detail.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_code_detail.CODE_ID
     *
     * @mbggenerated
     */
    private String codeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_code_detail.CODE_NAME
     *
     * @mbggenerated
     */
    private String codeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_code_detail.CODE_VALUE
     *
     * @mbggenerated
     */
    private String codeValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_code_detail.insert_time
     *
     * @mbggenerated
     */
    private Date insertTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_code_detail.insert_user
     *
     * @mbggenerated
     */
    private String insertUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_code_detail.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_knowledge_code_detail
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_code_detail.ID
     *
     * @return the value of t_knowledge_code_detail.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_code_detail.ID
     *
     * @param id the value for t_knowledge_code_detail.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_code_detail.CODE_ID
     *
     * @return the value of t_knowledge_code_detail.CODE_ID
     *
     * @mbggenerated
     */
    public String getCodeId() {
        return codeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_code_detail.CODE_ID
     *
     * @param codeId the value for t_knowledge_code_detail.CODE_ID
     *
     * @mbggenerated
     */
    public void setCodeId(String codeId) {
        this.codeId = codeId == null ? null : codeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_code_detail.CODE_NAME
     *
     * @return the value of t_knowledge_code_detail.CODE_NAME
     *
     * @mbggenerated
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_code_detail.CODE_NAME
     *
     * @param codeName the value for t_knowledge_code_detail.CODE_NAME
     *
     * @mbggenerated
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_code_detail.CODE_VALUE
     *
     * @return the value of t_knowledge_code_detail.CODE_VALUE
     *
     * @mbggenerated
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_code_detail.CODE_VALUE
     *
     * @param codeValue the value for t_knowledge_code_detail.CODE_VALUE
     *
     * @mbggenerated
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null ? null : codeValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_code_detail.insert_time
     *
     * @return the value of t_knowledge_code_detail.insert_time
     *
     * @mbggenerated
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_code_detail.insert_time
     *
     * @param insertTime the value for t_knowledge_code_detail.insert_time
     *
     * @mbggenerated
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_code_detail.insert_user
     *
     * @return the value of t_knowledge_code_detail.insert_user
     *
     * @mbggenerated
     */
    public String getInsertUser() {
        return insertUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_code_detail.insert_user
     *
     * @param insertUser the value for t_knowledge_code_detail.insert_user
     *
     * @mbggenerated
     */
    public void setInsertUser(String insertUser) {
        this.insertUser = insertUser == null ? null : insertUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_code_detail.update_time
     *
     * @return the value of t_knowledge_code_detail.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_code_detail.update_time
     *
     * @param updateTime the value for t_knowledge_code_detail.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_code_detail
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CodeDetail other = (CodeDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCodeId() == null ? other.getCodeId() == null : this.getCodeId().equals(other.getCodeId()))
            && (this.getCodeName() == null ? other.getCodeName() == null : this.getCodeName().equals(other.getCodeName()))
            && (this.getCodeValue() == null ? other.getCodeValue() == null : this.getCodeValue().equals(other.getCodeValue()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getInsertUser() == null ? other.getInsertUser() == null : this.getInsertUser().equals(other.getInsertUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_code_detail
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCodeId() == null) ? 0 : getCodeId().hashCode());
        result = prime * result + ((getCodeName() == null) ? 0 : getCodeName().hashCode());
        result = prime * result + ((getCodeValue() == null) ? 0 : getCodeValue().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getInsertUser() == null) ? 0 : getInsertUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_code_detail
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", codeId=").append(codeId);
        sb.append(", codeName=").append(codeName);
        sb.append(", codeValue=").append(codeValue);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", insertUser=").append(insertUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}