package com.cg.tms.dao;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.TicketException;
import com.cg.tms.util.Util;

public class TicketDAOImpl implements TicketDAO {
Util u=new Util();

	TicketBean ticketBean = new TicketBean();

	@Override
	public int raiseNewTicket(TicketBean ticketBean,TicketCategory tc) throws TicketException {
		return Util.raiseNewTicket(ticketBean,tc);
	}
	public Map<Integer, TicketCategory> getTicketDetails(int catid) {
		return Util.getTicketDetails(catid);
}
	}
