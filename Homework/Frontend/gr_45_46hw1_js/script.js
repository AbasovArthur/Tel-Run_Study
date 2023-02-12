

/* HOME WORK 1 (23.01.23) */

// const my_name = "Arthur"
// const surname = "Abasov"
// /* 1. Добавить пробел между строками name и surname*/
// const space = " "
// const fullname = my_name + space + surname
// console.log(fullname);

// /* 2. Есть переменные r = 12, g = 13, b = 14.
// Используя конкатенацию вывести строку "rgb({12}, {13}, 14)" */
// let r = 12
// let g = 13
// let b = 14
// const result = `rgb(${r}, ${g}, ${b})`

// /*3. Попросить у пользователя ввести его возраст(годы) и в консоли вывести год его рождения(валидный для 2023) */

// let age = prompt("enter youre age")
// console.log("year of your born is" + " " + (2023 - age))

// /* 4. Попросить ввести число и в консоли вывести квадрат этого числа */

// let num = prompt("please entr num")
// //let squar = num
// //console.log( Math.pow(num))                   //чето не работает так
// console.log(num * num)

// /* 5. Попросить пользователя ввести два числа (поочередно - 2x prompt), а в консоли вывести их произведение(*) */

// let messag = +prompt("enter 2 nume: ")
// let num1 = +prompt("enter 1 nume: ")
// console.log("sum of entered numbers is " + (messag + num1))


/* HOME WORK 2 (24.01.23) */
/*
1. Написать программу, которая запрашивает у пользователя два числа поочередно
и выводит бОльшее из них.
*/

// let num1 = +prompt("введите число 1")
// let num2 = +prompt("введите число 2")

// if (num1 > num2) {
//     console.log("число " + num1 + " больше " + num2)
// } else {
//     console.log("число " + num2 + " больше " + num1)
// }

/*2. Написать программу, которая запрашивает у пользователя число
и выводит "положительное" "отрицательно" "равно 0"
*/

// let num = +prompt("введите число: ")

// if (num > 0) {
//     console.log("число " + num + " положительное")
// } else if (num < 0) { 
//     console.log("число " + num + " отрицательное")
// } else { 
//     console.log("число " + num + " равно 0")
// }

/*3. Есть массив arr = [1, 4, 2, 6, 9]. Есть пустой массив squares = []. Нужно заполнить массив
        squares квардатами чисел из первого массива, используя методы push, unshift,shift, pop
        в итоге  squares = [1, 16, 4, 36, 81]
*/
/* Массивы и циклы 
    массив - это структура данных или коллекция элементов, которая упорядочена 
        и элементы имеют индексы от 0 до N
    .length - свойство длины массива - это количество элементов в нем

    .unshift() - метод, который добавляет в начало массив
    .shift() - метод, который удаляет значение с начала массива
    .push() - метод, который позволяет добавить значение в конец массив 
    .pop() - метод, который позволяет удалить значение с конца массив
    
*/ 

// arr = [1, 4, 2, 6, 9]
// squares = []

// console.log(arr)
// console.log(squares)

// squares.push(Math.pow(arr[0], 2))
// squares.push(Math.pow(arr[1], 2))
// squares.push(Math.pow(arr[2], 2))
// squares.push(Math.pow(arr[3], 2))
// squares.push(Math.pow(arr[4], 2))

// //squares.push(Math.pow(arr$[{}], 2))  //хочу как-то оптимизировать верхние 5 строк

/*
4. Используя методы push, unshift, shift, pop
удалить из массива movies "Властелин колец" и "Звездные войны"
В итоге в массиве должно остаться ["Аватар", "Гарри Поттер"]
*/
/*
const movies = [' Властелин колец ', ' Аватар ', ' Звездные войны ', ' Гарри Поттер ']

console.log("изначальн массив " + movies)


movies.shift([0])
movies.pop([3])         
movies.pop([2])
movies.push(' Гарри Поттер ')

//movies.unshift([2])

console.log("итог массив:" + movies)
*/
/*
    .unshift() - метод, который [ добавляет в начало ] массив
    .push() - метод, который [ добавляет значение в конец ] массивa

    .shift() - метод, который [ удаляет значение с начала ] массива
    .pop() - метод, который [ удаляет значение с конца ] массив
    
*/ 
/*
const products = [
    {
        id: 1,
        name: "Iphone 14",
        price: 100000,
        category: "phone"
    },
    {
        id: 2,
        name: "Iphone 13",
        price: 90000,
        category: "mobile"
    },
    {
        id: 3,
        name: "Iphone 12",
        price: 80000,
        category: "phone"
    }
]
*/
//0. Наполнить массив products подобными объектами, с разными значениями
/*
products.push({
        id: 4,
        name: "Iphone 15",
        price: 250000,
        category: "super-phone"
    })

    console.log(products)
*/   
/*
// 1. Вывести название и цену каждого товара в консоли со скидкой 10%
let sale = 0.1
    for(let i = 0; i < products.length; i++) {
       products[i].price - (products[i].price * sale)
       console.log(products[i])

    }                           ----------- почему оно так не работает?
*/

/*
let sale = 0.1
    for(let i = 0; i < products.length; i++) {
       let discont = products[i].price - (products[i].price * sale)
       console.log(discont)

    }
*/

/*
2. Есть массив объектов products. Из этого массива добавить в новый пустой массив
    только те продукты

    а)цена которых больше 88000;
    const moreThanPrice = [] нужно заполнить данный массив

    б) категория который "phone";
    const categoryPhone = []
*/



const products = [
    {
        id: 1,
        name: "Iphone 14",
        price: 100000,
        category: "phone"
    },
    {
        id: 2,
        name: "Iphone 13",
        price: 90000,
        category: "mobile"
    },
    {
        id: 3,
        name: "Iphone 12",
        price: 80000,
        category: "phone"
    }
]

const productsNew = []

productsNew.push(products[2])

console.log(products)
console.log(productsNew)

/*
а)цена которых больше 88000;
            const moreThanPrice = [] нужно заполнить данный массив
           к
*/
const moreThanPrice = []


for(let i = 0; i < products.length; i++) {
    if (products[i].price > 88000) {
        moreThanPrice.push(products[i].name)
    }
}
console.log(moreThanPrice)

/*
б) категория который "phone"; const categoryPhone = []
*/
const categoryPhone = []

for (let i = 0; i < products.length; i++) {
    if (products[i].category === "phone") {
        categoryPhone.push(products[i].name)
    }
}
console.log(categoryPhone)

/*

3. Создать функцию, которая получает два числа в параметры
и выводит в консоль бОльшее из них
        max(10, 20) // 20
        max(100, 5) // 100
 */

// let num1 = +prompt("add num 1: ")
// let num2 = +prompt("add num 2: ")
/*
    function max(num1, num2) {
        if (num1 > num2){
            console.log(num1)
        }else{
            console.log(num2)
        }
        console.log(max)
    }

    max(10, 20) // 20
    max(100, 5) // 100
*/

/*
4. Написать функцию, которая запрашивает число у пользователя и отображает "ЧЕТ", если число четное
и "НЕЧЕТ", если нечетное
*/
/*
const number = +prompt("add number: ")

function Ch_Or_Nch(number){
    
    if (number % 2 === 0){
        console.log("ЧЕТ")
        } else{
        console.log("НЕЧЕТ")
    }
}
console.log(Ch_Or_Nch(number))
*/

/* 5. Написать функцию, которая получает два числа и возводит первое число в степень второго
        power(10, 2) // 100
        power(2, 5) // 32
*/
/*
const number = +prompt("add nummer: ")
const power = +prompt("add power: ")
let result = 1
*/
/*
function pow(number, power) {
    return Math.pow(number, power);
}

console.log(pow(number, power));
*/
/*
for (let i = 0; i < power; i++) {
    result *= number;
}
console.log(result);
*/
















