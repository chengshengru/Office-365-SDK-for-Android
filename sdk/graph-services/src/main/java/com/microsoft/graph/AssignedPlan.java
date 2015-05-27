/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.graph;

import com.microsoft.services.orc.ODataBaseEntity;


/**
 * The type Assigned Plan.
*/
public class AssignedPlan extends ODataBaseEntity {

    public AssignedPlan(){
        setODataType("#Microsoft.Graph.AssignedPlan");
    }

    private java.util.Calendar assignedTimestamp;

    /**
    * Gets the assigned Timestamp.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getassignedTimestamp() {
        return this.assignedTimestamp; 
    }

    /**
    * Sets the assigned Timestamp.
    *
    * @param value the java.util.Calendar
    */
    public void setassignedTimestamp(java.util.Calendar value) { 
        this.assignedTimestamp = value;
        valueChanged("assignedTimestamp", value);

    }

    private String capabilityStatus;

    /**
    * Gets the capability Status.
    *
    * @return the String
    */
    public String getcapabilityStatus() {
        return this.capabilityStatus; 
    }

    /**
    * Sets the capability Status.
    *
    * @param value the String
    */
    public void setcapabilityStatus(String value) { 
        this.capabilityStatus = value;
        valueChanged("capabilityStatus", value);

    }

    private String service;

    /**
    * Gets the service.
    *
    * @return the String
    */
    public String getservice() {
        return this.service; 
    }

    /**
    * Sets the service.
    *
    * @param value the String
    */
    public void setservice(String value) { 
        this.service = value;
        valueChanged("service", value);

    }

    private java.util.UUID servicePlanId;

    /**
    * Gets the service Plan Id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getservicePlanId() {
        return this.servicePlanId; 
    }

    /**
    * Sets the service Plan Id.
    *
    * @param value the java.util.UUID
    */
    public void setservicePlanId(java.util.UUID value) { 
        this.servicePlanId = value;
        valueChanged("servicePlanId", value);

    }
}
