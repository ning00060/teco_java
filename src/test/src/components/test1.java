//package components;
//
//
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;
//
//import interfaces.ItemMoveable;
//import state.BombWay;
//import test.Lys_TestMain;
//
//public class test1 extends JLabel implements ItemMoveable {
//
//	Lys_TestMain mContext;
//
//	private int state = 0;
//	private int score = 0;
//
//	private int x;
//	private int y;
//	private ImageIcon item1;
//	private ImageIcon item2;
//	private ImageIcon item3;
//	private final int SPEED = 3;
//	
//	private boolean left;
//	private BombWay bombWay;
//
//	public test1() {
//		initData();
//		setInitLayout();
//		left();
//
//	}
//
//	public void initData() {
//		item1 = new ImageIcon("img/dotori.png");
//		item2 = new ImageIcon("img/berry2.png");
//		item3 = new ImageIcon("img/berry1.png");
//		x = 1000;
//		y = 310;
//
//	}
//
//	public void setInitLayout() {
//		setIcon(item1);
//		setSize(50, 50);
//		setLocation(x, y);
//	}
//
//	public void crash() {
//		// mContext.getPlayer().increaseScore();
//		mContext.remove(this);
//		mContext.repaint();
//	}
//
//
//
//	@Override
//	public void left() {
//		bombWay = BombWay.LEFT;
//		left = true;
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				while (left) {
//					x -= SPEED;
//					setLocation(x, y);
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//
//					if (getBounds().intersects(mContext.getPlayer().getBounds())) {
//						playerCollision();
//						break;
//					}
//				}
//
//			}
//		}).start();
//
//	}
//
//	public void playerCollision() {
//		crash();
//	}
//
//	public int getState() {
//		return state;
//	}
//
//	public void setState(int state) {
//		this.state = state;
//	}
//
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
//
//	public int getY() {
//		return y;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
//}
