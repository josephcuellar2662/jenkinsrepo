package Servlets;

import HandlerMapper.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class MasterServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        String conf = config.getInitParameter("ControllerContext");
        try {
            HandlerMapper.doMappings(conf);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = getServletConfig().getServletContext().getContextPath();
        //System.out.println("Context path: " + contextPath);
        String servletPath = req.getServletPath();
        //System.out.println("Servlet Path: " + servletPath);
        String inPath = req.getRequestURI().substring(contextPath.length());
        //System.out.println("inPath: " + inPath);
        inPath = inPath.substring(servletPath.length());
        //System.out.println("inPath: " + inPath);
        //System.out.println("uri: " + req.getRequestURI());
        Mapping m = HandlerMapper.getMapping(inPath, req.getMethod());

        if(req.getMethod().equalsIgnoreCase("OPTIONS")){
            return;
        }

        if(m == null){
            System.out.println("Path not found " + inPath);
            resp.setStatus(404);
        }else{
            try {
                dispatch(m, req, resp);
            } catch (ReflectiveOperationException e) {
                e.printStackTrace();
            }
        }
    }

    private void dispatch(Mapping mapping, HttpServletRequest req, HttpServletResponse resp) throws ReflectiveOperationException {
        Class controllerClass = mapping.getClazz();
        Object o = controllerClass.newInstance();
        Method m = controllerClass.getMethod(mapping.getHandle(),
                HttpServletRequest.class, HttpServletResponse.class);
        m.invoke(o, req, resp);
    }
}
