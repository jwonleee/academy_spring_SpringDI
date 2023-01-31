package ex02;

public class MemberDAO {

	private DatabaseDev databaseDev; //이걸 필요로 할 것 같아서 선언

	//get
	public DatabaseDev getDatabaseDev() {
		return databaseDev;
	}

	//set
	public void setDatabaseDev(DatabaseDev databaseDev) {
		this.databaseDev = databaseDev;
	}
		
}
