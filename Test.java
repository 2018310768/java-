package shiyan2;

public class Test {
	public static void main(String[] args) {
	    CPU cpu=new CPU();               //创建CPU对象cpu
	    cpu.setSpeed(2200);              //cpu调用setSpeed()方法
	    cpu.setDigit(64);                
	    HardDisk disk=new HardDisk();   
	    disk.setAmount(200);            
	    disk.setRev(7200);               
	    PC pc=new PC();                  
	    pc.setCPU(cpu);                  //pc调用setCPU(CPU c)方法,调用时实参是cpu
	    pc.setHardDisk(disk);            //pc调用HardDisk(HardDisk h)方法,调用时实参是disk
	    pc.show();                       //pc调用show()方法
		}
}
