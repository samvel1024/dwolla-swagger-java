package io.swagger.client.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;


@ApiModel(description = "")
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class WebhookHeader {

	private String name = null;
	private String value = null;
	private String locationHeader;


	/**
	 **/
	@ApiModelProperty(required = true, value = "")
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	/**
	 **/
	@ApiModelProperty(required = true, value = "")
	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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
		sb.append("class WebhookHeader {\n");

		sb.append("  name: ").append(name).append("\n");
		sb.append("  value: ").append(value).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
