package com.cg.tms.dto;

public class TicketCategory {
	private int ticketCategoryId;
	private String categoryName;
	
	public TicketCategory() {
		// TODO Auto-generated constructor stub
	}

	public TicketCategory(int ticketCategoryId, String categoryName) {
		super();
		this.ticketCategoryId = ticketCategoryId;
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "TicketCategory [ticketCategoryId=" + ticketCategoryId
				+ ", categoryName=" + categoryName + "]";
	}

	public int getTicketCategoryId() {
		return ticketCategoryId;
	}

	public void setTicketCategoryId(int ticketCategoryId) {
		this.ticketCategoryId = ticketCategoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
