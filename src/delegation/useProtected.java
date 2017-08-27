package delegation;

import delegation.extendTest;
/**
 * Created by ghost on 2017/8/25.
 */
public class useProtected {
    public static void main(String[] args) {
        extendTest et = new extendTest();
        et.fu("public");
        et.fn("protected");//不能在包外调用，包内可调用。
        //protected 只有包内和继承调用权限
    }


}
