package guga.design_patterns;

import static java.util.Objects.isNull;

public class Singleton {

    private static Wallet instance = null;

    private Singleton() {
    }

    public static synchronized Wallet getWalletInstance() {
        if (isNull(instance)) {
            instance = new Wallet();
        }
        return instance;
    }

    public static class Wallet {

        private Wallet() {

        }
    }
}
