package objectlnObject;

import java.util.ArrayList;

public class Main {

	public static <personel> void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Company> companys= new ArrayList<Company>();
        ArrayList<Title> titles= new ArrayList<Title>();
        companys.add(new Company("Halk Bank","www.HalkBank.com.tr"));
        companys.add(new Company("Yapý Kredi","www.YapýKredi.com.tr"));
        companys.add(new Company("Ziraat Bank","www.ZiraatBank.com.tr"));
        
        titles.add(new Title("Brawl Stars","Rank:35"));
        titles.add(new Title("Brawl Stars","Rank:30"));
        titles.add(new Title("Brawl Stars","Rank:25"));
	
        titles.add(new Title("personel","Turan Ay"));
	    titles.add(new Title("persone","Ahmed Hakan"));
	}

}
