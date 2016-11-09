/*
 * Copyright (C) 2014 SEC BFO, Inc. All Rights Reserved.
 */
package demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account
{
	private static final long serialVersionUID = 8513431614664165895L;
	@Id
	private Integer id;

	private Integer acctAnnualMacOutput;
	private String seAcctId;
	private String acctId;
	private String acctNameZh;
	private String acctNameEn;
	private String orgCode;
	private String country;
	private String province;
	private String city;
	private String countryName;
	private String provinceName;
	private String cityName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAcctAnnualMacOutput() {
        return acctAnnualMacOutput;
    }

    public void setAcctAnnualMacOutput(Integer acctAnnualMacOutput) {
        this.acctAnnualMacOutput = acctAnnualMacOutput;
    }

    public String getSeAcctId() {
        return seAcctId;
    }

    public void setSeAcctId(String seAcctId) {
        this.seAcctId = seAcctId;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getAcctNameZh() {
        return acctNameZh;
    }

    public void setAcctNameZh(String acctNameZh) {
        this.acctNameZh = acctNameZh;
    }

    public String getAcctNameEn() {
        return acctNameEn;
    }

    public void setAcctNameEn(String acctNameEn) {
        this.acctNameEn = acctNameEn;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
