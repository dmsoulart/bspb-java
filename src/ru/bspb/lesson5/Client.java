package ru.bspb.lesson5;

import java.util.Objects;

public abstract class Client {
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

    public abstract ClientGender getClientGender();
}