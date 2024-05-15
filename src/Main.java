public class Main {

    private static final Employee[] vaultWorkers = new Employee[10];

    public static void main(String[] args) {

        vaultWorkers[0] = new Employee("Жукова Милослава Кирилловна", 1, 53200);
        vaultWorkers[1] = new Employee("Прокофьев Андрей Иванович", 1, 48900);
        vaultWorkers[2] = new Employee("Осипов Илья Данилович", 2, 81348);
        vaultWorkers[3] = new Employee("Никитин Демьян Миронович", 2, 38944);
        vaultWorkers[4] = new Employee("Никонова Диана Всеволодовна", 3, 47591);
        vaultWorkers[5] = new Employee("Соболева Полина Вадимовна", 3, 58966);
        vaultWorkers[6] = new Employee("Матвеева Анастасия Германовна", 4, 98465);
        vaultWorkers[7] = new Employee("Воронин Никита Платонович", 4, 71249);
        vaultWorkers[8] = new Employee("Петрова Майя Марковна", 5, 72468);
        vaultWorkers[9] = new Employee("Александров Иван Радионович", 5, 68973);

        allPrint();

        System.out.println("\n«Сумма затрат на заработную плату в месяц равняется - " + sumSalary() + " рублей».");

        System.out.println("\n«Сотрудник с минимальной зарплатой - " + workerMinSalary() + "»");

        System.out.println("\n«Сотрудник с наивысшей зарплатой - " + workerMaxSalary() + "»");

        System.out.println("\n«Средняя заработная плата по всем отделам - " + averageSalary() + "»");

        allFullNamePrint();
    }

    public static void allPrint() {
        System.out.println();
        for (Employee vaultWorkers : vaultWorkers) {
            System.out.println(vaultWorkers);
        }
    }

    public static int sumSalary() {
        int sumSalary = vaultWorkers[0].getSalary();
        for (int i = 1; i < vaultWorkers.length; i++) {
            sumSalary = sumSalary + vaultWorkers[i].getSalary();
        }
        return sumSalary;
    }

    public static Employee workerMinSalary() {
        Employee workerMinSalary = vaultWorkers[0];
        for (Employee vaultWorker : vaultWorkers) {
            if (vaultWorker.getSalary() < workerMinSalary.getSalary()) {
                workerMinSalary = vaultWorker;
            }
        }
        return workerMinSalary;
    }

    public static Employee workerMaxSalary() {
        Employee workerMaxSalary = vaultWorkers[0];
        for (Employee vaultWorker : vaultWorkers) {
            if (vaultWorker.getSalary() > workerMaxSalary.getSalary()) {
                workerMaxSalary = vaultWorker;
            }
        }
        return workerMaxSalary;
    }

    public static double averageSalary() {
        double averageSalary = vaultWorkers[0].getSalary();
        for (int i = 1; i < vaultWorkers.length; i++) {
            averageSalary = averageSalary + vaultWorkers[i].getSalary();
        }
        return averageSalary / vaultWorkers.length;
    }

    public static void allFullNamePrint() {
        System.out.println("\nФИО сотрудников:");
        for (Employee vaultWorkers : vaultWorkers) {
            System.out.println("«" + vaultWorkers.getFullName() + "»");
        }
    }
}