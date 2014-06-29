package com.uservoice.uservoicesdk.model;

import android.util.Base64;

public class TicketAttachment {
	private String contentType;
	private byte[] data;
	private String name;
	
	public TicketAttachment(String name, String contentType, byte[] data) {
		this.contentType = contentType;
		this.data = data.clone();
		this.name = name;
	}
	
	protected String getDataBase64() {
		return Base64.encodeToString(data, Base64.DEFAULT);
	}
	
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
