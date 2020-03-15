package user;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
public class Test {
    public static void main(String[] args) {
//        String str = "Hello";
//        Filed vauleFiled;
//        vauleFiled = String.class.getDeclaredField("vaule");
//        v.alueField.setAccessible(true);
//        char[] vaule = (char[]) vauleFiled.get(str);
//
////    public Test() throws NoSuchFieldException {
//            vaule[0] = 'h';
//            System.out.println(str);
////    public Test() throws NoSuchFieldException {
////    }
////}
//        }
        System.out.println(firstUpper("yuisama"));
        System.out.println(firstUpper(""));
        System.out.println(firstUpper("y"));
    }
    public static String firstUpper(String str){
        if("".equals(str)|| str ==null){
            return str;
        }
        if(str.length()>1){
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }
        return  str.toUpperCase();
    }
}
