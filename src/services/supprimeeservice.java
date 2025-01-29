/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;
import connection.connexion;
import idao.IDAO;
import entities.Contact;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hp
 */
public class supprimeeservice implements IDAO<Contact> {
    @Override
	public boolean create(Contact o) {
            String req="insert into contactsupprime values(null,?,?,?)";
		try {
			
		PreparedStatement ps=connexion.getCnx().prepareStatement(req);
		ps.setString(1,o.getNom());
		ps.setLong(2,o.getTelephone());
		ps.setString(3,o.getAdress());
		
		if(ps.executeUpdate()==1) {
			System.out.println("contactesupprime cree!");
		return true;
		}
		}catch(SQLException e) {
			System.out.println("ERREUR DE CREATE SQL contactsupprime"+ e);
		}
            return false;}
        
        @Override
	public boolean update(Contact o) {
            return false;
	}
        
        @Override
	public Contact findById(int id) {
            return null;
	}
        @Override
	public List<Contact> findAll() {
            return null;
	}
        
        @Override
	public boolean delete(Contact o) {
            return false;
	}
        }
        

