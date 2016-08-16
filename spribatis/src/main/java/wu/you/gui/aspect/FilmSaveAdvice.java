package wu.you.gui.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class FilmSaveAdvice {
	@Before("execution(* wu.you.gui.service.impl.FilmInterfaceImpl.film_save(..))")
	public void beforeSave(){
		System.out.println("保存之前执行了增强");
	}
	@After("execution(* wu.you.gui.service.impl.FilmInterfaceImpl.film_save(..))")
	public void afterSave(){
		System.out.println("保存之后执行了增强");
	}
}
