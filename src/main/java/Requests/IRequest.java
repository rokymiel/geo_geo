package Requests;

import java.io.IOException;
import java.io.InputStream;

public interface IRequest {
    InputStream getRequest() throws IOException;
}
