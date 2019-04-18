package com.cg.tms.ui;

import java.io.ObjectInputStream.GetField;

import java.util.List;
import java.util.Scanner;

import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.service.TicketService;
import com.cg.tms.service.TicketServiceImpl;
import com.cg.tms.util.TicketException;

public class MainUI {

	public static void main(String[] args) throws TicketException {

		Scanner sc = new Scanner(System.in);
		int choice, categoryChoice, ticketPriority;
		String description, ticketPriorityString, ticketStatus,comments;
		TicketService service = new TicketServiceImpl();
		TicketCategory ticket = new TicketCategory();
		TicketBean tb=new TicketBean();
		TicketDAOImpl dao;

		System.out.println("Welcome to ITICS Help Desk");
		System.out.println();
		while(true)
		{
			System.out.println("1 to Raise a Ticket");
			System.out.println("2 to Exit from the system");

			System.out.println("Select your Option");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Select Ticket Category form below List");
				System.out.println("1:SoftWare Installation");
				System.out.println("2:Mailbox creation");
				System.out.println("3:network issues");

				categoryChoice = sc.nextInt();

				if (categoryChoice == 1) {
					int catid=(int)(Math.random()*2000);
					ticket.setTicketCategoryId(catid);
					ticket.setCategoryName("software installation");
					switch(categoryChoice) {
				case 1:
					System.out
							.println("Enter Description related to issue(one line seperated by comma)");
					description = sc.next();
					tb.setTicketDescription(description);
					while (true) {
						System.out.println("1.low");
						System.out.println("2.medium");
						System.out.println("3.high");
						System.out.println("Enter Priority");
						ticketPriority = sc.nextInt();
						if (ticketPriority == 1) {
							ticketPriorityString = "low";
							tb.setTicketPriority(ticketPriorityString);
							break;
						} else if (ticketPriority == 2) {
							ticketPriorityString = "medium";
							tb.setTicketPriority(ticketPriorityString);
							break;
						} else if (ticketPriority == 3) {
							ticketPriorityString = "high";
							System.out.println("your issue will be solved in 24 hours");
							tb.setTicketPriority(ticketPriorityString);
							
							
							break;
						} else
							System.out.println("Invalid priority try again");
					}
					int ticketNo = (int) (Math.random() * 1200);
					tb.setTicketNo(ticketNo);
					ticketStatus = "New";
					tb.setTicketStatus(ticketStatus);
					comments = "Comments";
					tb.setComments(comments);
					System.out.println(tb);
					service.raiseNewTicket(tb,ticket);
//					ticket = new TicketCategory(ticket.getTicketCategoryId(),
//							ticket.getCategoryName());
				}
				}
				// ticket= new TicketCategory("tc001", "software installation");
				else if (categoryChoice == 2) {
					int catid=(int)(Math.random()*2000);
					ticket.setTicketCategoryId(catid);
					ticket.setCategoryName("mailbox creation");
					switch(categoryChoice) {
					case 2:
						System.out
								.println("Enter Description related to issue(one line seperated by comma)");
						description = sc.next();
						tb.setTicketDescription(description);
						while (true) {
							System.out.println("1.low");
							System.out.println("2.medium");
							System.out.println("3.high");
							System.out.println("Enter Priority");
							ticketPriority = sc.nextInt();
							if (ticketPriority == 1) {
								ticketPriorityString = "low";
								tb.setTicketPriority(ticketPriorityString);
								break;
							} else if (ticketPriority == 2) {
								ticketPriorityString = "medium";
								tb.setTicketPriority(ticketPriorityString);
								break;
							} else if (ticketPriority == 3) {
								ticketPriorityString = "high";
								tb.setTicketPriority(ticketPriorityString);
								break;
							} else
								System.out.println("Invalid priority try again");
						}
						int ticketNo = (int) (Math.random() * 1200);
						tb.setTicketNo(ticketNo);
						ticketStatus = "New";
						tb.setTicketStatus(ticketStatus);
						comments = "Comments";
						tb.setComments(comments);
						service.raiseNewTicket(tb,ticket);
						

				}
				}
				else if (categoryChoice == 3) {
					int catid=(int)(Math.random()*2000);
					ticket.setTicketCategoryId(catid);
					ticket.setCategoryName("mailbox issues");
					switch(categoryChoice) {
					case 3:
						System.out
								.println("Enter Description related to issue(one line seperated by comma)");
						description = sc.next();
						tb.setTicketDescription(description);
						while (true) {
							System.out.println("1.low");
							System.out.println("2.medium");
							System.out.println("3.high");
							System.out.println("Enter Priority");
							ticketPriority = sc.nextInt();
							if (ticketPriority == 1) {
								ticketPriorityString = "low";
								tb.setTicketPriority(ticketPriorityString);
								break;
							} else if (ticketPriority == 2) {
								ticketPriorityString = "medium";
								tb.setTicketPriority(ticketPriorityString);
								break;
							} else if (ticketPriority == 3) {
								ticketPriorityString = "high";
								tb.setTicketPriority(ticketPriorityString);
								break;
							} else
								System.out.println("Invalid priority try again");
						}
						int ticketNo = (int) (Math.random() * 1200);
						tb.setTicketNo(ticketNo);
						ticketStatus = "New";
						tb.setTicketStatus(ticketStatus);
						comments = "Comments";
						tb.setComments(comments);
						service.raiseNewTicket(tb,ticket);
					}

				}
			case 2:
				System.exit(0);
			}
		}
		}
	}
		
