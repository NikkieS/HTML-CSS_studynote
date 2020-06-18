package phoneBook;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ComManager {
	
	private ComManager() {}
	private static ComManager manager = new ComManager();
	
	public static ComManager getInstance() {
		return manager;
	}
	
	pbDao dao = new pbDao();

	public void comManager() {
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
			comInsert();
			break;
		case 2:
			comEdit();
			break;
		case 3:
			comDelete();
			break;
		case 4:
			comList();
			break;
		case 5:
			comSearch();
			break;
		}
	}

	private void comSearch() {
		System.out.println("-------------------------");
		System.out.println("검색하실 이름을 입력해주세요.");
		System.out.println("-------------------------");
		
		MainManager.sc.nextLine();
		String pname = MainManager.sc.nextLine().toUpperCase();
		
		List<pbDto> list = dao.Search(pname);
		
		if(!list.isEmpty() && list != null) {
			System.out.println(" 이름\t       전화번호\t       주소\t\t\t이메일\t\t회사이름\t부서\t직급");
			System.out.println("----------------------------------------------------------------------------");
			for(pbDto d : list) {
				System.out.printf("%5s", d.getPname() + "\t");
				System.out.printf("%15s", d.getPnum() + "\t");
				System.out.printf("%10s", d.getPadd() + "\t");
				System.out.printf("%18s", d.getPemail() + "\t");
				System.out.printf("%10s", d.getPcomname()+"\t");
				System.out.printf("%10s", d.getPcomdept()+"\t");
				System.out.printf("%10s", d.getPcomjob()+"\n");
			}
			System.out.println("----------------------------------------------------------------------------");
		} else
			System.out.println(pname+"의 정보가 없습니다.");
	}

	private void comList() {
		List<pbDto> list = dao.cafeList();
		
		if(!list.isEmpty() && list != null) {
			System.out.println(" 이름\t       전화번호\t       주소\t\t\t이메일\t\t회사이름\t부서\t직급");
			System.out.println("----------------------------------------------------------------------------");
			for(int i=0; i<list.size(); i++) {
				System.out.printf("%5s", list.get(i).getPname()+"\t");
				System.out.printf("%15s", list.get(i).getPnum()+"\t");
				System.out.printf("%10s", list.get(i).getPadd()+"\t");
				System.out.printf("%18s", list.get(i).getPemail()+"\t");
				System.out.printf("%10s", list.get(i).getPcomname()+"\t");
				System.out.printf("%10s", list.get(i).getPcomdept()+"\t");
				System.out.printf("%10s", list.get(i).getPcomjob()+"\n");
			}
			System.out.println("----------------------------------------------------------------------------");
		} else {
			System.out.println("입력된 데이터가 없습니다.");
		}
	}

	private void comDelete() {
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

	private void comEdit() {
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
				
				System.out.println("수정하실 회사 이름("+d.getPcomname()+") : ");
				String pcomname = MainManager.sc.nextLine();
				
				System.out.println("수정하실 부서("+d.getPcomdept()+") : ");
				String pcomdept = MainManager.sc.nextLine();
				
				System.out.println("수정하실 직급("+d.getPcomdept()+") : ");
				String pcomjob = MainManager.sc.nextLine();
				
				pbDto info = new pbDto(d.getPidx(), editName, pnum, padd, pemail, "com", pcomname, pcomdept, pcomjob);
				
				int resultCnt = dao.comEdit(info, conn);
				
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

	private void comInsert() {
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
		
		System.out.println("회사 이름 : ");
		String pcomname = MainManager.sc.nextLine();
		
		System.out.println("부서 : ");
		String pcomdept = MainManager.sc.nextLine();
		
		System.out.println("직급 : ");
		String pcomjob = MainManager.sc.nextLine();
		
		int resultCnt = 0;
		
		pbDto info = new pbDto(dao.getKey(), pname, pnum, padd, pemail, "com", pcomname, pcomdept, pcomjob);
		resultCnt = dao.cafeInsert(info);
		
		if(resultCnt>0) {
			System.out.println(resultCnt + "행이 정상적으로 입력되었습니다.");
		} else {
			System.out.println("입력이 되지않았습니다. 확인 후 재시도 해주세요.");
		}
		
	}
}
