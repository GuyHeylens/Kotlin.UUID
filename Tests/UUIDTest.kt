import org.junit.Assert.*

class UUIDTest{

    @Test
    fun simpleTest() {
        Assert.assertEquals(2, 1 + 1)
    }


    @Test
    fun test.empty.UUID(){
        var uuid = UUID.empty()
        Assert.assertEquals("00000000-0000-0000-0000-000000000000")
    }
}