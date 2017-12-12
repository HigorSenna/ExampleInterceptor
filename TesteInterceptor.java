package interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Intercept
public class TesteInterceptor {
	
	@AroundInvoke
	public Object interceptar(InvocationContext context) throws Exception {
		System.out.println("Antes da chamada do método");
		Object objeto = context.proceed();
		System.out.println("Depois da chamada do método");
		System.out.println("Objeto" );
		System.out.println(objeto);
		int tempo = context.getMethod().getAnnotation(Intercept.class).time();
		System.out.println(tempo);
		return objeto;
	}
}
