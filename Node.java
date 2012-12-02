
public class Node {
	int num,size;
	Node next;
	
	public Node(int num, int size) {
		super();
		this.num = num;
		this.size = size;
	}

	public Node() {
		super();
	}

	public static Node  init(){
		Node h,pre;
		pre=new Node(8, 0);
		h=pre;
		pre.next=new Node(7,1);
		pre=pre.next;
		pre.next=new Node(-9,8);
		pre=pre.next;
		pre.next=new Node(5,17);
		pre=pre.next;
		return h;
	}
	public static Node init2(){
		Node h,pre;
		
		pre=new Node(4,1);
		h=pre;
		pre.next=new Node(6,7);
		pre=pre.next;
		pre.next=new Node(9,8);
		pre=pre.next;
		pre.next=new Node(10,19);
		pre=pre.next;
		return h;
		
	}
	public static Node combin(Node one,Node two){
		Node three=null;
		Node pre=new Node();
		three=pre;
		while(one!=null&&two!=null){
			if(one.size==two.size){
				int x=one.num+two.num;
				if(x!=0){
					pre.num=x;
					pre.size=one.size;
					pre.next=new Node();
					pre=pre.next;
				}else{
					System.out.println("ฮช0มห....");
				}
				one=one.next;
				two=two.next;
			}else if(one.size<two.size){
				pre.size=one.size;
				pre.num=one.num;
				one=one.next;
				pre.next=new Node();
				pre=pre.next;
			}else{
				pre.size=two.size;
				pre.num=two.num;
				two=two.next;
				pre.next=new Node();
				pre=pre.next;
			}
			
			
		}
		if(one!=null){
			pre=one;
		}
		if(two!=null){
			pre.num=two.num;
			pre.size=two.size;
			two=two.next;
		}
		return three;
	}
	public static void show(Node h){
		while(h!=null){
			System.out.println(h.num+"\t"+h.size);
			h=h.next;
		}
	}

}
