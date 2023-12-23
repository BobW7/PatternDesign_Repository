import com.bob.handlers.*;
import com.bob.request.S0123_LeaveRequest;
import org.junit.Test;

public class ChainOfResponsibilityTest {
    @Test
    public void test() {
        //创建处理者对象
        S0123_Handler handler = new S0123_Teacher();
        S0123_Handler headMaster = new S0123_HeadMaster();
        S0123_Handler counselor = new S0123_Counselor();
        S0123_Handler viceDean = new S0123_ViceDean();
        S0123_Handler dean = new S0123_Dean();

        //设置处理者对象之间的关系
        handler.setSuccessor(headMaster);
        headMaster.setSuccessor(counselor);
        counselor.setSuccessor(viceDean);
        viceDean.setSuccessor(dean);

        //创建请假申请对象
        S0123_LeaveRequest request1 = new S0123_LeaveRequest("Alice", 0.2);
        S0123_LeaveRequest request2 = new S0123_LeaveRequest("Bob", 30);
        S0123_LeaveRequest request3 = new S0123_LeaveRequest("Charlie", 200);

        //处理请假申请
        handler.handleRequest(request1);
        handler.handleRequest(request2);
        handler.handleRequest(request3);
    }
}
