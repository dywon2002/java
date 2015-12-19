package kr.co.mlec.day17.ui;

import java.util.ArrayList;
import java.util.Scanner;

import kr.co.mlec.day17.Product;

public class SearchPriceUI implements IProductUI {
private ArrayList<Product> list;

public SearchPriceUI() {
}

	public SearchPriceUI(ArrayList<Product> list) {
	this.list = list;
}

	@Override
	public void execute() {
		System.out.println("-----------------------------");
		System.out.println("금액으로 검색");
		System.out.println("-----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("낮은 금액 : ");
		int low = sc.nextInt();
		System.out.print("높은 금액 : ");
		int high = sc.nextInt();
		System.out.println("제조회사\t상품명\t\t상품번호\t가격");
		boolean flag = false;
		for(int i=0;i<list.size();i++){
			Product pd = list.get(i);
			if(Integer.parseInt(pd.getPrice())>low&&
					Integer.parseInt(pd.getPrice())<high){
				System.out.println(list.get(i));
				flag = true;
			}
			}
		if(flag == false){
			System.out.println("검색된 상품 정보가 없습니다");
			
		}
		
	}

}
