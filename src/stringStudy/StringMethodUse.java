package stringStudy;

public class StringMethodUse {

	public static void main(String[] args) 
	{  //  1.Length       2.toUppercase     3.toLowercase    4.equals    5.equalsIgnoreCase    6.contains       7.isEmpty     8.charAt
	   //  9.endsWith    10.startsWith     11.substring     12.concat   13.indexOf            14.lastIndexOf   15.replace    16.split
		
		
        System.out.println("=============================================================================");
		System.out.println ("               1. Length Method use");
		System.out.println("=============================================================================");

//      Length() Method use  ---> Int
		
		String name="Velocity";
//                   01234567        --> V=0   e=1   l=2   o=3   c=4   i=5   t=6   7=y <------- Index no. ---------->=[7]
		                             
//		             {formula}       String length= maxIndex+1; --> 7+1= [8]       maxIndex= StringLength-1; -->  8-1= [7]       
		
		System.out.println(name.length());  // length is equal to the total number of character in String
		
		int lengthofstring = name.length(); // call by other way....... using int
		
		System.out.println(lengthofstring);
		
		
		//practice
		String name1="Pune";
		System.out.println(name1.length());
		
        System.out.println("***************************************************************************** ");
        
        System.out.println("=============================================================================");
		System.out.println ("               2. toUpperCase Method use");
		System.out.println("=============================================================================");

//      toUpperCase() Method use  ---> String
		
		System.out.println(name);
		
		 String m = name.toUpperCase();  //Converts all of the characters in this String to UpperCase
		 
		 System.out.println(m);
		 
		 
		//practice
		name.toUpperCase();
		System.out.println(name.toUpperCase()); 
		
		System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               3. toLowerCase Method use");
			System.out.println("=============================================================================");
			
//	      toLowerCase() Method use ---> String
			
			System.out.println(m.toLowerCase());  //Converts all of the characters in this String to LowerCase
			
			String n= m.toLowerCase();
			System.out.println(n);
			
			//practice
			String vp="CONGRESS";
		    System.out.println(vp.toLowerCase());
		    
            System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               4. equals Method use");
			System.out.println("=============================================================================");
			
//	      equals() Method use -------->boolean
		  
		  String a="Velocity";               // constant pool area
		  String b="Velocity";               // constant pool area
		 
		  String c= new String("Velocity");  // Non-constant pool area
		  String d= new String("Velocity");  // Non-constant pool area
		  String e= new String("VELOCITY");
		  
		  // === compares memory locations of two operator 
		  // equals method compare character sequence of two objects
		  
		  System.out.println(a==b);   // controlStatment used to identify condition is true or False --> Boolean (as per alllocation of memory)
		  System.out.println(c==d);  // if String is same & using without new keyword--> constant pool area----> a = b
		  System.out.println(a!=d);  // and String is same & using with new keyword--> non-constant pool area----> c & d
		  System.out.println(a!=b);  //we use different conditions to show allocation relation
		  
		  System.out.println("=============================================================================");
		 
		  System.out.println(a.equals(b)); // Compares this string to the specified object/String.{case & sequence should be same
		  System.out.println(a.equals(c));// & argument is not null}-------> Boolean Condition-----> True or False 
		  System.out.println(a.equals(d)); //------>boolean
		  
		 boolean result= a.equals(c);
		 System.out.println("a and c are equal "+result);
		 
		 System.out.println(d.equals(e)); //checking character sequence along with case sensitivity
		  
		  System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               5. equalsIgnore Method use");
			System.out.println("=============================================================================");
			
//	      equalsIgnore() Method use -------->boolean
			
		 String city="Pune";
		 String locality="Pune";
		 String dist="pune";
		 
		 System.out.println(city.equals(dist));           //Compares this String to another String, case --->considerations.
		 System.out.println(city.equalsIgnoreCase(dist)); //Compares this String to another String,----> ignoring caseconsiderations.
		 
		 System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               6. contains Method use");
			System.out.println("=============================================================================");
			
//	      contains() Method use -------->boolean
			
		 String k="Katraj";
		 
		 System.out.println(k.contains("Ka")); //true if and only if this string contains the specifiedsequence of char values.
		 System.out.println(k.contains("ar")); //sequense & case sensetive
		 
		 System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               7. isEmpty Method use");
			System.out.println("=============================================================================");
			
//	      isEmpty() Method use -------->boolean / String only { Non- Primitive supports only }
			
		  String p="Test";
		  String q=" ";       // space(_) should be cosider in lengt-->=1
		  String r=null;      // if there  is "null" then -----> 'Exception' there in Java 
		  String s="";       // no space n char--> meance 0 lenght
		    
		  
		  System.out.println(q.length());
		  //System.out.println(r.length());------------------------------------------- > Exceptionn
		  System.out.println(s.length());
		  
		  
		  System.out.println(p.isEmpty());   // true if length() is 0, otherwise false
		  System.out.println(q.isEmpty());
		  //System.out.println(r.isEmpty());-------------------------------------------> Exception
		  System.out.println(s.isEmpty());   // True only "" ---> condition
		  
		  System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               8. isBlank Method use");
			System.out.println("=============================================================================");
			
//	      isBlank() Method use -------->boolean  / String only { Non- Primitive supports only }
			
		  //System.out.println(r.isBlank());    //------------------------------------------- > Exceptionn
		  System.out.println(q.isBlank());    // Returns true if the string is empty or contains only white space codepoints, otherwise false.
		  System.out.println(s.isBlank());
		  
		  System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               9. charAt Method use");
			System.out.println("=============================================================================");
			
//	      charAt() Method use -------->String
			
		   String country = "INDIA";
		   
		   System.out.println(country.charAt(0));  // Returns the char value at the specified index. An index ranges from 0 to length()
		   
		   char requiredChar=country.charAt(2);   // show the char of index no-----> letter/char
		   System.out.println(requiredChar);
		   
		  // country.charAt(-1);   //String index out of range: -1
		   
		   System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               10. endsWith Method use");
			System.out.println("=============================================================================");
			
//	      endsWith() Method use -------->boolean
			
		   System.out.println(country.endsWith("IND")); //if end letter not present at end .. cond'n--> False
		   System.out.println(country.endsWith("IA"));  //if the end letter present along with or without remained String char's.--> Trure
		   System.out.println(country.endsWith("a"));  //cas sensetive , if not same case then false
		   
		   System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               11. startsWith Method use");
			System.out.println("=============================================================================");
			
//	      startsWith() Method use -------->boolean
			
		  System.out.println(country.startsWith("INDIA")); // string starts with the specified prefix.
		  System.out.println(country.startsWith("ind"));   // case sensentive
		  System.out.println(country.startsWith("I"));
		  System.out.println("=============================================================================");
			
		  System.out.println(country.startsWith("A",4));    // given char index no should be same with leeter --> True
		  System.out.println(country.startsWith("IN", 0));
		  System.out.println(country.startsWith("D", 3));  // char index not  same with leeter --> False
		  
		  System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               12. substring Method use");
			System.out.println("=============================================================================");
			
//	      substring() Method use -------->String
		  
		  String testing= "VELOCITY CORPORATE TRAINNING CENTER";
		  System.out.println(testing.length());
		  
		  String resultString= testing.substring(28);
		  System.out.println(requiredChar);
		  
		  System.out.println(testing.substring(7, 12));
		  System.out.println(testing.substring(4, 6));
		  
		  String sa= "subodh Adav";  //substring begins with the character at the specified index andextends to the end of this string.
		  
		  System.out.println(sa.substring(2)); // 1st condition.....Accepted --> means  including from 2 word no.   
		  System.out.println(sa.substring(3, 6)); // 2nd condition 1st type letter after 2 .....Accepted --> means  including from 3 word no.
		  System.out.println(sa.substring(1, 4));// last index no 5 not include....till 4
		  System.out.println(sa.length());
		  
		  System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               13. concat Method use");
			System.out.println("=============================================================================");
			
//	      concat() Method use -------->String
			
		  String x="Pune";  
		  String y="City";
		  
		  System.out.println(x.concat(y));  // used to join 2 or more strings/messages
		  
		  System.out.println(x.concat(y).concat("Katraj"));
		  System.out.println(x.concat(y).concat(" Swarget"));	
		  
		  System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               14. indexOf Method use");
			System.out.println("=============================================================================");
			
//	      indexOf() Method use -------->int
			
		  String state= "Maharashtra";
		  
		  System.out.println(state.indexOf('a'));  //index within this string of the first occurrence of the specified character
		  System.out.println(state.indexOf("sh"));
		  System.out.println(state.indexOf('a', 4));
		  System.out.println(state.lastIndexOf('a'));
		  System.out.println(state.lastIndexOf("ht"));
		  
		  System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               15. replace Method use");
			System.out.println("=============================================================================");
			
//	      replace() Method use -------->String
			
		  String tal = "Pune Mumbai Nagpur";
		  
		  System.out.println(tal.replace('P', 'M'));
		  System.out.println(tal.replace("ai", "adevi"));
		  
		  System.out.println(tal.replaceAll(" ", "-"));
		  
		  System.out.println("***************************************************************************** ");
	        
	        System.out.println("=============================================================================");
			System.out.println ("               1. split Method use");
			System.out.println("=============================================================================");
			
//	      split() Method use -------->String
        			
			String st ="Good Afternoon";
			String s1 =" ";
			String[] required = st.split(s1);
			System.out.println(required[0]);
			System.out.println(required[1]);
		
		  System.out.println("++++++++++++++++++++++++++++++++++++++");
			
			String abc ="I_LOVE_MY_INDIA";
			String bkc ="_";
			String[] cnx = abc.split(bkc);
			System.out.println(cnx[0]);
			System.out.println(cnx[1]);
			System.out.println(cnx[2]);
			System.out.println(cnx[3]);
		   
	
		  
		  
		  
		
		 
			
		  
			
		
		
		
		
		
		
		
		
	}

}
