package quiz13;

import java.util.Random;

public class BugsMusic implements SongList {
	
	private String[] list = new String[100];
	private int count = 0;
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 * 
	 */

    @Override
    public void insertList(String song) {
        System.out.println("=== 벅스! ===");
        list[count] = song;
        count++;
    }

    @Override
    public void playList() {
        for (int i = 0; i < count; i++) {
            System.out.println("재생: " + list[i]);
        }
    }

    @Override
    public int playLength() {
        return count;
    }
}
