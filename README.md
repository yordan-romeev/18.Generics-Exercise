Generics- Exercises

# Jar of T

Create a class Jar<> that can store anything.

It should have two public methods:

void add(element)

element remove()

Adding should add on top of its contents. Remove should get the topmost element.

Use the syntax Jar<T> to create a generic class.

# Generic Array Creator

Create a class ArrayCreator with a method and a single overload to it:

static T[] create(int length, T item)

static T[] create(Class<T> class, int length, T item)

The method should return an array with the given length, and every element should be set to the given default item.

# Generic Scale

Create a class Scale<T extends Comparable<T>> that holds two elements - left and right. The scale should receive the elements through its single constructor:

Scale(T left, T right)

The scale should have a single method:

T getHeavier()

The greater of the two elements is heavier. The method should return null if elements are equal.

We use extends Comparable<T> so that every T is extending Comparable, which gives us a compareTo() method.

# Generic Box

Create a generic class Box that can store any type. Override the toString() method to print the type and the value of the stored data in the format "{class full name}: {value}".

Use the class that you've created and test it with the class java.lang.String. On the first line, you will get n - the number of strings to read from the console. On the next n lines, you will get the actual strings. For each of them, create a box and call its toString() method to print its data on the console.

# Generic Box of Integer

Test your generic box with Integers.

# Generic Swap Method Strings

Create a generic method that receives a list containing any type of data and swaps the elements at two given indexes.

Read n number of boxes of type String and add them to the list. On the next line, however, you will receive a swap command consisting of two indexes. Use the method you've created to swap the elements corresponding to the given indexes and print each element in the list.

# Generic Swap Method Integers

Test your list of generic boxes with Integers.

# Generic Count Method Strings

Create a method that receives as an argument a list of any type that can be compared and an element of the given type. The method should return the count of elements that are greater than the value of the given element. Modify your Box class to support comparing by the value of the data stored.

On the first line, you will receive n - the number of elements to add to the list. On the next n lines, you will receive the elements. On the last line, you will get the value of the element to which you need to compare every element in the list.

Examples

# Generic Count Method Doubles

Test your list of generic boxes with Doubles.

Examples

# Custom List

Create a generic data structure that can store any type that can be compared. Implement functions:

void add(T element)

T remove(int index)

boolean contains(T element)

void swap(int index, int index)

int countGreaterThan(T element)

T getMax()

T getMin()

Create a command interpreter that reads commands and modifies the custom list that you have created. Implement the commands:

Add {element} - Adds the given element to the end of the list.

Remove {index} - Removes the element at the given index.

Contains {element} - Prints if the list contains the given element (true or false).

Swap {index1} {index2} - Swaps the elements at the given indexes.

Greater {element} - Counts the elements that are greater than the given element and prints their count

Max - Prints the maximum element in the list.

Min - Prints the minimum element in the list.

Print - Prints all elements in the list, each on a separate line.

end - stops the reading of commands.

