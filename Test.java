package shiyan2;

public class Test {
	public static void main(String[] args) {
	    CPU cpu=new CPU();               //����CPU����cpu
	    cpu.setSpeed(2200);              //cpu����setSpeed()����
	    cpu.setDigit(64);                
	    HardDisk disk=new HardDisk();   
	    disk.setAmount(200);            
	    disk.setRev(7200);               
	    PC pc=new PC();                  
	    pc.setCPU(cpu);                  //pc����setCPU(CPU c)����,����ʱʵ����cpu
	    pc.setHardDisk(disk);            //pc����HardDisk(HardDisk h)����,����ʱʵ����disk
	    pc.show();                       //pc����show()����
		}
}
