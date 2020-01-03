import java.util.*;

public class TestArrayList {
	public void run()
	{
		String[] strings = {"CA","US","MX","AR","BR","CH"};
		println(strings);
		
		ArrayList list1 = new ArrayList(Arrays.asList(strings)); // asList는 배열을 리스트형태로 사용하기 위함
		System.out.println("list1 :		" +list1);
		
		list1.add("VE");		// ArrayList에 저장되어 있는 여러 메소드 사용가능, 그중 add를 사용
		System.out.println("list1 :		" +list1);
		
		
		
		ArrayList list2 = new ArrayList(Arrays.asList(new String[] {"MX","HN","GT"}));
		System.out.println("list2 :		" + list2);
		
		list1.addAll(list2);	// addAll은 list1에 list2에 있는 모든 항목 추가
		System.out.println("list1 + list2 : " + list1);
		
		list1.remove("MX");		// "MX" 값을 찾아 list1에서 제거
		System.out.println("list1 remove MX: " + list1);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		// containsAll은 list2의 모든 항목이 list1에 포함되어 있는지 확인, boolean 값으로 나타내줌
		
		list1.remove("HN");
		System.out.println("list1 :		" + list1);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		list1.removeAll(list2);		// removeAll : list1의 항목 중 list2에 해당되는 모든 내용을 제거 
		System.out.println("list1 :		" + list1);
		
		ArrayList list3 = new ArrayList(Arrays.asList(new String[] {"BR","US","PE"}));
		System.out.println("list3 :		" + list3);
		
		list1.retainAll(list3);		//retainAll : list1 항목 중 list3에 포함되는 내용들만으로 list1 재구성
		System.out.println("list1 :		" + list1);
		
		
		
		list1.toArray(strings);	//ArrayList의 요소를 지정된 요소 형식의 새 배열에 복사
								//list1에 들어있는 US,BR,NULL 값이 string 배열에 순서대로 저장
								//strings 배열에 0,1,2 자리에 US,BR,NULL을 덮어쓴다.
								//list1 데이터 뒤에는 눈에 보이지 않는 NULL값이 들어가있다.
		println(strings);
		
		System.out.println();
		
		ArrayList listIterator = new ArrayList(Arrays.asList(new String[] {"BR","US","PE","KR","JP","CN"}));
		System.out.println("listIterator : 		" + listIterator);
		
		Iterator itr = listIterator.iterator();	// iterator를 사용하기 위한 itr 생성
		
		System.out.println("반복자를 이용한 1차 출력 및 JP 삭제");
		while(itr.hasNext()) {
			String currentString = (String) itr.next();
			System.out.print(currentString + " ");
			
			if(currentString.compareTo("JP")==0) {
				itr.remove();
			}
		}
		
		System.out.println("\nJP 삭제 후 반복자를 이용한 2차 출력");
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
