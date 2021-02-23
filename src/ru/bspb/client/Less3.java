package ru.bspb.client;

import java.util.Arrays;

class Less2 {
    public static void main(String[] args) {
        Client[] clients = new Client[]{
                new Client("Jone", "m", 42),
                new Client("Mike", "m", 18),
                new Client("Kate", "f", 25),
                new Client("Den", "m", 36),
                new Client("Eve", "f", 33),
                new Client("Stive", "m", 28),
                new Client("Mila", "f", 66),
                new Client("Barbara", "f", 44),
                new Client("Den", "m", 52),
                new Client("Piter", "m", 23)
        };

        Clientsort(clients);

        for (int i = 0; i < clients.length; i++) {
            if (clients[i].sex.equals("m")) {
                    System.out.println(clients[i]);
            }
        }
    }

    public static void Clientsort(Client[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j].age > arr[j+1].age ){
                    Client tmpA = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmpA;
                }
            }
        }
    }
}