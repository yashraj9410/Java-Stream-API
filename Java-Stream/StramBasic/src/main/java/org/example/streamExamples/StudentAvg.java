package org.example.streamExamples;

import java.util.*;
// Maximum Average by Student
// Problem Statement:
// You're given a list of [student_name, marks]. A student may appear multiple times with different marks. Return the highest average score among all students.

// Input: An array of pairs: [[name1, marks1], [name2, marks2], ...]
// Output: A floating-point number representing the maximum average score.

// Constraints:

// 1 ≤ marks ≤ 100

// Student names are strings.

// Example Test Cases:

// plaintext
// Copy
// Edit
// Input: [["Alice", 90], ["Bob", 95], ["Alice", 100], ["Bob", 85]]
// Output: 95.0

// Input: [["Sam", 70], ["Sam", 80], ["Tom", 100]]
// Output: 100.0

// Input: [["A", 60], ["A", 60], ["A", 60]]
// Output: 60.0

// Input: [["A", 50]]
// Output: 50.0

public class StudentAvg {

    public int findAverage(List<List<String>> studentMarks) {
        Map<String, List<Integer>> studentScores = new HashMap<>();
        double maxAverage = Integer.MIN_VALUE;

        // group scores by student name 

        for(List<String> entry : studentMarks){
            studentScores.computeIfAbsent(entry.get(0), k -> new ArrayList<>()
            ).add(Integer.parseInt(entry.get(1)));
        }

        // calculate avg by using studen name on each map key set 
        for(List<Integer> scores : studentScores.values()){
            double average = scores.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);   

            if(average > maxAverage) {
                maxAverage = average;
            }
        }

        return maxAverage == Integer.MIN_VALUE ? 0 : (int) maxAverage;

    }
    
}
