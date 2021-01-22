package Requests;

import java.io.IOException;
import java.util.Optional;

public interface IRequestSender {
    String sendRequest() throws IOException;
}
