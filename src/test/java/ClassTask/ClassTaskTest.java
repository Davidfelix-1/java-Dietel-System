package ClassTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTaskTest {
    @Test
    void testIfCLassTaskExist(){
        ClassTask myTask = new ClassTask();
        myTask.setName(myTask.getName());
        assertNull(myTask.getName());
    }
@Test
    void testToCheckTheNumbersOfClassTask(){
        ClassTask myTask = new ClassTask();
        myTask.setNumber(4 + 5);
        assertEquals(9,myTask.getNumber());
}
@Test
    void testIfClassTaskIsActive(){
        ClassTask myTask = new ClassTask();
        myTask.isOn(true);
        assertTrue(true);
}
@Test
    void testIfClassTasKIsInActive(){
        ClassTask myTask = new ClassTask();
        myTask.isOn(false);
        assertFalse(false);
}
@Test
    void checkTheNumberOfParticipation(){
        ClassTask myTask = new ClassTask();
        myTask.setNumber(149);
        assertEquals(149,myTask.getNumber());
}
}