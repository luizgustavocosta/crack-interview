package guga.design_patterns;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SingletonTest {


    @Test
    public void
    createAllInstanceAsSingleton() {
        final List<Singleton.Wallet> wallets = Arrays.asList(
                Singleton.getWalletInstance(),
                Singleton.getWalletInstance(),
                Singleton.getWalletInstance());

        List<Singleton.Wallet> otherWallets = IntStream.rangeClosed(1, 3).boxed()
                .map(index -> Singleton.getWalletInstance())
                .flatMap(Stream::of)
                .collect(Collectors.toList());

        assertEquals(wallets, otherWallets);

    }

}