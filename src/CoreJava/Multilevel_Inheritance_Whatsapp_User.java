package CoreJava;

public class Multilevel_Inheritance_Whatsapp_User {

	public static void main(String[] args) {
		System.out.println("User having Whatsapp Version 5 can access all of its previous features.");
		Multilevel_Inheritance_Whatsappv5 w1=new Multilevel_Inheritance_Whatsappv5();
w1.sticker_msg();
w1.video_msg();
w1.picture_msg();
w1.audio_msg();
w1.text_msg();	


System.out.println("User having Whatsapp Version 3 can access only version 3 and its previous features.");
Multilevel_Inheritance_Whatsappv3 w3=new Multilevel_Inheritance_Whatsappv3();

//We can't able to access the properties of what'sapp after version 3.
//w3.sticker_msg();
//w3.video_msg();
//We can only be able to access the features of up to  what'sapp version 3.
w3.picture_msg();
w3.audio_msg();
w3.text_msg()
;
	}

}
