package prac;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DEPTManager {
	DeptDao dao = new DeptDao();
	
	public void deptManager() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("-----------------------");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 전체 출력");
		System.out.println("5. 검색");
		System.out.println("-----------------------");
		
		int choice = ERPManager.kb.nextInt();
		switch(choice) {
		case 1:
			deptInsert(); // 사용자의 입력데이터 dept 객체에 담아서 dao insert 메소드로 전달
			break;
		case 2:
			deptEdit(); // 1. 수정하고자 하는 데이터 유무 확인 2. 사용자로부터 데이터 받아서 전달
			break;
		case 3:
			deptDelete(); // 이름또는 부서번호 dao delete 전달
			break;
		case 4:
			deptList();
			break;
		case 5:
			deptSearch(); // 사용자가 입력한 이름을 dao search 전달
			break;
		}
	}
	
	public void deptEdit() {
		Connection conn=null;
		try {
			conn = ConnProvider.getConnection();
			
			conn.setAutoCommit(false); // 기본값 true : 자동커밋
			
			System.out.println("-------------------------");
			System.out.println("수정하실 부서의 정보를 입력해주세요.");
			System.out.println("-------------------------");
			
			// 사용자 입력정보 변수
			System.out.println("찾으실 부서 이름");
			ERPManager.kb.nextLine();
			String dname = ERPManager.kb.nextLine().toUpperCase();
			
			// 1. 수정하고자 하는 데이터 유무 확인
			int rowCnt = dao.deptSearchCount(dname, conn);
			
			if(rowCnt >0) {
				Dept dept = dao.deptSearchName(dname, conn);
				
				if(dept == null) {
					System.out.println("찾으시는 이름의 부서정보가 존재하지 않습니다.");
					return;
				}
				
				System.out.println("부서 번호는 고유키로 수정이 불가능합니다.");
				
				System.out.println("수정하실 이름 ("+dept.getDname()+") : ");
				String editName = ERPManager.kb.nextLine().toUpperCase();
				
				
				System.out.println("수정하실 위치("+dept.getLoc()+") : ");
				String loc = ERPManager.kb.nextLine().toUpperCase();
				Dept newDept = new Dept(dept.getDeptno(), editName, loc);
				
				int resultCnt = dao.deptEdit(newDept, conn);
				
				if(resultCnt>0) {
					System.out.println("부서정보 "+resultCnt + "개가 정상적으로 수정되었습니다.");
				} else {
					System.out.println(dname+"에 대한 정보를 찾지 못하였습니다. 확인후 재 시도해주세요.");
				}
			} else {
				System.out.println("찾으시는 이름의 부서정보가 존재하지 않습니다.");
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

	public void deptInsert() {
		System.out.println("-------------------------");
		System.out.println("부서 정보를 입력해주세요.");
		System.out.println("-------------------------");
		
		System.out.println("부서 번호");
		int deptno = ERPManager.kb.nextInt();
		
		System.out.println("부서 이름");
		ERPManager.kb.nextLine();
		String dname = ERPManager.kb.nextLine().toUpperCase();
		
		System.out.println("위치");
		String loc = ERPManager.kb.nextLine().toUpperCase();
		
		Dept dept = new Dept(deptno, dname, loc);
		int resultCnt = dao.deptInsert(dept);
		
		if(resultCnt>0) {
			System.out.println(resultCnt + "행이 정상적으로 입력되었습니다.");
		} else {
			System.out.println("입력이 되지않았습니다. 확인후 재 시도해주세요.");
		}
		
	}

	public void deptDelete() {
		System.out.println("-------------------------");
		System.out.println("삭제하실 부서의 번호를 입력해주세요.");
		System.out.println("-------------------------");
		
		String dname = ERPManager.kb.nextLine();
		
		int resultCnt = dao.deptDelete(dname);
		
		if(resultCnt>0) {
			System.out.println(dname+"의 부서정보가 정상적으로 삭제되었습니다.");
		} else {
			System.out.println("부서를 찾지 못하였습니다. 확인후 재 시도해주세요.");
		}
	}

	public void deptSearch() {
		System.out.println("-------------------------");
		System.out.println("검색하실 부서의 이름을 입력해주세요.");
		System.out.println("-------------------------");
		
		ERPManager.kb.nextLine();
		String dname = ERPManager.kb.nextLine().toUpperCase();
		
		List<Dept> list = dao.deptSearch(dname);
		
		if(!list.isEmpty() && list != null) {
			for(Dept d : list) {
				System.out.printf("%5s", d.getDeptno() + "\t");
				System.out.printf("%12s", d.getDname() + "\t");
				System.out.printf("%12s", d.getLoc() + "\n");
			}
		} else
			System.out.println(dname+"의 부서정보가 없습니다.");
	}

	public void deptList() {
		List<Dept> deptList = dao.deptList();
		
		if(!deptList.isEmpty() && deptList != null) {
			for(int i=0; i<deptList.size(); i++) {
				System.out.printf("%5s", deptList.get(i).getDeptno()+"\t");
				System.out.printf("%12s", deptList.get(i).getDname()+"\t");
				System.out.printf("%12s", deptList.get(i).getLoc()+"\n");
			}
		} else {
			System.out.println("입력된 데이터가 없습니다.");
		}
	}

}
