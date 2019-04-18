package com.cg.tms.service;

import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.TicketException;

public interface TicketService {
	int raiseNewTicket(TicketBean ticket,TicketCategory tc) throws TicketException;
	public  Map<Integer, TicketCategory> getTicketDetails(int catid) ;
	


}
