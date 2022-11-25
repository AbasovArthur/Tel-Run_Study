/* 
//_________________________________________ЗАДАЧА 1)____________________________________________________

Project10. Buttons. При нажатии на кнопку менять цвет body.
У вас должен быть слушатель для всех кнопок. По нажатию на каждую кнопку отображаете в консоли "клик"
По нажатию на каждую кнопку, считывать атрибут id нажатой кнопки
Менять фона body на считанный атрибут id.
Добавить кнопку blue и orange. 
*/

//_________________________________________РЕШЕНИЕ 1)____________________________________________________

let buttons = document.querySelectorAll(".item")             //нашли кнопки и присв им перем buttons. теперь это массив
buttons.forEach(function(elem) {
    elem.addEventListener("click", function(){               //слушатель для всех кнопок.
        let ident = elem.getAttribute("id")
            console.log("Клик", ident);
        if(ident == "img"){
            document.body.style.background = `url(./image/pattern.jpg)`
        }else{
            document.body.style.background = ident
        }
    })
});
//_________________________________________ЗАДАЧА 2)____________________________________________________
        
/*
Создать 5 тегов в html. Из массива let texts = ["Lorem", "Ipsum", "Dolor", "Sit", "Amet"]
для каждого тега p добавить соотв-ю текст. innerText
*/
//_________________________________________РЕШЕНИЕ 2.a)____________________________________________________

let texts = ["Lorem", "Ipsum", "Dolor", "Sit", "Amet"];      // 

let paragraps = document.querySelectorAll("p");              //собираем в массив все параграфа в [i]
for (let i = 0; i < texts.length; i++) {
    let iterParagraf = paragraps[i];                         //присвоили переменной текущий параграф
    let iterText = texts[i];                                 //0 - "Lorem", 1- "Ipsum", ... 
    iterParagraf.innerText = iterText;                       //текущему параграфу изм текст сво-во на текущую строку из массива
    
};
//_________________________________________РЕШЕНИЕ 2.a)____________________________________________________

//________________________________________РЕШЕНИЕ 2.b)_____________________________________________________

// let texts = ["Lorem", "Ipsum", "Dolor", "Sit", "Amet"];  // 

// let paragraps = document.querySelectorAll("p");          //собираем в массив все параграфа в [i]
// texts.forEach(
//     function (iterText, i) {                             //метод ф-ции "forEach"
//         let iterParagraf = paragraps[i];                 //присвоили переменной текущий параграф
//         iterParagraf.innerText = iterText;               //текущему параграфу изм текст сво-во на текущую строку из массива
//     }
// );
//________________________________________РЕШЕНИЕ 2.b)_____________________________________________________

//________________________________________РЕШЕНИЕ 2.c)_____________________________________________________

// let texts = ["Lorem", "Ipsum", "Dolor", "Sit", "Amet"]; // 

// let paragraps = document.querySelectorAll("p");          //собираем в массив все параграфа в [i]
// texts.forEach((iterText, i) => {                         //стрелочная ф-ция
//         let iterParagraf = paragraps[i];                 //присвоили переменной текущий параграф
//         iterParagraf.innerText = iterText;               //текущему параграфу изм текст сво-во на текущую строку из массива
//     }
// );
//________________________________________РЕШЕНИЕ 2.c)_____________________________________________________

/*
//________________________________________ЗАДАЧА 3)____________________________________________________

В html создаем 3 тега a -  x3. Для каждого из трех, 
    добавить link в href и title внутрь тега из массива arr

    Есть массивт arr = [
{
    link : "https://google.com",
    title : "Ссылка на гугл"
},
{
    link : "https://instagram.com",
    title : "Ссылка на инстаграм"
},
{
    link : "https://facebook.com",
    title : "Ссылка на фейсбук"
}
]
*/
//_________________________________________ЗАДАЧА 3)____________________________________________________

//_________________________________________РЕШЕНИЕ 3)___________________________________________________

let arr = [
    {
        link : "https://google.com",
        title : "Ссылка на гугл"
    },
    {
        link : "https://instagram.com",
        title : "Ссылка на инстаграм"
    },
    {
        link : "https://facebook.com",
        title : "Ссылка на фейсбук"
    }
];

let links = document.querySelectorAll("a");
arr.forEach((element, i) => {                                // перебираю массив объектов
    links[i].setAttribute("href", element.link);             // "<a href=""></a>"" обрачаюсь к  тегу "а" и меняю у него атр href на значение из объекта текущ. по ключу link
    links[i].innerText = element.title;                      //обращ к <a href=""></a> и меняю пустот строку на знач из текущ объекта
});


//_________________________________________ЗАДАЧА 4)____________________________________________________
/*
Создать две кнопки - PLUS, MINUS
Создать тег p с начальным значением - 0. 
При клике на buttonPlus увеличивать значение в теге p на 1
При клике на buttonMinus уменьшать значение в теге p на 1
addEventListener. innerText. 
*/
//_________________________________________ЗАДАЧА 4)____________________________________________________

//_________________________________________РЕШЕНИЕ 4)___________________________________________________

let paragraf = document.querySelector(".paragraf");
let minus = document.querySelector(".minus");
let plus = document.querySelector(".plus");

minus.addEventListener("click", function(event) {
    paragraf.innerText = Number(paragraf.innerText) - 1;
})
plus.addEventListener("click", function(event) {
    paragraf.innerText = Number(paragraf.innerText) + 1;
   
})
//_________________________________________РЕШЕНИЕ 4)___________________________________________________







