package mock;
import api.User;
import entity.Tea;
import org.mockito.Mockito;
import org.testng.annotations.Test;
import static org.easymock.EasyMock.*;
import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;

public class EasyMock {

    @Test
    public void testTea(){
        //创建mock的对象
        Tea mockTea=Mockito.mock(Tea.class);
        String tea="green tea";
        //设置输入的zhi，和预期返回的zhi
        when(mockTea.tea("red tea")).thenReturn("green tea");
        when(mockTea.tea("green tea")).thenReturn("mlik");
        String real=mockTea.tea(tea);
        System.out.println(real);
        //断言检查
        assertEquals(mockTea.tea("green tea"),"mlik");
        //验证该方法是否执行了两次
        Mockito.verify(mockTea,times(2)).tea(tea);
    }

    @Test
    public void test2(){
        Tea tea2=new Tea();
        //使用spy监控真实的对象
        Tea mock=spy(tea2);
        mock.tea("red tea");
        assertEquals("red tea",tea2.tea("red tea"));
        verify(mock,times(3)).tea("red tea");
    }


}
