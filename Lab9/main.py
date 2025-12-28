from animals.cat_base import Cat
from animals.cat_research import ExperimentalCat

def main():
    print("--- Створення звичайного кота ---")
    simple_cat = Cat("Мурчик", 3, "Британець")
    print(simple_cat.get_info())
    simple_cat.make_sound()
    simple_cat.eat("рибу")

    print("\n--- Створення піддослідного кота ---")
    test_subject = ExperimentalCat(
        name="Барсик", 
        age=5, 
        breed="Сіамський", 
        experiment_id="EXP-007", 
        danger_level="Високий"
    )

    print(test_subject.get_info())
    test_subject.eat("спеціальний корм")
    test_subject.perform_test("Реакція на лазер")
    test_subject.sedate()
    test_subject.perform_test("Стрибки")

if __name__ == "__main__":
    main()