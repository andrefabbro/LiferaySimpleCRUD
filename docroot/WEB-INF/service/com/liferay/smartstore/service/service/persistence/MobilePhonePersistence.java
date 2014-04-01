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

package com.liferay.smartstore.service.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.smartstore.service.model.MobilePhone;

/**
 * The persistence interface for the mobile phone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Andre Fabbro
 * @see MobilePhonePersistenceImpl
 * @see MobilePhoneUtil
 * @generated
 */
public interface MobilePhonePersistence extends BasePersistence<MobilePhone> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MobilePhoneUtil} to access the mobile phone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mobile phones where name LIKE &#63;.
	*
	* @param name the name
	* @return the matching mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.smartstore.service.model.MobilePhone> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mobile phones where name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.smartstore.service.model.impl.MobilePhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of mobile phones
	* @param end the upper bound of the range of mobile phones (not inclusive)
	* @return the range of matching mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.smartstore.service.model.MobilePhone> findByName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mobile phones where name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.smartstore.service.model.impl.MobilePhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of mobile phones
	* @param end the upper bound of the range of mobile phones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.smartstore.service.model.MobilePhone> findByName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mobile phone in the ordered set where name LIKE &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mobile phone
	* @throws com.liferay.smartstore.service.NoSuchMobilePhoneException if a matching mobile phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone findByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.smartstore.service.NoSuchMobilePhoneException;

	/**
	* Returns the first mobile phone in the ordered set where name LIKE &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mobile phone, or <code>null</code> if a matching mobile phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone fetchByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mobile phone in the ordered set where name LIKE &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mobile phone
	* @throws com.liferay.smartstore.service.NoSuchMobilePhoneException if a matching mobile phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone findByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.smartstore.service.NoSuchMobilePhoneException;

	/**
	* Returns the last mobile phone in the ordered set where name LIKE &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mobile phone, or <code>null</code> if a matching mobile phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone fetchByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mobile phones before and after the current mobile phone in the ordered set where name LIKE &#63;.
	*
	* @param id the primary key of the current mobile phone
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mobile phone
	* @throws com.liferay.smartstore.service.NoSuchMobilePhoneException if a mobile phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone[] findByName_PrevAndNext(
		long id, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.smartstore.service.NoSuchMobilePhoneException;

	/**
	* Removes all the mobile phones where name LIKE &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mobile phones where name LIKE &#63;.
	*
	* @param name the name
	* @return the number of matching mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mobile phones where brand = &#63;.
	*
	* @param brand the brand
	* @return the matching mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.smartstore.service.model.MobilePhone> findByBrand(
		java.lang.String brand)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mobile phones where brand = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.smartstore.service.model.impl.MobilePhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param brand the brand
	* @param start the lower bound of the range of mobile phones
	* @param end the upper bound of the range of mobile phones (not inclusive)
	* @return the range of matching mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.smartstore.service.model.MobilePhone> findByBrand(
		java.lang.String brand, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mobile phones where brand = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.smartstore.service.model.impl.MobilePhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param brand the brand
	* @param start the lower bound of the range of mobile phones
	* @param end the upper bound of the range of mobile phones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.smartstore.service.model.MobilePhone> findByBrand(
		java.lang.String brand, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mobile phone in the ordered set where brand = &#63;.
	*
	* @param brand the brand
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mobile phone
	* @throws com.liferay.smartstore.service.NoSuchMobilePhoneException if a matching mobile phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone findByBrand_First(
		java.lang.String brand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.smartstore.service.NoSuchMobilePhoneException;

	/**
	* Returns the first mobile phone in the ordered set where brand = &#63;.
	*
	* @param brand the brand
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mobile phone, or <code>null</code> if a matching mobile phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone fetchByBrand_First(
		java.lang.String brand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mobile phone in the ordered set where brand = &#63;.
	*
	* @param brand the brand
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mobile phone
	* @throws com.liferay.smartstore.service.NoSuchMobilePhoneException if a matching mobile phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone findByBrand_Last(
		java.lang.String brand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.smartstore.service.NoSuchMobilePhoneException;

	/**
	* Returns the last mobile phone in the ordered set where brand = &#63;.
	*
	* @param brand the brand
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mobile phone, or <code>null</code> if a matching mobile phone could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone fetchByBrand_Last(
		java.lang.String brand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mobile phones before and after the current mobile phone in the ordered set where brand = &#63;.
	*
	* @param id the primary key of the current mobile phone
	* @param brand the brand
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mobile phone
	* @throws com.liferay.smartstore.service.NoSuchMobilePhoneException if a mobile phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone[] findByBrand_PrevAndNext(
		long id, java.lang.String brand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.smartstore.service.NoSuchMobilePhoneException;

	/**
	* Removes all the mobile phones where brand = &#63; from the database.
	*
	* @param brand the brand
	* @throws SystemException if a system exception occurred
	*/
	public void removeByBrand(java.lang.String brand)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mobile phones where brand = &#63;.
	*
	* @param brand the brand
	* @return the number of matching mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public int countByBrand(java.lang.String brand)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mobile phone in the entity cache if it is enabled.
	*
	* @param mobilePhone the mobile phone
	*/
	public void cacheResult(
		com.liferay.smartstore.service.model.MobilePhone mobilePhone);

	/**
	* Caches the mobile phones in the entity cache if it is enabled.
	*
	* @param mobilePhones the mobile phones
	*/
	public void cacheResult(
		java.util.List<com.liferay.smartstore.service.model.MobilePhone> mobilePhones);

	/**
	* Creates a new mobile phone with the primary key. Does not add the mobile phone to the database.
	*
	* @param id the primary key for the new mobile phone
	* @return the new mobile phone
	*/
	public com.liferay.smartstore.service.model.MobilePhone create(long id);

	/**
	* Removes the mobile phone with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mobile phone
	* @return the mobile phone that was removed
	* @throws com.liferay.smartstore.service.NoSuchMobilePhoneException if a mobile phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.smartstore.service.NoSuchMobilePhoneException;

	public com.liferay.smartstore.service.model.MobilePhone updateImpl(
		com.liferay.smartstore.service.model.MobilePhone mobilePhone)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mobile phone with the primary key or throws a {@link com.liferay.smartstore.service.NoSuchMobilePhoneException} if it could not be found.
	*
	* @param id the primary key of the mobile phone
	* @return the mobile phone
	* @throws com.liferay.smartstore.service.NoSuchMobilePhoneException if a mobile phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.smartstore.service.NoSuchMobilePhoneException;

	/**
	* Returns the mobile phone with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mobile phone
	* @return the mobile phone, or <code>null</code> if a mobile phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.smartstore.service.model.MobilePhone fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mobile phones.
	*
	* @return the mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.smartstore.service.model.MobilePhone> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mobile phones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.smartstore.service.model.impl.MobilePhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mobile phones
	* @param end the upper bound of the range of mobile phones (not inclusive)
	* @return the range of mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.smartstore.service.model.MobilePhone> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mobile phones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.smartstore.service.model.impl.MobilePhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mobile phones
	* @param end the upper bound of the range of mobile phones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.smartstore.service.model.MobilePhone> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mobile phones from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mobile phones.
	*
	* @return the number of mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}