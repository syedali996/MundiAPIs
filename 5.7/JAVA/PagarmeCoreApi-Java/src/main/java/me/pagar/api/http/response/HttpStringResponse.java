/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.http.response;

import java.io.InputStream;
import me.pagar.api.http.Headers;

/**
 * Class to hold response body as string.
 */
public class HttpStringResponse extends HttpResponse {

    /**
     * Initialization constructor.
     * @param code    The HTTP status code
     * @param headers The HTTP headers read from response
     * @param rawBody The raw data returned in the HTTP response
     * @param body String response body
     */
    public HttpStringResponse(int code, Headers headers, InputStream rawBody, String body) {
        super(code, headers, rawBody, body);
    }

    /**
     * Converts this HttpStringResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HttpStringResponse [statusCode=" + getStatusCode() + ", headers=" + getHeaders()
                + ", body=" + getBody() + "]";
    }
}
