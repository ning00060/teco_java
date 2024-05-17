//package components;
//
//import javax.swing.ImageIcon;
//
//public class Player2 {
//	private Player player; // Player 클래스의 인스턴스를 포함
//
//	public Player2() {
//		player = new Player(null); // Player 객체 생성
//	}
//
//	public void moveLeft() {
//		int currentX = player.getX();
//		player.setX(currentX - 10); // Player의 X 좌표 변경
//		player.setLocation(player.getX(), player.getY()); // 위치 업데이트
//	}
//
//	public void moveRight() {
//		int currentX = player.getX();
//		player.setX(currentX + 10); // Player의 X 좌표 변경
//		player.setLocation(player.getX(), player.getY()); // 위치 업데이트
//	}
//
//	// 필요한 경우 Player 객체의 다른 메서드들을 호출하여 동작 구현
//
//	public ImageIcon getPlayerIcon() {
//		return player.getPlayer(); // Player의 이미지 아이콘 반환
//	}
//
////
//	public void jump() {
//		player.up();
//
//	}
//}
