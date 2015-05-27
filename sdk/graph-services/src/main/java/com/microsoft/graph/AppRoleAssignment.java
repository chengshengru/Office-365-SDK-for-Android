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



/**
 * The type App Role Assignment.
*/
public class AppRoleAssignment extends DirectoryObject {

    public AppRoleAssignment(){
        setODataType("#Microsoft.Graph.AppRoleAssignment");
    }
            
    private java.util.Calendar creationTimestamp;
     
    /**
    * Gets the creation Timestamp.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getcreationTimestamp() {
        return this.creationTimestamp; 
    }

    /**
    * Sets the creation Timestamp.
    *
    * @param value the java.util.Calendar
    */
    public void setcreationTimestamp(java.util.Calendar value) { 
        this.creationTimestamp = value; 
        valueChanged("creationTimestamp", value);

    }
            
    private java.util.UUID id;
     
    /**
    * Gets the id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getid() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the java.util.UUID
    */
    public void setid(java.util.UUID value) { 
        this.id = value; 
        valueChanged("id", value);

    }
            
    private String principalDisplayName;
     
    /**
    * Gets the principal Display Name.
    *
    * @return the String
    */
    public String getprincipalDisplayName() {
        return this.principalDisplayName; 
    }

    /**
    * Sets the principal Display Name.
    *
    * @param value the String
    */
    public void setprincipalDisplayName(String value) { 
        this.principalDisplayName = value; 
        valueChanged("principalDisplayName", value);

    }
            
    private java.util.UUID principalId;
     
    /**
    * Gets the principal Id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getprincipalId() {
        return this.principalId; 
    }

    /**
    * Sets the principal Id.
    *
    * @param value the java.util.UUID
    */
    public void setprincipalId(java.util.UUID value) { 
        this.principalId = value; 
        valueChanged("principalId", value);

    }
            
    private String principalType;
     
    /**
    * Gets the principal Type.
    *
    * @return the String
    */
    public String getprincipalType() {
        return this.principalType; 
    }

    /**
    * Sets the principal Type.
    *
    * @param value the String
    */
    public void setprincipalType(String value) { 
        this.principalType = value; 
        valueChanged("principalType", value);

    }
            
    private String resourceDisplayName;
     
    /**
    * Gets the resource Display Name.
    *
    * @return the String
    */
    public String getresourceDisplayName() {
        return this.resourceDisplayName; 
    }

    /**
    * Sets the resource Display Name.
    *
    * @param value the String
    */
    public void setresourceDisplayName(String value) { 
        this.resourceDisplayName = value; 
        valueChanged("resourceDisplayName", value);

    }
            
    private java.util.UUID resourceId;
     
    /**
    * Gets the resource Id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getresourceId() {
        return this.resourceId; 
    }

    /**
    * Sets the resource Id.
    *
    * @param value the java.util.UUID
    */
    public void setresourceId(java.util.UUID value) { 
        this.resourceId = value; 
        valueChanged("resourceId", value);

    }
}

