package com.tns.orderservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class OrderService {
	@Autowired
	private  OrderRepository repo;
	
	//Get all the records from the table
	public void insertRecord(Order order)
	{
		repo.save(order);
	}
	
	//Show all the records from the table in database
	public List<Order> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public 
	Order getOrderById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteOrder(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateOrder(Integer id,Order updateOrder)
	{
		Order existingOrder=repo.findById(id).orElse(null);
		if(existingOrder!=null)
		{
			existingOrder.setOrderid(updateOrder.getOrderid());
			existingOrder.setCustname(updateOrder.getCustname());
			existingOrder.setAddress(updateOrder.getAddress());
			existingOrder.setEmail(updateOrder.getEmail());
			existingOrder.setOstatus(updateOrder.getOstatus());
			existingOrder.setPayment(updateOrder.getPayment());
			repo.save(existingOrder);
		}
	}
	
	

}
