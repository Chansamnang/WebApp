import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "Filter")
public class Filter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        try{
            HttpServletRequest hr = (HttpServletRequest) req;
            HttpSession hs = hr.getSession();
            boolean flag = (boolean) hs.getAttribute("flag");
            if(flag){
                chain.doFilter(req,resp);
            }
        } catch (Exception e){
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.forward(req,resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
