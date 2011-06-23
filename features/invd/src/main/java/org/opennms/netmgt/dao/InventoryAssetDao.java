//
// This file is part of the OpenNMS(R) Application.
//
// OpenNMS(R) is Copyright (C) 2006 The OpenNMS Group, Inc.  All rights reserved.
// OpenNMS(R) is a derivative work, containing both original code, included code and modified
// code that was published under the GNU General Public License. Copyrights for modified
// and included code are below.
//
// OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
//
// Original code base Copyright (C) 1999-2001 Oculan Corp.  All rights reserved.
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
//
// For more information contact:
// OpenNMS Licensing       <license@opennms.org>
//     http://www.opennms.org/
//     http://www.opennms.com/
//
package org.opennms.netmgt.dao;

import org.opennms.netmgt.model.OnmsNode;
import org.opennms.netmgt.model.inventory.OnmsInventoryAsset;
import org.opennms.netmgt.model.inventory.OnmsInventoryCategory;

import java.util.Collection;
import java.util.Date;

public interface InventoryAssetDao extends OnmsDao<OnmsInventoryAsset, Integer> {
    public abstract OnmsInventoryAsset findByAssetId(int id);
    
    public abstract Collection<OnmsInventoryAsset> findAllEffectiveDate(Date effdt, Boolean effStatus);
    public abstract Collection<OnmsInventoryAsset> findAll(final Integer offset, final Integer limit);
    
    public abstract Collection<OnmsInventoryAsset> findByName(String name);
    public abstract Collection<OnmsInventoryAsset> findByNameEffectiveDate(String name, Date effdt, Boolean effStatus);
    
    public abstract Collection<OnmsInventoryAsset> findByNameAndNodeEffectiveDate(String name, OnmsNode owner, Date effdt, Boolean effStatus);
    public abstract Collection<OnmsInventoryAsset> findByNameAndNode(String name, OnmsNode owner);
    
    public abstract OnmsInventoryAsset findByNameNodeAndCategory(String name, OnmsNode owner, OnmsInventoryCategory cat);
    public abstract OnmsInventoryAsset findByNameNodeAndCategoryEffectiveDate(String name, OnmsNode owner, OnmsInventoryCategory cat, Date effdt, Boolean effStatus);
    public abstract Collection<OnmsInventoryAsset> findByCategoryAndNode(OnmsInventoryCategory category, OnmsNode owner);
    public abstract Collection<OnmsInventoryAsset> findByCategoryAndNodeEffectiveDate(OnmsInventoryCategory category, OnmsNode owner, Date effdt, Boolean effStatus);
}

