package baekjoon;

class Tv {
	int scale;
	int length;
	int height;
	String color;
	int volume;
	int channel;
	boolean power;
	
	void power() { power = !power; }
	void volumeUp() { volume++; }
	void volumeDown() { volume--; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {                     // �ڵ� �ߺ��� �����Ϸ��� �Ʒ��� ���� �ۼ�
		color = "white";        // Car() {
		gearType = "auto";      // this("white", "auto", 4);
		door = 4;               // }
	}
	/*
	Car( String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
	
	Car( String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	*/
}
