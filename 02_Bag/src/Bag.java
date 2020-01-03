
public interface Bag {
	/**
	 * 가방에 내용물 추가
	 * @param object
	 */
	public void add(Object object);
	
	/**
	 * 동일한 내용물이 있는지 확인
	 * @param object
	 * @return boolean
	 */
	public boolean contains(Object object);

	/**
	 * 처음 들어있는 내용물 확인 
	 * @return Object
	 */
	public Object getFirst();
	
	/**
	 * 다음 내용물 확인
	 * @return Object
	 */
	public Object getNext();
	
	/**
	 * 해당 내용물 삭제
	 * @param object
	 * @return boolean
	 */
	public boolean remove(Object object);
	
	/**
	 * 가방 크기 확인
	 * @return int
	 */
	public int size();
	
	/**
	 * 주어진 백이 다른 주어진 백에 있는 모든 객체들을 포함하는 지의 여부를 알려주는 메소드
	 * @param bag
	 * @return boolean
	 */
	public boolean other_contains(Bag bag);
	
}
