package friend.bean;

public class FriendDTO {
	private int seq;
	private String name;
	private String tel1;
	private String tel2;
	private String tel3;
	private int gender;
	private int read,movie,music,game,shopping;
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setTel1(String tel) {
		this.tel1 = tel;
	}

	public void setTel2(String tel22) {
		this.tel2 = tel22;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public void setRead(int read) {
		this.read = read;
	}

	public void setMovie(int movie) {
		this.movie = movie;
	}

	public void setMusic(int music) {
		this.music = music;
	}

	public void setGame(int game) {
		this.game = game;
	}

	public void setShopping(int shopping) {
		this.shopping = shopping;
	}


	public String getName() {
		return name;
	}

	public String getTel1() {
		return tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public String getTel3() {
		return tel3;
	}

	public int getGender() {
		return gender;
	}

	public int getRead() {
		return read;
	}

	public int getMovie() {
		return movie;
	}

	public int getMusic() {
		return music;
	}

	public int getGame() {
		return game;
	}

	public int getShopping() {
		return shopping;
	}
	
	@Override
	public String toString() {
		return name;
	}
	public FriendDTO() {
	
	}
	
}
