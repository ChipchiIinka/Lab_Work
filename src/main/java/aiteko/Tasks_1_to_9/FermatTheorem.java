package aiteko.Tasks_1_to_9;

public class FermatTheorem implements CanRun {
    private int n; //Степень чисел
    private int range = 100; //Диапазон для поиска решений
    private boolean IsSolutionTrue;

    @Override
    public void run() {
        System.out.println("Задание №4");

        System.out.println("Решения для n = 2: ");
        FindResultForNisTwo(range);

        for (int n = 3; n <= range; n++) {
            IsSolutionTrue = checkFermatTheorem(n);
            if (!IsSolutionTrue) {
                System.out.printf("Теорема неверна. Для n = %d есть решение!\n", n);
            }
        }
        if (IsSolutionTrue) {
            System.out.println("Теорема Ферма верна." +
                    " Для чисел в диапазоне от 1 до 100 и n > 2 - нет решений.");
        }
        System.out.println();
    }

    private void FindResultForNisTwo(int range) {  //проверка работы теоремы ферма при n=2
        for (int a = 1; a <= range; a++) {
            for (int b = 1; b <= range; b++) {
                for (int c = 1; c <= range; c++) {
                    if ((a * a) + (b * b) == (c * c)) {
                        System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
                    }
                }
            }
        }
    }
    private boolean checkFermatTheorem(int n) {
        for (int a = 1; a <= range; a++) {
            for (int b = 1; b <= range; b++) {
                for (int c = 1; c <= range; c++) {
                    if ((Math.pow(a, this.n)) + (Math.pow(b, this.n)) == (Math.pow(c, this.n))) {
                        return false; // Найдено решение - в теории никогда не должно быть найдено
                    }
                }
            }
        }
        return true; // Решения ненайдено
    }
}






