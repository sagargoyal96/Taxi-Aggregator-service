
import java.util.*;
import java.io.*;

public class Myset {
		
		edge head;
		edge last;
		
		Myset()
		{
		head=null;
		
		last=head;
		}
		
		public Boolean IsEmpty()
		{
			if(head==null)
				return true;
				
			else return false;
			
		}

		public Boolean IsMember(vertex o)
		{
			
			edge trav;
			trav=this.head;
			
			while(trav!=null)
			{
				if(trav.end== o)
					{
						return true;
					}
				else 
					trav=trav.next;
				
			}
		
				return false;
			
		}
		
		
		public void addElement(String o, int price)
		{
			edge inp=new edge();
			vertex trav=TaxiService.nodeli.first;
			//System.out.println("hello");
			//System.out.println(trav.name);
			while(trav!=null && trav.name.compareTo(o)!=0 )
			{
				trav=trav.next;
			}
			
			if(trav==null)
			{
				//create new node
				vertex ins=new vertex();
				ins.name=o;
				ins.Id=TaxiService.i;
				TaxiService.i++;
				TaxiService.nodeli.insert(ins);
				inp.end=ins;
				inp.cost=price;
			}
			
			else 
			{
				inp.end=trav;
				inp.cost=price;
			}
			
			//pehle will have to fijnd the node
			//there will be a list of all the nodes that needs to be maintined
			
			if(head==null)
				{
				head=inp;
				last= head;
				
				}
			
			else 
			{
				last.next=inp;
				last=inp;
			}
			
		}
		
		void printall()
		{
			edge temp=head;
			while(temp!=null)
			{
				
				System.out.println(temp.end.name + " " + temp.cost);
				temp=temp.next;
			}
		}
		
		edge ret(String str)
		{
			edge fde=head;
			while(fde!=null)
			{
				if(fde.end.name.compareTo(str)==0)
					break;
				
				fde=fde.next;
			}
			return fde;
		}
		
		/*public void Delete(edge o)
		{
			edge trav;
			edge bef;
			
			trav=this.head.next;
			bef=this.head;
		try{
			
		
		while(bef!=null)
			{
			if(this.head.data==o)
				{
					this.head=this.head.next;
					break;
				}
			else if(trav.data==o && trav.data==last.data)
			{
				last=bef;
				
				last.next=null;
				break;
			}
			
			else if(trav.data==o)
			{
				bef.next=trav.next;
				trav=bef.next;
				
				
				break;
			}
			else 
			{
				bef=bef.next;
				trav=trav.next;
				
			}
			}
		if(bef==null)
			throw new Exception();	
		
		}
		
		catch(Exception e )
		{
			System.out.println("edge not found for deletion");
		}
		*/
		
}
		
		
		
		
		/*public Myset<X> Union(Myset<X> a)
		{
			edge<X> trav;
			trav=a.head;
			
			Myset<X> uni=new Myset<X>();
			uni.head=this.head;
			edge<X> prev;
			
			uni.last=this.last;
			prev=uni.last;
			
			
			while(trav!=null)
			{
			if(this.IsMember(trav.data))
			{
				trav=trav.next;
				
			}
			else 
			{
				uni.addElement(trav.data);
				trav=trav.next;
			}
			}
			
			return uni;
			
		}
		
		public Myset<X> intersection(Myset<X> a)
		{
			Myset<X> inter=new Myset<X>();
			
			edge<X> trav1;
			trav1=this.head;
			edge<X> trav2;
			trav2=a.head;
			edge<X> inthead;
			inthead=inter.head;
			
			
			while(trav2!=null)
			{
				if(this.IsMember(trav2.data))
					{
						inter.addElement(trav2.data);
						
					}
				
				trav2=trav2.next;
			}
			
			return inter;
			
		}
*/
		




