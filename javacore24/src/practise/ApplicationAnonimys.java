package practise;

public class ApplicationAnonimys {

	public static void main(String[] args) {

		CustomSecondInterface si = new CustomSecondInterface() {

			@Override
			public void test() {
				System.out.println("Custom Anonimys interface");
			}
		};
		si.test();

		sil.test();
	}

	static CustomSecondInterface sil = () -> System.out.println("Custom Lambda");

}

@FunctionalInterface
interface CustomSecondInterface {
	void test();
}