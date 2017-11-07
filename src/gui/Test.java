package gui;
import desktop_resources.GUI;
import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_fields.Street;
public class Test {
//Test
	public static void main(String[] Args) {
	Field [] fields = new Field [12];
	GUI.create(fields);
	
	fields[0] = new Street.Builder()
			.setTitle("Start")
			.build();
	fields[1] = new Shipping.Builder()
			.setTitle("Tower")
//			.setPicture(picture)
			.build();
	fields[2] = new Shipping.Builder()
			.setTitle("Crater")
//			.setPicture(picture)
			.build();
	fields[3] = new Shipping.Builder()
			.setTitle("Palace Gates")
//			.setPicture(picture)
			.build();
	fields[4] = new Shipping.Builder()
			.setTitle("Cold Desert")
//			.setPicture(picture)
			.build();
	fields[5] = new Shipping.Builder()
			.setTitle("Walled City")
//			.setPicture(picture)
			.build();
	fields[6] = new Shipping.Builder()
			.setTitle("Monastary")
//			.setPicture(picture)
			.build();
	fields[7] = new Shipping.Builder()
			.setTitle("Black Cave")
//			.setPicture(picture)
			.build();
	fields[8] = new Shipping.Builder()
			.setTitle("Huts in the mountain")
//			.setPicture(picture)
			.build();
	fields[9] = new Shipping.Builder()
			.setTitle("The Werewall")
//			.setPicture(picture)
			.build();
	fields[10] = new Shipping.Builder()
			.setTitle("The Pit")
//			.setPicture(picture)
			.build();
	fields[11] = new Shipping.Builder()
			.setTitle("Goldmine")
//			.setPicture(picture)
			.build();
	
	
	
	
	
	
//	Vi mangler udover picture, description text, og oprette spillere osv.
	}
}