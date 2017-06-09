package pivx.org.pivxwallet.module;

import java.io.File;

/**
 * Created by mati on 18/04/17.
 */

public interface PivxModule {

    /**
     * ...
     */
    void createWallet();

    /**
     *
     *
     * @param backupFile
     * @param password
     */
    void restoreWallet(File backupFile, String password);

    /**
     * If the wallet already exist
     * @return
     */
    boolean isWalletCreated();

    /**
     * Return a new address.
     */
    String freshNewAddress();

    boolean isAddressUsed(String address);
}
