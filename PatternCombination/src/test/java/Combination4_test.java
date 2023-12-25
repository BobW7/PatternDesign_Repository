import com.bob.combination4.S0123_TransactionProcessor;
import com.bob.combination4.strategy.S0123_AuthenticationStrategy;
import com.bob.combination4.strategy.S0123_FingerPrintValidator;
import com.bob.combination4.strategy.S0123_PasswordValidator;
import com.bob.combination4.strategy.adapter.S0123_FingerPrintAdapter;

public class Combination4_test {
    public static void main(String[] args) {
        S0123_TransactionProcessor processor = new S0123_TransactionProcessor();
        //设置验证方法为密码验证
        S0123_AuthenticationStrategy passwordValidator = new S0123_PasswordValidator();
        processor.setAuthenticationStrategy(passwordValidator);
        processor.process();
        System.out.println("====================================");
        System.out.println();
        System.out.println("校验策略改为指纹验证");
        processor.setAuthenticationStrategy(new S0123_FingerPrintAdapter(new S0123_FingerPrintValidator()));
        processor.process();
    }
}
