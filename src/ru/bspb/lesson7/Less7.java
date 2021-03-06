package ru.bspb.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class Less7 {
    public static void main(String[] args) {

        List<Client> clientBases = new ArrayList<>();
        clientBases.add(new ClientFL(ClientType.FL, "Jone", 21, ClientGender.MALE));
        clientBases.add(new ClientIP(ClientType.IP, "Dan", 18, 12345));
        clientBases.add(new ClientIP(ClientType.IP, "Peter", 52, 56789));
        clientBases.add(new ClientFL(ClientType.FL, "Jone", 18, ClientGender.MALE));
        clientBases.add(new ClientFL(ClientType.FL, "Mike", 33, ClientGender.MALE));
        clientBases.add(new ClientFL(ClientType.FL, "Kate", 28, ClientGender.FEMALE));
        clientBases.add(new ClientIP(ClientType.IP, "Peter", 44, 26532));
        clientBases.add(new ClientFL(ClientType.FL, "Den", 31, ClientGender.MALE));
        clientBases.add(new ClientFL(ClientType.FL, "Dave", 19, ClientGender.MALE));
        clientBases.add(new ClientIP(ClientType.IP, "Patrik", 62, 42516));
        clientBases.add(new ClientFL(ClientType.FL, "Sten", 21, ClientGender.MALE));
        clientBases.add(new ClientFL(ClientType.FL, "Barbara", 36, ClientGender.FEMALE));
        clientBases.add(new ClientIP(ClientType.IP, "Ben", 42, 16532));

 //       List<Client> clientBasesFL = new ArrayList<>();
  //      clientBasesFL.addAll(clientBases);

//        List<Client> clientBasesIP = new ArrayList<>();
//        clientBasesIP.addAll(clientBases);

        // выборка по клиентам ФЛ, только male, удаление дубликатов и сортировка по возрасту
        out.println("ClientFL");
        List<Client> clientBasesFL = clientBases.stream()
                .filter(client -> client.getClientType().equals(ClientType.FL))
                .filter(client -> client.getClientGender().equals(ClientGender.MALE))
                .sorted(Comparator.comparing(Client::getClientAge))
                .distinct().collect(Collectors.toList());
        clientBasesFL.forEach (out::println);

        // выборка по клиентам ИП, удаление дубликатов и сортировка по возрасту
        out.println("ClientIP");
        List<Client> clientBasesIP = clientBases.stream()
                .filter(client -> client.getClientType().equals(ClientType.IP))
                .sorted(Comparator.comparing(Client::getClientAge))
                .distinct().collect(Collectors.toList());
        clientBasesIP.forEach(out::println);

//        clientBasesFL = Clients.filterClientType(clientBasesFL, ClientType.FL);
//        clientBasesFL = Clients.filterClientGender(clientBasesFL, ClientGender.MALE);
//        clientBasesFL = clientBasesFL.stream().distinct().collect(Collectors.toList());
        //        Collections.sort(clientBasesFL,Client.clientComparator);
//        Collections.sort(clientBasesFL);
//        out.println("ClientFL");
//        for (Client client : clientBasesFL) {
//            out.println(client);
//        }

        // выборка по клиентам ИП, удаление дубликатов и сортировка по возрасту

//        clientBasesIP = Clients.filterClientType(clientBasesIP, ClientType.IP);
//        clientBasesIP = clientBasesIP.stream().distinct().collect(Collectors.toList());
//        Collections.sort(clientBasesIP);
//        System.out.println("ClientIP");
//        for (Client client : clientBasesIP) {
//            System.out.println(client);
//        }
    }
}
