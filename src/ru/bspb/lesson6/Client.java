package ru.bspb.lesson6;

import java.util.Comparator;
import java.util.Objects;

public abstract class Client implements Comparable<Client>{
    protected ClientType clientType;
    protected String clientName;
    protected int clientAge;

    public Client() {
    }

    public Client(ClientType clientType, String clientName, int clientAge) {
        this.clientType = clientType;
        this.clientName = clientName;
        this.clientAge = clientAge;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public String getClientName() {
        return clientName;
    }

    public int getClientAge() {
        return clientAge;
    }

    public abstract ClientGender getClientGender();

    @Override
    public int compareTo (Client orderClient){
        return this.getClientAge()-orderClient.getClientAge();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(clientName, client.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName);
    }



//    public static final Comparator<Client> clientComparator = new Comparator<Client>() {
//        @Override
//        public int compare(Client o1, Client o2) {
//            return o1.getClientAge()-o2.getClientAge();
//        }
//    };

}