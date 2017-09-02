
import java.util.*;
import java.io.*;

class position
{
	vertex a;
	vertex b;
	int froaa;

}

class linklis
{
	taxi first=null;
	taxi last=null;
	
	public void insert(taxi a)
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
}

class taxi
{
	String name;

	int time=0;
	int finaltime=0;
	taxi next;
	position loca;
	vertex lastchosen;
	int occu=0;
	
	vertex newforsrc(String src1,String src2,int froma , String dest1, String dest2, int fromb)
	{
		vertex forsrc1=TaxiService.nodeli.first;
		vertex forsrc2=TaxiService.nodeli.first;
		while(forsrc1!=null)
		{
			if(forsrc1.name.compareTo(src1)==0)
				break;
			forsrc1=forsrc1.next;
		}
		
		while(forsrc2!=null)
		{
			if(forsrc2.name.compareTo(src2)==0)
				break;
			forsrc2=forsrc2.next;
		}
		
		
		vertex fordest1=TaxiService.nodeli.first;
		vertex fordest2=TaxiService.nodeli.first;
		while(fordest1!=null)
		{
			if(fordest1.name.compareTo(dest1)==0)
				break;
			fordest1=fordest1.next;
		}
		
		while(fordest2!=null)
		{
			if(fordest2.name.compareTo(dest2)==0)
				break;
			fordest2=fordest2.next;
		}
		//making strings vertices--------------------end

		
		int dj1[]=forsrc1.Dijkstra();
		int dj2[]=forsrc2.Dijkstra();
		
		int costsrc=forsrc1.connected.ret(forsrc2.name).cost;
		
		int costdes=fordest1.connected.ret(fordest2.name).cost;
		
		int cost11,cost12,cost21,cost22;
		
		cost11=(froma)+(fromb)+ dj1[fordest1.Id];
		cost12=(froma)+(costdes-fromb)+ dj1[fordest2.Id];
		cost21=(costsrc-froma)+(fromb)+ dj2[fordest1.Id];
		cost22=(costsrc-froma)+(costdes-fromb)+ dj2[fordest2.Id];
		
		vertex forsrc=forsrc1,fordest=fordest1;
		
		//finding minimum out of the four----------------
		
		int tempm=Integer.MAX_VALUE;
		if(cost11<tempm)
			tempm=cost11;
		if(cost12<tempm)
			tempm=cost12;
		if(cost21<tempm)
			tempm=cost21;
		
		if(cost22<tempm)
			tempm=cost22;
		
		if(tempm==cost12)
			fordest=fordest2;
		else if(tempm==cost21)
			forsrc=forsrc2;
		
		else if(tempm==cost22)
		{
			fordest=fordest2;
			forsrc=forsrc2;
		}
	
		return forsrc;
	}
	
	vertex newfordest(String src1,String src2,int froma , String dest1, String dest2, int fromb)
	{
		vertex forsrc1=TaxiService.nodeli.first;
		vertex forsrc2=TaxiService.nodeli.first;
		while(forsrc1!=null)
		{
			if(forsrc1.name.compareTo(src1)==0)
				break;
			forsrc1=forsrc1.next;
		}
		
		while(forsrc2!=null)
		{
			if(forsrc2.name.compareTo(src2)==0)
				break;
			forsrc2=forsrc2.next;
		}
		
		
		vertex fordest1=TaxiService.nodeli.first;
		vertex fordest2=TaxiService.nodeli.first;
		while(fordest1!=null)
		{
			if(fordest1.name.compareTo(dest1)==0)
				break;
			fordest1=fordest1.next;
		}
		
		while(fordest2!=null)
		{
			if(fordest2.name.compareTo(dest2)==0)
				break;
			fordest2=fordest2.next;
		}
		//making strings vertices--------------------end

		
		int dj1[]=forsrc1.Dijkstra();
		int dj2[]=forsrc2.Dijkstra();
		
		int costsrc=forsrc1.connected.ret(forsrc2.name).cost;
		int costdes=fordest1.connected.ret(fordest2.name).cost;
		
		int cost11,cost12,cost21,cost22;
		
		cost11=(froma)+(fromb)+ dj1[fordest1.Id];
		cost12=(froma)+(costdes-fromb)+ dj1[fordest2.Id];
		cost21=(costsrc-froma)+(fromb)+ dj2[fordest1.Id];
		cost22=(costsrc-froma)+(costdes-fromb)+ dj2[fordest2.Id];
		
		vertex forsrc=forsrc1,fordest=fordest1;
		
		//finding minimum out of the four----------------
		
		int tempm=Integer.MAX_VALUE;
		if(cost11<tempm)
			tempm=cost11;
		if(cost12<tempm)
			tempm=cost12;
		if(cost21<tempm)
			tempm=cost21;
		
		if(cost22<tempm)
			tempm=cost22;
		
		if(tempm==cost12)
			fordest=fordest2;
		else if(tempm==cost21)
			forsrc=forsrc2;
		
		else if(tempm==cost22)
		{
			fordest=fordest2;
			forsrc=forsrc2;
		}
		
		
		return fordest;
	}
	
	int mindist(String src1,String src2,int froma , String dest1, String dest2, int fromb)
	{
		vertex forsrc1=TaxiService.nodeli.first;
		vertex forsrc2=TaxiService.nodeli.first;
		while(forsrc1!=null)
		{
			if(forsrc1.name.compareTo(src1)==0)
				break;
			forsrc1=forsrc1.next;
		}
		
		while(forsrc2!=null)
		{
			if(forsrc2.name.compareTo(src2)==0)
				break;
			forsrc2=forsrc2.next;
		}
		
		
		vertex fordest1=TaxiService.nodeli.first;
		vertex fordest2=TaxiService.nodeli.first;
		while(fordest1!=null)
		{
			if(fordest1.name.compareTo(dest1)==0)
				break;
			fordest1=fordest1.next;
		}
		
		while(fordest2!=null)
		{
			if(fordest2.name.compareTo(dest2)==0)
				break;
			fordest2=fordest2.next;
		}
		//making strings vertices--------------------end

		
		int dj1[]=forsrc1.Dijkstra();
		int dj2[]=forsrc2.Dijkstra();
		
		int costsrc=forsrc1.connected.ret(forsrc2.name).cost;
		int costdes=fordest1.connected.ret(fordest2.name).cost;
		
		int cost11,cost12,cost21,cost22;
		
		cost11=(froma)+(fromb)+ dj1[fordest1.Id];
		cost12=(froma)+(costdes-fromb)+ dj1[fordest2.Id];
		cost21=(costsrc-froma)+(fromb)+ dj2[fordest1.Id];
		cost22=(costsrc-froma)+(costdes-fromb)+ dj2[fordest2.Id];
		
		vertex forsrc=forsrc1,fordest=fordest1;
		
		//finding minimum out of the four----------------
		
		int mincost=Integer.MAX_VALUE;
		int tempm=Integer.MAX_VALUE;
		if(cost11<tempm)
			tempm=cost11;
		if(cost12<tempm)
			tempm=cost12;
		if(cost21<tempm)
			tempm=cost21;
		
		if(cost22<tempm)
			tempm=cost22;
		
		if(tempm==cost12)
			fordest=fordest2;
		else if(tempm==cost21)
			forsrc=forsrc2;
		
		else if(tempm==cost22)
		{
			fordest=fordest2;
			forsrc=forsrc2;
		}
		
		return tempm;
	}
	
	vertex path(vertex curr,vertex fina)
	{
		vertex huy=curr;
		int arr[];
		arr=huy.Dijkstra();
		vertex jhf=fina;
		while(jhf.prevvis!=curr)
			{jhf=jhf.prevvis;}
		return jhf;
	}
	
	position gettaxipos(int tim)
	{
		vertex fir=null;
		
		int costte=0;
		int costt=0;
		int temtim=0;
		int prestim=finaltime;;
	
		int avatime=tim-finaltime;
		if(loca.a!=loca.b)
		{
		
			temtim=loca.a.connected.ret(loca.b.name).cost-loca.froaa;
			
		}
		
		
		
		if(avatime>=temtim && avatime!=0)
		{
			fir=loca.b;
			avatime=avatime-temtim;
			prestim+=temtim;
			System.out.println("taxi "+this.name+" reached "+fir.name+ " at time "+prestim);
			
			//temtim=fir.Dijkstra()[lastchosen.Id];
			
			while(true)
			{
				temtim=fir.Dijkstra()[lastchosen.Id];
			if(avatime<temtim)
			break;
				fir=lastchosen;
				
				avatime=avatime-temtim;
				prestim+=temtim;
				System.out.println("taxi "+this.name+" reached "+ fir.name+ "at time "+prestim);
				loca.a=fir;
				
				lastchosen=TaxiService.lexico(TaxiService.i,fir.name);
				loca.b=path(loca.a,lastchosen);
			}
			
		if(avatime>0)
			{
				
				while(true)
				{
					temtim=fir.connected.ret(path(fir,lastchosen).name).cost;
					if(avatime<temtim)
						break;
					fir=path(fir,lastchosen);
					avatime=avatime-temtim;
					prestim+=temtim;
					System.out.println("taxi "+this.name+" reached "+fir.name+ " at time "+prestim);
				}
				
			if(avatime>0)
				{
					loca.froaa=avatime;
					prestim+=avatime;
					loca.a=fir;
					loca.b=path(fir,lastchosen);
					System.out.println("taxi "+this.name+" reached "+loca.froaa + " ahead of  "+loca.a.name+" at time "+prestim);
					
				}
				
				
				
			}
		}
		
	
		else
		{
			System.out.println("avatime =" +avatime);
			loca.froaa=loca.froaa+avatime;
		}
		
		
		finaltime=tim;
		return loca;
	}
	
	
}

class edge
{
	edge next;
	int cost=0;
	vertex end=null;
}

class vertex
{
	String name;
	int Id;
	int tempcost=10000;
	vertex next;
	vertex prevvis;
	int lexid;

	
	Myset connected;
	vertex()
	{
		connected=new Myset();
	}
	
	int[] Dijkstra()
	{
		int fina[]=new int[TaxiService.i+1];
		int arr[]=new int[TaxiService.i+1];
		//arr stores temporary changing values
		int temp=0;
		TreeSet<Integer> set = new TreeSet<Integer>(new MyComp(arr)) ;
    
		TreeMap<Integer,vertex> mp = new TreeMap<Integer,vertex>() ;
        
		vertex wood=TaxiService.nodeli.first;
		while(wood!=null)
		{
			mp.put(wood.Id,wood) ;
			wood=wood.next;
		}

        
		//heap forthis=new heap();
		
		for(int k=1;k<=TaxiService.i;k++)
		{
			arr[k]=Integer.MAX_VALUE ;
			arr[this.Id]=0 ;
			
		}

		vertex get=TaxiService.nodeli.first;
		while(get!=null)
		{
			if(get==this)
			{
				
			}
			else
				{	
					set.add(get.Id);
				}
			get=get.next;
			
		}
		
			//all inserted
		vertex poi=this;

		while(set.isEmpty()==false)
		{
			edge toupd=poi.connected.head;
			while(toupd!=null)
			{
				if(toupd.cost+temp<arr[toupd.end.Id])
					{  
						
						//poi.prevvis=toupd.end;
						toupd.end.prevvis=poi;
					    set.remove(toupd.end.Id) ;
					    arr[toupd.end.Id] = toupd.cost+temp ;
						set.add(toupd.end.Id);
					}
				
				toupd=toupd.next;
			}
			int min=set.first();
		//	System.out.println(mp.get(min).Id);
			fina[min]=arr[mp.get(min).Id];
			temp=arr[mp.get(min).Id];
			arr[min]=0;
			
			
			set.pollFirst();
			//System.out.println();
			poi=mp.get(min);
		}
	
		//panga hai to id me hi hai
		
		return fina;
	}
}
class MyComp implements Comparator<Integer>{
	int dist[] ;
	MyComp(int[] ar){
		dist=ar ;
	}
	public int compare(Integer a,Integer b){
		int n = Integer.compare(dist[a],dist[b]) ;
		if(n!=0)
			return n ;
		return Integer.compare(a,b) ;
	}
}

public class TaxiService {
	static int i=1;
	static MyLinkedList nodeli;
	static linklis taxili;
	
	
	
	vertex newfordest(String src1,String src2,int froma , String dest1, String dest2, int fromb)
	{
		vertex forsrc1=TaxiService.nodeli.first;
		vertex forsrc2=TaxiService.nodeli.first;
		while(forsrc1!=null)
		{
			if(forsrc1.name.compareTo(src1)==0)
				break;
			forsrc1=forsrc1.next;
		}
		
		while(forsrc2!=null)
		{
			if(forsrc2.name.compareTo(src2)==0)
				break;
			forsrc2=forsrc2.next;
		}
		
		
		vertex fordest1=TaxiService.nodeli.first;
		vertex fordest2=TaxiService.nodeli.first;
		while(fordest1!=null)
		{
			if(fordest1.name.compareTo(dest1)==0)
				break;
			fordest1=fordest1.next;
		}
		
		while(fordest2!=null)
		{
			if(fordest2.name.compareTo(dest2)==0)
				break;
			fordest2=fordest2.next;
		}
		//making strings vertices--------------------end

		
		int dj1[]=forsrc1.Dijkstra();
		int dj2[]=forsrc2.Dijkstra();
		
		int costsrc=forsrc1.connected.ret(forsrc2.name).cost;
		int costdes=fordest1.connected.ret(fordest2.name).cost;
		
		int cost11,cost12,cost21,cost22;
		
		cost11=(froma)+(fromb)+ dj1[fordest1.Id];
		cost12=(froma)+(costdes-fromb)+ dj1[fordest2.Id];
		cost21=(costsrc-froma)+(fromb)+ dj2[fordest1.Id];
		cost22=(costsrc-froma)+(costdes-fromb)+ dj2[fordest2.Id];
		
		vertex forsrc=forsrc1,fordest=fordest1;
		
		//finding minimum out of the four----------------
		
		int tempm=Integer.MAX_VALUE;
		if(cost11<tempm)
			tempm=cost11;
		if(cost12<tempm)
			tempm=cost12;
		if(cost21<tempm)
			tempm=cost21;
		
		if(cost22<tempm)
			tempm=cost22;
		
		if(tempm==cost12)
			fordest=fordest2;
		else if(tempm==cost21)
			forsrc=forsrc2;
		
		else if(tempm==cost22)
		{
			fordest=fordest2;
			forsrc=forsrc2;
		}
		
		
		return fordest;
	}
	
	vertex newforsrcc(String src1,String src2,int froma , String dest1, String dest2, int fromb)
	{
		vertex forsrc1=TaxiService.nodeli.first;
		vertex forsrc2=TaxiService.nodeli.first;
		while(forsrc1!=null)
		{
			if(forsrc1.name.compareTo(src1)==0)
				break;
			forsrc1=forsrc1.next;
		}
		
		while(forsrc2!=null)
		{
			if(forsrc2.name.compareTo(src2)==0)
				break;
			forsrc2=forsrc2.next;
		}
		
		
		vertex fordest1=TaxiService.nodeli.first;
		vertex fordest2=TaxiService.nodeli.first;
		while(fordest1!=null)
		{
			if(fordest1.name.compareTo(dest1)==0)
				break;
			fordest1=fordest1.next;
		}
		
		while(fordest2!=null)
		{
			if(fordest2.name.compareTo(dest2)==0)
				break;
			fordest2=fordest2.next;
		}
		//making strings vertices--------------------end

		
		int dj1[]=forsrc1.Dijkstra();
		int dj2[]=forsrc2.Dijkstra();
		
		int costsrc=forsrc1.connected.ret(forsrc2.name).cost;
		int costdes=fordest1.connected.ret(fordest2.name).cost;
		
		int cost11,cost12,cost21,cost22;
		
		cost11=(froma)+(fromb)+ dj1[fordest1.Id];
		cost12=(froma)+(costdes-fromb)+ dj1[fordest2.Id];
		cost21=(costsrc-froma)+(fromb)+ dj2[fordest1.Id];
		cost22=(costsrc-froma)+(costdes-fromb)+ dj2[fordest2.Id];
		
		vertex forsrc=forsrc1,fordest=fordest1;
		
		//finding minimum out of the four----------------
		
		int tempm=Integer.MAX_VALUE;
		if(cost11<tempm)
			tempm=cost11;
		if(cost12<tempm)
			tempm=cost12;
		if(cost21<tempm)
			tempm=cost21;
		
		if(cost22<tempm)
			tempm=cost22;
		
		if(tempm==cost12)
			fordest=fordest2;
		else if(tempm==cost21)
			forsrc=forsrc2;
		
		else if(tempm==cost22)
		{
			fordest=fordest2;
			forsrc=forsrc2;
		}
		
		
		return forsrc;
	}

	
	int yaya(String src1,String src2,int froma , String dest1, String dest2, int fromb)
	{
		vertex forsrc1=TaxiService.nodeli.first;
		vertex forsrc2=TaxiService.nodeli.first;
		while(forsrc1!=null)
		{
			if(forsrc1.name.compareTo(src1)==0)
				break;
			forsrc1=forsrc1.next;
		}
		
		while(forsrc2!=null)
		{
			if(forsrc2.name.compareTo(src2)==0)
				break;
			forsrc2=forsrc2.next;
		}
		
		
		vertex fordest1=TaxiService.nodeli.first;
		vertex fordest2=TaxiService.nodeli.first;
		while(fordest1!=null)
		{
			if(fordest1.name.compareTo(dest1)==0)
				break;
			fordest1=fordest1.next;
		}
		
		while(fordest2!=null)
		{
			if(fordest2.name.compareTo(dest2)==0)
				break;
			fordest2=fordest2.next;
		}
		//making strings vertices--------------------end

		
		int dj1[]=forsrc1.Dijkstra();
		int dj2[]=forsrc2.Dijkstra();
		
		int costsrc=forsrc1.connected.ret(forsrc2.name).cost;
		int costdes=fordest1.connected.ret(fordest2.name).cost;
		
		int cost11,cost12,cost21,cost22;
		
		cost11=(froma)+(fromb)+ dj1[fordest1.Id];
		cost12=(froma)+(costdes-fromb)+ dj1[fordest2.Id];
		cost21=(costsrc-froma)+(fromb)+ dj2[fordest1.Id];
		cost22=(costsrc-froma)+(costdes-fromb)+ dj2[fordest2.Id];
		
		vertex forsrc=forsrc1,fordest=fordest1;
		
		//finding minimum out of the four----------------
		
		int mincost=Integer.MAX_VALUE;
		int tempm=Integer.MAX_VALUE;
		if(cost11<tempm)
			tempm=cost11;
		if(cost12<tempm)
			tempm=cost12;
		if(cost21<tempm)
			tempm=cost21;
		
		if(cost22<tempm)
			tempm=cost22;
		
		if(tempm==cost12)
			fordest=fordest2;
		else if(tempm==cost21)
			forsrc=forsrc2;
		
		else if(tempm==cost22)
		{
			fordest=fordest2;
			forsrc=forsrc2;
		}
	
		return tempm;
	}
	
	
	
	
	TaxiService()

	{
		nodeli=new MyLinkedList();
		taxili=new linklis();
	}
	
	static public vertex lexico(int number, String current)
	{
		String toret="";
		int pos=0;
		
		String alpha[]=new String[number-1];
		vertex halo=TaxiService.nodeli.first;
		for(int f=0;f<number;f++)
		{
			if(halo!=null)
			{
				alpha[f]=halo.name;
				halo=halo.next;
			}
		}
		Arrays.sort(alpha);
		for(int f=0;f<TaxiService.i-1;f++)
		{
			if(alpha[f].compareTo(current)==0)
			{
				pos=f;
			}
		}
		toret=alpha[(pos+1)%(number-1)];
		
		vertex tyre=TaxiService.nodeli.first;
		while(tyre!=null)
		{
			if(tyre.name.compareTo(toret)==0)
				break;
			tyre=tyre.next;
		}
	
		return tyre;
	}
	
	
	public void performAction(String actionMessage)
	{
		String total=actionMessage;
		Scanner s=new Scanner(total);
		try{
		String job=s.next();
		
		
		if(job.compareTo("edge")==0)
		{
			String src=s.next();
			String dest=s.next();
			int cost=s.nextInt();
			
			vertex trav=this.nodeli.first;
			while(trav!=null)
			{
				if(trav.name.compareTo(src)==0)
				{
					break;				
				}
				trav=trav.next;
			}
			
			if(trav==null)
			{
				vertex nfou=new vertex();
				//id's aaARE COMING SAME
				nfou.name=src;
				nfou.Id=this.i;
				
				TaxiService.i++;
				
				this.nodeli.insert(nfou);
				trav=nfou;
				
			}
			vertex temp=trav;
			trav.connected.addElement(dest, cost);
			
			trav=this.nodeli.first;
			while(trav!=null)
			{
				if(trav.name.compareTo(dest)==0)
				{
					break;				
				}
				
				trav=trav.next;
			}
			
			if(trav==null)
				System.out.println("my code sucks, khatarnak panga insertion me");
			
			trav.connected.addElement(temp.name, cost);
			
		
			
		}
		
		else if(job.compareTo("taxi")==0)
		{
			String taxiname=s.next();
			String posi=s.next();
			
			taxi gaadi=new taxi();
			taxili.insert(gaadi);
			vertex mer=this.nodeli.first;
			while(mer!=null)
			{
				if(mer.name.compareTo(posi)==0)
					break;
				mer=mer.next;
				
			}
			if(mer==null)
			{
				System.out.println("No vertex with the name = " + posi);
			}
			
			position jik=new position();
			jik.a=mer;
			jik.b=mer;
			gaadi.lastchosen=lexico(i,mer.name);
			jik.froaa=0;
			jik.b=gaadi.path(mer, lexico(TaxiService.i,mer.name));
			gaadi.loca=jik;
			gaadi.name=taxiname;
	
		}
			
		
		
		else if(job.compareTo("customer")==0)
		{
			String src1=s.next();
			String src2=s.next();
			int froma=s.nextInt();
			
			String dest1=s.next();
			String dest2=s.next();
			int fromb=s.nextInt();
			
			int tim=s.nextInt();
			
			//making strings vertices----------
			vertex forsrc1=TaxiService.nodeli.first;
			vertex forsrc2=TaxiService.nodeli.first;
			while(forsrc1!=null)
			{
				if(forsrc1.name.compareTo(src1)==0)
					break;
				forsrc1=forsrc1.next;
			}
			
			while(forsrc2!=null)
			{
				if(forsrc2.name.compareTo(src2)==0)
					break;
				forsrc2=forsrc2.next;
			}
			
			
			vertex fordest1=TaxiService.nodeli.first;
			vertex fordest2=TaxiService.nodeli.first;
			while(fordest1!=null)
			{
				if(fordest1.name.compareTo(dest1)==0)
					break;
				fordest1=fordest1.next;
			}
			
			while(fordest2!=null)
			{
				if(fordest2.name.compareTo(dest2)==0)
					break;
				fordest2=fordest2.next;
			}
			//making strings vertices--------------------end
			
		
			
			int mini=100000;
			//mini= taxi to customer
			int min2=10000;
			//min2= customer to destination
			
			taxi minta=null;
			int ttime=0;
			vertex huj=this.nodeli.first;

			System.out.println("Available Taxis:");
			taxi recu=this.taxili.first;
	
			//path printing
			while(recu!=null)
			{
				if(recu.occu<=tim)
				{
				System.out.print("Path of Taxi " + recu.name+":");
				vertex yiha=recu.newforsrc(recu.loca.a.name, recu.loca.b.name, recu.loca.froaa, src1, src2, froma);
				vertex duh=recu.newfordest(recu.loca.a.name, recu.loca.b.name, recu.loca.froaa, src1, src2, froma);
				int mind=recu.mindist(recu.loca.a.name, recu.loca.b.name, recu.loca.froaa, src1, src2, froma);
				
				
				vertex tyu=this.nodeli.first;
			/*	while(tyu!=null)
				{
					tyu.prevvis=null;
					tyu=tyu.next;
				}
				*/
				int tre[]=yiha.Dijkstra();
				
				int klm=0;
			
				while(klm<2)
				{
					System.out.print(yiha.name +", ");
					yiha=yiha.prevvis;
					klm++;
				}
				System.out.print(yiha.name +". time taken is " + mind +" units" );
				System.out.println();
				}
				recu=recu.next;
				
			}
			
			recu=taxili.first;
			
			while(recu!=null)
			{
				if(recu.mindist(recu.loca.a.name, recu.loca.b.name, recu.loca.froaa, dest1, dest2, fromb)<mini && recu.occu<=tim)
					{
						//check the id ek baar by printing
						mini=recu.mindist(recu.loca.a.name, recu.loca.b.name, recu.loca.froaa, dest1, dest2, fromb);
						minta=recu;
					}
				recu=recu.next;
			}
			
			
			
			min2=this.yaya(src1, src2, froma, dest1, dest2, fromb);;
			if(minta==null)
			{
				System.out.println("No taxi to service");
			}
			else
			{
				System.out.println("**Chose taxi "+ minta.name+ " to service the customer request ***");
			}
				String stri="";
			vertex kol=this.newforsrcc(src1, src2, froma, dest1, dest2, fromb);
			vertex kol1=this.newfordest(src1, src2, froma, dest1, dest2, fromb);
			
			
			vertex tyu=this.nodeli.first;
			while(tyu!=null)
			{
				tyu.prevvis=null;
				tyu=tyu.next;
			}
			
			int jkk[]=kol.Dijkstra();
			
			
			while(kol1!=kol)
			{
				if(kol1==kol)
					stri=kol1.name+". "+stri;
				else
					stri=kol1.name+", "+stri;
				
				kol1=kol1.prevvis;
			}
	
			tyu=this.nodeli.first;
			while(tyu!=null)
			{
				tyu.prevvis=null;
				tyu=tyu.next;
			}
			
			stri=kol.name+", "+stri;
			
			System.out.print("Path of customer: "+ stri);
			System.out.println("time taken is = " + min2 + " units");
			
			if(minta!=null)
			minta.time=tim;
		
			ttime=min2+mini;
			if(minta!=null)
			{
				minta.occu=ttime+tim;
				minta.loca.a=fordest1;
				minta.loca.b=fordest2;
				minta.loca.froaa=fromb;
				
			}
		
			
		}
		
	
		
		else if(job.compareTo("printTaxiPosition")==0)
		{
			int samay=s.nextInt();
			taxi temkl=this.taxili.first;
			System.out.println("Print taxi Positions at time = "+samay);
			
			
			while(temkl!=null)
			{
				
				position jio=temkl.gettaxipos(samay);
				
				if(samay>=temkl.finaltime)
				{
					System.out.println(temkl.name + " : "+ jio.a.name + " "+ jio.b.name+" "+jio.froaa );
				}
				temkl=temkl.next;
			}
		

			
		}
	
	}
	catch(Exception e)
{
	System.out.println("Invalid input");
}
}

}
