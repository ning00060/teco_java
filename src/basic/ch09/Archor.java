package basic.ch09;

import java.util.Scanner;

public class Archor {
	String name;
	int HP;//
	int MP;
	int attck;
	int defence;
	int speed;
	int count;

	public Archor(String Aname, int Ahp, int Amp, int Aat, int Ade, int Asp) {
		name = Aname;
		HP = Ahp;
		MP = Amp;
		attck = Aat;
		defence = Ade;
		speed = Asp;
	}

	public void TakeM(int at, int deal, Magician magician) {
		at += attck;
		magician.Injuried(attck);
		deal += count;
	}

	public void TakeW(int at, int deal, Warrior warrior) {
		at += attck;
		warrior.Injuried(attck);
		deal += count;
	}

	public void Injuried(int Ahp) {
		HP -= Ahp;
		if (HP <= 0) {
			System.out.println("사망하였습니다");
			return;
		} else {
			System.out.println(HP + "생존 하였습니다");
			return;
		}

	}

	public void showinfo() {
		System.out.println("영웅 이름: " + name);
		System.out.println("영웅 체력: " + "피 " + HP + "마나 " + MP);
		System.out.println("영웅 공격력: " + attck);
		System.out.println("영웅 방어력: " + defence);
		System.out.println("영웅 속도: " + HP);

	}
}
