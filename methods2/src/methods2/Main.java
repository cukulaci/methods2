package methods2;

public class Main {

	public static void main(String[] args) {

		// topla(5, 7);
		System.out.println(topla(6, 7));
	}

	public static void ekle() {
		System.out.println("Eklendi.");

	}

	public static void sil() {
		System.out.println("Silindi.");

	}

	public static void guncelle() {
		System.out.println("Güncellendi.");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

}
