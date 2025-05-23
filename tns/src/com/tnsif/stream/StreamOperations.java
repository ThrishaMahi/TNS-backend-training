package com.tnsif.stream;


	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class StreamOperations {
	    public static void main(String[] args) {
	        // Create a list of integers
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Filter even numbers
	        List<Integer> evenNumbers = numbers.stream()
	                .filter(n -> n % 2 == 0)
	                .collect(Collectors.toList());
	        System.out.println("Even numbers: " + evenNumbers);

	        // Map numbers to their squares
	        List<Integer> squares = numbers.stream()
	                .map(n -> n * n)
	                .collect(Collectors.toList());
	        System.out.println("Squares: " + squares);

	        // Reduce numbers to their sum
	        int sum = numbers.stream()
	                .reduce(0, (a, b) -> a + b);
	        System.out.println("Sum: " + sum);

	        // Find the maximum number
	        int max = numbers.stream()
	                .max(Integer::compare)
	                .orElse(Integer.MIN_VALUE);
	        System.out.println("Max: " + max);

	        // Find the minimum number
	        int min = numbers.stream()
	                .min(Integer::compare)
	                .orElse(Integer.MAX_VALUE);
	        System.out.println("Min: " + min);

	        // Check if all numbers are positive
	        boolean allPositive = numbers.stream()
	                .allMatch(n -> n > 0);
	        System.out.println("All positive: " + allPositive);

	        // Check if any number is greater than 5
	        boolean anyGreaterThan5 = numbers.stream()
	                .anyMatch(n -> n > 5);
	        System.out.println("Any greater than 5: " + anyGreaterThan5);

	        // Check if none of the numbers are negative
	        boolean noneNegative = numbers.stream()
	                .noneMatch(n -> n < 0);
	        System.out.println("None negative: " + noneNegative);

	        // Find the first number greater than 5
	        int firstGreaterThan5 = numbers.stream()
	                .filter(n -> n > 5)
	                .findFirst()
	                .orElse(-1);
	        System.out.println("First greater than 5: " + firstGreaterThan5);

	        // Find distinct numbers (not applicable here since all numbers are distinct)
	        List<Integer> distinctNumbers = numbers.stream()
	                .distinct()
	                .collect(Collectors.toList());
	        System.out.println("Distinct numbers: " + distinctNumbers);

	        // Sort numbers in ascending order
	        List<Integer> sortedNumbers = numbers.stream()
	                .sorted()
	                .collect(Collectors.toList());
	        System.out.println("Sorted numbers: " + sortedNumbers);

	        // Limit numbers to the first 5
	        List<Integer> limitedNumbers = numbers.stream()
	                .limit(5)
	                .collect(Collectors.toList());
	        System.out.println("Limited numbers: " + limitedNumbers);

	        // Skip the first 5 numbers
	        List<Integer> skippedNumbers = numbers.stream()
	                .skip(5)
	                .collect(Collectors.toList());
	        System.out.println("Skipped numbers: " + skippedNumbers);

	        // Count the total numbers
	        long count = numbers.stream()
	                .count();
	        System.out.println("Total count: " + count);

	        // Collect numbers into a string
	        String numbersString = numbers.stream()
	                .map(String::valueOf)
	                .collect(Collectors.joining(", "));
	        System.out.println("Numbers as string: " + numbersString);

	        // Collect numbers into a list of strings
	        List<String> numbersList = numbers.stream()
	                .map(String::valueOf)
	                .collect(Collectors.toList());
	        System.out.println("Numbers as list of strings: " + numbersList);
	    }
	}


	

