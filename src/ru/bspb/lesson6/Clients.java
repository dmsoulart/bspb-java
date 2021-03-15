package ru.bspb.lesson6;

import java.util.List;

public class Clients {

    public static List<Client> filterClientType(List<Client> clientHolders, ClientType clientType) {
        for (int i = 0; i < clientHolders.size(); i++) {
            if (clientHolders.get(i).clientType!=clientType) {
                clientHolders.remove(i);
                i--;
            }
        }return clientHolders;
    }

    public static List<Client> filterClientGender(List<Client> clientHolders, ClientGender clientGender) {
        for (int i = 0; i < clientHolders.size(); i++) {
            if (clientHolders.get(i).getClientGender()!=clientGender) {
                clientHolders.remove(i);
                i--;
            }
        }return clientHolders;
    }

//    public static Client[] filterDublicateByName(Client[] clientHolders){
//        int count = 0;
//        for (int i = 0; i < clientHolders.length; i++) {
//            int k=0;
//                for (int j = 0; j < clientHolders.length; j++) {
//                    if (clientHolders[i].getClientName().equals(clientHolders[j].getClientName())) {
//                        k++;
//                    }
//                }
//                if(k==1){
//                    count++;}
//        }
//        Client[] filteredClientHolder = new Client[count];
//
//        int n=0;
//        for (int i = 0; i < clientHolders.length; i++) {
//            int k=0;
//            for (int j = 0; j < clientHolders.length; j++) {
//                if (clientHolders[i].getClientName().equals(clientHolders[j].getClientName())) {
//                    k++;
//                }
//            }
//            if(k==1){
//                filteredClientHolder[n] = clientHolders[i];
//                n++;
//            }
//        }
//        return filteredClientHolder;
//    }

}
