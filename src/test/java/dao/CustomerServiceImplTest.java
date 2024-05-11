package dao;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.DBConnUtil;
import org.junit.jupiter.api.Test;
import util.DBConnUtil;
import dao.ICustomerService;
import dao.CustomerServiceImpl;
import entity.Customer;


import org.junit.jupiter.api.Test;

class CustomerServiceImplTest {
	ICustomerService mockCustomerService = mock(ICustomerService.class);

	@Test
	 void testUpdateCustomer()
	{
		Customer c=new Customer();
		c.setCustomerID(111);
		c.setFirstName("reddy");
		c.setLastName("reddy");
		c.setEmail("reddy@gmail.com");
		c.setPhoneNumber(955319145);
		c.setAddress("png");
		c.setUserName("pradeep");
		c.setPassword("pr123");
		//c.setRegistrationDate("2024-05-08 ");
		// when(mockVehicleService.getVehicleById(anyInt())).thenReturn(new Vehicle());
        when(mockCustomerService.updateCustomer(any(Customer.class))).thenReturn(true);
        
        // Call the updateVehicle method
        boolean flag = mockCustomerService.updateCustomer(c);
        
        // Verify that the updateVehicle method is called with the correct parameters
        verify(mockCustomerService).updateCustomer(c);
        
        // Verify that the method returns true
        assertTrue(flag);
		//fail("Not yet implemented"); // TODO
	}

}
