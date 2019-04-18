package com.cg.tms.service;

import java.util.List;
import java.util.Map;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.TicketException;

public class TicketServiceImpl implements TicketService {

	TicketDAO dao =new TicketDAOImpl();
	@Override
	public int raiseNewTicket(TicketBean ticketBean,TicketCategory tc) throws TicketException {
		// TODO Auto-generated method stub
		return dao.raiseNewTicket(ticketBean, tc);
	}
	public  Map<Integer, TicketCategory> getTicketDetails(int catid) {
		return dao.getTicketDetails(catid);
	}
	/*@Override
	public List<TicketCategory> listTicketCategory() {
		// TODO Auto-generated method stub
		return dao.listTicketCategory();
	}
*/
}
