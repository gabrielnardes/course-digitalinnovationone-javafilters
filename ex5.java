import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GincanaAcampamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int qntAlunos = Integer.parseInt(sc.nextLine());
        boolean fimDosTestes = qntAlunos == 0 ? true : false;
        
        while (!fimDosTestes) {
            List<Aluno> alunos = new ArrayList<>();
            
            for (int i = 0; i < qntAlunos; i++) {
                String aluno = sc.next();
                int valor = sc.nextInt();
                sc.nextLine();
                
                alunos.add(new Aluno(aluno, valor));
            }
        
            int alunoAtual = 0;
            int fichaAtual = alunos.get(alunoAtual).ficha;
            int alunoEliminado;
            
            while (alunos.size() > 1) {
                int resto = fichaAtual % alunos.size();
    
                if (fichaAtual % 2 == 0) {
                    alunoEliminado = alunoAtual - resto;
                    
                    if (alunoEliminado < 0) {
                        alunoEliminado = alunoEliminado + alunos.size();
                    }  
                } else {
                    alunoEliminado = alunoAtual + resto;
                    
                    if (alunoEliminado >= alunos.size()) {
                        alunoEliminado = alunoEliminado - alunos.size();
                    }
                }

                fichaAtual = alunos.get(alunoEliminado).ficha;
                alunos.remove(alunoEliminado); 
    
                if (fichaAtual % 2 == 0)  {
                    alunoAtual = alunoEliminado; 
                    
                    if (alunoAtual >= alunos.size()) {
                      alunoAtual = 0;
                    }

                } else { 
                    alunoAtual = alunoEliminado - 1; 
                    
                    if (alunoAtual < 0) {
                      alunoAtual = alunos.size() - 1;
                    }
                }
            }
    
            System.out.println("Vencedor(a): " + alunos.get(0).nome);
            
            qntAlunos = Integer.parseInt(sc.nextLine());
            fimDosTestes = qntAlunos == 0 ? true : false;
        }
    }
}

class Aluno {
    String nome;
    int ficha;
    
    public Aluno(String nome, int ficha) {
        this.nome = nome;
        this.ficha = ficha;
    }
    
    @Override
    public String toString() {
        return nome + "-" + ficha;
    }
}
