package emg.demo.webapp.servlet;


import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertTrue;

public class HelloServletTest extends Mockito {
    @Test
    public void testServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        when(request.getParameter("user")).thenReturn("Edison");
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        new HelloServlet().doGet(request, response);

        verify(request, atLeast(1)).getParameter("user");
        writer.flush();
        final String result = stringWriter.toString();
        stringWriter.close();
        writer.close();
        assertTrue(result.contains("hello Edison from servlet!"));
    }
}