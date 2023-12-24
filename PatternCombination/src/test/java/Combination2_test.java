import com.bob.combination2.*;
import org.junit.Test;

public class Combination2_test {
    @Test
    public void test() {
        //创建中介者：会议列表对象
        S0123_MeetingList meetingList = new S0123_MeetingList();

        //创建员工对象
        S0123_MyUser employeeA = new S0123_Employee("A");
        S0123_MyUser employeeB = new S0123_Employee("B");
        S0123_MyUser employeeC = new S0123_Employee("C");

        //创建部门对象，并将员工对象加入
        S0123_Department departmentA = new S0123_ConcreteDepartment("Department A");
        departmentA.addMember(employeeA);
        departmentA.addMember(employeeB);

        S0123_Department departmentB = new S0123_ConcreteDepartment("Department B");
        departmentB.addMember(employeeC);

        //注册员工和部门到会议列表
        employeeA.registerToMeetingList(meetingList);
        employeeB.registerToMeetingList(meetingList);
        employeeC.registerToMeetingList(meetingList);

        //发送给员工
        meetingList.sendNotification("Meeting for A,B,C");

        System.out.println("----------------");

        departmentA.registerToMeetingList(meetingList);
        departmentB.registerToMeetingList(meetingList);
        //发送给部门，部门将转发给下属员工
        meetingList.sendNotification("Meeting for Department A,B");


    }

}
