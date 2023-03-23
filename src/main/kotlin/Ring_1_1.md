Efficient Sampler
Design and implement an efficient sampler that can handle the following operations in constant time:
- Adding a String
- Removing a String
- Perform a uniform random sampling over the current set of Strings

Code your solution to the following interface:
interface Sampler {
    public void add(String item);
    public void remove(String item);
    public String sample();
}

 ("amazon", "hello") add "world"  ("amazon", "hello", "world"),
 sample() -> obtain random string in set