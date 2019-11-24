package mock;
import api.User;
import entity.Tea;
import org.mockito.Mockito;

import org.mockito.Mockito;
import org.testng.annotations.Test;
import org.testng.Assert;

import static org.easymock.EasyMock.*;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

public class EasyMock {

    @Test
    public void testTea(){
        //创建mock的对象
        Tea mockTea=Mockito.mock(Tea.class);
        String tea="green tea";
        when(mockTea.tea("red tea")).thenReturn("green tea");
        when(mockTea.tea("green tea")).thenReturn("mlik");
        String real=mockTea.tea(tea);
        System.out.println(real);
        assertEquals(mockTea.tea("green tea"),"mlik");
        //Mockito.verify(mockTea).tea("red tea");
    }


}
