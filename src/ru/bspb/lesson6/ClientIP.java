package ru.bspb.lesson6;

public class ClientIP extends Client {
    private int clientOGRN;

    public ClientIP(ClientType clientType, String clientName, int clientAge, int clientOGRN) {
        super(clientType, clientName, clientAge);
        this.clientOGRN = clientOGRN;
    }

    @Override
    public ClientGender getClientGender() {
        return null;
    }

    @Override
    public String toString() {
        return "{" +
                "clientType=" + clientType +
                ", clientName='" + clientName + '\'' +
                ", clientAge=" + clientAge +
                ", clientOGRN=" + clientOGRN +
                '}';
    }
}