package MrFemiClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwappingElementsTest {


@Test
void testElementCanBeSwapped(){
    int [] numbers ={1,2,3,4,5};
    int start =0;
    int end = numbers.length -1;
    while (start < end) {
        int check = numbers[start];
        numbers[start]= numbers[end];
        numbers[end]= check;
        start++;
        end--;
    }
}





}



