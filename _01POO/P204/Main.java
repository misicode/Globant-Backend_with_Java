package _01POO.P204;

import _01POO.P204.entities.Document;
import _01POO.P204.services.DocumentService;

public class Main {
    public static void main(String[] args) {
        DocumentService documentService = new DocumentService();
        Document document = documentService.createDocument();

        System.out.println(document);
    }
}