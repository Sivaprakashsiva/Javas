public class UniqKey{
Public static void main(String args[])
{
Integer[] numbers = {1, 1, 2, 1, 3, 4, 5};
Set<Integer> uniqKeys = new TreeSet<Integer>();
uniqKeys.addAll(Arrays.asList(numbers));
System.out.println("uniqKeys: " + uniqKeys);
}}
