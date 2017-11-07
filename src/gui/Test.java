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
//			.setPicture(
			.build();
	fields[2] = new Shipping.Builder()
			.setTitle("Crater")
//			.setPicture(picture)
			.build();
	fields[3] = new Shipping.Builder()
			.setTitle("Palace Gates")
//			.setPicture(picture)
			.build();
//	Vi manggler udover title og picture, description text, og oprette spillere osv.
	}
}