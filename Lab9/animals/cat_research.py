from .cat_base import Cat  

class ExperimentalCat(Cat):
    def __init__(self, name: str, age: int, breed: str, experiment_id: str, danger_level: str):
        """
        Ініціалізація піддослідного кота.
        Додаються параметри experiment_id та danger_level.
        """

        super().__init__(name, age, breed)
        self.experiment_id = experiment_id
        self.danger_level = danger_level
        self.is_sedated = False

    def perform_test(self, test_name: str):
        """Специфічний метод для піддослідного кота"""
        if self.is_sedated:
            print(f"Тест '{test_name}' неможливий. Об'єкт {self.name} спить.")
        else:
            print(f"Проводиться тест '{test_name}' над об'єктом {self.experiment_id} ({self.name})...")

    def sedate(self):
        """Ввести заспокійливе"""
        self.is_sedated = True
        print(f"Кіт {self.name} отримав заспокійливе і засинає.")

    def get_info(self) -> str:
        base_info = super().get_info()
        return f"{base_info} | ID Експерименту: {self.experiment_id} | Рівень небезпеки: {self.danger_level}"