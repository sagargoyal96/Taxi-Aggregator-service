
class MyLinkedList
{
	//vertex obj=new vertex();
	
	vertex first=null;
	vertex last=null;
	
	public void insert(vertex a)
	{
	
		if(first==null)
		{
			first=a;
			last=first;
		}
		else 
		{
			last.next=a;
			last=a;
		}
	}
	
	/*public boolean Ismember(X a)
	{
		vertex trav;
		trav=this.first;
		while(trav!=null)
		{
			if(trav.data==a)
				return true;
			
			trav=trav.next;
		}
		return false;
	}*/
	
	
}
