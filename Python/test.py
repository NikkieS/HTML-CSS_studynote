student_number = 12

# 변수의 타입을 출력
print(type(student_number))
print(type(str(student_number)))
# 학생의 번호를 출력합니다.
print('학생번호 : ', student_number)    # , : space 하나를 띄워줌
print('학생번호 : '+str(student_number))

del student_number  # 변수 삭제
student_number = 12

number_list1 = range(10)
number_list2 = range(5,10)
number_list3 = range(0,10,2)

print("number_list1 :", number_list1, "\nnumber_list2 :", number_list2,"\nnumber_list3 :", number_list3)

for i in number_list1:
    print(i)

print('송가람')