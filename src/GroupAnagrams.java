import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
		List<String> tempAnagram = new ArrayList();

		List<List<String>> answer = new ArrayList<List<String>>();

		for (int x = 0; x < strs.length; x++) {
			
			List<String> stringOne = Arrays.asList(strs[x].split(""));
			System.out.println("First x:" + x + stringOne.toString());
			
			
			for (int i = 0; i < strs.length; i++) {
				
				List<String> stringTwo = Arrays.asList(strs[i].split(""));
				System.out.println("First i:" + x + stringTwo.toString());
				
				
				if ((stringOne.size() == stringTwo.size()) && stringOne.containsAll(stringTwo)
						&& stringTwo.containsAll(stringOne)) {
					
					System.out.println("strs[x]" + strs[x]);
//					tempAnagram.add(strs[x]);

					System.out.println("strs[i]" + strs[i]);
					tempAnagram.add(strs[i]);
					
					System.out.println("tempAnagram" + tempAnagram.toString());
					answer.add(tempAnagram);
					
					System.out.println("\n");
				}
				
			}
		}
        return answer;
	}

}
	


