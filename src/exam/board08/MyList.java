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
//	 *  1. �ԷµǱ� ���� ũ�⸦ üũ�Ѵ�.
//	 *  2. ���ο� Ȯ��� �迭�� �����Ѵ�.
//	 *  3. ���� �迭�� ������ ���Ӱ� ������ �迭�� �����Ѵ�.
//	 *  4. ���� �迭�� ������ ���Ӱ� ������ �迭�� �����Ѵ�.
//	 */
//	public void add(Object data) {
//		// �迭�� ũ��� �Էµ� �������� ũ�Ⱑ ���� ��
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
//	 *  ���� ���� �� : true
//	 *  ���� ���� �� : false
//	 *  
//	 *  ���� ���� ���
//	 *  1. index ��ȣ�� 0 ���� ���� ���
//	 *  2. index ��ȣ�� pos ���� ũ�ų� ���� ��� 
//	 */
//	public boolean remove(int index) {
//		if (index < 0 || index >= pos) return false;
//		
//		// ������ �ε��� �ڿ� �ִ� ���� �̵���ų ����
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