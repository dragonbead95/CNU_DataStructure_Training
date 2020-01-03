import java.util.*;

public class TestArrayList {
	public void run()
	{
		String[] strings = {"CA","US","MX","AR","BR","CH"};
		println(strings);
		
		ArrayList list1 = new ArrayList(Arrays.asList(strings)); // asList�� �迭�� ����Ʈ���·� ����ϱ� ����
		System.out.println("list1 :		" +list1);
		
		list1.add("VE");		// ArrayList�� ����Ǿ� �ִ� ���� �޼ҵ� ��밡��, ���� add�� ���
		System.out.println("list1 :		" +list1);
		
		
		
		ArrayList list2 = new ArrayList(Arrays.asList(new String[] {"MX","HN","GT"}));
		System.out.println("list2 :		" + list2);
		
		list1.addAll(list2);	// addAll�� list1�� list2�� �ִ� ��� �׸� �߰�
		System.out.println("list1 + list2 : " + list1);
		
		list1.remove("MX");		// "MX" ���� ã�� list1���� ����
		System.out.println("list1 remove MX: " + list1);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		// containsAll�� list2�� ��� �׸��� list1�� ���ԵǾ� �ִ��� Ȯ��, boolean ������ ��Ÿ����
		
		list1.remove("HN");
		System.out.println("list1 :		" + list1);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		list1.removeAll(list2);		// removeAll : list1�� �׸� �� list2�� �ش�Ǵ� ��� ������ ���� 
		System.out.println("list1 :		" + list1);
		
		ArrayList list3 = new ArrayList(Arrays.asList(new String[] {"BR","US","PE"}));
		System.out.println("list3 :		" + list3);
		
		list1.retainAll(list3);		//retainAll : list1 �׸� �� list3�� ���ԵǴ� ����鸸���� list1 �籸��
		System.out.println("list1 :		" + list1);
		
		
		
		list1.toArray(strings);	//ArrayList�� ��Ҹ� ������ ��� ������ �� �迭�� ����
								//list1�� ����ִ� US,BR,NULL ���� string �迭�� ������� ����
								//strings �迭�� 0,1,2 �ڸ��� US,BR,NULL�� �����.
								//list1 ������ �ڿ��� ���� ������ �ʴ� NULL���� ���ִ�.
		println(strings);
		
		System.out.println();
		
		ArrayList listIterator = new ArrayList(Arrays.asList(new String[] {"BR","US","PE","KR","JP","CN"}));
		System.out.println("listIterator : 		" + listIterator);
		
		Iterator itr = listIterator.iterator();	// iterator�� ����ϱ� ���� itr ����
		
		System.out.println("�ݺ��ڸ� �̿��� 1�� ��� �� JP ����");
		while(itr.hasNext()) {
			String currentString = (String) itr.next();
			System.out.print(currentString + " ");
			
			if(currentString.compareTo("JP")==0) {
				itr.remove();
			}
		}
		
		System.out.println("\nJP ���� �� �ݺ��ڸ� �̿��� 2�� ���");
		System.out.println("listIterator : 		" + listIterator);
		itr = listIterator.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
	}
	
	public void println(String[] a)
	{
		System.out.print("{"+a[0]);
		for(int i=1;i<a.length;i++)
			System.out.print(","+ a[i]);
		System.out.println("}");
	}
	
}
