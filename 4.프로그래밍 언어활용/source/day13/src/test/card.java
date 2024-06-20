package test;

public class card {

        private int cardNumber;
        private static int serialNum = 10000;

        card() {
            serialNum++;
            cardNumber = serialNum;
        }

        public int getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(int cardNumber) {
            this.cardNumber = cardNumber;
        }


    }
