import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.*;

 public class MainApp {
   public static void main(String[] args) {
      //ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      //HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      //obj.getMessage();
      //TextEditor te = (TextEditor) context.getBean("textEditor");
      //te.spellCheck();
      //JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

      //jc.getAddressList();
      //jc.getAddressSet();
      //jc.getAddressMap();
      //jc.getAddressProp();
      
      //ApplicationContext ctx = 
      //   new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
      //HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
      //helloWorld.setMessage("Hello World! This is from Catherine.");
      //helloWorld.getMessage();
      
      ApplicationContext ctx = 
         new AnnotationConfigApplicationContext(TextEditorConfig.class);

      TextEditor te = ctx.getBean(TextEditor.class);
      te.spellCheck();

   }

}