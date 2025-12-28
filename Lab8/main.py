from calc import calc_y, save_text, save_bin, load_text, load_bin

if __name__ == "__main__":
    x = float(input("Введіть x: "))
    y = calc_y(x)
    print("y = ", y)

    save_text("result.txt", [y])
    save_bin("result.bin", [y])

    print("\nзбережено результат у result.txt та result.bin")

    print("прочитано з текстового:", load_text("result.txt"))
    print("прочитано з бінарного:", load_bin("result.bin"))
