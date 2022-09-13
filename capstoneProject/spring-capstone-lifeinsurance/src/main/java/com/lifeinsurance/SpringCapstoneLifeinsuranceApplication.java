package com.lifeinsurance;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lifeinsurance.model.Address;
import com.lifeinsurance.model.Client;
import com.lifeinsurance.model.Insurance;
import com.lifeinsurance.model.Nominee;
import com.lifeinsurance.model.Plan;
import com.lifeinsurance.service.IAddressService;
import com.lifeinsurance.service.IClientService;
import com.lifeinsurance.service.IInsuranceService;
import com.lifeinsurance.service.INomineeService;

@SpringBootApplication
public class SpringCapstoneLifeinsuranceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCapstoneLifeinsuranceApplication.class, args);
	}
	
	@Autowired
	IInsuranceService insuranceService;
	
	@Autowired
	IAddressService addressService;
	
	@Autowired
	IClientService clientService;

	@Autowired
	INomineeService iNomineeService;
	@Override
	public void run(String... args) throws Exception {
		
	
//		Address address=new Address("KR Puram", "Bangalore", "Karnataka", 560027);
//		Nominee nominee=new Nominee("Rajath","Male",23,"Son");
//		Client client=new Client("Nagaraj", 9630215487l, nominee, address);
//		List<Client> clientlist=Arrays.asList(client);
//		Insurance insurance=new Insurance("Jeeven Anand",3 , Plan.saving.type, 350, clientlist, 50000);
		
//		Address address=new Address("Shivajinagar", "Bangalore", "Karnataka", 560001);
//		Nominee nominee=new Nominee("Santhi","Female",21,"wife");
//		Client client=new Client("Guru", 9856471232l, nominee, address);
//		List<Client> clientlist=Arrays.asList(client);
//		Insurance insurance=new Insurance("LIC",5 , Plan.uli.type, 4500, clientlist, 30000);
		
//		Address address=new Address("Anna Nagar", "Chennai", "Tamil Nadu", 600027);
//		Nominee nominee=new Nominee("Kiran","Male",25,"Son");
//		Client client=new Client("Rajath", 8896547215l, nominee, address);
//		List<Client> clientlist=Arrays.asList(client);
//		Insurance insurance=new Insurance("Star Life",1 , Plan.mbp.type, 2450, clientlist, 300000);
//		
//		Address address=new Address("PP Road", "Mandya", "Karnataka", 560027);
//		Nominee nominee=new Nominee("Vikas","Male",28,"Husband");
//		Client client=new Client("Bindu", 9596871235l, nominee, address);
//		List<Client> clientlist=Arrays.asList(client);
//		Insurance insurance=new Insurance("Jeeven Anand",3 , Plan.ep.type, 3780, clientlist, 500000);
		
//		Address address=new Address("MG Road", "Pune", "Maharashtra", 411044);
//		Nominee nominee=new Nominee("Usha","Female",12,"Daughter");
//		Client client=new Client("Suma", 7312579640l, nominee, address);
//		List<Client> clientlist=Arrays.asList(client);
//		Insurance insurance=new Insurance("Aditiya Birla",2 , Plan.saving.type, 2250, clientlist, 250000);
//		
		
//		insuranceService.addInsurance(insurance);
//		 insuranceService.getAll().forEach(System.out::println);
		
//		System.out.println(insuranceService.getById(3));
		
//		insuranceService.getByLessSumAssured(400000).forEach(System.out::println);
//		System.out.println("\n\n\n");
//		insuranceService.getByHighSumAssured(300000).forEach(System.out::println);
//		System.out.println("\n\n\n");
//		insuranceService.getByRangeOfSumAssured(300000, 450000).forEach(System.out::println);
//		
//		insuranceService.getByPlan("savings").forEach(System.out::println);
//		System.out.println("\n\n\n");
//		insuranceService.getByName("Star Life").forEach(System.out::println);
		
		
		
//      addressService.getBycity("Bangalore").forEach(System.out::println);
//	    addressService.getByState("Karnataka").forEach(System.out::println);
//		addressService.getByCityAndState("Bangalore", "Karnataka").forEach(System.out::println);
//		addressService.getAll().forEach(System.out::println);
		
//		clientService.getByName("Guru").forEach(System.out::println);
//		System.out.println(clientService.getById(12));
//		System.out.println(clientService.getByNameAndId("Suma", 13));
//		clientService.getByIdAndNominee(11,"Rajath").forEach(System.out::println);
		
//		iNomineeService.getByNomineeName("Usha").forEach(System.out::println);
//	    System.out.println(iNomineeService.getById(11));
		
//		insuranceService.getByInsuranceAndClients("LIC", "Guru").forEach(System.out::println);
	}

}
