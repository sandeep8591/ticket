package com.cg.tms.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public class Util {
	private static Map<Integer, TicketCategory> ticketCategory = new HashMap<Integer, TicketCategory>();
	static HashMap<Integer, TicketBean> ticketLog = new HashMap<Integer, TicketBean>();
	public static int raiseNewTicket(TicketBean ticketBean,TicketCategory tc) {
		ticketCategory.put(tc.getTicketCategoryId(),tc);
		ticketLog.put(ticketBean.getTicketNo(), ticketBean);
		return tc.getTicketCategoryId();
		
	}
	public static Map<Integer, TicketCategory> getTicketDetails(int catid) {
		return ticketCategory;
	/*	ticketCategory.put("tc001", "software installatio;n");
		ticketCategory.put("tc002", "mailbox creation");
		
		return ticketCategory;*/
	}

}
