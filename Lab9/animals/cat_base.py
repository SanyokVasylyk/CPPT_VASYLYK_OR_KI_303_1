class Cat:
    def __init__(self, name: str, age: int, breed: str):
        """
        Ініціалізація базового кота.
        :param name: Ім'я кота
        :param age: Вік кота
        :param breed: Порода
        """
        self.name = name
        self.age = age
        self.breed = breed

    def make_sound(self):
        """Метод подачі голосу"""
        print(f"{self.name} каже: Мяу!")

    def eat(self, food: str):
        """Метод годування"""
        print(f"{self.name} їсть {food}.")

    def get_info(self) -> str:
        """Повертає рядок з інформацією про кота"""
        return f"Кіт: {self.name}, Вік: {self.age}, Порода: {self.breed}"