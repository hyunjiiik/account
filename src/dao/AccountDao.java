package dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.AccountDto;

public class AccountDao {

	
	Scanner sc = new Scanner(System.in);
	
	private List<AccountDto> list = new ArrayList<AccountDto>();
	
	// CRUD
	
	// insert, delete, select, update
	public void insert() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("가계부를 추가합니다.");
		System.out.print("날짜 = ");
		String date = sc.next();
		
		System.out.print("용도 = ");
		String use = sc.next();
		
		System.out.print("수입 or 지출 = ");
		String classify = sc.next();
		
		System.out.print("금액= ");
		int money = sc.nextInt();
		
		System.out.print("내용 = ");
		String memo = sc.next();
		
		AccountDto dto = new AccountDto(date, use, classify, money, memo);
		list.add(dto);
		
	}
	
	public void delete() {
		
		System.out.println("삭제 할 날짜 = ");
		String date = sc.next();
		
		int index = search(date);
		
		if(index == -1) {
			System.out.println("삭제할 데이터가 없습니다.");
		} else {
			list.remove(index);
			System.out.println("지정한 지인의 가계부를 삭제하였습니다.");
		}
	}
	

	
	// select함수 각각 만들기 
	public void selectMonth() {		
		
		// 연도월별 결산
		System.out.print("검색할 날짜 = ");
		String name = sc.next();
		
		for (AccountDto accountDto : list) {
			
		}
		
	}
	
	public void selectUse() {
		// 수입만
		
		// 지출만
		
	} 
	
	public void select() {
		// 용도검색
		
	}
	
	public void update() {
		
	}
	
	public int search(String date) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			AccountDto dto = list.get(i);
			if(date.equals(dto.getDate())) {
				index = i;
				break;
			}
		}
	return index;
	}
	
	
	
}
