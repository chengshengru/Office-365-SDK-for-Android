package com.microsoft.office365.test.integration;

import java.util.concurrent.Future;


import com.microsoft.listservices.SharepointClient;
import com.microsoft.listservices.SharepointListsClient;
import com.microsoft.office365.test.integration.framework.TestCase;
import com.microsoft.office365.test.integration.framework.TestExecutionCallback;
import com.microsoft.outlookservices.odata.OutlookClient;
import com.microsoft.sharepointservices.odata.SharePointClient;


public interface TestPlatformContext {

	String getExchangeServerUrl();

    String getFileServerUrl();

	String getClientId();
	
	String getRedirectUrl();

    String getExchangeEndpointUrl();

    String getFilesEndpointUrl();

    String getTestMail();

    String getSharepointServerUrl();

    String getTestListName();

    String getTestDocumentListName();

    String getSiteRelativeUrl();

	Future<Void> showMessage(String message);

	void executeTest(TestCase testCase, TestExecutionCallback callback);

	void sleep(int seconds) throws Exception;

	String getAuthenticationMethod();

    OutlookClient getMailCalendarContactClient();

    SharePointClient getFilesClient();

    SharepointListsClient getSharePointListClient();



}
