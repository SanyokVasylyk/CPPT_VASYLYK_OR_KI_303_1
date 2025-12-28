def main():
  
    n = int(input("Введіть розмір квадратної матриці: "))
    
    if n % 2 == 0:
        n = n + 1

    filler = input("\nВведіть символ-заповнювач: ")

    if len(filler) != 1:
        print("Потрібно ввести рівно 1 символ!")
        return

    symbol = filler[0]

    arr = [[' ' for _ in range(n)] for _ in range(n)]

    mid = n // 2
    height = (n + 1) // 2  
    start_row = n - height  
    for i in range(start_row, n):
        k = i - start_row  
        left = max(0, mid - k)  
        right = min(n - 1, mid + k)  
        for j in range(left, right + 1):
            arr[i][j] = symbol 

            number = 4

            for i in range (start_row, n):
                
                up = (0,0)
                down = (n,n)
                for j in range (up, down):
                    arr[i][j] = number


    with open("MyFile.txt", "w", encoding="utf-8") as fout:
        for i in range(n):
            print(" ".join(arr[i]))
            fout.write(" ".join(arr[i]) + "\n")

if __name__ == "__main__":
    main()