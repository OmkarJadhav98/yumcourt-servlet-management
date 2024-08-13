package com.yumcourt.web.servlet;

import com.yumcourt.web.servlet.model.Contact;
import com.yumcourt.web.servlet.model.Address;
import com.yumcourt.web.servlet.service.ContactService;
import com.yumcourt.web.servlet.service.AddressService;


@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
    private ContactService contactService;
    private AddressService addressService;

    @Override
    public void init() throws ServletException {
        contactService = new ContactService();
        addressService = new AddressService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if ("getContact".equals(action)) {
            long contactId = Long.parseLong(req.getParameter("id"));
            Contact contact = contactService.getContactById(contactId);
            if (contact != null) {
                resp.setContentType("application/json");
                resp.getWriter().write(contact.toJson());
            } else {
                resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Contact not found");
            }
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if ("createContact".equals(action)) {
            // Extract Contact details from request
            long id = Long.parseLong(req.getParameter("id"));
            long phone = Long.parseLong(req.getParameter("phone"));
            long addressId = Long.parseLong(req.getParameter("addressId"));
            Address address = addressService.getAddressById(addressId);

            if (address != null) {
                Contact contact = new Contact(id, phone, address);
                contactService.createContact(contact);
                resp.setContentType("application/json");
                resp.getWriter().write("{\"message\":\"Contact created successfully\"}");
            } else {
                resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Address not found");
            }
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if ("updateContact".equals(action)) {
            long contactId = Long.parseLong(req.getParameter("id"));
            long phone = Long.parseLong(req.getParameter("phone"));
            long addressId = Long.parseLong(req.getParameter("addressId"));
            Address address = addressService.getAddressById(addressId);

            if (address != null) {
                Contact contact = new Contact(contactId, phone, address);
                contactService.updateContact(contact);
                resp.setContentType("application/json");
                resp.getWriter().write("{\"message\":\"Contact updated successfully\"}");
            } else {
                resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Address not found");
            }
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if ("deleteContact".equals(action)) {
            long contactId = Long.parseLong(req.getParameter("id"));
            contactService.deleteContact(contactId);
            resp.setContentType("application/json");
            resp.getWriter().write("{\"message\":\"Contact deleted successfully\"}");
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
        }
    }
}
