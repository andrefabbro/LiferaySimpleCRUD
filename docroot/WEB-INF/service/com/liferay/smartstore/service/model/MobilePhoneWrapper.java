/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.smartstore.service.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MobilePhone}.
 * </p>
 *
 * @author Andre Fabbro
 * @see MobilePhone
 * @generated
 */
public class MobilePhoneWrapper implements MobilePhone,
	ModelWrapper<MobilePhone> {
	public MobilePhoneWrapper(MobilePhone mobilePhone) {
		_mobilePhone = mobilePhone;
	}

	@Override
	public Class<?> getModelClass() {
		return MobilePhone.class;
	}

	@Override
	public String getModelClassName() {
		return MobilePhone.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("brand", getBrand());
		attributes.put("description", getDescription());
		attributes.put("releaseDate", getReleaseDate());
		attributes.put("price", getPrice());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String brand = (String)attributes.get("brand");

		if (brand != null) {
			setBrand(brand);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date releaseDate = (Date)attributes.get("releaseDate");

		if (releaseDate != null) {
			setReleaseDate(releaseDate);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}
	}

	/**
	* Returns the primary key of this mobile phone.
	*
	* @return the primary key of this mobile phone
	*/
	@Override
	public long getPrimaryKey() {
		return _mobilePhone.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mobile phone.
	*
	* @param primaryKey the primary key of this mobile phone
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mobilePhone.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mobile phone.
	*
	* @return the ID of this mobile phone
	*/
	@Override
	public long getId() {
		return _mobilePhone.getId();
	}

	/**
	* Sets the ID of this mobile phone.
	*
	* @param id the ID of this mobile phone
	*/
	@Override
	public void setId(long id) {
		_mobilePhone.setId(id);
	}

	/**
	* Returns the company ID of this mobile phone.
	*
	* @return the company ID of this mobile phone
	*/
	@Override
	public long getCompanyId() {
		return _mobilePhone.getCompanyId();
	}

	/**
	* Sets the company ID of this mobile phone.
	*
	* @param companyId the company ID of this mobile phone
	*/
	@Override
	public void setCompanyId(long companyId) {
		_mobilePhone.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this mobile phone.
	*
	* @return the user ID of this mobile phone
	*/
	@Override
	public long getUserId() {
		return _mobilePhone.getUserId();
	}

	/**
	* Sets the user ID of this mobile phone.
	*
	* @param userId the user ID of this mobile phone
	*/
	@Override
	public void setUserId(long userId) {
		_mobilePhone.setUserId(userId);
	}

	/**
	* Returns the user uuid of this mobile phone.
	*
	* @return the user uuid of this mobile phone
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhone.getUserUuid();
	}

	/**
	* Sets the user uuid of this mobile phone.
	*
	* @param userUuid the user uuid of this mobile phone
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_mobilePhone.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this mobile phone.
	*
	* @return the user name of this mobile phone
	*/
	@Override
	public java.lang.String getUserName() {
		return _mobilePhone.getUserName();
	}

	/**
	* Sets the user name of this mobile phone.
	*
	* @param userName the user name of this mobile phone
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_mobilePhone.setUserName(userName);
	}

	/**
	* Returns the create date of this mobile phone.
	*
	* @return the create date of this mobile phone
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _mobilePhone.getCreateDate();
	}

	/**
	* Sets the create date of this mobile phone.
	*
	* @param createDate the create date of this mobile phone
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_mobilePhone.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this mobile phone.
	*
	* @return the modified date of this mobile phone
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _mobilePhone.getModifiedDate();
	}

	/**
	* Sets the modified date of this mobile phone.
	*
	* @param modifiedDate the modified date of this mobile phone
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_mobilePhone.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this mobile phone.
	*
	* @return the name of this mobile phone
	*/
	@Override
	public java.lang.String getName() {
		return _mobilePhone.getName();
	}

	/**
	* Sets the name of this mobile phone.
	*
	* @param name the name of this mobile phone
	*/
	@Override
	public void setName(java.lang.String name) {
		_mobilePhone.setName(name);
	}

	/**
	* Returns the brand of this mobile phone.
	*
	* @return the brand of this mobile phone
	*/
	@Override
	public java.lang.String getBrand() {
		return _mobilePhone.getBrand();
	}

	/**
	* Sets the brand of this mobile phone.
	*
	* @param brand the brand of this mobile phone
	*/
	@Override
	public void setBrand(java.lang.String brand) {
		_mobilePhone.setBrand(brand);
	}

	/**
	* Returns the description of this mobile phone.
	*
	* @return the description of this mobile phone
	*/
	@Override
	public java.lang.String getDescription() {
		return _mobilePhone.getDescription();
	}

	/**
	* Sets the description of this mobile phone.
	*
	* @param description the description of this mobile phone
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_mobilePhone.setDescription(description);
	}

	/**
	* Returns the release date of this mobile phone.
	*
	* @return the release date of this mobile phone
	*/
	@Override
	public java.util.Date getReleaseDate() {
		return _mobilePhone.getReleaseDate();
	}

	/**
	* Sets the release date of this mobile phone.
	*
	* @param releaseDate the release date of this mobile phone
	*/
	@Override
	public void setReleaseDate(java.util.Date releaseDate) {
		_mobilePhone.setReleaseDate(releaseDate);
	}

	/**
	* Returns the price of this mobile phone.
	*
	* @return the price of this mobile phone
	*/
	@Override
	public double getPrice() {
		return _mobilePhone.getPrice();
	}

	/**
	* Sets the price of this mobile phone.
	*
	* @param price the price of this mobile phone
	*/
	@Override
	public void setPrice(double price) {
		_mobilePhone.setPrice(price);
	}

	@Override
	public boolean isNew() {
		return _mobilePhone.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_mobilePhone.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _mobilePhone.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mobilePhone.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _mobilePhone.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _mobilePhone.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_mobilePhone.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _mobilePhone.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_mobilePhone.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_mobilePhone.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_mobilePhone.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MobilePhoneWrapper((MobilePhone)_mobilePhone.clone());
	}

	@Override
	public int compareTo(MobilePhone mobilePhone) {
		return _mobilePhone.compareTo(mobilePhone);
	}

	@Override
	public int hashCode() {
		return _mobilePhone.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<MobilePhone> toCacheModel() {
		return _mobilePhone.toCacheModel();
	}

	@Override
	public MobilePhone toEscapedModel() {
		return new MobilePhoneWrapper(_mobilePhone.toEscapedModel());
	}

	@Override
	public MobilePhone toUnescapedModel() {
		return new MobilePhoneWrapper(_mobilePhone.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _mobilePhone.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _mobilePhone.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_mobilePhone.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MobilePhoneWrapper)) {
			return false;
		}

		MobilePhoneWrapper mobilePhoneWrapper = (MobilePhoneWrapper)obj;

		if (Validator.equals(_mobilePhone, mobilePhoneWrapper._mobilePhone)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MobilePhone getWrappedMobilePhone() {
		return _mobilePhone;
	}

	@Override
	public MobilePhone getWrappedModel() {
		return _mobilePhone;
	}

	@Override
	public void resetOriginalValues() {
		_mobilePhone.resetOriginalValues();
	}

	private MobilePhone _mobilePhone;
}