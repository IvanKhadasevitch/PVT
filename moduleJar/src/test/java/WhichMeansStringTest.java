import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class WhichMeansStringTest {
    @Test
    void getInstanceTest(){
        WhichMeansString instance1 = WhichMeansString.getInstance();
        WhichMeansString instance2 = WhichMeansString.getInstance();
        assertAll("WhichMeansString.getInstanceTest",
                () -> assertEquals(instance1, instance2),
                () -> assertNotNull(instance1),
                () -> assertNotNull(instance2));
    }

    @Test
    void stringIsTest() {
        WhichMeansString wms = WhichMeansString.getInstance();
        assertAll("WhichMeansString.stringIsTest",
                () -> assertEquals(wms.stringIs(null), StringType.NOT_DEFINE),
                () -> assertEquals(wms.stringIs("+375 (017) 123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs(" +375 (017) 123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375(017) 123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375 (017)123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375(017)123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375 017) 123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375 (017 123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375 017 123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375017 123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375 017123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375 017)123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375(017 123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375017123-12-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+37501712312-12  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375017123-1212  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+3750171231212"), StringType.PHONE),
                () -> assertEquals(wms.stringIs("+375(017)1231212  "), StringType.PHONE),
                () -> assertEquals(wms.stringIs(" pyshkin@gmail.com "), StringType.EMAIL),
                () -> assertEquals(wms.stringIs(" 1вася..pyshkin@gmail.com "), StringType.NOT_DEFINE),
                () -> assertEquals(wms.stringIs(" pyshkin "), StringType.SURNAME),
                () -> assertEquals(wms.stringIs(" pyshkin cc "), StringType.NOT_DEFINE),
                () -> assertEquals(wms.stringIs(" Иванов "), StringType.SURNAME),
                () -> assertEquals(wms.stringIs(" Иванов dd1 "), StringType.NOT_DEFINE),
                () -> assertEquals(wms.stringIs(" 3020374A016PB4 "), StringType.NUMBER_SOCIAL_INSURANCE),
                () -> assertEquals(wms.stringIs(" 3020374A016PB42 "), StringType.NOT_DEFINE),
                () -> assertEquals(wms.stringIs(" 3020374W016PB4 "), StringType.NOT_DEFINE),
                () -> assertEquals(wms.stringIs(" 320374A016PB4 "), StringType.NOT_DEFINE));
    }
}
