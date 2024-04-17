package basic.ch07;

public class ClothMainTest {

	public static void main(String[] args) {
		Cloth cloth1 = new Cloth();
		cloth1.clothName="니트";
		cloth1.size=30;
		cloth1.Category="Uuper";
		cloth1.Texture="Wool";
		cloth1.take();
		cloth1.favor();
		cloth1.looks();
		cloth1.info();

	}

}
