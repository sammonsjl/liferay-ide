/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.roster.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the RosterMember service. Represents a row in the &quot;ROSTER_RosterMember&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.roster.model.impl.RosterMemberModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.roster.model.impl.RosterMemberImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RosterMember
 * @see com.liferay.roster.model.impl.RosterMemberImpl
 * @see com.liferay.roster.model.impl.RosterMemberModelImpl
 * @generated
 */
@ProviderType
public interface RosterMemberModel extends BaseModel<RosterMember> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a roster member model instance should use the {@link RosterMember} interface instead.
	 */

	/**
	 * Returns the primary key of this roster member.
	 *
	 * @return the primary key of this roster member
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this roster member.
	 *
	 * @param primaryKey the primary key of this roster member
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this roster member.
	 *
	 * @return the uuid of this roster member
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this roster member.
	 *
	 * @param uuid the uuid of this roster member
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the roster member ID of this roster member.
	 *
	 * @return the roster member ID of this roster member
	 */
	public long getRosterMemberId();

	/**
	 * Sets the roster member ID of this roster member.
	 *
	 * @param rosterMemberId the roster member ID of this roster member
	 */
	public void setRosterMemberId(long rosterMemberId);

	/**
	 * Returns the create date of this roster member.
	 *
	 * @return the create date of this roster member
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this roster member.
	 *
	 * @param createDate the create date of this roster member
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this roster member.
	 *
	 * @return the modified date of this roster member
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this roster member.
	 *
	 * @param modifiedDate the modified date of this roster member
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the roster ID of this roster member.
	 *
	 * @return the roster ID of this roster member
	 */
	public long getRosterId();

	/**
	 * Sets the roster ID of this roster member.
	 *
	 * @param rosterId the roster ID of this roster member
	 */
	public void setRosterId(long rosterId);

	/**
	 * Returns the contact ID of this roster member.
	 *
	 * @return the contact ID of this roster member
	 */
	public long getContactId();

	/**
	 * Sets the contact ID of this roster member.
	 *
	 * @param contactId the contact ID of this roster member
	 */
	public void setContactId(long contactId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.roster.model.RosterMember rosterMember);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.roster.model.RosterMember> toCacheModel();

	@Override
	public com.liferay.roster.model.RosterMember toEscapedModel();

	@Override
	public com.liferay.roster.model.RosterMember toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}