package shiyan2;

class PC {
	CPU cpu;                      //����cpuΪCPU����
	HardDisk HD;
	public void setCPU(CPU c){
		cpu=c;
	}
	public void setHardDisk(HardDisk h){
		HD=h;
	}
    public void show() {
		System.out.println("cpu���ٶȣ�"+cpu.getSpeed()+"\n"+"cpu��λ��"+cpu.getDigit()+"\n"+
				           "Ӳ�̵�������"+HD.getAmount()+"\n"+"Ӳ�̵�ת��"+HD.getRev());	
	}	
}

