package com.tns.orderservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	private OrderService service;
	
	@PostMapping("/orderservice")
	public void add(@RequestBody Order order)
	{
		service.insertRecord(order);
	}
	
	@GetMapping("/orderservice")
	public List<Order> ShowAll()
	{
		return service.getAllRecords();
	}
	
	@GetMapping("/orderservice/{id}")
	public Order getOrderById(@PathVariable Integer id)
	{
		return service.getOrderById(id);
	}
	
	@DeleteMapping("/orderservice/{id}")
	public void deleteOrder(@PathVariable Integer id)
	{
		service.deleteOrder(id);
	}
	
	@PutMapping("/orderservice/{id}")
	public ResponseEntity<String> updateOrder(@PathVariable Integer id,@RequestBody Order updatedOrder)
	{
		service.updateOrder(id,updatedOrder);
		return ResponseEntity.ok("Order updated Successfully");
	}



}
