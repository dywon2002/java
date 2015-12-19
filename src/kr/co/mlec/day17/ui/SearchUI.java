package kr.co.mlec.day17.ui;

import java.util.ArrayList;

import kr.co.mlec.day17.Product;

public class SearchUI implements IProductUI{
	
	private ArrayList<Product> list;
	
	public SearchUI() {
	}
	public SearchUI(ArrayList<Product> list) {
		this.list = list;
	}


	@Override
	public void execute() {
		System.out.println("-----------------------------");
		System.out.println("상품 정보");
		System.out.println("총 "+list.size()+"개");
		System.out.println("-----------------------------");
		System.out.println("제조회사\t상품명\t\t상품번호\t가격");
		System.out.println("-----------------------------");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------");
	}

}
