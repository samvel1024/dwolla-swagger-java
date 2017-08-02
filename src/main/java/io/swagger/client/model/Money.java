package io.swagger.client.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;


@ApiModel(description = "")
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class Money {

	private String value = null;
	private String currency = null;
	private String locationHeader;


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
	 **/
	@ApiModelProperty(required = true, value = "")
	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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
		sb.append("class Money {\n");

		sb.append("  value: ").append(value).append("\n");
		sb.append("  currency: ").append(currency).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
