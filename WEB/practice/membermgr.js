// 회원 정보를 저장할 배열 생성
var members = [];

// 회원 데이터를 객체화 시킬 생성자 함수
function Member(mid, mname, mpw){
    this.id=mid;
    this.name=mname;
    this.pw=mpw;
}

// 공통 함수 : 메소드 정의
// prototype이라는 객체 
Member.prototype.toString = function(){

}

// 데이터 저장 함수
function addMember(member){
    members.push(member);
    console.log(members);
    displayTable();
}

// 회원 데이터 저장
function createMember(){
    // 사용자 입력 데이터 받기, document로 캐스팅 후 
    var id = document.getElementById('uid').value;
    var name = document.getElementById('uname').value;
    var pw = document.getElementById('upw').value;

    // 배열에 데이터 추가
    addMember(new Member(id, name, pw));
    // 동기화
    setStorage();

    document.getElementById().reset;

    // form  태그의 action 실행이 되지 않도록 반드시 return false
    return false;
}
// 회원 리스트 출력 기능
function displayTable(){
    var listHtml = '';
    listHtml += '<table calss "listtable">';
    listHtml += '   <tr>';
    listHtml += '       <th>index</th>';
    listHtml += '       <th>ID(이메일)</th>';
    listHtml += '       <th>비밀번호</th>';
    listHtml += '       <th>이름</th>';
    listHtml += '       <th>관리</th>';
    listHtml += '   </tr>'

    // 배열의 요소를 반복문으로 태그 생성
    for(let i=0; i<members.length; i++){
        listHtml += '   <tr>';
        listHtml += '       <td>'+i+'</td>';
        listHtml += '       <td>'+members[i].id+'</td>';
        listHtml += '       <td>'+members[i].pw+'</td>';
        listHtml += '       <td>'+members[i].name+'</td>';
        listHtml += '       <td> <a href="javascript:editSet('+i+')">수정</a> | <a href="javascript:deleteMember('+i+')">삭제</a></td>';
        listHtml += '   <tr>';
    }

    listhtml +='</table>';

    var listTable = document.getElementById('list');
    listTable.innerHTML = listHtml;
}

// 리스트에서 선택한 회원의 데이터를 수정 폼에 Set
function editSet(idx){

    // 수정 폼 영역 출력
    document.getElementById('edit').style.display='block';

    // 사용자 입력 데이터 받기, document로 캐스팅 후 value속성 사용
    document.getElementById('eid').value=members[idx].id;
    document.getElementById('ename').value=members[idx].name;
    document.getElementById('epw').value=members[idx].pw;
    document.getElementById('idx').value=idx;
}

// 데이터 수정 함수
function editMember(){
    // 사용자 입력 데이터 받기, document로 캐스팅 후 value 속성 사용
    var id = document.getElementById('eid').value;
    var name = document.getElementById('ename').value;
    var pw = document.getElementById('epw').value;
    var idx = document.getElementById('idx').value;

    // 배열의 요소 인 Member 객체의 속성값을 변경.
    // setter/getter 메소드 구현도 가능
    members[parseInt(idx)].id = id;
    members[parseInt(idx)].name = name;
    members[parseInt(idx)].pw = pw;

    document.getElementById('editForm').reset();

    // 리스트 테이블 갱신
    displayTable();
    // 동기화
    setStorage();

    alert("수정되었습니다.\n수정폼 화면을 숨깁니다.");
    // 
}




// 저장, 수정, submit 이벤트 처리
window.onload = function(){
    // 페이지가 로드된것은 프로그램을 시작하는 시점이다
    // 저장된 데이터를 배열 객체로 변환
    initStorage();

    // 로드 된 데이터를 테이블로 화면에 출력
    displayTable();

    // 입력 폼 casting -> onsubmit Event
}