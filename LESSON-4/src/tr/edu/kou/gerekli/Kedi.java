package tr.edu.kou.gerekli;

import tr.edu.kou.util.*;

public class Kedi extends Hayvan {

	public Kedi() {
		System.out.println("Kedi oluşturuluyor");
		System.out.println(a); // Protected
		// System.out.println(b); //Hata erişemez.Friendly/Default
		// System.out.println(c); //Hata erişemez.Private
		System.out.println(d); // Public
	}

	public static void main(String[] args) {

		Kedi k = new Kedi();

	}

}
