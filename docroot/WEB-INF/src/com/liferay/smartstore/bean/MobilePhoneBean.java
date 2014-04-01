/**
 * 
 */
package com.liferay.smartstore.bean;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.smartstore.service.model.MobilePhone;
import com.liferay.smartstore.service.model.impl.MobilePhoneImpl;
import com.liferay.smartstore.service.service.MobilePhoneLocalServiceUtil;

/**
 * @author andrefabbro
 * 
 */
@ManagedBean(name = "mobilePhoneBean")
public class MobilePhoneBean {

	private MobilePhone mobilePhone = new MobilePhoneImpl();

	private List<MobilePhone> results;

	public MobilePhoneBean() {
		list();
	}

	/**
	 * creates a new instance of mobilePhone to load new form
	 */
	public void reset() {
		mobilePhone = new MobilePhoneImpl();
	}

	/**
	 * Load the phone to edit
	 * 
	 * @param id
	 */
	public void load(long id) {
		try {
			mobilePhone = MobilePhoneLocalServiceUtil.getMobilePhone(id);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	/**
	 * List all phones
	 * 
	 * @param actionEvent
	 */
	public void list(ActionEvent actionEvent) {
		list();
	}
	
	private void list() {
		try {
			results = MobilePhoneLocalServiceUtil.getMobilePhones(
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Delete a phone by id
	 * 
	 * @param id
	 */
	public void delete(long id) {
		try {
			MobilePhoneLocalServiceUtil.deleteMobilePhone(id);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Phone has been deleted"));
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		list();
	}

	/**
	 * Save a MobilePhone
	 * 
	 * @param actionEvent
	 * @throws Exception
	 */
	public void save(ActionEvent actionEvent) {
		if (mobilePhone.getId() == 0)
			this.addMobilePhone();
		else
			this.updateMobilePhone();
		list();
	}

	private void addMobilePhone() {
		try {

			ThemeDisplay themeDisplay = (ThemeDisplay) FacesContext
					.getCurrentInstance().getExternalContext().getRequestMap()
					.get("THEME_DISPLAY");

			if(themeDisplay != null) {
				long companyId = themeDisplay.getCompanyId();
				long userid = themeDisplay.getUserId();

				mobilePhone.setCompanyId(companyId);
				mobilePhone.setUserId(userid);
			}
			
			mobilePhone.setCreateDate(new Date());

			long id = CounterLocalServiceUtil.increment(MobilePhone.class
					.getName());
			mobilePhone.setId(id);

			MobilePhoneLocalServiceUtil.addMobilePhone(mobilePhone);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Phone has been saved"));

		} catch (SystemException e) {
			mobilePhone.setId(0l);
			e.printStackTrace();
		}
	}

	private void updateMobilePhone() {

		mobilePhone.setModifiedDate(new Date());

		try {
			MobilePhoneLocalServiceUtil.updateMobilePhone(mobilePhone);

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Phone has been saved"));

		} catch (SystemException e) {
			e.printStackTrace();
		}

	}

	public MobilePhone getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(MobilePhone mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public List<MobilePhone> getResults() {
		return results;
	}

	public void setResults(List<MobilePhone> results) {
		this.results = results;
	}

}
