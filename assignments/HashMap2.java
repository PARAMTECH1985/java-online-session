//WAP which stores the Adhaar Card Number as key and stores the name as value.

import java.util.*;
public class HashMap2
{
public static void main(String args[])
{
HashMap<String,String> hm=new HashMap<String,String>();

hm.put("738695482934","Virendra Raghuwanshi");
hm.put("925976108348","Nikita Raghuwanshi");
hm.put("588403853353", "Abhishek Raghuwanshi");
hm.put("477588893453","Arti Sahu");
hm.put("456787654543","Mona Raghuwanshi");
hm.put("675434567890","Manisha Raghuwanshi");
hm.put("984356098765","Mithlesh Raghuwanshi");

System.out.println(hm.startsWith("A"));

Set<String> KeySet=hm.KeySet();
Iterator<String> itr=KeySet.Iterator();
while(itr.hasNext())
{
String Key=itr.next();
System.out.println(hm.get(key));
}
 

}
}