package test;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import entities.Contact;
import services.contactservice;

public class test {

	public static void main(String[] args) {
		Contact c=new Contact("loubna",12345,"tanassa");
		contactservice ser=new contactservice();
		//ser.create(c);
		ser.delete(c);
		c.setAdress("loubnaloubna");
		ser.update(c);
		ser.findById(1);
		ser.findAll();

	}

}
