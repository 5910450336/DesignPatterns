package lab9.State;

public interface State {
    void insertCoin(int amount);
    void chooseDestination(String station);
    void getTicket();
}
