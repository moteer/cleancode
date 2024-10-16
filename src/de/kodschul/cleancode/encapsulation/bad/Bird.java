package de.kodschul.cleancode.encapsulation.bad;

class Bird {
    private static final int EUROPEAN = 0;
    private static final int AFRICAN = 1;
    private static final int NORWEGIAN_BLUE = 2;

    private int numberOfCoconuts;
    private Object voltage;
    private boolean isNailed;

    //


    double getSpeed(int type) {
        switch (type) {
            case EUROPEAN -> {
                return getBaseSpeed(voltage);
            }
            case AFRICAN -> {
                return getBaseSpeed(voltage) - getLoadFactor() * numberOfCoconuts;
            }
            case NORWEGIAN_BLUE -> {
                return (isNailed) ? 0 : getBaseSpeed(voltage);
            }
        }
        throw new RuntimeException("Should be unreachable");
    }

    private int getLoadFactor() {
        // TODO Auto-generated method stub
        return 0;
    }

    private double getBaseSpeed(Object voltage2) {
        // TODO Auto-generated method stub
        return 0;
    }
}
