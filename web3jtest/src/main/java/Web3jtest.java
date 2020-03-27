import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

public class Web3jtest {

    public static void main(String[] args) throws Exception {

        Web3j web3j = Web3j.build(new HttpService("https://core.bloxberg.org"));

        Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
        String clientVersion = web3ClientVersion.getWeb3ClientVersion();

        System.out.println(clientVersion);
    }

}
