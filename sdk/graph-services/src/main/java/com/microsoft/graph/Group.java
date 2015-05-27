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
 * The type Group.
*/
public class Group extends DirectoryObject {

    public Group(){
        setODataType("#Microsoft.Graph.Group");
    }
            
    private String description;
     
    /**
    * Gets the description.
    *
    * @return the String
    */
    public String getdescription() {
        return this.description; 
    }

    /**
    * Sets the description.
    *
    * @param value the String
    */
    public void setdescription(String value) { 
        this.description = value; 
        valueChanged("description", value);

    }
            
    private Boolean dirSyncEnabled;
     
    /**
    * Gets the dir Sync Enabled.
    *
    * @return the Boolean
    */
    public Boolean getdirSyncEnabled() {
        return this.dirSyncEnabled; 
    }

    /**
    * Sets the dir Sync Enabled.
    *
    * @param value the Boolean
    */
    public void setdirSyncEnabled(Boolean value) { 
        this.dirSyncEnabled = value; 
        valueChanged("dirSyncEnabled", value);

    }
            
    private String displayName;
     
    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getdisplayName() {
        return this.displayName; 
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setdisplayName(String value) { 
        this.displayName = value; 
        valueChanged("displayName", value);

    }
            
    private String groupType;
     
    /**
    * Gets the group Type.
    *
    * @return the String
    */
    public String getgroupType() {
        return this.groupType; 
    }

    /**
    * Sets the group Type.
    *
    * @param value the String
    */
    public void setgroupType(String value) { 
        this.groupType = value; 
        valueChanged("groupType", value);

    }
            
    private Boolean isPublic;
     
    /**
    * Gets the is Public.
    *
    * @return the Boolean
    */
    public Boolean getisPublic() {
        return this.isPublic; 
    }

    /**
    * Sets the is Public.
    *
    * @param value the Boolean
    */
    public void setisPublic(Boolean value) { 
        this.isPublic = value; 
        valueChanged("isPublic", value);

    }
            
    private java.util.Calendar lastDirSyncTime;
     
    /**
    * Gets the last Dir Sync Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getlastDirSyncTime() {
        return this.lastDirSyncTime; 
    }

    /**
    * Sets the last Dir Sync Time.
    *
    * @param value the java.util.Calendar
    */
    public void setlastDirSyncTime(java.util.Calendar value) { 
        this.lastDirSyncTime = value; 
        valueChanged("lastDirSyncTime", value);

    }
            
    private String mail;
     
    /**
    * Gets the mail.
    *
    * @return the String
    */
    public String getmail() {
        return this.mail; 
    }

    /**
    * Sets the mail.
    *
    * @param value the String
    */
    public void setmail(String value) { 
        this.mail = value; 
        valueChanged("mail", value);

    }
            
    private String mailNickname;
     
    /**
    * Gets the mail Nickname.
    *
    * @return the String
    */
    public String getmailNickname() {
        return this.mailNickname; 
    }

    /**
    * Sets the mail Nickname.
    *
    * @param value the String
    */
    public void setmailNickname(String value) { 
        this.mailNickname = value; 
        valueChanged("mailNickname", value);

    }
            
    private Boolean mailEnabled;
     
    /**
    * Gets the mail Enabled.
    *
    * @return the Boolean
    */
    public Boolean getmailEnabled() {
        return this.mailEnabled; 
    }

    /**
    * Sets the mail Enabled.
    *
    * @param value the Boolean
    */
    public void setmailEnabled(Boolean value) { 
        this.mailEnabled = value; 
        valueChanged("mailEnabled", value);

    }
            
    private String onPremisesSecurityIdentifier;
     
    /**
    * Gets the on Premises Security Identifier.
    *
    * @return the String
    */
    public String getonPremisesSecurityIdentifier() {
        return this.onPremisesSecurityIdentifier; 
    }

    /**
    * Sets the on Premises Security Identifier.
    *
    * @param value the String
    */
    public void setonPremisesSecurityIdentifier(String value) { 
        this.onPremisesSecurityIdentifier = value; 
        valueChanged("onPremisesSecurityIdentifier", value);

    }
    
        
    private java.util.List<ProvisioningError> provisioningErrors = null;
    
    
     
    /**
    * Gets the provisioning Errors.
    *
    * @return the java.util.List<ProvisioningError>
    */
    public java.util.List<ProvisioningError> getprovisioningErrors() {
        return this.provisioningErrors; 
    }

    /**
    * Sets the provisioning Errors.
    *
    * @param value the java.util.List<ProvisioningError>
    */
    public void setprovisioningErrors(java.util.List<ProvisioningError> value) { 
        this.provisioningErrors = value; 
        valueChanged("provisioningErrors", value);

    }
    
        
    private java.util.List<String> proxyAddresses = null;
    
    
     
    /**
    * Gets the proxy Addresses.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getproxyAddresses() {
        return this.proxyAddresses; 
    }

    /**
    * Sets the proxy Addresses.
    *
    * @param value the java.util.List<String>
    */
    public void setproxyAddresses(java.util.List<String> value) { 
        this.proxyAddresses = value; 
        valueChanged("proxyAddresses", value);

    }
            
    private Boolean securityEnabled;
     
    /**
    * Gets the security Enabled.
    *
    * @return the Boolean
    */
    public Boolean getsecurityEnabled() {
        return this.securityEnabled; 
    }

    /**
    * Sets the security Enabled.
    *
    * @param value the Boolean
    */
    public void setsecurityEnabled(Boolean value) { 
        this.securityEnabled = value; 
        valueChanged("securityEnabled", value);

    }
    
        
    private java.util.List<AppRoleAssignment> appRoleAssignments = null;
    
    
     
    /**
    * Gets the app Role Assignments.
    *
    * @return the java.util.List<AppRoleAssignment>
    */
    public java.util.List<AppRoleAssignment> getappRoleAssignments() {
        return this.appRoleAssignments; 
    }

    /**
    * Sets the app Role Assignments.
    *
    * @param value the java.util.List<AppRoleAssignment>
    */
    public void setappRoleAssignments(java.util.List<AppRoleAssignment> value) { 
        this.appRoleAssignments = value; 
        valueChanged("appRoleAssignments", value);

    }
    
        
    private java.util.List<DirectoryObject> members = null;
    
    
     
    /**
    * Gets the members.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getmembers() {
        return this.members; 
    }

    /**
    * Sets the members.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setmembers(java.util.List<DirectoryObject> value) { 
        this.members = value; 
        valueChanged("members", value);

    }
    
        
    private java.util.List<DirectoryObject> memberOf = null;
    
    
     
    /**
    * Gets the member Of.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getmemberOf() {
        return this.memberOf; 
    }

    /**
    * Sets the member Of.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setmemberOf(java.util.List<DirectoryObject> value) { 
        this.memberOf = value; 
        valueChanged("memberOf", value);

    }
            
    private DirectoryObject createdOnBehalfOf;
     
    /**
    * Gets the created On Behalf Of.
    *
    * @return the DirectoryObject
    */
    public DirectoryObject getcreatedOnBehalfOf() {
        return this.createdOnBehalfOf; 
    }

    /**
    * Sets the created On Behalf Of.
    *
    * @param value the DirectoryObject
    */
    public void setcreatedOnBehalfOf(DirectoryObject value) { 
        this.createdOnBehalfOf = value; 
        valueChanged("createdOnBehalfOf", value);

    }
    
        
    private java.util.List<DirectoryObject> owners = null;
    
    
     
    /**
    * Gets the owners.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getowners() {
        return this.owners; 
    }

    /**
    * Sets the owners.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setowners(java.util.List<DirectoryObject> value) { 
        this.owners = value; 
        valueChanged("owners", value);

    }
    
        
    private java.util.List<Item> files = null;
    
    
     
    /**
    * Gets the files.
    *
    * @return the java.util.List<Item>
    */
    public java.util.List<Item> getfiles() {
        return this.files; 
    }

    /**
    * Sets the files.
    *
    * @param value the java.util.List<Item>
    */
    public void setfiles(java.util.List<Item> value) { 
        this.files = value; 
        valueChanged("files", value);

    }
}

