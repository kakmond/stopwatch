# Stopwatch tasks by Wongsathorn Panichkurkul(5910545817)
I ran the tasks on HP OMEN 15, and got these results:

Task | Time
--------------------------------------|-------:
Append 50,000 chars to String | 0.723284 sec
Append 100,000 chars to String | 2.060423 sec
Append 100,000 chars to StringBuilder | 0.001868 sec
Add 1 billion double using array | 1.247813 sec
Add 1 billion Double using array | 4.086294 sec
Add 1 billion BigDecimal using array | 7.297607 sec

## Explanation of Results
Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
>>Because appending 100,000 chars to a String will use more memory than appending 50,000 chars to a String .

Why is appending to StringBuilder so much different than appending to String?  What is happening to the String? 
>>Because String will create a new string during appending, StringBuilder will just add the new text to the char[] (attributes) .

Explain difference in time to sum double, Double, and BigDecimal.  Which is faster and why?
>>double is faster than Double because double is primitive type but Double is Wrapper Class that have method and attributes so it will take more time.
And Double is faster than BigDecimal because BigDecimal is the class that bigger than Double and BigDecimal have a precision number so it will take more time to compute.

