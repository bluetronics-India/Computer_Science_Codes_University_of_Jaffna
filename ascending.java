import java.util.*;
public class ascending{
	public static void main(String args[]){
		int size =5;
		int x =0;
		int y =0;
		boolean exist_statues1 = true;
		boolean exist_statues2 = true;
		boolean exist_statues3 = true;
		boolean exist_statues4 = true;
		Scanner input = new Scanner(System.in);
		Queue q1 = new Queue(size);
		Queue q2 = new Queue(size);
		Queue ResultQueue = new Queue(2*size);
		System.out.println("Input Q1");
		for(int e=0;e<size;e++){
			q1.enQueue(input.nextInt());
		}
		System.out.println("Input Q2");
		for(int e=0;e<size;e++){
			q2.enQueue(input.nextInt());
		}
		x =q1.deQueue();
		y =q2.deQueue();
		
		while(!q1.QueueEmpty() && !q2.QueueEmpty()){
		
			while(x<=y && exist_statues1){
				ResultQueue.enQueue(x);
				if(!q1.QueueEmpty()){
				x =q1.deQueue();}
				else{
				ResultQueue.enQueue(y);
				exist_statues1 =false;
				}
			}
			while(x>y && exist_statues2){
				ResultQueue.enQueue(y);
				if(!q2.QueueEmpty()){
				y =q2.deQueue();}
				else{
				ResultQueue.enQueue(x);
				exist_statues2 =false;
				}
			}
		}
		if(q1.QueueEmpty()){
			while(exist_statues3){
				if(!q2.QueueEmpty()){
				ResultQueue.enQueue(q2.deQueue());}else{exist_statues3 =false;}
			}
		} 
		 if(q2.QueueEmpty()){
			while(exist_statues4){
				if(!q1.QueueEmpty()){
				ResultQueue.enQueue(q1.deQueue());}else{exist_statues4 =false;}
			}
		} 
		if(q1.QueueEmpty() && q2.QueueEmpty() && !ResultQueue.enQueuefull()){
			if(x>y){
				ResultQueue.enQueue(y);
				ResultQueue.enQueue(x);}
			else if(x<y){
				ResultQueue.enQueue(x);
				ResultQueue.enQueue(y);}
		}
		
		
		
		while(!ResultQueue.QueueEmpty()){
			System.out.println(ResultQueue.deQueue());
		}
	}
}
		
