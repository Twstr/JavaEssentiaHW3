package DocumentWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userKey;
        int proKey = 1111;
        int expKey = 2222;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product's key");
        userKey = sc.nextInt();

        if (userKey == proKey) {
            DocumentWorker documentWorker = new ProDocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        } else if (userKey == expKey) {
            DocumentWorker documentWorker = new ExpertDocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        } else {
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }
    }
}
