var storage = /** @class */ (function () {
    function storage() {
        this.items = [];
    }
    storage.prototype.addItem = function (item) {
        this.items.push(item);
    };
    storage.prototype.getItem = function (index) {
        return this.items[index];
    };
    storage.prototype.updateItem = function (index, newItem) {
        if (index >= 0 && index < this.items.length) {
            this.items[index] = newItem;
        }
        else {
            console.log("Index out of range.");
        }
    };
    storage.prototype.clearStorage = function () {
        this.items = [];
    };
    storage.prototype.getAllItems = function () {
        return this.items;
    };
    return storage;
}());
var stringStorage = new storage();
stringStorage.addItem("apple");
stringStorage.addItem("Banana");
console.log(stringStorage.getItem(0));
var numberStorage = new storage();
numberStorage.addItem(10);
console.log(numberStorage.getAllItems());
var userStorage = new storage();
userStorage.addItem({ name: "Alice", age: 30 });
console.log(userStorage.getItem(0));
