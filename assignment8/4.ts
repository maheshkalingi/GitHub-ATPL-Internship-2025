class Person {
  public name: string;
  private age: number;
  protected gender: string;

  constructor(name: string, age: number, gender: string) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  public getAge(): number {
    return this.age;
  }
  public getGender(): string {
    return this.gender;
  }
  public printDetails(): void {
    console.log(`Name: ${this.name}`);
    console.log(`Age: ${this.getAge()}`);
    console.log(`Gender: ${this.getGender()}`);
  }
}
const person = new Person('Alice', 28, 'Female');
person.printDetails();
