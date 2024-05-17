//package test;
//
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
//import components.test1;
//
//public class Lys_TestMain extends JFrame {
//
//	Lys_TestMain mContext = this;
//
//    private JLabel backgroundMap;
//    private Bomb bomb;
//    private test1 item;
//    private ImageIcon i1;
//    private ImageIcon i2;
//    private ImageIcon i3;
//    private Player player;
//
//
//    public Lys_TestMain() {
//        initData();
//        setInitLayout();
//        addEventListener();
//    }
//
//    public void initData() {
//
//    	i2 =new ImageIcon("img/berry1.png");
//        backgroundMap = new JLabel(new ImageIcon("img/Background.jpg"));
//        setContentPane(backgroundMap);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(815, 500);
//        bomb = new Bomb(mContext);
//        item = new Item(i2, i3);
//        player = new Player(player);
//    }
//
//    public void setInitLayout() {
//        setLayout(null);
//        setLocationRelativeTo(null);
//        setVisible(true);
//        add(player);
//        add(i2);
//        add(i3);
//        
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    int a = (new Random()).nextInt(10);
//                    if (a < 7) {
//                        int b = (new Random()).nextInt(10);
//                        if (b < 5) {
//                           add(new Item());
//                        }
//                    } else {
//                        int b = (new Random()).nextInt(10);
//                        if (b < 5) {
//                            add(new Bomb(mContext));
//                        }
//                    }
//                    repaint();
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();
//    }
//
//    public void addEventListener() {
//        this.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                switch (e.getKeyCode()) {
//                    case KeyEvent.VK_SPACE:
//                        player.up();
//                        break;
//                    default:
//                        break;
//                }
//            }
//        });
//    }
//
//    //player와 item의 충돌 
//    public void checkCollisions() {
//        if (player.getBounds().intersects(i2.getBounds())) {
//            i2.playerCollision(); // item과 player가 충돌했을 때 호출하여 점수 증가 및 아이템 제거
//        } 
//        if (player.getBounds().intersects(i3.getBounds())) {
//        	i3.playerCollision(); // item과 player가 충돌했을 때 호출하여 점수 증가 및 아이템 제거
//        } 
//    } 
//
//    public JLabel getBackgroundMap() {
//        return backgroundMap;
//    }
//
//    public void setBackgroundMap(JLabel backgroundMap) {
//        this.backgroundMap = backgroundMap;
//    }
//
//    public Bomb getBomb() {
//        return bomb;
//    }
//
//    public void setBomb(Bomb bomb) {
//        this.bomb = bomb;
//    }
//
//    
//
//    public Item getIcon1() {
//		return icon1;
//	}
//
//	public void setIcon1(Item icon1) {
//		this.icon1 = icon1;
//	}
//
//	public Item getIcon3() {
//		return icon3;
//	}
//
//	public void setIcon3(Item icon3) {
//		this.icon3 = icon3;
//	}
//
//	public Player getPlayer() {
//        return player;
//    }
//
//    public void setPlayer(Player player) {
//        this.player = player;
//    }
//
//    public static void main(String[] args) {
//    	Lys_TestMain miniGame = new Lys_TestMain();
//        new Thread(() -> {
//            while (true) {
//                miniGame.checkCollisions(); // 충돌 확인
//                try {
//                    Thread.sleep(10); // 충돌 확인 주기
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//    }
//}