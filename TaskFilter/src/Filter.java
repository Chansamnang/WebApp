import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "Filter")
public class Filter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String option = req.getParameter("option");
        if (option.equals("admin") || option.equals("supervisor")){
            chain.doFilter(req, resp);
        } else{
            req.getRequestDispatcher("Error.jsp").forward(req,resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }
}
