package ie.atu.Using.Containers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PassengerTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void testTitle() {
        Passenger pass = new Passenger("Mr","Ted","1234567890","1234567",20);
        assertEquals("Mr", pass.getTitle());
        System.out.println(pass);
    }
    @Test
    void testTitleMrs() {
        Passenger pass = new Passenger("Mrs","Ted","1234567890","1234567",20);
        assertEquals("Mrs", pass.getTitle());
        System.out.println(pass);
    }
    @Test
    void testTitleMs() {
        Passenger pass = new Passenger("Ms","Ted","1234567890","1234567",20);
        assertEquals("Ms", pass.getTitle());
        System.out.println(pass);
    }


    @Test
    void testTitleFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mar", "Ted", "1234567890", "1234567", 20));
        assertEquals("Title must be Mr, Mrs or Ms", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }
    @Test
    void testName() {
        Passenger pass = new Passenger("Mr","Ted","1234567890","1234567",20);
        assertEquals("Ted", pass.getName());
        System.out.println(pass);
    }

    @Test
    void testNameFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "Te", "1234567890", "1234567", 20));
        assertEquals("Minimum of three characters required", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }
    @Test
    void testID() {
        Passenger pass = new Passenger("Mr","Ted","1234567890","1234567",20);
        assertEquals("1234567890", pass.getId());
        System.out.println(pass);
    }

    @Test
    void testIDFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "Ted", "123456789", "1234567", 20));
        assertEquals("Minimum of ten characters required", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }
    @Test
    void testPhone() {
        Passenger pass = new Passenger("Mr","Ted","1234567890","1234567",20);
        assertEquals("1234567", pass.getPhone());
        System.out.println(pass);
    }

    @Test
    void testPhoneFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "Ted", "1234567890", "123456", 20));
        assertEquals("Minimum of seven characters required", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }
    @Test
    void testAge() {
        Passenger pass = new Passenger("Mr","Ted","1234567890","1234567",20);
        assertEquals(20, pass.getAge());
        System.out.println(pass);
    }

    @Test
    void testAgeFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "Ted", "1234567890", "1234567", 15));
        assertEquals("Must be over 16 to fly", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }


    @AfterEach
    void tearDown() {
    }

}