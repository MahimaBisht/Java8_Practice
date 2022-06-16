package java8;

import org.apache.poi.util.SystemOutLogger;

public class Typecasting {

	public static void main(String[] args) {
		char c = '7'-'0';
		int in = c;
		char d =c;
		char e = (char)in;
		char f = 'a';
		int g = f;
		System.out.println(c+" "+ e+" "+in+" "+ f+ " g->"+g);
		
		short sht = (short)c;
		char ch = (char)sht;
		long lng = in;
		int in2 = (int)lng;
		float flt = in2;
		int in3= (int)flt;
		double dbl = flt;
		float flt2 = (float)dbl;
		System.out.println(sht+" "+ ch+" "+lng+" "+ flt+ " in3->"+in3+"in3->"+in3+" "+dbl+"flt2->"+flt2);
		
		short srt1 = 120;
		//srt1= srt1*10;'
		byte bt = 127;
		System.out.println(bt);
	}

}
