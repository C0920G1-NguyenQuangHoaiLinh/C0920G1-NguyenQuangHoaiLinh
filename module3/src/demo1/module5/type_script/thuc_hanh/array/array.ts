/**
 * Array
 */

// declare an array

const list: number[] = [1, 2, 3];

const categories: Array<string> =
    ['Sport', 'IT', 'Car'];

document.write('List' + "<br>");
list.forEach((num) =>
    document.write(num.toFixed(1) + "<br>")
);

document.write('categories' + "<br>");
categories.forEach((str) =>
    document.write(str.indexOf('IT') + "<br>")
);

// convert mảng từ dạng này sang dạng khác.
const listSquare = list.map(num => num * num);
document.write(listSquare + "<br>")
// Output: [1, 4, 9]

// lọc các phần tử thỏa mãn
const result = categories.filter(str => str.length > 4)
document.write(result + "<br>");
// Output: ['Sport', 'Car']


/**
 * Tuple
 */

// Declare a tuple type
let x: [string, number];
// Initialize it
x = ["hello ", 10]; // OK
document.write(x[0].toString() + "<br>");
// Initialize it incorrectly
// x = [10, "hello"]; // Error

// console.log(x[1].substr(1));
// Error, Property 'substr' does not exist on type 'number'.

x[0] = "world";
document.write(x[0].toString() + "<br>");
// OK, 'string' can be assigned to 'string | number'
x[1] = 100.25;
document.write(x[1].toString() + "<br>");

// OK, 'string' and 'number' both have 'toString'

// x[6] = true; // Error, 'boolean' isn't 'string | number'