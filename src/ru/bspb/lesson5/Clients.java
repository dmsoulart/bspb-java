package ru.bspb.lesson5;

public class Clients {

    public static Client[] filterClientType(Client[] clientHolders, ClientType clientType) {
        int count = 0;
        for (Client clientHolder : clientHolders) {
            if (clientHolder.getClientType() == clientType) {
                count++;
            }
        }

        Client[] filteredClientHolder = new Client[count];

        int j = 0;

        for (Client clientHolder : clientHolders) {
            if (clientHolder.getClientType() == clientType) {
                filteredClientHolder[j] = clientHolder;
                j++;
            }
        }
        return filteredClientHolder;
    }

    public static Client[] filterClientGender(Client[] clientHolders, ClientGender clientGender) {
        int count = 0;
        for (Client clientHolder : clientHolders) {
            if (clientHolder.getClientGender() == clientGender) {
                count++;
            }
        }

        Client[] filteredClientHolder = new Client[count];

        int j = 0;

        for (Client clientHolder : clientHolders) {
            if (clientHolder.getClientGender() == clientGender) {
                filteredClientHolder[j] = clientHolder;
                j++;
            }
        }
        return filteredClientHolder;
    }

    public static Client[] filterDublicateByName(Client[] clientHolders){
        int count = 0;
        for (int i = 0; i < clientHolders.length; i++) {
            int k=0;
                for (int j = 0; j < clientHolders.length; j++) {
                    if (clientHolders[i].getClientName().equals(clientHolders[j].getClientName())) {
                        k++;
                    }
                }
                if(k==1){
                    count++;}
        }
        Client[] filteredClientHolder = new Client[count];

        int n=0;
        for (int i = 0; i < clientHolders.length; i++) {
            int k=0;
            for (int j = 0; j < clientHolders.length; j++) {
                if (clientHolders[i].getClientName().equals(clientHolders[j].getClientName())) {
                    k++;
                }
            }
            if(k==1){
                filteredClientHolder[n] = clientHolders[i];
                n++;
            }
        }
        return filteredClientHolder;
    }

    public static Client[] sortingByClientAge(Client[] clientHolders){

                for(int i = clientHolders.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( clientHolders[j].getClientAge() > clientHolders[j+1].getClientAge() ){
                    Client sortedClientHolder = clientHolders[j];
                    clientHolders[j] = clientHolders[j+1];
                    clientHolders[j+1] = sortedClientHolder;
                }
            }
        }
        return clientHolders;
    }
//    public static void anketasort(Anketa[] arr){
//        for(int i = arr.length-1 ; i > 0 ; i--){
//            for(int j = 0 ; j < i ; j++){
//                if( arr[j].age > arr[j+1].age ){
//                    Anketa tmpA = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmpA;
//                }
//            }
//        }
//    }
}
