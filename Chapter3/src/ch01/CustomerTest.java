package ch01;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer vipCustomerJoo = new VIPCustomer(10020, "������");
		vipCustomerJoo.bonusPoint = 20000;
		System.out.println(vipCustomerJoo.showCustomerInfo());
	}

}
