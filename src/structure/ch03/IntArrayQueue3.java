package structure.ch03;

public class IntArrayQueue3 {

	private String[] array;
	private int front;// 큐의 시작 지점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 갯수

	public IntArrayQueue3(int capacity) {
		this.capacity = capacity;
		array = new String[this.capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// 편의 기능 만들어 보기
	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// todo -1 데이터 넣기 기능 구현
	public void enqueue(String item) {

		// 코드 수정
		// [10][20][30]
		// 나머지 연산자를 활용 한다 (순환구조)
		// 1 = 1 % 5;몫 0 나머지 1
		// 2 = 2 % 5;몫 0 나머지 2
		// 임시값 3
		// 0 = 0 % 3
		// 1 = 0 + 1 % 3
		// 2 = 1 + 1 % 3
		// 3 = 2 + 1 % 3 ->0
		// 4 = 0 + 1 % 3 ->1
		// 5 = 1 + 1 % 3 ->2
		rear = (rear + 1) % capacity;
		array[rear] = item;
		size++;

	

	}

	// todo -2 데이터 꺼내기
	public String dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return "empty";
		}
		String item= array[front];
		// [10][20][30]
		front= (front+1)% capacity;
		
		return item;
	}

	// todo -3 데이터 찾기 (peak)
	public String peek() {
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다.");
			return "empty";
		} else {
			// peek --> 맨 앞에 데이터를 리턴 시켜주는 기능일 뿐
			return array[front]; // - 수정
		}
		
	}

	public void printAll() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "");

		}
		System.out.println();
	}

	// 코드
	public static void main(String[] args) {

		IntArrayQueue3 queue = new IntArrayQueue3(4);

		// 데이터 넣기
		queue.enqueue("첫단");
		queue.enqueue("둘쨋단");
		queue.enqueue("셋째단");
		queue.enqueue("4~~");/// 안들어감
		queue.enqueue("5~~");/// 안들어감
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

//		queue.printAll();

	}// main
}// class
