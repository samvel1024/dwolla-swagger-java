package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;


@ApiModel(description = "")
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class FundingSource {

	private Map<String, HalLink> links = new HashMap<String, HalLink>();
	private Object embedded = null;
	private String id = null;
	private String status = null;
	private String type = null;
	private String name = null;
	private Date created = null;
	private Object balance = null;
	private Boolean removed = null;
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
	 **/
	@ApiModelProperty(required = true, value = "")
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	/**
	 **/
	@ApiModelProperty(required = true, value = "")
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	/**
	 **/
	@ApiModelProperty(required = true, value = "")
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


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
	@JsonProperty("created")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}


	/**
	 **/
	@ApiModelProperty(value = "")
	@JsonProperty("balance")
	public Object getBalance() {
		return balance;
	}

	public void setBalance(Object balance) {
		this.balance = balance;
	}


	/**
	 **/
	@ApiModelProperty(required = true, value = "")
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
		sb.append("class FundingSource {\n");

		sb.append("  links: ").append(links).append("\n");
		sb.append("  embedded: ").append(embedded).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  status: ").append(status).append("\n");
		sb.append("  type: ").append(type).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  created: ").append(created).append("\n");
		sb.append("  balance: ").append(balance).append("\n");
		sb.append("  removed: ").append(removed).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
