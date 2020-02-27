import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter")
public class Filter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String currency = req.getParameter("currency");
        String usd = req.getParameter("usd");
        int result = 0;
        if(currency.equals("KHR")){
            result = Integer.parseInt(usd) * 4000;
            req.setAttribute("currency", result);
            chain.doFilter(req, resp);
        } else if (currency.equals("YUAN")){
            result = Integer.parseInt(usd) * 7;
            req.setAttribute("currency", result);
            chain.doFilter(req,resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
