package refone.realexam.service;

import java.sql.SQLException;
import java.util.Scanner;

import refone.realexam.dao.MemberDaoInter;
import refone.realexam.dao.MemberRefactDao;
import refone.realexam.vo.MemberVo;

public class MemberService {
   public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  MemberDaoInter dao = new MemberRefactDao();
      MemberVo vo = new MemberVo();
      int jobSelect = Integer.parseInt(dataInput("작업[1:입력, 2:수정, 3:삭제]을 선택하세요"));
      
      if ( jobSelect == 1) {
         //입력작업을 한다. => 5개입력
         vo.setMemId(dataInput("아이디"));
         vo.setPassword(dataInput("비밀번호"));
         vo.setiName(dataInput("이름"));
         vo.setAddress(dataInput("주소"));
         vo.setPhone(dataInput("전화번호"));
         int result = dao.add(vo);
         if (result != 1) {
            System.out.println("회원 입력에 실패하였습니다.");
         }
      }
            
      if ( jobSelect == 2) {
         //수정작업을 한다. => 2개(변경될 주소와 아이디)    	 
     	 vo.setAddress(dataInput("변경할 주소"));
     	 vo.setMemId(dataInput("변경할 아이디"));
         int updateResult = dao.update(vo);
         if (updateResult == 1) {
            System.out.println("자료 수정 성공!!!");
         }
      }
      if ( jobSelect == 3) {
         vo.setMemId(dataInput("아이디"));
         int updateResult = dao.delete(vo.getMemId());
         if (updateResult == 1) {
            System.out.println("자료 삭제 성공!!!");
         }
      }

   }
   
   public static String dataInput(String message) {
	   System.out.println(message + " 입력하세요");
	   Scanner scan = new Scanner(System.in);
	   return scan.next();
	   //return new Scanner(System.in).next로 줄일 수 있다. ->비권장
   }
}