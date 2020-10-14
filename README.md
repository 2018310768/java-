# java-
java课程作业项目仓库

## 实验内容：
用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别
是PC、CPU、HardDisk和Test，其中Test是主类。
 
## 实验方法：
定义4个类，在CPU类和HardDisk类中分别定义cpu的速度、位数和硬盘的转速、容量，这4个属性是私有变量。
在PC类中定义show()方法，用来按照格式输出各个属性的值。在Test类中，创建了cpu、dist、pc这三个对象，
cpu调用setSpeed()、setDigit()方法，dist调用setRev()、setAmount()方法，属性的值为括号里的参数值，
pc调用show()方法来输出各属性的值。
           
## 核心代码：  
             private int speed;            //定义CPU的速度（私有变量）
	           public void setSpeed(int speed){
		           if(speed>=2000&&speed<=2400) {
			           this.speed=speed;
		           }
	           }
               public int getSpeed(){
	 	           return speed;
	             }
             
             
             public void show() {
		         System.out.println("cpu的速度："+cpu.getSpeed()+"\n"+"cpu的位数"+cpu.getDigit()+"\n"+
				           "硬盘的容量："+HD.getAmount()+"\n"+"硬盘的转速"+HD.getRev());	
	           }	
             
             
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
             
## 实验结果：
![实验结果](https://github.com/2018310768/java-/blob/main/实验结果.PNG)
