package gui;
import desktop_resources.GUI;
import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_fields.Street;
public class Test {
//Test
	public static void main(String[] Args) {
	Field [] fields = new Field [12];
//	GUI.create(fields);
	
	fields[0] = new Street.Builder()
			.setTitle("START")
			.setSubText("START")
			.setDescription("Game starts here")
			.build();
	fields[1] = new Shipping.Builder()
			.setTitle("Tower")
//			.setPicture(picture)
			.setSubText("+200 gold")
			.setDescription("The Tower")
			.build();
	fields[2] = new Shipping.Builder()
			.setTitle("Crater")
//			.setPicture(picture)
			.setSubText("-100 gold")
			.setDescription("The Crater")
			.build();
	fields[3] = new Shipping.Builder()
			.setTitle("Palace Gates")
//			.setPicture(picture)
			.setSubText("+100 gold")
			.setDescription("The Royal Palace Gates")
			.build();
	fields[4] = new Shipping.Builder()
			.setTitle("Cold Desert")
//			.setPicture(picture)
			.setSubText("-20 gold")
			.setDescription("The Cold Desert")
			.build();
	fields[5] = new Shipping.Builder()
			.setTitle("Walled City")
//			.setPicture(picture)
			.setSubText("+180 gold")
			.setDescription("The Walled City")
			.build();
	fields[6] = new Shipping.Builder()
			.setTitle("Monastary")
//			.setPicture("Jail.jpg")
			.setSubText("Nothing happens.")
			.setDescription("The Monastary")
			.build();
	fields[7] = new Shipping.Builder()
			.setTitle("Black Cave")
//			.setPicture(picture)
			.setSubText("-70 gold")
			.setDescription("The Black Cave")
			.build();
	fields[8] = new Shipping.Builder()
			.setTitle("Huts")
//			.setPicture(picture)
			.setSubText("+60 gold")
			.setDescription("Huts in the mountainside")
			.build();
	fields[9] = new Shipping.Builder()
			.setTitle("The Werewall")
//			.setPicture(picture)
			.setSubText("-80 gold, take an ekstra turn!")
			.setDescription("The Werewall")
			.build();
	fields[10] = new Shipping.Builder()
			.setTitle("The Pit")
//			.setPicture(picture)
			.setSubText("-50 gold")
			.setDescription("The Pit")
			.build();
	fields[11] = new Shipping.Builder()
			.setTitle("Goldmine")
//			.setPicture(picture)
			.setSubText("+650 gold")
			.setDescription("The Goldmine")
			.build();
	
	
	GUI.create(fields);
	GUI.addPlayer("peter", 1000);
	
	while (true) {
		
	}
	
	
	
//	Vi mangler udover picture, description text, og oprette spillere osv.
	}
}