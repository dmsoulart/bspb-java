package ru.bspb.lesson7;

public class ClientFL extends Client {
    private ClientGender clientGender;

    public ClientFL(ClientType clientType, String clientName, int clientAge, ClientGender clientGender) {
        super(clientType, clientName, clientAge);
        this.clientGender = clientGender;
    }

    @Override
    public ClientGender getClientGender() {
        return clientGender;
    }

    @Override
    public String toString() {
        return "{" +
                "clientType=" + clientType +
                ", clientName='" + clientName + '\'' +
                ", clientAge=" + clientAge +
                ", clientGender=" + clientGender +
                '}';
    }

}
