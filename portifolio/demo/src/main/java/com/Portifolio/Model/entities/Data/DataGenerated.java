package com.Portifolio.Model.entities.Data;

import java.util.Date;
import java.util.Random;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Portifolio.Model.entities.Company;
import com.Portifolio.Model.entities.CompanyEmployee;
import com.Portifolio.Model.entities.JobFunction;

import net.datafaker.Faker;

public class DataGenerated {

	private String firstName;
	private String name;
	private String email;
	private Date date;
	private String cpf;
	private String JbfName;
	private Double salary;
	private JobFunction jobFunction, j1, j2, j3, j4;
	private CompanyEmployee companyEmployee;

	public String getFirstName() {
		return firstName;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Date getDate() {
		return date;
	}

	public String getCpf() {
		return cpf;
	}

	public String getJbfName() {
		return JbfName;
	}

	public Double getSalary() {
		return salary;
	}

	private void dataVarRandomCreate() {

		Faker randomData = new Faker();
		Random aleatorio = new Random();
		salary = aleatorio.nextDouble(2000, 5000);

		int num = aleatorio.nextInt(1, 4);

		DataGenerated randomPerson = new DataGenerated();

		date = randomPerson.date = randomData.date().birthday();

		cpf = randomPerson.cpf = randomData.cpf().valid();

		firstName = randomPerson.firstName = randomData.name().firstName();

		name = firstName + " " + randomData.name().lastName();

		email = this.firstName + randomEmailDomain(num);

	}

	private String randomEmailDomain(int num) {
		switch (num) {
		case 1:
			return "@outlook.com";

		case 2:
			return "@gmail.com";

		case 3:
			return "@yahoo.com";

		default:
			return "@live.com";

		}
	}

	private JobFunction randomJobFunction(int num) {

		switch (num) {
		case 1:
			return j1;

		case 2:
			return j2;

		case 3:
			return j3;

		case 4:
			return j4;

		default:
			return new JobFunction("ALL", 2000.00);

		}
	}

	public JobFunction getJ1() {
		return j1;
	}

	public void setJ1(JobFunction j1) {
		this.j1 = j1;
	}

	public JobFunction getJ2() {
		return j2;
	}

	public void setJ2(JobFunction j2) {
		this.j2 = j2;
	}

	public JobFunction getJ3() {
		return j3;
	}

	public void setJ3(JobFunction j3) {
		this.j3 = j3;
	}

	public JobFunction getJ4() {
		return j4;
	}

	public void setJ4(JobFunction j4) {
		this.j4 = j4;
	}

	public void CreateJobFunction() {
		dataVarRandomCreate();
		j1 = new JobFunction("Manager", salary);
		dataVarRandomCreate();
		j2 = new JobFunction("Dev", salary);
		dataVarRandomCreate();
		j3 = new JobFunction("Director", salary);
		dataVarRandomCreate();
		j4 = new JobFunction("Intern", salary);

	}

	public void uploadRandomDate() throws Exception {
		dataVarRandomCreate();
		atomicCreate(name, date, cpf, email);
	}

	private Company company;

	public void setCompany(Company company) {
		this.company = company;
	}

	public JobFunction getJobFunction() {
		return jobFunction;
	}

	public CompanyEmployee getCompanyEmployee() {
		return companyEmployee;
	}

	public Company getCompany() {
		return company;
	}

	public void atomicCreate(String employeName, Date employeeBirthday, String employeeCpf, String employeeEmail)// create
																								// companyemployee
			throws Exception {
		Random aleatorio = new Random();

		int num = aleatorio.nextInt(1, 4);
		

		companyEmployee = new CompanyEmployee(employeName, employeeBirthday, employeeCpf, employeeEmail,
				randomJobFunction(num), company);

	}
	
}
