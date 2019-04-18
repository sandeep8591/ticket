package com.cg.tms.dao;

import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.TicketException;

public interface TicketDAO {

	int raiseNewTicket(TicketBean ticketBean,TicketCategory tc) throws TicketException;
	public Map<Integer, TicketCategory> getTicketDetails(int catid);
/*	List<TicketCategory> listTicketCategory();*/

}
