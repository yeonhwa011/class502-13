package exam01;

public enum Transportation {
    BUS(1400) {
        @Override
        public int getTotal(int person) {
            return 0;
        }
    },
    TAXI(4500) {
        @Override
        public int getTotal(int person) {
            return 0;
        }
    },
    SUBWAY(1300) {
        @Override
        public int getTotal(int person) {
            return 0;
        }
    };

    private final int fare;

    Transportation(int fare) {
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }

    public abstract int getTotal(int person);
}