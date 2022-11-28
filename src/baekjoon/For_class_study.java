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
	
	Car() {                     // 코드 중복을 제거하려면 아래와 같이 작성
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
