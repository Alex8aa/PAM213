import tkinter as tk
import math

class Ventana(tk.Canvas):
    def __init__(self, master=None):
        super().__init__(master, width=600, height=600, bg="#87CEEB")  # azul cielo
        self.pack()
        self.dibujar_figuras()
        self.create_text(300, 100, text="Te amo <3", fill="red", font=("Serif", 36, "bold"))

    def dibujar_figuras(self):
        # Dibujar varias figuras
        self.dibujar_figura(120, 300, 50)
        self.dibujar_figura(280, 350, 60)
        self.dibujar_figura(450, 280, 45)
        self.dibujar_figura(370, 420, 55)

    def dibujar_figura(self, x, y, tamaño):
        # Parte central vertical
        self.create_rectangle(x - 5, y, x + 5, y + 120, fill="#228B22", outline="")  # verde fuerte

        # Lados
        self.create_oval(x - 30, y + 50, x + 10, y + 70, fill="#32CD32", outline="")  # hoja izquierda
        self.create_oval(x - 10, y + 80, x + 30, y + 100, fill="#32CD32", outline="")  # hoja derecha

        # Formas alrededor (pétalos)
        piezas = 12
        radio = tamaño
        for i in range(piezas):
            angulo = 2 * math.pi * i / piezas
            px = int(x + math.cos(angulo) * radio)
            py = int(y + math.sin(angulo) * radio)
            self.create_oval(px - tamaño // 2, py - tamaño // 2,
                             px + tamaño // 2, py + tamaño // 2,
                             fill="yellow", outline="")

        # Parte central
        self.create_oval(x - tamaño // 2, y - tamaño // 2,
                         x + tamaño // 2, y + tamaño // 2,
                         fill="orange", outline="#8B4513")  # contorno marrón


# Crear ventana principal
root = tk.Tk()
root.title("Sorpresa Bonita")

ventana = Ventana(root)

root.mainloop()
