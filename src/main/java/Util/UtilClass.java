package Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UtilClass {
	List <String> sharelists = new ArrayList<String>();
	public List <String> sharelist(){
	sharelists.add(0, "State Bank of India");
	sharelists.add(1, "One97 Communications Ltd.");
	sharelists.add(2, "Shree Renuka Sugars Ltd.");
	sharelists.add(3, "Life Insurance Corporation of India");
	sharelists.add(4, "tata Steel ltd.");
	sharelists.add(5, "Tata Consultancy Services Ltd.");
	sharelists.add(6, "Maruti Suzuki India Ltd.");
	sharelists.add(7, "Bandhan Bank Ltd.");	
	
	return sharelists;
	}
	
public String dateShow() {
	
	DateFormat dateFormat = new SimpleDateFormat("dd MMMMM yyyy HH:mm:ss");
	Date date = new Date();
	String date1 = dateFormat.format(date);
	return date1;
}
	
}
