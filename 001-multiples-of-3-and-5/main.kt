/* -------------------
 Multiples of 3 and 5
- Problem 1
----------------------

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
------------------------------------------------------ */

// 1) is it a multiple of 3 or 5?
fun isMultiple(args: Array<Int>) {    
  // args.forEach { println(it) }
  println(args[0]);
}

fun main(args: Array<String>) {
  val numbers = arrayOf(3,5); // [3, 5]
  isMultiple(numbers); 
}