/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.onenote;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Copy Notebook Model.
*/
public class CopyNotebookModel extends ODataBaseEntity {

    public CopyNotebookModel(){
        setODataType("#Microsoft.OneNote.Api.CopyNotebookModel");
    }

    private Boolean isDefault;

    /**
    * Gets the is Default.
    *
    * @return the Boolean
    */
    public Boolean getIsDefault() {
        return this.isDefault; 
    }

    /**
    * Sets the is Default.
    *
    * @param value the Boolean
    */
    public void setIsDefault(Boolean value) { 
        this.isDefault = value;
        valueChanged("isDefault", value);

    }

    private UserRole userRole;

    /**
    * Gets the user Role.
    *
    * @return the UserRole
    */
    public UserRole getUserRole() {
        return this.userRole; 
    }

    /**
    * Sets the user Role.
    *
    * @param value the UserRole
    */
    public void setUserRole(UserRole value) { 
        this.userRole = value;
        valueChanged("userRole", value);

    }

    private Boolean isShared;

    /**
    * Gets the is Shared.
    *
    * @return the Boolean
    */
    public Boolean getIsShared() {
        return this.isShared; 
    }

    /**
    * Sets the is Shared.
    *
    * @param value the Boolean
    */
    public void setIsShared(Boolean value) { 
        this.isShared = value;
        valueChanged("isShared", value);

    }

    private String sectionsUrl;

    /**
    * Gets the sections Url.
    *
    * @return the String
    */
    public String getSectionsUrl() {
        return this.sectionsUrl; 
    }

    /**
    * Sets the sections Url.
    *
    * @param value the String
    */
    public void setSectionsUrl(String value) { 
        this.sectionsUrl = value;
        valueChanged("sectionsUrl", value);

    }

    private String sectionGroupsUrl;

    /**
    * Gets the section Groups Url.
    *
    * @return the String
    */
    public String getSectionGroupsUrl() {
        return this.sectionGroupsUrl; 
    }

    /**
    * Sets the section Groups Url.
    *
    * @param value the String
    */
    public void setSectionGroupsUrl(String value) { 
        this.sectionGroupsUrl = value;
        valueChanged("sectionGroupsUrl", value);

    }

    private NotebookLinks links;

    /**
    * Gets the links.
    *
    * @return the NotebookLinks
    */
    public NotebookLinks getLinks() {
        return this.links; 
    }

    /**
    * Sets the links.
    *
    * @param value the NotebookLinks
    */
    public void setLinks(NotebookLinks value) { 
        this.links = value;
        valueChanged("links", value);

    }

    private String name;

    /**
    * Gets the name.
    *
    * @return the String
    */
    public String getName() {
        return this.name; 
    }

    /**
    * Sets the name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.name = value;
        valueChanged("name", value);

    }

    private String createdBy;

    /**
    * Gets the created By.
    *
    * @return the String
    */
    public String getCreatedBy() {
        return this.createdBy; 
    }

    /**
    * Sets the created By.
    *
    * @param value the String
    */
    public void setCreatedBy(String value) { 
        this.createdBy = value;
        valueChanged("createdBy", value);

    }

    private String lastModifiedBy;

    /**
    * Gets the last Modified By.
    *
    * @return the String
    */
    public String getLastModifiedBy() {
        return this.lastModifiedBy; 
    }

    /**
    * Sets the last Modified By.
    *
    * @param value the String
    */
    public void setLastModifiedBy(String value) { 
        this.lastModifiedBy = value;
        valueChanged("lastModifiedBy", value);

    }

    private java.util.Calendar lastModifiedTime;

    /**
    * Gets the last Modified Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastModifiedTime() {
        return this.lastModifiedTime; 
    }

    /**
    * Sets the last Modified Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastModifiedTime(java.util.Calendar value) { 
        this.lastModifiedTime = value;
        valueChanged("lastModifiedTime", value);

    }

    private String id;

    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getId() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setId(String value) { 
        this.id = value;
        valueChanged("id", value);

    }

    private String self;

    /**
    * Gets the self.
    *
    * @return the String
    */
    public String getSelf() {
        return this.self; 
    }

    /**
    * Sets the self.
    *
    * @param value the String
    */
    public void setSelf(String value) { 
        this.self = value;
        valueChanged("self", value);

    }

    private java.util.Calendar createdTime;

    /**
    * Gets the created Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getCreatedTime() {
        return this.createdTime; 
    }

    /**
    * Sets the created Time.
    *
    * @param value the java.util.Calendar
    */
    public void setCreatedTime(java.util.Calendar value) { 
        this.createdTime = value;
        valueChanged("createdTime", value);

    }
}
