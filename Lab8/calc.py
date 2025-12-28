import math
import struct

def calc_y(x: float) -> float:
    """Обчислення значення y = cos(x) / sin(x).
       math.sin(x) не повинен бути 0.
    """
    s = math.sin(x)
    if s == 0:
        raise ValueError("Ділення на нуль! sin(x)=0")
    return math.cos(x) / s

def save_text(filename: str, values: list[float]):
    """зберегти список чисел у текстовий файл"""
    with open(filename, "w", encoding="utf-8") as f:
        for v in values:
            f.write(f"{v}\n")

def load_text(filename: str) -> list[float]:
    """зчитати список чисел з текстового файлу"""
    res = []
    with open(filename, "r", encoding="utf-8") as f:
        for line in f:
            res.append(float(line.strip()))
    return res

def save_bin(filename: str, values: list[float]):
    """зберегти список чисел у двійковий файл (double = 8 байт)"""
    with open(filename, "wb") as f:
        for v in values:
            f.write(struct.pack("d", v))

def load_bin(filename: str) -> list[float]:
    """зчитати список чисел з двійкового файлу (double = 8 байт)"""
    res = []
    with open(filename, "rb") as f:
        data = f.read()
        
        for i in range(0, len(data), 8):
            (value,) = struct.unpack("d", data[i:i+8])
            res.append(value)
    return res
