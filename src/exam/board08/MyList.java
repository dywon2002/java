package exam.board08;
//package exam.board08;
//
//public class MyList {
//	private Object[] arr;
//	private int pos = 0;
//	
//	public MyList() {
//		arr = new Object[2];
//	}
//	
//	public MyList(int size) {
//		arr = new Object[size];
//	}
//	
//	/*
//	 *  1. 입력되기 전에 크기를 체크한다.
//	 *  2. 새로운 확장된 배열을 생성한다.
//	 *  3. 기존 배열의 내용을 새롭게 생성한 배열에 복사한다.
//	 *  4. 기존 배열의 참조를 새롭게 생성한 배열로 변경한다.
//	 */
//	public void add(Object data) {
//		// 배열의 크기와 입력된 데이터의 크기가 같을 때
//		if (arr.length == pos) {
//			Object[] temp = new Object[arr.length * 2];
//			System.arraycopy(arr, 0, temp, 0, arr.length);
//			arr = temp;
//		}
//
//		arr[pos++] = data;
//	}
//	
//	public Object get(int index) throws InvalidIndexException {
//		if (pos <= index) {
//			throw new InvalidIndexException(index);
//		}
//		return arr[index];
//	}
//	
//	/*
//	 *  삭제 성공 시 : true
//	 *  삭제 실패 시 : false
//	 *  
//	 *  삭제 실패 경우
//	 *  1. index 번호가 0 보다 작을 경우
//	 *  2. index 번호가 pos 보다 크거나 같을 경우 
//	 */
//	public boolean remove(int index) {
//		if (index < 0 || index >= pos) return false;
//		
//		// 삭제할 인덱스 뒤에 있는 실제 이동시킬 개수
//		int numMoved = pos - index -1;
//		if (numMoved > 0) {
//			System.arraycopy(
//					arr, index + 1, arr, index, numMoved);
//		}
//		arr[--pos] = null;
//		
//		return true;
//	}
//	
//	public int size() {
//		return pos;
//	}
//	}