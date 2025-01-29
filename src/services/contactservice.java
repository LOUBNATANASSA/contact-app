package services;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.connexion;
import entities.Contact;
import idao.IDAO;

public class contactservice implements IDAO<Contact>  {

	@Override
	public boolean create(Contact o) {
		String req="insert into carnet values(null,?,?,?)";
		try {
			
		PreparedStatement ps=connexion.getCnx().prepareStatement(req);
		ps.setString(1,o.getNom());
		ps.setLong(2,o.getTelephone());
		ps.setString(3,o.getAdress());
		
		if(ps.executeUpdate()==1) {
			System.out.println("contacte cree!");
		return true;
		}
		}catch(SQLException e) {
			System.out.println("ERREUR DE CREATE SQL"+ e);
		}
		return false;
	}

	@Override
	public boolean delete(Contact o) {
		String req="DELETE FROM carnet where id=?";
		try {
			
			PreparedStatement ps=connexion.getCnx().prepareStatement(req);
			ps.setLong(1,o.getId());
			if(ps.executeUpdate()==1) {
				System.out.println("deletion contact AFFECTED!");
			return true;}
			else {System.out.println("AUCUN SUPRESSION contact");
			
			}
		} catch (SQLException e) {
			
			System.out.println("ERREUR SQL "+ e.getMessage());
		}
		return false;
	}

	@Override
	public boolean update(Contact o) {
		String req="UPDATE carnet  SET nom=?,telephone=?,adress=? where id=?";	
		try {
			
			PreparedStatement ps=connexion.getCnx().prepareStatement(req);
			ps.setString(1,o.getNom());
			ps.setLong(2,o.getTelephone());
			ps.setString(3,o.getAdress());
			ps.setInt(4,o.getId());
			
			if(ps.executeUpdate()==1) {
				System.out.println("update carnet AFFECTED!");
			return true;
			}else {
	            System.out.println("Aucune ligne mise à jour a carnet . Vérifiez l'ID fourni.");}
			}catch(SQLException e) {
				System.out.println("ERREUR DE CREATE SQL + "+ e.getMessage());
			}
		return false;
	}

	@Override
	public Contact findById(int id) {
		String req="SELECT * FROM carnet WHERE id=?";
		try {
			
			PreparedStatement ps=connexion.getCnx().prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("findbyid affected");
				return new Contact(rs.getInt(1),rs.getString(2),rs.getLong(3),rs.getString(4));
				
			}else { System.out.println("Aucun carnet trouvé pour l'ID : " + id);}
		} catch (SQLException e) {
			
			System.out.println("ERREUR SQL "+ e.getMessage());
		}
		return null;
	}

	@Override
	public List<Contact> findAll() {
		List<Contact> ls=new ArrayList<>();
		String req="SELECT * FROM carnet ";
		try {
			PreparedStatement ps=connexion.getCnx().prepareStatement(req);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ls.add(new Contact(rs.getInt(1),rs.getString(2),rs.getLong(3),rs.getString(4)));
			}
			System.out.println("FINDALL  catnet est bien affecte!");
			return ls;
		} catch (SQLException e) {
			
			System.out.println(" ERREUR SQL "+ e.getMessage());
		}
		return null;
	}
        public boolean createsup(Contact o) {
            String req="insert into contactsupprime values(?,?,?,?)";
		try {
			
		PreparedStatement ps=connexion.getCnx().prepareStatement(req);
                ps.setInt(1,o.getId());
		ps.setString(2,o.getNom());
		ps.setLong(3,o.getTelephone());
		ps.setString(4,o.getAdress());
		
		if(ps.executeUpdate()==1) {
			System.out.println("contactesupprime cree!");
		return true;
		}
		}catch(SQLException e) {
			System.out.println("ERREUR DE CREATE SQL contactsupprime"+ e);
		}
            return false;}
        
        public List<Contact> findAllSUPP() {
		List<Contact> ls=new ArrayList<>();
		String req="SELECT * FROM contactsupprime ";
		try {
			PreparedStatement ps=connexion.getCnx().prepareStatement(req);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ls.add(new Contact(rs.getInt(1),rs.getString(2),rs.getLong(3),rs.getString(4)));
			}
			System.out.println("FINDALL  contactsupprime est bien affecte!");
			return ls;
		} catch (SQLException e) {
			
			System.out.println(" ERREUR SQL "+ e.getMessage());
		}
		return null;
	}
        public boolean deleteSUPP(Contact o) {
		String req="DELETE FROM contactsupprime where id=?";
		try {
			
			PreparedStatement ps=connexion.getCnx().prepareStatement(req);
			ps.setLong(1,o.getId());
			if(ps.executeUpdate()==1) {
				System.out.println("deletion contactsupp AFFECTED!");
			return true;}
			else {System.out.println("AUCUN SUPRESSION contact");
			
			}
		} catch (SQLException e) {
			
			System.out.println("ERREUR SQL "+ e.getMessage());
		}
		return false;
	}
        
        public Contact findByIdsupp(int id) {
		String req="SELECT * FROM contactsupprime WHERE id=?";
		try {
			
			PreparedStatement ps=connexion.getCnx().prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("findbyid affected");
				return new Contact(rs.getInt(1),rs.getString(2),rs.getLong(3),rs.getString(4));
				
			}else { System.out.println("Aucun carnet trouvé pour l'ID : " + id);}
		} catch (SQLException e) {
			
			System.out.println("ERREUR SQL "+ e.getMessage());
		}
		return null;
	}

}
