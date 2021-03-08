package ru.bspb.lesson5;

import java.util.Arrays;

public class Less5 {
    public static void main(String[] args) {
        Client[] clientBase = {
                new ClientFL(ClientType.FL, "Jone", 21, ClientGender.MALE),
                new ClientIP(ClientType.IP, "Dan", 18, 12345),
                new ClientIP(ClientType.IP, "Peter", 52, 56789),
                new ClientFL(ClientType.FL, "Jone", 18, ClientGender.MALE),
                new ClientFL(ClientType.FL, "Mike", 33, ClientGender.MALE),
                new ClientFL(ClientType.FL, "Kate", 28, ClientGender.FEMALE),
                new ClientIP(ClientType.IP, "Peter", 44, 26532),
                new ClientFL(ClientType.FL, "Den", 31, ClientGender.MALE),
                new ClientFL(ClientType.FL, "Dave", 19, ClientGender.MALE),
                new ClientIP(ClientType.IP, "Patrik", 62, 42516),
                new ClientFL(ClientType.FL, "Sten", 21, ClientGender.MALE),
                new ClientFL(ClientType.FL, "Barbara", 36, ClientGender.FEMALE),
                new ClientIP(ClientType.IP, "Ben", 42, 16532),
        };

        Client[] clientBaseFL = Clients.filterClientType(clientBase, ClientType.FL);
        Client[] clientBaseFLMale = Clients.filterClientGender(clientBaseFL,ClientGender.MALE);
        Client[] clientBaseFLMaleNotDublicate = Clients.filterDublicateByName(clientBaseFLMale);
        Client[] clientBaseFLMaleNotDublicateSortedByClientAge = Clients.sortingByClientAge(clientBaseFLMaleNotDublicate);
        System.out.println("ClientFL");
        for (Client client : clientBaseFLMaleNotDublicateSortedByClientAge) {
            System.out.println(client);
        }

        Client[] clientBaseIP = Clients.filterClientType(clientBase, ClientType.IP);
        Client[] clientBaseIPNotDublicate = Clients.filterDublicateByName(clientBaseIP);
        Client[] clientBaseIPNotDublicateSortedByClientAge = Clients.sortingByClientAge(clientBaseIPNotDublicate);
        System.out.println("ClientIP");
        for (Client client : clientBaseIPNotDublicateSortedByClientAge) {
            System.out.println(client);
        }
    }
}
