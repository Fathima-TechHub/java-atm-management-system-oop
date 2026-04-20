public class Card {
private String cardNumber;
private int pin;
 public Card(String cardNumber, int pin) {
    this.cardNumber = cardNumber;
    this.pin = pin;
 }
public boolean validatePIN(int enteredPin) {
    return enteredPin == pin; 
}
public void showCard() {
    System.out.println("Card Number:" + cardNumber);
}

public static void main(String[] args) {
    Card myCard = new Card("12345-6788-9999", 1234);
    myCard.showCard();
    myCard.validatePIN(1234);
    myCard.validatePIN(1111);
}
}