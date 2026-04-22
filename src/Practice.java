import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class Practice {

  // Time Complexity: O(n)
  // Space Complexity: O(n)
  // n= array.length
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Assume a rectangular array where #rows <= #cols
  // Time Complexity: O(n)
  // Space Complexity: O(1)
  // Where n = number of rows in the matrix
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: O(n)
  // Space Complexity: O(n)
  // n=array.length
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    Map<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: O(n^2)
  // Space Complexity: O(n)
  // Where n = n (the provided integer value)
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
      evens.add(i);
    }
    return evens;
  }

  // Time Complexity: O(r*c)
  // Space Complexity:O(r*c)
  // r= size of map, c=size of largest List in map
  public static List<Integer> concatVals(Map<Integer, List<Integer>> map) {
    List<Integer> result = new ArrayList<>();

    for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
      for(int num : entry.getValue()) {
        result.add(num);
      }
    }
    return result;
  }

  // Time Complexity: O(1)
  // Space Complexity: O(1)
  public static List<Character> septuple(char c) {
    List<Character> result = new ArrayList<>();
    for(int i = 0; i < 7; i++) {
      result.add(c);
    }
    return result;
  }

  // Time Complexity:O(r*c)
  // Space Complexity:O(r*c)
  // r = rows and c = cols
  public static char[][] initCharRect(int rows, int cols) {
    return new char[rows][cols];
  }

  // Assume all strings in strs are of length s
  // Hint: charAt is an O(1) operation in both time and space
  // Time Complexity: O(n*s)
  // Space Complexity: O(n)
  // Where n = strs.size() and s = length of each string in strs
  public static List<Character> concatStrings(List<String> strs) {
    List<Character> concat = new ArrayList<>();
    for(String str : strs) {
      for(int i = 0; i < str.length(); i++) {
        concat.add(str.charAt(i));
      }
    }
    return concat;
  }

  // Time Complexity: O(1)
  // Space Complexity: O(1)
  // Remember to define your variables!
  public static int cubic(int n, int a, int b, int c, int d) {
    int result = d;
    result += c * n;
    result += b * n * n;
    result += a * n * n * n;
    return result;
  }


  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.length
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   * Where n = nums.length
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    int highestCount = 0;
    int highestInt = -1000000000;

    for (int num : nums) {

      if (!frequencyMap.containsKey(num)) {
        frequencyMap.put(num, 1);
      } else {
        int newCount = frequencyMap.get(num) + 1;
        frequencyMap.put(num, newCount);
      }

    }

    if (nums.length > 0) {
      for (int num : nums) {
        if (frequencyMap.get(num) > highestCount) {
          highestCount = frequencyMap.get(num);
          highestInt = num;
        }
      }
    } else {
      return 0;
    }

    return highestInt;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 0(n^2)
   * Space Complexity: 0(1)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
      int highestCount=0;
      int highestInt=nums[0];

      for(int i=0; i<nums.length;i++ ){
        int currentCount=0;
        for(int j=i+1; j<nums.length; j++){
          if(nums[j]==nums[i]){
            currentCount++;
          }
        }
        if(currentCount>highestCount){
          highestCount=currentCount;
          highestInt= nums[i];
        }
      }

    return highestInt;
  }
}