/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Random;
import model.Members;

/**
 *
 * @author NathanG
 */
public class MemberControl {
    
    private Members dbMembers = new Members();
    private String tempName;

    public MemberControl() {
        tempName = createName();
        addMember(tempName);
        checkMembers();
    }
    
    
    public void addMember(String name){
        dbMembers.setName(name);
    }
    
    public String checkMembers(){
        return(dbMembers.getName());
    }
    
    private String createName() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    
}
//public class InsertEmployee {
//
//	public static void main(String[] args) {
//		Configuration cfg = new configuration();
//		cfg.getAppConfigurationEntry("Hibernate.cfg.xml");
//		SessionFactory sf = cfg.buildSessionFactory();
//		Session s = sf.openSession();
//		Transaction tx = s.beginTransaction();
//		Employee emp = new Employee();
//		emp.setId(1);
//		emp.setName("Eric");
//		emp.setMobile(4220119);
//		emp.setEmail("min15010@byui.edu");
//		s.save(emp);
//		s.flush();
//		tx.commit();
//		s.close();
//	}
//
//}
