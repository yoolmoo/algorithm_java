package algo;

public class Song {
	String title;
	String artist;
	int year;
	String country;

	//송 클래스의 속성을 초기화하는 생성자
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public static void main(String[] args) {
		// 특정값으로 송 클래스의 인스턴스 생성
		Song song = new Song("Dancing Queen", "ABBA", 1987, "스웨덴");
		
		//생성된 송 정보 출력
		System.out.println(song.year+ "년 " + song.country + " 국적의 " + song.artist + "가 부른 " + song.title);
	}
	
}
