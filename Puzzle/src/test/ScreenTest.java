package test;

import org.junit.Test;
import com.company.*;

import static com.company.Main.shuffledList;
import static org.junit.Assert.*;

public class ScreenTest {

    final Integer arraySize = shuffledList.size();
    final Number rowSize = Math.sqrt(shuffledList.size());


    @Test
    public void rowSizeTest(){
        Screen screen = new Screen();
        Double result = Math.sqrt(shuffledList.size());
        assertEquals(result.intValue(),3);
    }


    @Test
    public void arraySizeTest(){
        Screen screen = new Screen();
        Number result = shuffledList.size();
        assertEquals(result, 9);
    }

}