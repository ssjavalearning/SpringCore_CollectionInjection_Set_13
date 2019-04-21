package com.suraj.spring.test;

import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.spring.beans.Employee;
import com.suraj.spring.beans.HCLInfo;

public class HCLInfoTest {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("spring.xml");
			HCLInfo info = context.getBean("info", HCLInfo.class);
			Set<String> nameSet = info.getNameSet();
			for (String nSet : nameSet) {
				System.out.println(nSet);
			}
			System.out.println("--------------------------------------------------");
			Set<Employee> empSet = info.getEmpSet();
			for (Employee employee : empSet) {
				System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getOrgName());
			}
			
		} catch (BeansException e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				((AbstractApplicationContext) context).close();
			}
		}
	}
}
