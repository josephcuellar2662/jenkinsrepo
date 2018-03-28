package Filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CORSFilter implements javax.servlet.Filter {

    public void destroy() {
        // TODO Auto-generated method stub

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        resp.setHeader("Access-Control-Allow-Origin","*");
        resp.setHeader("Access-Control-Methods","GET, POST, PUT, DELETE");
        resp.setHeader("Access-Control-Allow-Headers","Content-Type");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub

    }

}
