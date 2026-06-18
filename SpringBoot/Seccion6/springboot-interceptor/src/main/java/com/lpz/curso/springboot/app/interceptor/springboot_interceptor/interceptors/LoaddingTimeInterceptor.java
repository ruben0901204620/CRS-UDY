package com.lpz.curso.springboot.app.interceptor.springboot_interceptor.interceptors;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.crypto.spec.DESKeySpec;

import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tools.jackson.databind.ObjectMapper;

@Component("timeInterceptor")
public class LoaddingTimeInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoaddingTimeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

                HandlerMethod controller = ((HandlerMethod)handler);
                logger.info("LoadingTimeInterceptor: preHandler() entrando..." + controller.getMethod().getName());

                Long start = System.currentTimeMillis();
                request.setAttribute("start", start);
                
                Random ranom = new Random();
                int delay = ranom.nextInt(500);
                Thread.sleep(delay);

        // Map<String, String> json = new HashMap<>();
        // json.put("date", new Date().toString());
        // json.put("error", "No tienes acceso a esta pagina!");
        
        // ObjectMapper mapper = new ObjectMapper();
        // String jsonString = mapper.writeValueAsString(json);
        // response.setContentType("application/json");
        // response.setStatus(401);
        // response.getWriter().write(jsonString);;
        // return false;

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            @Nullable ModelAndView modelAndView) throws Exception {

                long end = System.currentTimeMillis();
                long start = (Long) request.getAttribute("start");
                long result = end - start;

                logger.info("Tiempo transcurrido " + result + " milisegundos!");
                logger.info("LoadingTimeInterceptor: postHandler() saliendo..." + ((HandlerMethod)handler).getMethod().getName());
    }

}
