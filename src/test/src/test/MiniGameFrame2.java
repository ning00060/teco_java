//package test;
//
//import java.awt.Font;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//import java.util.Random;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//import components.Bomb;
//import components.Item;
//import components.Player;
//
//public class MiniGameFrame2 extends MiniGameFrame {
//
//	MiniGameFrame mContext = this;
//
//	private JLabel backgroundMap;
//	private Bomb bomb;
//	private Item item;
//	private Player player;
//	private JLabel comments;
//	private int score;
//	boolean flag;
//
//	public MiniGameFrame2() {
//		initData();
//		setInitLayout();
//		addEventListener();
//	}
//
//	public void initData() {
//		backgroundMap = new JLabel(new ImageIcon("img/Background1.jpg"));
//		setContentPane(backgroundMap);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(815, 500);
//		bomb = new Bomb(mContext);
//		item = new Item(mContext);
//		player = new Player(player);
//		comments = new JLabel(Integer.toString(score));
////		comments = new JLabel(Integer.toString(2));
//		getContentPane().add(comments);
//		comments.setFont(new Font("나눔고딕", Font.BOLD, 20));
//	}
//
//	public void setInitLayout() {
//		setLayout(null);
//		// setResizable(false);
//		setLocationRelativeTo(null);
//		setVisible(true);
//		add(player);
//		comments.setBounds(20, 0, 150, 100);
//		add(comments);
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				while (true) {
//					int a = (new Random()).nextInt(10);
//					if (a < 7) {
//						int b = (new Random()).nextInt(10);
//						if (b < 5) {
//							add(new Item(mContext));
//							repaint();
//						}
//					} else {
//						int b = (new Random()).nextInt(10);
//						if (b < 5) {
//							add(new Bomb(mContext));
//							repaint();
//						}
//					}
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}).start();
//
//	}
//
//	public void addEventListener() {
//		this.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) {
//				switch (e.getKeyCode()) {
//				case KeyEvent.VK_SPACE:
//					player.up();
//					scoreSet(50);
//					System.out.println(score);
//					comments.setText(Integer.toString(score));
//					break;
//				default:
//					break;
//				}
//			}
//		});
//	}
//
//	public JLabel getBackgroundMap() {
//		return backgroundMap;
//	}
//
//	public void setBackgroundMap(JLabel backgroundMap) {
//		this.backgroundMap = backgroundMap;
//	}
//
//	public Bomb getBomb() {
//		return bomb;
//	}
//
//	public void setBomb(Bomb bomb) {
//		this.bomb = bomb;
//	}
//
//	public Item getItem() {
//		return item;
//	}
//
//	public void setItem(Item item) {
//		this.item = item;
//	}
//
//	public Player getPlayer() {
//		return player;
//	}
//
//	public void setPlayer(Player player) {
//		this.player = player;
//	}
//
//	public int scoreSet(int point) {
//		this.score+=point;
//		return this.score;
//	}
//
//	public static void main(String[] args) {
//		new MiniGameFrame2();
//	}
//
//}
