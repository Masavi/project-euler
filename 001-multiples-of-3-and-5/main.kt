/* -------------------
 Multiples of 3 and 5
- Problem 1
----------------------

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
------------------------------------------------------ */

// 1) which numbers are multiples of 3 or 5?
fun getMultiples3or5(limit: Int): Set<Int> {
  var multiples = setOf<Int>()

  for (i in 1..(limit - 1)) {
    if(i%3 == 0 || i%5 == 0) {
      // val message = "Hello world $i" // String and Int concatenation
      // println(message);
      multiples += i;
    }
  }

  val numberOfMultiples = multiples.size;
  println("number of multiples found:\n$numberOfMultiples");

  return multiples;
}

// 2) what is the sum of all the multiples?
fun getSumOfNumbers(numbers: Set<Int>) :Int {
  var sum = 0;
  numbers.forEach { sum += it };
  return sum;
}

fun main(args: Array<String>) {
  val limit = 1000;
  val multiples = getMultiples3or5(limit);
  val result = getSumOfNumbers(multiples);
  println("sum of all the multiples of 3 or 5 below $limit:\n$result");
}