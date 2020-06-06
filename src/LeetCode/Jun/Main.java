package LeetCode.Jun;

import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.*;
import java.util.*;
import LeetCode.Jun.*;

public class Main {

	public static void main(String[] args)throws Exception{
		//		Clipboard test 1. Fail --textArea?--
		//		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		//		String c=textArea.getSelectedText();
		//		if(c!=null) {
		//			StringSelection con=new StringSelection(c);
		//			clip.setContents(con,null);
		//		}

		//		Clipboard test 2. Fail --txtCommand?--
		//		String ctc = txtCommand.getText().toString();
		//	    StringSelection stringSelection = new StringSelection(ctc);
		//	    Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		//	    clpbrd.setContents(stringSelection, null);

		//		Clipboard test 2. Success --상위 케이스들은 해당 변수에 텍스트를 설정하고 그 텍스트를 클립보드로 복사하는듯.--
		//		String myString = "This text will be copied into clipboard";
		//		StringSelection stringSelection = new StringSelection(myString);
		//		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		//		clipboard.setContents(stringSelection, null);

		//		0> I/O Setting
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st; 

		//		1> Test instructions
		bw.write("Test Case Will copy to Clipboard.\nFollow Input Form.\n\n");

		//		2> Clipboard setting
		String tCase;
		StringSelection selection;
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();

		//		3> Test Selection
		bw.write("Select Case:\t1. TwoSum\t2. ThreeSum\t: ");
		bw.flush();
		switch(br.readLine()) {
		case "1":
//			3-1> T1: TwoSum
			bw.write("2020-06\t1. TwoSum\n");
			bw.flush();
			Thread.sleep(500);
			bw.write("\tIntegers) 1 2 3 4 5\n\tTarget) 3\n");
			bw.flush();
			tCase="2 7 11 15\n9";
			selection=new StringSelection(tCase);
			clip.setContents(selection,null);
			String[]input=br.readLine().split(" ");
			int l=input.length,i,nums[]=new int[l],target,result[];
			for(i=0;i<l;nums[i]=Integer.parseInt(input[i++]));
			target=Integer.parseInt(br.readLine());
			result=TwoSum.twoSum(nums, target);
			bw.write(Arrays.toString(result)+"\n");
			bw.flush();
			break;
		case "2":
//			3-2> T1: ThreeSum
			bw.write("2020-06\t1. TwoSum\n");
			bw.flush();
			Thread.sleep(500);
			bw.write("\tIntegers) 1 2 3 4 5\n\tTarget) 3\n");
			bw.flush();
			tCase="2 7 11 15\n9";
			selection=new StringSelection(tCase);
			clip.setContents(selection,null);
			String[]input=br.readLine().split(" ");
			int l=input.length,i,nums[]=new int[l],target,result[];
			for(i=0;i<l;nums[i]=Integer.parseInt(input[i++]));
			target=Integer.parseInt(br.readLine());
			result=TwoSum.twoSum(nums, target);
			bw.write(Arrays.toString(result)+"\n");
			bw.flush();
			break;
		default: 
			bw.write("anonymous");
			bw.flush();

		}

	}

}
