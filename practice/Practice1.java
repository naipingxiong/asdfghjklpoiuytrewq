package practice;


/**
 * @author wenjian.cui
 *
 */
public class Practice1 {
    /**
     * @param arguments
     */
    public static void main(String[] arguments) {
        String xmu03HuntPath="xmu03HuntPath";
        String duration="duration";
        int xmuRiPortNum=8;
        System.out.println("lhsh " + xmu03HuntPath + " riportglitch -p "
                + (xmuRiPortNum - 1)
                + " -t "
                + duration + " -m rxtx");   
    }    
}
