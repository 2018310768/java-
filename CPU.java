package shiyan2;

class CPU {
	private int speed;            //����CPU���ٶ�
	private int digit;            //����CPU��λ��
	public void setSpeed(int speed){
		if(speed>=2000&&speed<=2400) {
			this.speed=speed;
		}
	}
    public int getSpeed(){
	 	return speed;
	 	
	}
	public void setDigit(int digit){
		if(digit>=32) {
			this.digit=digit;
		}
	}
    public int getDigit(){
	 	return digit;
	 	
	}
}

