# Trabalhando com Arquivos no Java

Este repositório é um guia rápido para manipulação de arquivos em Java. Aqui você encontrará exemplos práticos de leitura, escrita e outras operações comuns.
Leitura de Arquivos - Usando FileInputStream e BufferedReader:


    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;

    public class LerArquivo {
    public static void main(String[] args) {
          try (BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"))) {
              String linha;
              while ((linha = br.readLine()) != null) {
                  System.out.println(linha);
              }
          } catch (IOException e) {
              System.out.println("Erro ao ler o arquivo: " + e.getMessage());
          }
      }
    }
***
## Escrita em Arquivos
Usando FileOutputStream e BufferedWriter


    import java.io.BufferedWriter;
    import java.io.FileWriter;
    import java.io.IOException;

    public class EscreverArquivo {
        public static void main(String[] args) {
              try (BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo.txt"))) {
                  bw.write("Olá, mundo!");
                  bw.newLine();
                  bw.write("Segunda linha.");
              } catch (IOException e) {
               System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
    }

Try-with-Resources

A partir do Java 7, use try-with-resources para garantir que os recursos sejam fechados automaticamente.
java


    try (BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"))) {
        String linha;
       while ((linha = br.readLine()) != null) {
        System.out.println(linha);
        }
      } catch (IOException e) {
        System.out.println("Erro: " + e.getMessage());
      }

## Operações Comuns

### Verificar se um arquivo existe:
  

    File arquivo = new File("arquivo.txt");
    if (arquivo.exists()) {
        System.out.println("O arquivo existe!");
    }

    Criar um arquivo:
    java
    Copy

    File arquivo = new File("novo_arquivo.txt");
    if (arquivo.createNewFile()) {
        System.out.println("Arquivo criado com sucesso!");
    }

    Excluir um arquivo:
    java
    Copy

    File arquivo = new File("arquivo.txt");
    if (arquivo.delete()) {
        System.out.println("Arquivo excluído com sucesso!");
    }
