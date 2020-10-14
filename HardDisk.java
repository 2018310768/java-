package shiyan2;

class HardDisk {
	private int amount;                //定义硬盘的容量
	private int rev;                   //定义硬盘的转速
	public void setAmount(int amount){
		if(amount>=100&&amount<=300) {
			this.amount=amount;    
	    }
	}
	int getAmount(){
		return amount; 
	}
	public void setRev(int rev){
		if(rev>=5400&&rev<=80000) {
			this.rev=rev;
	    }
	}
	int getRev(){
		return rev; 
	}
	
}
