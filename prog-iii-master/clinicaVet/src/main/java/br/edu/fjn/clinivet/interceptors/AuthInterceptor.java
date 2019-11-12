/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.interceptors;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.edu.fjn.clinivet.annotations.Private;
import br.edu.fjn.clinivet.controller.AuthController;
import br.edu.fjn.clinivet.view.components.UserSession;
import javax.inject.Inject;

/**
 *
 * @author vinicius
 */
@Intercepts
public class AuthInterceptor implements Interceptor {

    @Inject
    private UserSession userSession;
    @Inject
    private Result result;
    @Override
    public void intercept(InterceptorStack is, ControllerMethod cm, Object o) throws InterceptionException {
       // Se o Cadastro for logado ,redirecione para a pagina solicitada senão redirecione para o login
        if (userSession.isLogged()) {
            is.next(cm, o);
        }else{
            //redirecionar
            //linha com erro, irei comentar por enquanto.
            //result.redirectTo(AuthController.class).signinView();
        }
    }

    @Override
    public boolean accepts(ControllerMethod cm) {
        return cm.getController().getType().isAnnotationPresent(Private.class)|| cm.containsAnnotation(Private.class);
      
    }
    
    public  boolean isAnnotationPresentInController(ControllerMethod cm, Class<Private> annotation){
        return cm.getController().getType().isAnnotationPresent(annotation);
       
    }
    public boolean isAnnotationPresentInMethod(ControllerMethod cm, Class<Private> annotation){
    
     return cm.getController().getType().isAnnotationPresent(annotation);
    }
            
}