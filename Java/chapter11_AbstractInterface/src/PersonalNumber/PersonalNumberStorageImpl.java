package PersonalNumber;

public class PersonalNumberStorageImpl extends PersonalNumberStorage implements PersonalNum {
	PersonalNumberInfo[] perArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl(int sz) {
		perArr = new PersonalNumberInfo[sz];
		numOfPerInfo=0;
	}
	@Override
	public void addPersonalInfo(String perNum, String name) {
		perArr[numOfPerInfo]=new PersonalNumberInfo(name, perNum);
		numOfPerInfo++;

	}

	@Override
	public String searchName(String perNum) {
		for(int i=0; i<numOfPerInfo; i++) {
			if(perNum.compareTo(perArr[i].getNumber())==0)
				return perArr[i].getName();
		}
		return null;
	}

}
