# Singleton

Singleton pattern makes sure that whenever there's an object being created or instantiated, it returns only **one** instance of itself. In the first call, it will create an object since it does not exist, and then next times, it will forward the created instance instead of creating another.

It is important to make sure you make the consttuctor `private` to enforce using `getInstance()`.

## How to Run

![RunSingleton](https://i.imgur.com/N2oqnRL.png)

## Code

![SingletonCode](https://i.imgur.com/7uIzisd.png)
