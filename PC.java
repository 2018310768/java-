package shiyan2;

class PC {
	CPU cpu;                      //定义cpu为CPU类型
	HardDisk HD;
	public void setCPU(CPU c){
		cpu=c;
	}
	public void setHardDisk(HardDisk h){
		HD=h;
	}
    public void show() {
		System.out.println("cpu的速度："+cpu.getSpeed()+"\n"+"cpu的位数"+cpu.getDigit()+"\n"+
				           "硬盘的容量："+HD.getAmount()+"\n"+"硬盘的转速"+HD.getRev());	
	}	
}

