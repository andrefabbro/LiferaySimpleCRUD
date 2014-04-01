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

package com.liferay.smartstore.service.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.smartstore.service.model.MobilePhone;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MobilePhone in entity cache.
 *
 * @author Andre Fabbro
 * @see MobilePhone
 * @generated
 */
public class MobilePhoneCacheModel implements CacheModel<MobilePhone>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", brand=");
		sb.append(brand);
		sb.append(", description=");
		sb.append(description);
		sb.append(", releaseDate=");
		sb.append(releaseDate);
		sb.append(", price=");
		sb.append(price);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MobilePhone toEntityModel() {
		MobilePhoneImpl mobilePhoneImpl = new MobilePhoneImpl();

		mobilePhoneImpl.setId(id);
		mobilePhoneImpl.setCompanyId(companyId);
		mobilePhoneImpl.setUserId(userId);

		if (userName == null) {
			mobilePhoneImpl.setUserName(StringPool.BLANK);
		}
		else {
			mobilePhoneImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			mobilePhoneImpl.setCreateDate(null);
		}
		else {
			mobilePhoneImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			mobilePhoneImpl.setModifiedDate(null);
		}
		else {
			mobilePhoneImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			mobilePhoneImpl.setName(StringPool.BLANK);
		}
		else {
			mobilePhoneImpl.setName(name);
		}

		if (brand == null) {
			mobilePhoneImpl.setBrand(StringPool.BLANK);
		}
		else {
			mobilePhoneImpl.setBrand(brand);
		}

		if (description == null) {
			mobilePhoneImpl.setDescription(StringPool.BLANK);
		}
		else {
			mobilePhoneImpl.setDescription(description);
		}

		if (releaseDate == Long.MIN_VALUE) {
			mobilePhoneImpl.setReleaseDate(null);
		}
		else {
			mobilePhoneImpl.setReleaseDate(new Date(releaseDate));
		}

		mobilePhoneImpl.setPrice(price);

		mobilePhoneImpl.resetOriginalValues();

		return mobilePhoneImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		brand = objectInput.readUTF();
		description = objectInput.readUTF();
		releaseDate = objectInput.readLong();
		price = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (brand == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(brand);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(releaseDate);
		objectOutput.writeDouble(price);
	}

	public long id;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String brand;
	public String description;
	public long releaseDate;
	public double price;
}