package io.swagger.client.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;


@ApiModel(description = "")
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class RemoveBankRequest {

	private Boolean removed = null;
	private String locationHeader;


	/**
	 **/
	@ApiModelProperty(value = "")
	@JsonProperty("removed")
	public Boolean getRemoved() {
		return removed;
	}

	public void setRemoved(Boolean removed) {
		this.removed = removed;
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
		sb.append("class RemoveBankRequest {\n");

		sb.append("  removed: ").append(removed).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
