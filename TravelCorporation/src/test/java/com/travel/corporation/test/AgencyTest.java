package com.travel.corporation.test;

import com.travel.corporation.Agency;
import com.travel.corporation.Staff;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by poletim on 10/29/2015.
 */
public class AgencyTest {

    public interface lala {
        public void method();
    }

    public interface blabla extends lala {
        public void method2();
    }


    public AgencyTest() {

    }

    private Staff staff = new Staff();

    @Test
    public void testAgency() {

        Agency a = new Agency(staff);

        Agency b = new Agency(staff);

        Assert.assertEquals("objects are not equal", a, a);
    }

    @Test
    public void testAgency2() {
        Staff st = mock(Staff.class);

        when(st.toString2()).thenReturn("I am your test");

        Agency a = new Agency(st);


        Assert.assertEquals("dfgf", "I am your test",a.toString() );
        verify(st,times(1)).toString2();
    }




}
