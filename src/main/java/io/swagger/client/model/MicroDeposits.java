package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.*;
import java.util.ArrayList;
import java.util.Map;


@ApiModel(description = "")
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class MicroDeposits {

	private Map<String, HalLink> links = new HashMap<String, HalLink>();
	private Object embedded = null;
	private String locationHeader;


	/**
	 **/
	@ApiModelProperty(required = true, value = "")
	@JsonProperty("_links")
	public Map<String, HalLink> getLinks() {
		return links;
	}

	public void setLinks(Map<String, HalLink> links) {
		this.links = links;
	}


	/**
	 **/
	@ApiModelProperty(value = "")
	@JsonProperty("_embedded")
	public Object getEmbedded() {
		return embedded;
	}

	public void setEmbedded(Object embedded) {
		this.embedded = embedded;
	}


	/**
	 * Used to deserialize Location field in
	 * HTTP headers, primarily for HAL-styled
	 * POST requests.
	 **/
	@JsonProperty("Location")
	public String getLocationHeader() {
		return locationHeader;
	}

	public void setLocationHeader(ArrayList<String> locationHeader) {
		this.locationHeader = locationHeader.get(0);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MicroDeposits {\n");

		sb.append("  links: ").append(links).append("\n");
		sb.append("  embedded: ").append(embedded).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
