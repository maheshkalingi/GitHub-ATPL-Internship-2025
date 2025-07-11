class storage<T>{
   private items:T[]=[];

 addItem(item:T):void{
    this.items.push(item);
 }
getItem(index:number):T{
     return this.items[index];
}
updateItem(index:number,newItem:T){
 if (index >= 0 && index < this.items.length) {
  this.items[index] = newItem;
 }  else {
      console.log("Index out of range.");
    }
}
clearStorage():void {
    this.items = [];
  }

   getAllItems(): T[] {
    return this.items;
  }
}

const stringStorage=new storage<string>();
stringStorage.addItem("apple");
stringStorage.addItem("Banana");
console.log(stringStorage.getItem(0)); 
const numberStorage = new storage<number>();
numberStorage.addItem(10);
console.log(numberStorage.getAllItems());
type user = { name: string; age: number };
const userStorage = new storage<user>();
userStorage.addItem({ name: "Alice", age: 30 });
console.log(userStorage.getItem(0)); 