package com.example.ems;

import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class LeetCodesubString {
	
	public static boolean checkpelindrom(String tempString) {
		
		String temp="";
		for(int i=tempString.length()-1;i>=0;i--)
		{
			temp=temp+tempString.charAt(i);
		}
		if(tempString.equals(temp)) {
			return true;
		}else {
		return false;
		}
	}
    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ss=new Scanner(System.in);
		String s=ss.nextLine();
//		ababa

//		HashMap<Integer, String> hm=new HashMap<>();
//		int l=0;
//		for (int i=0;i<ss.length()-1;i++) {
//			int startFrom = i+1;
////			int a=ss.charAt(i);
//			
//			for(;;) {
//				int n=ss.indexOf(ss.charAt(i),startFrom);
//				if(n>=0) {
//					String substr=ss.substring(i, n+1);
////					System.out.println();
//					startFrom=n+1;
//					if(checkpelindrom(substr)) {
//						int ll=substr.length();
//						
//						if(ll>l) {
//							l=ll;
//						}
//						hm.put(ll, substr);
//					}
//					
//					
//				}else {
//					
//					break;
//				}
//				
//			}
//		}
//        if(hm.get(l)==null){
//            System.out.println(String.valueOf(ss.charAt(0)));
//        }else{
//        	System.out.println(hm.get(l));
//
//	}

		        if (s == null || s.length() < 1) {
		            System.out.println("");
		        }
		        int start = 0, end = 0;
		        for (int i = 0; i < s.length(); i++) {
		            int len1 = expandAroundCenter(s, i, i);
		            int len2 = expandAroundCenter(s, i, i + 1);
		            int len = Math.max(len1, len2);
		            if (len > end - start) {
		                start = i - (len - 1) / 2;
		                end = i + len / 2;
		            }
		        }
		        System.out.println(s.substring(start, end + 1)); 
		    }


		

        }


