

class A { 
	public void outerPrint() {
		System.out.println("I am inside Class A");
	}

	public static class MainApp { //inner Main class: A$MainApp.class

		public static void main(String[] args) { //inner class main()
			A a = new A();
			a.outerPrint();
		}

	}
}