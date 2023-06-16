package ch07;

class MyTv2 {
	private boolean isPoweron;
	private int channel;
	private int volume;
	private int prevChannel;	// ���� ä�� ������ �������
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	public boolean isPoweron() {
		return isPoweron;
	}
	public void setPoweron(boolean isPoweron) {
		this.isPoweron = isPoweron;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel < MIN_CHANNEL || channel > MAX_CHANNEL)	// ��ȿ�� ����
			return;
		
		prevChannel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)	// ��ȿ�� ����
			return;
		
		this.volume = volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);	// ���� ä���� ���� ä�η� �����Ѵ�.
	}
}

public class Exercise7_5 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}

}
