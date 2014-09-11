package com.microsoft.office365.api;

import java.net.URI;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.olingo.client.api.http.HttpMethod;
import org.apache.olingo.client.api.v4.EdmEnabledODataClient;
import org.apache.olingo.client.core.http.DefaultHttpUriRequestFactory;
import org.apache.olingo.commons.api.format.ODataFormat;

import com.microsoft.office365.oauth.OAuthCredentials;
import com.microsoft.office.Service;

//TODO:FIX Namespace
import com.microsoft.office.microsoft.exchange.services.odata.model.EntityContainer;

/**
 * The Class BaseOfficeClient.
 */
public abstract class BaseOfficeClient {

	private final String odataEndpoint;
	private final String resourceId;

	private Service<EdmEnabledODataClient> service;
	public static EntityContainer container;

	protected BaseOfficeClient(Builder builder) {

		odataEndpoint = builder.getOdataEndpoint();
		resourceId = builder.getResourceId();

		initialize(builder);
	}

	protected void initialize(final Builder builder) {

		// TODO:
		// Check for preconditions.
		// Cannot initialize if all the builder setting are not already set.

		service = Service.getV4(resourceId + odataEndpoint, false);
		service.getClient().getConfiguration()
				.setDefaultPubFormat(ODataFormat.JSON_FULL_METADATA);
		
		service.getClient().getConfiguration().setUseChuncked(false);
		service.getClient().getConfiguration().setAddressingDerivedTypes(false);
		service.getClient().getConfiguration().setUseUrlOperationFQN(false);

		service.getClient().getConfiguration()
				.setHttpUriRequestFactory(new DefaultHttpUriRequestFactory() {
					@Override
					public HttpUriRequest create(HttpMethod method, URI uri) {

						HttpUriRequest request = super.create(method, uri);
						request.addHeader("Authorization", "Bearer " + builder.getCredentials().getToken());
						return request;
					}
				});
		
		container = service.getEntityContainer(EntityContainer.class);
	}

	/**
	 * The Class Builder.
	 */
	public abstract static class Builder {

		private OAuthCredentials mCredentials;
		private String mResourceId;
		private String mOdataEndpoint;

		protected Builder(final OAuthCredentials credentials,
				String resourceId, String odataEndpoint) {

			mCredentials = credentials;
			mResourceId = resourceId;
			mOdataEndpoint = odataEndpoint;
		}

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {
		}

		/**
		 * Builds the.
		 * 
		 * @return the base office client
		 */
		public abstract BaseOfficeClient build();

		/**
		 * Sets the resource id.
		 * 
		 * @param resourceId
		 *            the resource id
		 * @return the builder
		 */
		public Builder setResourceId(String resourceId) {
			mResourceId = resourceId;
			return this;
		}

		/**
		 * Gets the resource id.
		 * 
		 * @return the resource id
		 */
		public String getResourceId() {
			return mResourceId;
		}

		/**
		 * Sets the odata endpoint.
		 * 
		 * @param odataEndpoint
		 *            the odata endpoint
		 * @return the builder
		 */
		public Builder setOdataEndpoint(String odataEndpoint) {
			mOdataEndpoint = odataEndpoint;
			return this;
		}

		/**
		 * Sets the credentials.
		 * 
		 * @param credentials
		 *            the credentials
		 * @return the builder
		 */
		public Builder setCredentials(OAuthCredentials credentials) {
			mCredentials = credentials;
			return this;
		}

		/**
		 * Gets the odata endpoint.
		 * 
		 * @return the odata endpoint
		 */
		public String getOdataEndpoint() {
			return mOdataEndpoint;
		}

		/**
		 * Gets the credentials.
		 * 
		 * @return the credentials
		 */
		public OAuthCredentials getCredentials() {
			return mCredentials;
		}
	}
}
