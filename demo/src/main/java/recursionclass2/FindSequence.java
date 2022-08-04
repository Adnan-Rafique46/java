package recursionclass2;
import java.util .*;
public  class FindSequence {
    // JAVA program for above approach
    // Function to find sequence
// from given string
// according to given rule
        public static void findSequence(int N, String S) {

            // Creating a deque
            Deque<Integer> v = new ArrayDeque<Integer>();

            // Inserting N (size of string) into deque
            v.addLast(N);

            // Iterating string from behind and
            // pushing the indices into the deque
            for (int i = N - 1; i >= 0; i--) {

                // If letter at current index is 'F',
                // push i to the right of i-1
                if (S.charAt(i) == 'F') {
                    v.addLast(i);
                }

                // If letter at current index is 'B',
                // push i to the left of i-1
                else {
                    v.addFirst(i);
                }
            }

            // Printing resultant sequence
            for (Iterator itr = v.iterator(); itr.hasNext(); ) {
                System.out.print(itr.next() + " ");
            }
        }

        // Driver Code
        public static void main(String[] args) {
            int N =4 ;
            String S = "FBBFB";

            // Printing the sequence
            findSequence(N, S);
        }
    }

// This code is contributed by Taranpreet


