// Задача 1. Вывести в консоли:
// а) все ноутбуки. лучше с разметкой HTML     
// б) все ноутбуки, цена которых больше 40000.
// в) Посчитать сумму цен всех ноутбуков. Итого.


let laptops = [
    {
        mark : "Acer",
        price : 25000
    },
    {
        mark : "Apple",
        price : 37000
    },
    {
        mark : "Asus",
        price : 125500,
    },
    {
        mark : "HP",
        price : 42000
    },
    {
        mark : "Samsung",
        price : 52000
    }
]
//__________решение______________//__________решение______________//__________решение______________




// Задача 1._____________________//__________ЗАДАЧА______________//________________________________
// Решение 1.a.
// а) все ноутбуки. лучше с разметкой HTML      

console.log('-------a) \'laptop\'------')
for (let i = 0; i < laptops.length; i++){
    //console.log(laptops[i].mark)
    console.log(`
        <div>
        <p>mark:${laptops[i].mark} </p>
        <p>price:${laptops[i].price} </p>
        </div>
        `);
}
console.log('   ')

// // Решение 1.б.
// // б) все ноутбуки, цена которых больше 40000.

// console.log('-------b) \'price > 40000\'------')
// for (let i = 0; i < laptops.length; i++){
//     if (laptops[i].price > 40000)
//     console.log("больше 40000 - " + laptops[i].mark)
// }
// console.log('   ')

// // Решение 1.в.
// // в) Посчитать сумму цен всех ноутбуков. Итого.

// console.log('-------c) \'AllPrice\'------')
// let sum = 0
// for (let i = 0; i < laptops.length; i++){
//     sum += laptops[i].price
// }
// console.log("Итого: " +sum)

//__________решение______________//__________решение______________//__________решение______________

// Задача.2
// а) Вывести все ноутбуки, у которых есть категория "laptop"
// б) Вывести все ноутбуки, у которых категория "premium"
// в) Вывести все ноутбуки, у которых категория "tech"

// let laptopsSecond = [
//     {
//         mark : "Acer",
//         category : ["laptop", "tech"],
//         price : 25000
//     },
//     {
//         mark : "Apple",
//         category : ["notebook", "tech"],
//         price : 37000
//     },
//     {
//         mark : "Asus",
//         category : ["computer", "premium"],
//         price : 125500,
//     },
//     {
//         mark : "HP",
//         category : ["computer", "tech"],
//         price : 42000
//     },
//     {
//         mark : "Samsung",
//         category : ["notebook", "premium"],
//         price : 52000
//     }
// ]
//__________решение______________//__________решение______________//__________решение______________

// Задача 2._____________________//__________ЗАДАЧА______________//________________________________
// Решение 2.a.
// а) Вывести все ноутбуки, у которых есть категория "laptop"

// console.log('-------a) \'laptop\'------')
// for (let i = 0; i < laptopsSecond.length; i++){
//     for (let x = 0; x < laptopsSecond[i].category.length; x++){
//         if(laptopsSecond[i].category[x] == "laptop"){
//             console.log(laptopsSecond[i])
//         }
//     }
// }
// // Решение 2.б.
// // б) Вывести все ноутбуки, у которых категория "premium"

// console.log('-------a) premium \'------')
// for (let i = 0; i < laptopsSecond.length; i++){
//     for (let x = 0; x < laptopsSecond[i].category.length; x++){
//         if(laptopsSecond[i].category[x] == "premium"){
//             console.log(laptopsSecond[i])
//         }
//     }
// }
// // Решение 2.с.
// // в) Вывести все ноутбуки, у которых категория "tech"
// console.log('-------c) tech \'------')
// for (let i = 0; i < laptopsSecond.length; i++){
//     for (let x = 0; x < laptopsSecond[i].category.length; x++){
//         if(laptopsSecond[i].category[x] == "tech"){
//             console.log(laptopsSecond[i])
//         }
//     }
// }
// console.log('________________')

//__________решение______________//__________решение______________//__________решение______________



// Задача 3._____________________//__________ЗАДАЧА______________//________________________________

// Запрашивать у пользователя Марку и Цену ноутбука три раза.
// Марку и цену ноутбука объединять в объект и добавлять(push) в массив laptops=[]-пустой
// Итого будет массив из трех объектов.

// let laptopsSecond = [
//     {
//         mark : "Acer",
//         category : ["laptop", "tech"],
//         price : 25000
//     },
//     {
//         mark : "Apple",
//         category : ["notebook", "tech"],
//         price : 37000
//     },
//     {
//         mark : "Asus",
//         category : ["computer", "premium"],
//         price : 125500,
//     },
//     {
//         mark : "HP",
//         category : ["computer", "tech"],
//         price : 42000
//     },
//     {
//         mark : "Samsung",
//         category : ["notebook", "premium"],
//         price : 52000
//     }
// ]
// Решение 3.
//__________решение______________//__________решение______________//__________решение______________

// let laptops = [];
// for(let i = 0; i < 3; i++){
//     let title = prompt('Enter title of compjuter'); // У пользователя с prompta запрашивать марку.
//     let price = +prompt('Enter price of compjuter'); // У пользователя с prompta запрашивать цену.
//     let obj = {
//            titleO: title,
//            priceO: price
// };
//     laptops.push(obj);
// }
// if(laptops != null){
//     laptops.forEach(t=>console.log(t));
// }
// else{
//     console.log('laptops = null');
// }

//__________решение______________//__________решение______________//__________решение______________


// Задача 4._____________________//__________ЗАДАЧА______________//________________________________

// У пользователя с prompta запрашивать марку/цену.
// По его ответу в консоли ввыводить ноутбуки с разметкой.
// Какую марку вы бы хотели? -Acer. Выводим хар-ки Acer
// На какую цену вы рассчитываете? -50000. Выводить все ноутбуки, которые удовл-т(меньше) этой цене

// let laptopsSecond1 = [
//     {
//         mark : "Acer",
//         category : ["laptop", "tech"],
//         price : 25000
//     },
//     {
//         mark : "Apple",
//         category : ["notebook", "tech"],
//         price : 37000
//     },
//     {
//         mark : "Asus",
//         category : ["computer", "premium"],
//         price : 125500,
//     },
//     {
//         mark : "HP",
//         category : ["computer", "tech"],
//         price : 42000
//     },
//     {
//         mark : "Samsung",
//         category : ["notebook", "premium"],
//         price : 52000
//     }
// ]

// Решение 4.
//__________решение______________//__________решение______________//__________решение______________

// let title = prompt('What brand would you like?');
// let price = +prompt('What price do you expect?');

// for (let i = 0; i < laptopsSecond1.length; i++) {
//     if (laptopsSecond1[i].mark == title && laptopsSecond1[i].price <= price) {
//         console.log(laptopsSecond1[i]);
//     }
    
// }