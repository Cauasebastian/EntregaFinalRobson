class ShellSort {

    public static void ordenarPorMatricula(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        int h = 1;

        while (h < n / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                if (funcionarios[i] != null) {
                    int j = i;
                    while (j >= h && funcionarios[j - h] != null
                            && funcionarios[j].getCod() < funcionarios[j - h].getCod()) {
                        trocar(funcionarios, j, j - h);
                        j -= h;
                    }
                }
            }
            h = h / 3;
        }
    }

    public static void ordenarPorNome(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        int h = 1;

        while (h < n / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                if (funcionarios[i] != null) {
                    int j = i;
                    while (j >= h && funcionarios[j - h] != null
                            && funcionarios[j].getNome().compareTo(funcionarios[j - h].getNome()) < 0) {
                        trocar(funcionarios, j, j - h);
                        j -= h;
                    }
                }
            }
            h = h / 3;
        }
    }

    private static void trocar(Funcionario[] funcionarios, int i, int j) {
        Funcionario temp = funcionarios[i];
        funcionarios[i] = funcionarios[j];
        funcionarios[j] = temp;
    }
}