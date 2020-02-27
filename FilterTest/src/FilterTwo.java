import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FilterTwo")
public class FilterTwo implements Filter {
    public void destroy() {
        System.out.println("Filter two Destroy....");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Before doFilter in Filter Two");
        chain.doFilter(req, resp);
        System.out.println("After doFilter in Filter Two");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Filter Two...");
    }

}
