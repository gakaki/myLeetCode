//function 2 method declare

const func = (str:string) : number => {
    return parseInt(str,10)
}
// : => 都可以表示返回类型
const func1 : (str:string) => number = (str) => {
    return parseInt(str,10)
}

//type alias
type User = { name:string , age: number}
const objectArr: User[]= [{
    name:'dell',age:28
}]

// tuple special array data type sequence
const teacherInfo:[string,string,number] = ['dell','male',18];
// tuple deal csv
const teacherList:[string,string,number][] = [['dell','male',18],['dell','male',19]];


const arr:(number | string)[] = [1,'2',3]
const stringArr:string[] = ['a','b','c']
const undefinedArr:undefined[] = [undefined]


// interface type

interface Person{
    name:string
    age?:number
    [propName:string]:any

    say?:()=> string

}
interface SayHi {
    (word:string):string //method
}

interface Teacher extends Person{
    teach?:()=> string
}

const  getPersonName = (person:Person):void =>{
    console.log(person.name)
}
const  setPersonName = (person:Person,name:string):void =>{
    person.name = name
    console.log(person.name)
}
type Person1 = Person // type rename alias

const person:Person = {
    name:'dell'
}

getPersonName({
    name: 'dell',
    sex:'male',
    other:'data', //propName
    say:()=>{return 'name'}
})
setPersonName(person,'lee')

