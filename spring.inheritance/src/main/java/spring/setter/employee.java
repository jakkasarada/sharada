package spring.setter;

public class employee {
	int emp_id;
	address address1;
	employee(int emp_id, address address1){
		this.emp_id=emp_id;
		this.address1=address1;
	}
	void display() {
		System.out.println(emp_id);
		System.out.println(address1);
	}

}
