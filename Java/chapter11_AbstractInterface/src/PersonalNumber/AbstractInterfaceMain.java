package PersonalNumber;

public class AbstractInterfaceMain {

	public static void main(String[] args) {
		//PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
		PersonalNum storage = new PersonalNumberStorageImpl(100);
		
		storage.addPersonalInfo("202020-1111111", "손흥민");
		storage.addPersonalInfo("202020-2222222", "박지성");
		
		System.out.println(storage.searchName("202020-1111111"));
		System.out.println(storage.searchName("202020-2222222"));
	}
}
