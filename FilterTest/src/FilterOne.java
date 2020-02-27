import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FilterOne")
public class FilterOne implements Filter {
    public void destroy() {
        System.out.println("Servlet Destroy..");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Before Filter chaining Filter One...");
        chain.doFilter(req, resp);
        System.out.println("After Filter Chaining Filter One");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Filter One Created...");
    }

}
