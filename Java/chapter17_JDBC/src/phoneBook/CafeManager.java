package phoneBook;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CafeManager {
	
	private CafeManager() {}
	private static CafeManager manager = new CafeManager();
	
	public static CafeManager getInstance() {
		return manager;
	}
	
	pbDao dao = new pbDao();

	public void cafeManager() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("-----------------------");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 전체 출력");
		System.out.println("5. 검색");
		System.out.println("-----------------------");
		
		int choice = MainManager.sc.nextInt();
		switch(choice) {
		case 1:
			cafeInsert();
			break;
		case 2:
			cafeEdit();
			break;
		case 3:
			cafeDelete();
			break;
		case 4:
			cafeList();
			break;
		case 5:
			cafeSearch();
			break;
		}
	}

	private void cafeSearch() {
		System.out.println("-------------------------");
		System.out.println("검색하실 이름을 입력해주세요.");
		System.out.println("-------------------------");
		
		MainManager.sc.nextLine();
		String pname = MainManager.sc.nextLine().toUpperCase();
		
		List<pbDto> list = dao.Search(pname);
		
		if(!list.isEmpty() && list != null) {
			System.out.println(" 이름\t       전화번호\t       주소\t\t\t이메일\t\t동호회이름\t\t닉네임");
			System.out.println("----------------------------------------------------------------------------");
			for(pbDto d : list) {
				System.out.printf("%5s", d.getPname() + "\t");
				System.out.printf("%15s", d.getPnum() + "\t");
				System.out.printf("%10s", d.getPadd() + "\t");
				System.out.printf("%18s", d.getPemail() + "\t");
				System.out.printf("%10s", d.getPcafename()+"\t");
				System.out.printf("%10s", d.getPcafenickname()+"\n");
			}
			System.out.println("----------------------------------------------------------------------------");
		} else
			System.out.println(pname+"의 정보가 없습니다.");
	}

	private void cafeList() {
		List<pbDto> list = dao.cafeList();
		
		if(!list.isEmpty() && list != null) {
			System.out.println(" 이름\t       전화번호\t       주소\t\t\t이메일\t\t동호회이름\t\t닉네임");
			System.out.println("----------------------------------------------------------------------------");
			for(int i=0; i<list.size(); i++) {
				System.out.printf("%5s", list.get(i).getPname()+"\t");
				System.out.printf("%15s", list.get(i).getPnum()+"\t");
				System.out.printf("%10s", list.get(i).getPadd()+"\t");
				System.out.printf("%18s", list.get(i).getPemail()+"\t");
				System.out.printf("%10s", list.get(i).getPcafename()+"\t");
				System.out.printf("%10s", list.get(i).getPcafenickname()+"\n");
			}
			System.out.println("----------------------------------------------------------------------------");
		} else {
			System.out.println("입력된 데이터가 없습니다.");
		}
	}

	private void cafeDelete() {
		System.out.println("-------------------------");
		System.out.println("삭제하실 연락처의 이름을 입력해주세요.");
		System.out.println("-------------------------");
		
		String pname = MainManager.sc.nextLine().toUpperCase();
		
		int resultCnt = dao.Delete(pname);
		
		if(resultCnt>0) {
			System.out.println(pname+"의 연락처 정상적으로 삭제되었습니다.");
		} else {
			System.out.println("연락처 정보를 찾지 못하였습니다. 확인후 재 시도해주세요.");
		}
	}

	private void cafeEdit() {
		Connection conn = null;
		try {
			conn = ConnProvider.getConnection();
			
			conn.setAutoCommit(false);
			
			System.out.println("-------------------------");
			System.out.println("수정하실 연락처의 정보를 입력해주세요.");
			System.out.println("-------------------------");
			
			// 사용자 입력정보 변수
			System.out.println("찾으실 연락처 이름");
			MainManager.sc.nextLine();
			String pname = MainManager.sc.nextLine().toUpperCase();
			
			// 1. 수정하고자 하는 데이터 유무 확인
			int rowCnt = dao.SearchCount(pname, conn);
			
			if(rowCnt >0) {
				pbDto d = dao.SearchName(pname, conn);
				
				if(d == null) {
					System.out.println("찾으시는 이름의 연락처가 존재하지 않습니다.");
					return;
				}
				
				System.out.println("수정하실 이름 ("+d.getPname()+") : ");
				String editName = MainManager.sc.nextLine().toUpperCase();
				
				
				System.out.println("수정하실 번호("+d.getPnum()+") : ");
				String pnum = MainManager.sc.nextLine();
				
				System.out.println("수정하실 주소("+d.getPadd()+") : ");
				String padd = MainManager.sc.nextLine();
				
				System.out.println("수정하실 이메일("+d.getPemail()+") : ");
				String pemail = MainManager.sc.nextLine();
				
				System.out.println("수정하실 동호회 이름("+d.getPcafename()+") : ");
				String pcafename = MainManager.sc.nextLine();
				
				System.out.println("수정하실 닉네임("+d.getPcafenickname()+") : ");
				String pcafenickname = MainManager.sc.nextLine();
				
				pbDto info = new pbDto(d.getPidx(), editName, pnum, padd, pemail, "cafe", pcafename, pcafenickname);
				
				int resultCnt = dao.univEdit(info, conn);
				
				if(resultCnt>0) {
					System.out.println("연락처 "+resultCnt + "개가 정상적으로 수정되었습니다.");
				} else {
					System.out.println(pname+"에 대한 연락처를 찾지 못하였습니다. 확인후 재 시도해주세요.");
				}
			} else {
				System.out.println("찾으시는 이름의 연락처가 존재하지 않습니다.");
			}
			conn.commit();
			
		} catch (SQLException e) {
			if(conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}
	}

	private void cafeInsert() {
		System.out.println("-------------------------");
		System.out.println("연락처를 입력해주세요.");
		System.out.println("-------------------------");
		
		System.out.println("이름 : ");
		MainManager.sc.nextLine();
		String pname = MainManager.sc.nextLine().toUpperCase();
		
		System.out.println("전화번호 : ");
		String pnum = MainManager.sc.nextLine();
		
		System.out.println("주소 : ");
		String padd = MainManager.sc.nextLine();
		
		System.out.println("이메일 : ");
		String pemail = MainManager.sc.nextLine();
		
		System.out.println("동호회 이름 : ");
		String pcafename = MainManager.sc.nextLine();
		
		System.out.println("닉네임 : ");
		String pcafenickname = MainManager.sc.nextLine();
		
		int resultCnt = 0;
		
		pbDto info = new pbDto(dao.getKey(), pname, pnum, padd, pemail, "cafe", pcafename, pcafenickname);
		resultCnt = dao.cafeInsert(info);
		
		if(resultCnt>0) {
			System.out.println(resultCnt + "행이 정상적으로 입력되었습니다.");
		} else {
			System.out.println("입력이 되지않았습니다. 확인 후 재시도 해주세요.");
		}
	}
}
